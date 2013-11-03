/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.dao;

import br.com.sof3.clinivet.entidade.VendaProduto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author xps-l502x
 */
public class VendasProdutosDAO extends GenericoDAO{
     
    public void removeVendaProduto(int idVendaProduto) throws SQLException {
        executeCommand("DELETE FROM venda_produto WHERE ID = ?", idVendaProduto);
    }
    
    public List<VendaProduto> getProdutosVendidos(int id_venda) throws SQLException {
        List<VendaProduto> toReturn = new LinkedList<VendaProduto>();
        ResultSet rs = executeQuery("SELECT p.nome FROM vendas_produtos vp inner join produtos p on vp.id_venda like\""+id_venda+"%\";");
        
        while (rs.next()) {
            toReturn.add(populateVendaProduto(rs));
        }
        rs.close();
        return toReturn;
    }
    
    public static VendaProduto populateVendaProduto(ResultSet rs) throws SQLException {
        final VendaDAO vendaDAO = new VendaDAO();
        final ProdutoDAO produtoDAO = new ProdutoDAO();
        
        VendaProduto toReturn = new VendaProduto();
        toReturn.setId(rs.getInt("ID"));
        toReturn.setVenda(vendaDAO.getVenda(rs.getInt("ID_VENDA")));
        toReturn.setProduto(produtoDAO.getProduto(rs.getInt("ID_PRODUTO")));
        toReturn.setQtd(rs.getInt("QTD"));
        toReturn.setDesconto(rs.getDouble("DESCONTO"));
        
        return toReturn;
    }
}
