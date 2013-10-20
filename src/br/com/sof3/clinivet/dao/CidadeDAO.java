package br.com.sof3.clinivet.dao;

import br.com.sof3.clinivet.entidade.Cidade;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class CidadeDAO extends GenericoDAO {

    public CidadeDAO() {
    }
    public List<Cidade> getAllCidadesById_Estado(int id) throws SQLException{
        List<Cidade> toReturn = new LinkedList<>();
        ResultSet rs = executeQuery("select * from cidades where id_estado = ?", id);
        try{
            
            while(rs.next()){
                toReturn.add(populateCidadeInfo(rs));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro no getAllCidadesById_esdados na classe cidadeDAO: "+ex);
        }
        
        return toReturn;
    }
    public Cidade getCidade(int idCidade) throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM cidades WHERE ID = ?", idCidade);
        Cidade cidade = null;
        while (rs.next()) {
            cidade = populateCidadeInfo(rs);
        }
        rs.close();
        return cidade;
    }
    public Cidade getCidadeByName(String nomeCidade) throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM cidades WHERE nome = ?", nomeCidade);
        Cidade cidade = null;
        try{
            
            while (rs.next()) {
                cidade = populateCidadeInfo(rs);
            }
            rs.close();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao buscar cidades pelo nome");
        }
        return cidade;
    }
    public List<Cidade> getAllCidades() throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM cidades");
        List<Cidade> toReturn = new LinkedList<Cidade>();
        
        while (rs.next()) {
            toReturn.add(populateCidadeInfo(rs));
        }
        rs.close();
        
        return toReturn;
    }

    public static Cidade populateCidadeInfo(ResultSet rs) throws SQLException {
        final EstadoDAO estadoDAO = new EstadoDAO();
        Cidade toReturn = new Cidade();
        toReturn.setId(rs.getInt("ID"));
        toReturn.setNome(rs.getString("NOME"));
        toReturn.setEstado(estadoDAO.getEstado(rs.getInt("ID_ESTADO")));
        return toReturn;
    }
}
