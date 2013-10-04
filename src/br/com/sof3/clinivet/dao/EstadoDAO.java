package br.com.sof3.clinivet.dao;

import br.com.sof3.clinivet.entidade.Estado;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class EstadoDAO extends GenericoDAO {

    public EstadoDAO() {
    }
    
    public Estado getEstado(int idEstado) throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM estados WHERE ID = ?", idEstado);
        Estado estado = null;
        if (rs.next()) {
            estado = populateEstadoInfo(rs);
        }
        rs.close();
        return estado;
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
  
        toReturn.setNome(rs.getString("NOME"));
        return toReturn;
    }
}

