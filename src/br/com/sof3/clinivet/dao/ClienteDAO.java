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
        String query = "INSERT INTO clientes (ID, NOME, SOBRENOME, CPF, TELEFONE, CELULAR, ENDERECO, BAIRRO, ID_CIDADE, EMAIL) VALUES (?,?,?,?,?,?,?,?,?,?)";
        executeCommand(query, cliente.getId(), cliente.getNome(), cliente.getSobrenome(), cliente.getCpf(), cliente.getTelefone(), cliente.getCelular(), cliente.getEndereco(), cliente.getBairro(), cliente.getCidade().getId(), cliente.getEmail());
        return cliente.getId();
    }

    public void removeCliente(int idCliente) throws SQLException {
        executeCommand("DELETE FROM clientes WHERE ID = ?", idCliente);
    }

    public void atualizarCliente(Cliente cliente) throws SQLException {
        String query = "UPDATE clientes SET NOME = ?, SOBRENOME=?, CPF=?, TELEFONE=?, CELULAR=?, ENDERECO=?, BAIRRO=?, ID_CIDADE=?, EMAIL=? WHERE ID = ?";
        executeCommand(query, cliente.getNome(), cliente.getSobrenome(), cliente.getCpf(), cliente.getTelefone(), cliente.getCelular(), cliente.getEndereco(), cliente.getBairro(), cliente.getCidade().getId(), cliente.getEmail(), cliente.getId());
    }

    public Cliente getCliente(int idCliente) throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM clientes WHERE ID = ?", idCliente);
        Cliente cliente = null;
        if (rs.next()) {
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
        toReturn.setCpf(rs.getString("CPF"));
        toReturn.setTelefone(rs.getString("TELEFONE"));
        toReturn.setCelular(rs.getString("CELULAR"));
        toReturn.setEndereco(rs.getString("ENDERECO"));
        toReturn.setBairro(rs.getString("BAIRRO"));
        toReturn.setCidade(cidadeDAO.getCidade(rs.getInt("ID_CIDADE")));
        toReturn.setEmail(rs.getString("EMAIL"));
        
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
    
    public List<Cliente> getClientesByCPF(int cpf) throws SQLException {
        List<Cliente> toReturn = new LinkedList<Cliente>();
        
        
        ResultSet rs = executeQuery("SELECT * FROM clientes WHERE cpf like \""+cpf+"%\";");
        
        while (rs.next()) {
            toReturn.add(populateCliente(rs));
        }
        rs.close();
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
    
   
}

