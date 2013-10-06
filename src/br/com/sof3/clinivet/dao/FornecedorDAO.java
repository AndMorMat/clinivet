package br.com.sof3.clinivet.dao;

import static br.com.sof3.clinivet.dao.CidadeDAO.populateCidadeInfo;
import br.com.sof3.clinivet.entidade.Cidade;
import br.com.sof3.clinivet.entidade.Cliente;
import br.com.sof3.clinivet.entidade.Fornecedor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class FornecedorDAO extends GenericoDAO{
    
    public int adicionaFornecedor(Fornecedor fornecedor) throws SQLException {
        fornecedor.setId(getNextId("fornecedores"));
        String query = "INSERT INTO fornecedores (id,"
                                           + " nome,"
                                            + "cnpj,"
                                            + "telefone, "
                                            + "email, "
                                            + "bairro, "
                                            + "endereco, "
                                            + "id_cidade) VALUES (?,?,?,?,?,?,?,?)";
        executeCommand(query,
                         fornecedor.getId(),
                         fornecedor.getNome(),
                         fornecedor.getCnpj(),
                         fornecedor.getTelefone(),
                         fornecedor.getEmail(),
                         fornecedor.getBairro(),
                         fornecedor.getEndereco(),
                         fornecedor.getCidade().getId());
        return fornecedor.getId();
    }
    public List<Fornecedor> getAllFornecedores() throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM fornecedores");
        List<Fornecedor> toReturn = new LinkedList<Fornecedor>();
        
        while (rs.next()) {
            toReturn.add(populateFornecedorInfo(rs));
        }
        rs.close();
        
        return toReturn;
    }
    public Fornecedor getFornecedorByCnpj(String cnpj) throws SQLException{
        Fornecedor toReturn = new Fornecedor();
        
        ResultSet rs = executeQuery("SELECT * FROM fornecedores WHERE cnpj = ?", cnpj);
        try{
            if (rs.next()) {
                toReturn = populateFornecedorInfo(rs);
            }
            rs.close();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao buscar Fornecedor :: classe FornecedorDAO metodo getFornecedorByCnpj");
        }
        JOptionPane.showMessageDialog(null,toReturn.exibir());
        return toReturn;
    }
    public static Fornecedor populateFornecedorInfo(ResultSet rs) throws SQLException {
        Fornecedor toReturn = new Fornecedor();
        CidadeDAO cdao = new CidadeDAO();
        toReturn.setId(rs.getInt("id"));
        toReturn.setNome(rs.getString("nome"));
        toReturn.setCnpj(rs.getString("cnpj"));
        toReturn.setTelefone(rs.getString("telefone"));
        toReturn.setEmail(rs.getString("email"));
        toReturn.setBairro(rs.getString("bairro"));
        toReturn.setEndereco(rs.getString("endereco"));
        toReturn.setCidade(cdao.getCidade(rs.getInt("id_cidade")));
        return toReturn;
    }
//    public static Cidade getCidadeById(int id) throws SQLException{
//        Cidade cidade = new Cidade();
//        try{
//            ResultSet rs = executeQuery("SELECT * FROM cidades WHERE id = ?", id);
//        
//            if (rs.next()) {
//                cidade = populateCidadeInfo(rs);
//            }
//            rs.close();
//            
//        }catch(Exception ex){
//            JOptionPane.showMessageDialog(null, "Erro ao pegar cidade por id :: classe FornecedorDAO metodo getFornecedorByCnpj");
//        }
//        return cidade;
//    }
}
