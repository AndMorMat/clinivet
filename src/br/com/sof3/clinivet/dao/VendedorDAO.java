package br.com.sof3.clinivet.dao;


import br.com.sof3.clinivet.entidade.Venda;
import br.com.sof3.clinivet.entidade.Vendedor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        
        try{
            vendedor.setId(getNextId("vendedores"));
            
            String query = "INSERT INTO vendedores (ID, NOME, LOGIN, SENHA,INATIVO) values (?,?,?,?,?)";
<<<<<<< HEAD
            executeCommand(query, vendedor.getId(), vendedor.getNome(), vendedor.getLogin(), vendedor.getSenha(),vendedor.isInativo());
=======
            executeCommand(query, vendedor.getId(), vendedor.getNome(), vendedor.getLogin(), vendedor.getSenha());
>>>>>>> fc9502a65fca91d8f2146c2a3fd0f3e5fae971fa
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao adicionar vendedor na classe vendedorDAO: "+ex);
        }
        return vendedor.getId();
    }
    public void inativarVendedor(int idVendedor){
       try {
           executeCommand("update vendedores set inativo = ? where id = ?",true,idVendedor);
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao inativar vendedor na classe VendedorDAO: "+ ex);
       }
    }
    /*public void removeVendedor(int idVendedor) throws SQLException {
        VendaDAO vendaDAO = new VendaDAO();
        List <Venda> vendas = new ArrayList<>();
        try{
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao excluir vendedor na classe vendedorDAO: "+ex);
        }
    }*/
    public int getIdVendedor(String login) throws SQLException{
        Vendedor vendedor = new Vendedor();        
        try{
            ResultSet rs = executeQuery("SELECT * FROM vendedores WHERE login = ?", login);
//            JOptionPane.showMessageDialog(null, login);
            

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
            String query = "UPDATE vendedores SET nome = ?, login = ?, senha = ?, inativo=? WHERE id = ?";

            executeCommand(query, vendedor.getNome(), vendedor.getLogin(), vendedor.getSenha(), vendedor.isInativo(),vendedor.getId());
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar vendedores na classe VendedorDAO");
        }
    }

    public Vendedor getVendedor(int idVendedor) throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM vendedores WHERE id = ?", idVendedor);
        Vendedor vendedor = null;
        while(rs.next()) {
            vendedor = populateVendedorInfo(rs);
        }
        rs.close();
        return vendedor;
    }

    public List<Vendedor> getAllVendedores() throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM vendedores");
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
        toReturn.setInativo(rs.getBoolean("INATIVO"));
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
    
    public boolean getLoginDuplicado(String login) throws SQLException{
        
        ResultSet rs = executeQuery("SELECT * FROM vendedores WHERE login =  ?", login);//Pesquisando CPf do cliente a ser cadastrado
        boolean found = false;  
        
        while (rs.next()) {   
             found = true;  //Caso seja encontrado um cadastro retorna verdadeiro
        }
        
        return found;
    }
}
