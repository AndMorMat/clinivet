package br.com.sof3.clinivet.dao;

import static br.com.sof3.clinivet.dao.ClienteDAO.populateCliente;
import br.com.sof3.clinivet.entidade.Cliente;
import br.com.sof3.clinivet.entidade.Vendedor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;//So,mente para teste

public class VendedorDAO extends GenericoDAO {
   public VendedorDAO() {
       
   } 
   
   public boolean isValidLoginSenha(String login, String senha) throws SQLException {
      
        boolean toReturn = false;
        String sql = "SELECT * FROM vendedores WHERE login = \"" + login + "\" AND senha = \""+ senha +"\";";
        
        
        //JOptionPane.showMessageDialog(null, sql);
        
        
        ResultSet rs = executeQuery(sql);
        
        
        if (rs.next()) {
            toReturn = true;
        }
        rs.close();
        return toReturn;
    }
    
    public int adicionaVendedor(Vendedor vendedor) throws SQLException {
        vendedor.setId(getNextId("vendedores"));
        JOptionPane.showMessageDialog(null, vendedor.getId().toString());
        String query = "INSERT INTO vendedores (ID, NOME, LOGIN, SENHA) values (?,?,?,?)";
        executeCommand(query, vendedor.getId(), vendedor.getNome(), vendedor.getLogin(), vendedor.getSenha());
        return vendedor.getId();
    }

    public void removeVendedor(int idVendedor) throws SQLException {
        executeCommand("DELETE FROM VENDEDORES WHERE ID = ?", idVendedor);
    }

    public void atualizaVendedor(Vendedor vendedor) throws SQLException {
        String query = "UPDATE VENDEDORES SET NOME=?, LOGIN=?, SENHA=? WHERE ID = ?";
        executeCommand(query, vendedor.getNome(), vendedor.getLogin(), vendedor.getSenha(), vendedor.getId());
    }

    public Vendedor getVendedor(int idVendedor) throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM VENDEDORES WHERE ID = ?", idVendedor);
        Vendedor vendedor = null;
        if (rs.next()) {
            vendedor = populateVendedorInfo(rs);
        }
        rs.close();
        return vendedor;
    }

    public List<Vendedor> getAllVendedores() throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM VENDEDORES");
        List<Vendedor> toReturn = new LinkedList<Vendedor>();
        while (rs.next()) {
            toReturn.add(populateVendedorInfo(rs));
        }
        rs.close();
        return toReturn;
    }

    public static Vendedor populateVendedorInfo(ResultSet rs) throws SQLException {
        Vendedor toReturn = new Vendedor();
        toReturn.setId(rs.getInt("ID"));
        toReturn.setLogin(rs.getString("LOGIN"));
        toReturn.setNome(rs.getString("NOME"));
        toReturn.setSenha(rs.getString("SENHA"));
        return toReturn;
    }
    public List<Vendedor> getVendedorByName(String nome) throws SQLException {
        List<Vendedor> toReturn = new LinkedList<Vendedor>();
        
        ResultSet rs = executeQuery("SELECT * FROM vendedores WHERE nome = \""+nome+"\";");
        
        while (rs.next()) {
            toReturn.add(populateVendedorInfo(rs));
        }
        rs.close();
        return toReturn;
    }
}
