package br.com.sof3.clinivet.dao;

import br.com.sof3.clinivet.entidade.Cidade;
import br.com.sof3.clinivet.entidade.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteDAO extends GenericoDAO {

    

    public int adicionaCliente(Cliente cliente) throws SQLException {
        cliente.setId(getNextId("clientes"));
        String query = "INSERT INTO clientes (ID, NOME, SOBRENOME,DATA_NASC, CPF, TELEFONE, CELULAR, ENDERECO, BAIRRO, ID_CIDADE, EMAIL,sms_inicio_consulta,sms_fim_consulta) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        executeCommand(query, cliente.getId(), cliente.getNome(), cliente.getSobrenome(),cliente.getDataNasc(), cliente.getCpf(), cliente.getTelefone(), cliente.getCelular(), cliente.getEndereco(), cliente.getBairro(), cliente.getCidade().getId(), cliente.getEmail(),cliente.isSms_inicio_consulta(),cliente.isSms_fim_consulta());
        return cliente.getId();
    }

    public void removeCliente(int idCliente) throws SQLException {
        try{
            JOptionPane.showMessageDialog(null, "Id: "+idCliente);
            executeCommand("DELETE FROM clientes WHERE ID = ?", idCliente);
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro ao excluir cliente na classe ClienteDAO: "+ ex);
        }
    }
    public int getIdByCpf(String cpf) throws SQLException{
        int id=-1;
        Cliente cli = new Cliente();
        try{
            ResultSet rs = executeQuery("select * from clientes where cpf = ?",cpf);
            while(rs.next()){
                cli = populateCliente(rs);
                id=cli.getId();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao pegar id do cliente");
        }
        return id;
    }
    public void atualizarCliente(Cliente cliente) throws SQLException {
        try{
            String query = "UPDATE clientes SET NOME = ?, SOBRENOME=?, DATA_NASC = ?,CPF=?, TELEFONE=?, CELULAR=?, ENDERECO=?, BAIRRO=?, ID_CIDADE=?, EMAIL=?,sms_inicio_consulta = ?,sms_fim_consulta = ? WHERE ID = ?";
            executeCommand(query, cliente.getNome(), cliente.getSobrenome(), cliente.getDataNasc(),cliente.getCpf(), cliente.getTelefone(), cliente.getCelular(), cliente.getEndereco(), cliente.getBairro(), cliente.getCidade().getId(), cliente.getEmail(),cliente.isSms_inicio_consulta(),cliente.isSms_fim_consulta(), cliente.getId());
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "erro dentro do atualizar cliente na classe clienteDAO");
        }
    }

    public Cliente getCliente(int idCliente) throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM clientes WHERE ID = ?", idCliente);
        Cliente cliente = new Cliente();
        while (rs.next()) {
            cliente = populateCliente(rs);
        }
        rs.close();
        return cliente;
    }

    public ArrayList<Cliente> getAllClientes() throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM clientes");
        ArrayList<Cliente> toReturn = new ArrayList<Cliente>();
        while (rs.next()) {
            toReturn.add(populateCliente(rs));
        }
        rs.close();
        
        return toReturn;

    }

    public static Cliente populateCliente(ResultSet rs) throws SQLException {
        final CidadeDAO cidadeDAO = new CidadeDAO();
        Cliente toReturn = new Cliente();
        toReturn.setId(rs.getInt("ID"));
        toReturn.setNome(rs.getString("NOME"));
        toReturn.setSobrenome(rs.getString("SOBRENOME"));
        toReturn.setDataNasc(rs.getString("DATA_NASC"));
        toReturn.setCpf(rs.getString("CPF"));
        toReturn.setTelefone(rs.getString("TELEFONE"));
        toReturn.setCelular(rs.getString("CELULAR"));
        toReturn.setEndereco(rs.getString("ENDERECO"));
        toReturn.setBairro(rs.getString("BAIRRO"));
        toReturn.setCidade(cidadeDAO.getCidade(rs.getInt("ID_CIDADE")));
        toReturn.setEmail(rs.getString("EMAIL"));
        toReturn.setSms_inicio_consulta(rs.getBoolean("SMS_INICIO_CONSULTA"));
        toReturn.setSms_fim_consulta(rs.getBoolean("SMS_FIM_CONSULTA"));
        
        return toReturn;
    }
    
    public List<Cliente> getClientesByTelefone(String telefone) throws SQLException {
        List<Cliente> toReturn = new LinkedList<Cliente>();
        
        
        ResultSet rs = executeQuery("SELECT * FROM clientes WHERE telefone like \""+telefone+"%\";");
        
        while (rs.next()) {
            toReturn.add(populateCliente(rs));
        }
        rs.close();
        return toReturn;
    }
    
    public List<Cliente> getClientesByName(String nome) throws SQLException {
        List<Cliente> toReturn = new LinkedList<Cliente>();
        
        
        ResultSet rs = executeQuery("SELECT * FROM clientes WHERE nome like \""+nome+"%\";");
        
        while (rs.next()) {
            toReturn.add(populateCliente(rs));
        }
        rs.close();
        return toReturn;
    }
    
    public List<Cliente> getClientesByCPF(String cpf) throws SQLException {
        List<Cliente> toReturn = new LinkedList<Cliente>();
        
        try{
            ResultSet rs = executeQuery("SELECT * FROM clientes WHERE cpf like \""+cpf+"%\";");

            while (rs.next()) {
                toReturn.add(populateCliente(rs));
            }
            rs.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao buscar clientes pelo cpf");
        }
        return toReturn;
    }
    
    public List<Cliente> getClientesByID() throws SQLException {
        List<Cliente> toReturn = new LinkedList<Cliente>();
        

        ResultSet rs = executeQuery("SELECT * FROM clientes ORDER BY id DESC;");
        
        while (rs.next()) {
            toReturn.add(populateCliente(rs));
        }
        rs.close();
        return toReturn;
    }
    
    public Cliente getDetalhes(String cpf) throws SQLException {
        
        ResultSet rs = executeQuery("SELECT * FROM clientes WHERE cpf =  ?", cpf);
        
        Cliente cliente = new Cliente();
        if (rs.next()) {
            cliente = populateCliente(rs);
        }
        rs.close();
        return cliente;
    }
    
    public boolean getCPFDuplicado(String cpf) throws SQLException{
        
        ResultSet rs = executeQuery("SELECT * FROM clientes WHERE cpf =  ?", cpf);//Pesquisando CPf do cliente a ser cadastrado
        boolean found = false;  
        
        while (rs.next()) {   
             found = true;  //Caso seja encontrado um cadastro retorna verdadeiro
        }
        
        return found;
    }
    
}

