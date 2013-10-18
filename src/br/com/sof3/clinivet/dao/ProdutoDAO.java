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
        String query = "insert into produtos (id,codigo,nome,preco_custo,margem_lucro,preco_venda,validade,id_fornecedor,qtdEstoque,tipo)"
                + "values(?,?,?,?,?,?,?,?,?,?)";
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
                             produto.getTipoProduto());
        
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null, "Erro ao cadastrar produtos no banco de dados :: na classe produtoDAO");
      }
        return produto.getId();
      
    }
    
    public List<Produto> getProdutoByName(String nome) throws SQLException {
        List<Produto> toReturn = new LinkedList<Produto>();
        
        
        ResultSet rs = executeQuery("SELECT * FROM produtos WHERE nome like \""+nome+"%\";");
        
        while (rs.next()) {
            toReturn.add(populateProduto(rs));
        }
        rs.close();
        return toReturn;
    }
    
   
    public List<Produto> getProdutoByCodigo(String codigo) throws SQLException {
        List<Produto> toReturn = new LinkedList<Produto>();
        
        
        ResultSet rs = executeQuery("SELECT * FROM produtos WHERE codigo like \""+codigo+"%\";");
        
        while (rs.next()) {
            toReturn.add(populateProduto(rs));
        }
        rs.close();
        return toReturn;
    }
    
    public List<Produto> getProdutosByTipo(String tipo) throws SQLException {
        List<Produto> toReturn = new LinkedList<Produto>();
        
        
        ResultSet rs = executeQuery("SELECT * FROM produtos WHERE tipo like \""+tipo+"%\";");
        
        while (rs.next()) {
            toReturn.add(populateProduto(rs));
        }
        rs.close();
        return toReturn;
    }
    
    public List<Produto> getProdutosByQuant(int quant) throws SQLException {
        List<Produto> toReturn = new LinkedList<Produto>();
        
        
        ResultSet rs = executeQuery("SELECT * FROM produtos WHERE qtdestoque <=\""+quant+"\";");
        
        while (rs.next()) {
            toReturn.add(populateProduto(rs));
        }
        rs.close();
        return toReturn;
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
        toReturn.setFornecedor(fornecedorDAO.getFornecedor(rs.getInt("ID_FORNECEDOR")));
        toReturn.setEstoque(rs.getInt("QTDESTOQUE"));
        toReturn.setCodigo(rs.getString("CODIGO"));
        toReturn.setTipoProduto(rs.getString("TIPO"));
        
        return toReturn;
    }
    
    public Produto getDetalhes(String Cod) throws SQLException {
        
        ResultSet rs = executeQuery("SELECT * FROM produtos WHERE codigo =  ?", Cod);
        
        Produto cliente = new Produto();
        if (rs.next()) {
            cliente = populateProduto(rs);
        }
        rs.close();
        return cliente;
    }
}