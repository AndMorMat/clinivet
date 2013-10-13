package br.com.sof3.clinivet.dao;

import br.com.sof3.clinivet.entidade.Estado;
import java.awt.JobAttributes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class EstadoDAO extends GenericoDAO {

    public EstadoDAO() {
    }
    
    public Estado getEstado(int idEstado) throws SQLException {
        
        ResultSet rs = executeQuery("SELECT * FROM estados WHERE id = ?", idEstado);
        Estado estado = new Estado();
        try{
            while (rs.next()) {
                estado = populateEstadoInfo(rs);
            }
            rs.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao buscar estados na classe estadoDAO");
        }
        return estado;
    }
    public int getIdEstado(String nome) throws SQLException {
        
        ResultSet rs = executeQuery("SELECT * FROM estados WHERE nome = ?", nome);
        Estado estado = new Estado();
        int id=-1;
        try{
            while (rs.next()) {
                JOptionPane.showMessageDialog(null, "Erro antes do populate");
                estado = populateEstadoInfo(rs);
                JOptionPane.showMessageDialog(null, "passou o populate");
                id = estado.getId();
                JOptionPane.showMessageDialog(null, "passou o idestado");
            }
            rs.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao buscar id_estados na classe estadoDAO");
        }
        return id;
    }
    public List<Estado> getAllEstados() throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM estados");
        List<Estado> toReturn = new LinkedList<Estado>();
        while (rs.next()) {
            toReturn.add(populateEstadoInfo(rs));
        }
        rs.close();
        return toReturn;
    }

    public static Estado populateEstadoInfo(ResultSet rs) throws SQLException {
        Estado toReturn = new Estado();
        toReturn.setId(rs.getInt("ID"));
        toReturn.setNome(rs.getString("NOME"));
        return toReturn;
    }
}

