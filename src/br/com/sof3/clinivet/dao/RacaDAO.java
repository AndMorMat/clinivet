/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.dao;

import br.com.sof3.clinivet.entidade.Raca;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author xps-l502x
 */
public class RacaDAO extends GenericoDAO{
    
    
    public int adicionarRaca(Raca rac) throws SQLException {
        try{
            String query = "INSERT INTO raca (nome,tipo_animal) VALUES (?,?)";
            //JOptionPane.showMessageDialog(null, "Antes de executar a query");
            executeCommand(query,rac.getNome(),rac.getTipo_animal());
            //JOptionPane.showMessageDialog(null, "Depois de executar a query");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar raca no metodo adicionaRaca na classe RacaDAO: "+ex);
        }
        return rac.getId();
    }
    
     public void removeRaca(int idRaca) throws SQLException {
        executeCommand("DELETE FROM raca WHERE ID = ?", idRaca);
    }
     
     public void atualizarRaca(Raca rac) throws SQLException {
        String query = "UPDATE raca SET ID = ?,NOME=? WHERE ID = ?";
        executeCommand(query, rac.getNome());
    }
     public List<Raca> getAllRaca(int tipo_animal) throws SQLException{
         List<Raca> toReturn = new LinkedList<>();
         String sql = "select * from raca where tipo_animal = ?";
         ResultSet rs = executeQuery(sql,tipo_animal);
         try{
             while(rs.next()){
                 toReturn.add(populateRaca(rs));
             }
             
         }catch(Exception ex){
             JOptionPane.showMessageDialog(null, "Erro ao buscar todas as raças no metodo getAllRaca na classe RacaDAO: "+ex);
         }
         return toReturn;
     }
     public Raca getRaca(String nome) throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM raca WHERE nome = ?", nome);
        Raca rac = null;
        while (rs.next()) {
            rac = populateRaca(rs);
        }
        rs.close();
        return rac;
    }
     public Raca getRacaById(int id) throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM raca WHERE id = ?", id);
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
        toReturn.setTipo_animal(rs.getInt("TIPO_ANIMAL"));
     
        return toReturn;
    }
    
}
