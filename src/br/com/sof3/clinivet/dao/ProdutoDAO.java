package br.com.sof3.clinivet.dao;

import br.com.sof3.clinivet.entidade.Produto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutoDAO extends GenericoDAO{
    
    
    public int adicionaProduto(Produto produto)throws SQLException{
       try{
            produto.setId(getNextId("produtos"));  
            String query = "insert into produtos (id,codigo,nome,preco_custo,margem_lucro,preco_venda,validade,id_fornecedor,qtdEstoque,tipo, inativo)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?)";
            executeCommand(query, 
                                 produto.getId(),
                                 produto.getCodigo(),
                                 produto.getNome(),
                                 produto.getPrecoCusto(),
                                 produto.getMargemLucro(),
                                 produto.getPrecoVenda(),
                                 produto.getValidade(),
                                 produto.getFornecedor().getId(),
                                 produto.getEstoque(),
                                 produto.getTipoProduto(),
                                 produto.isInativo());
        
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null, "Erro ao cadastrar produtos no banco de dados :: na classe produtoDAO");
      }
        return produto.getId();
      
    }
    public int getIdBCod(String cod) throws SQLException{
        int id=-1;
        try{
            String sql = "select * from produtos where codigo = ?";
            ResultSet rs = executeQuery(sql, cod);
            
            Produto pro = new Produto();
            while(rs.next()){
                pro = populateProduto(rs);
                id = pro.getId();
            }
            
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro ao pegar id pelo codigo na classe ProdutoDAO: "+ ex);
        }
        return id;
    }
    
    public void atualizaEstoque(int id_produto, int quantidade) throws SQLException {
        try {
            String query = "update produtos set qtdEstoque = ? where id = ?";
            executeCommand(query, quantidade, id_produto);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Erro ao atualizar o estoque: "+ ex);
        }
    }
    
    public void atualizaProduto(Produto p) throws SQLException{
        try{
            String query = "update produtos set nome =?, preco_custo=?, margem_lucro=?, preco_venda=?, validade=?, id_fornecedor=?, qtdEstoque = ?, codigo=?, tipo=?, inativo=?  where id = ?";
            executeCommand(query, p.getNome(),p.getPrecoCusto(),p.getMargemLucro(),p.getPrecoVenda(),p.getValidade(),p.getFornecedor().getId(),p.getEstoque(),p.getCodigo(), p.getTipoProduto(), p.isInativo(), p.getId());
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro ao atualizarProduto na classe produtoDAO: "+ ex);
        }
    }
    
    public List<Produto> getProdutoByName(String nome) throws SQLException {
        List<Produto> toReturn = new LinkedList<Produto>();
        
        
        ResultSet rs = executeQuery("SELECT * FROM produtos WHERE inativo = 0 and nome like \""+nome+"%\";");
        
        while (rs.next()) {
            toReturn.add(populateProduto(rs));
        }
        rs.close();
        return toReturn;
    }
    
   
    public List<Produto> getProdutoByCodigo(String codigo) throws SQLException {
        List<Produto> toReturn = new LinkedList<Produto>();
        
        
        ResultSet rs = executeQuery("SELECT * FROM produtos WHERE inativo = 0 and codigo like \""+codigo+"%\";");
        
        while (rs.next()) {
            toReturn.add(populateProduto(rs));
        }
        rs.close();
        return toReturn;
    }
    
    public List<Produto> getProdutosByTipo(String tipo) throws SQLException {
        List<Produto> toReturn = new LinkedList<Produto>();
        
        
        ResultSet rs = executeQuery("SELECT * FROM produtos WHERE inativo = 0 and tipo like \""+tipo+"%\";");
        
        while (rs.next()) {
            toReturn.add(populateProduto(rs));
        }
        rs.close();
        return toReturn;
    }
    
    public List<Produto> getProdutosByQuant(int quant) throws SQLException {
        List<Produto> toReturn = new LinkedList<Produto>();
        
        
        ResultSet rs = executeQuery("SELECT * FROM produtos WHERE inativo = 0 and qtdestoque <=\""+quant+"\";");
        
        while (rs.next()) {
            toReturn.add(populateProduto(rs));
        }
        rs.close();
        return toReturn;
    }
    
      public Produto getProduto(int idProduto) throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM produtos WHERE inativo = ? and ID = ?",false, idProduto);
        Produto produto = new Produto();
        while (rs.next()) {
            produto = populateProduto(rs);
        }
        rs.close();
        return produto;
    }
    
    public static Produto populateProduto(ResultSet rs) throws SQLException {
        final FornecedorDAO fornecedorDAO = new FornecedorDAO();
        
        Produto toReturn = new Produto();
        toReturn.setId(rs.getInt("ID"));
        toReturn.setNome(rs.getString("NOME"));
        toReturn.setPrecoCusto(rs.getDouble("PRECO_CUSTO"));
        toReturn.setMargemLucro(rs.getDouble("MARGEM_LUCRO"));
        toReturn.setPrecoVenda(rs.getDouble("PRECO_VENDA"));
        toReturn.setValidade(rs.getString("VALIDADE"));
        toReturn.setFornecedor(fornecedorDAO.getTodosFornecedorAteInativos(rs.getInt("ID_FORNECEDOR")));
        toReturn.setEstoque(rs.getInt("QTDESTOQUE"));
        toReturn.setCodigo(rs.getString("CODIGO"));
        toReturn.setTipoProduto(rs.getString("TIPO"));
        toReturn.setInativo(rs.getBoolean("INATIVO"));
        
        return toReturn;
    }
    
    public Produto getDetalhes(String Cod) throws SQLException {
        
        ResultSet rs = executeQuery("SELECT * FROM produtos WHERE inativo = 0 and codigo =  ?", Cod);
        
        Produto produto = new Produto();
        while (rs.next()) {
            produto = populateProduto(rs);
        }
        rs.close();
        return produto;
    }
    
    public List<Produto> getTodosProdutos() throws SQLException {
        List<Produto> toReturn = new LinkedList<Produto>();
        ResultSet rs = executeQuery("SELECT * FROM produtos where inativo = 0");
        while (rs.next()) {
            toReturn.add(populateProduto(rs));
        }
        return toReturn;
    }

     public void inativarProduto(int codProduto){
        try {
            executeCommand("update produtos set inativo = ? where id = ?", true, codProduto);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao definir produto como inativo na classe ProdutoDAO: "+ex);
        }
    }
     public boolean verificaCodigoRepedido(String cod){
         boolean value=false;
         try{
             ResultSet rs = executeQuery("select * from produtos where codigo = ?", cod);
             while(rs.next()){
                 value=true;
             }
         }catch(Exception ex){
             
         }
         
     return value;
     }
}