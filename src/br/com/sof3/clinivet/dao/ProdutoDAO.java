package br.com.sof3.clinivet.dao;

import br.com.sof3.clinivet.entidade.Produto;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProdutoDAO extends GenericoDAO{
    
    
    public int adicionaProduto(Produto produto)throws SQLException{
       try{
        produto.setId(getNextId("produtos"));  
        String query = "insert into produtos (id,codigo,nome,preco_custo,margem_lucro,preco_venda,validade,id_fornecedor,qtdEstoque)"
                + "values(?,?,?,?,?,?,?,?,?)";
        executeCommand(query, 
                             produto.getId(),
                             produto.getCodigo(),
                             produto.getNome(),
                             produto.getPrecoCusto(),
                             produto.getMargemLucro(),
                             produto.getPrecoVenda(),
                             produto.getValidade(),
                             produto.getFornecedor().getId(),
                             produto.getEstoque());
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null, "Erro ao cadastrar produtos no banco de dados :: na classe produtoDAO");
      }
        return produto.getId();
      
    }
}
