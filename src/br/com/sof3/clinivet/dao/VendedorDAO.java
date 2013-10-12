package br.com.sof3.clinivet.dao;


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
    public int getIdVendedor(String login) throws SQLException{
        Vendedor vendedor = new Vendedor();
        try{
            ResultSet rs = executeQuery("SELECT * FROM vendedores WHERE login = ?", login);
            JOptionPane.showMessageDialog(null, login);
            

            while(rs.next()) {
                vendedor = populateVendedorInfo(rs);
            }
            rs.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao pegar id na classe vendedorDAO");
        }
        return vendedor.getId();
    }
    public void atualizaVendedor(Vendedor vendedor) throws SQLException {
        try{
            String query = "UPDATE vendedores SET nome = ?, login = ?, senha = ? WHERE id = ?";
//            update vendedores set nome = "Andre Matos", login = "AndMat", senha = "34x88=2992" where id = 2;

            executeCommand(query, vendedor.getNome(), vendedor.getLogin(), vendedor.getSenha(), vendedor.getId());
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar vendedores na classe VendedorDAO");
        }
    }

    public Vendedor getVendedor(int idVendedor) throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM VENDEDORES WHERE ID = ?", idVendedor);
        Vendedor vendedor = null;
        while(rs.next()) {
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
        
        ResultSet rs = executeQuery("SELECT * FROM vendedores WHERE nome like \""+nome+"%\";");
        
        while (rs.next()) {
            toReturn.add(populateVendedorInfo(rs));
        }
        rs.close();
        return toReturn;
    }
    
    public List<Vendedor> getVendedorByID() throws SQLException {
        List<Vendedor> toReturn = new LinkedList<Vendedor>();
        

        ResultSet rs = executeQuery("SELECT * FROM vendedores ORDER BY id DESC;");
        
        while (rs.next()) {
            toReturn.add(populateVendedorInfo(rs));
        }
        
        rs.close();
        
        return toReturn;
    }
    
    public List<Vendedor> getVendedorByLogin(String login) throws SQLException {
        List<Vendedor> toReturn = new LinkedList<Vendedor>();
        
        
        ResultSet rs = executeQuery("SELECT * FROM vendedores WHERE login like \""+login+"%\";");
        
        while (rs.next()) {
            toReturn.add(populateVendedorInfo(rs));
        }
        rs.close();
        return toReturn;
    }
}
