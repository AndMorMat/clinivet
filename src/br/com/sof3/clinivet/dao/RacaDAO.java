/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.dao;

import br.com.sof3.clinivet.entidade.Raca;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author xps-l502x
 */
public class RacaDAO extends GenericoDAO{
    
    
    public int adicionarRaca(Raca rac) throws SQLException {
        String query = "INSERT INTO raca (ID, NOME) VALUES (?,?)";
        //JOptionPane.showMessageDialog(null, "Antes de executar a query");
        executeCommand(query, rac.getId(), rac.getNome());
        //JOptionPane.showMessageDialog(null, "Depois de executar a query");
        return rac.getId();
    }
    
     public void removeRaca(int idRaca) throws SQLException {
        executeCommand("DELETE FROM raca WHERE ID = ?", idRaca);
    }
     
     public void atualizarRaca(Raca rac) throws SQLException {
        String query = "UPDATE raca SET ID = ?,NOME=? WHERE ID = ?";
        executeCommand(query, rac.getNome());
    }
     
     public Raca getRaca(int idRaca) throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM raca WHERE ID = ?", idRaca);
        Raca rac = null;
        while (rs.next()) {
            rac = populateRaca(rs);
        }
        rs.close();
        return rac;
    }
     
     public static Raca populateRaca(ResultSet rs) throws SQLException {
        
        Raca toReturn = new Raca();
        toReturn.setId(rs.getInt("ID"));
        toReturn.setNome(rs.getString("NOME"));
     
        return toReturn;
    }
    
}
