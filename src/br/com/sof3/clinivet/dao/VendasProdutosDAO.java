/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.dao;

import br.com.sof3.clinivet.entidade.VendaProduto;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author xps-l502x
 */
public class VendasProdutosDAO extends GenericoDAO{
     
    public void removeVendaProduto(int idVendaProduto) throws SQLException {
        executeCommand("DELETE FROM venda_produto WHERE ID = ?", idVendaProduto);
    }
    /*
    public static VendaProduto populateVendaProduto(ResultSet rs) throws SQLException {
        final VendaDAO VendaDAO = new VendaDAO();
        final ProdutoDAO ProdutoDAO = new ProdutoDAO();
        
        VendaProduto toReturn = new VendaProduto();
        toReturn.setId(rs.getInt("ID"));
        toReturn.setProduto(ProdutoDAO.getDetalhes(rs.getString(rs.getString("COD"))));
       // toReturn.setVenda(VendaDAO.);
        toReturn.setQtd(rs.getInt(null));
        
        return toReturn;
    }*/
}
