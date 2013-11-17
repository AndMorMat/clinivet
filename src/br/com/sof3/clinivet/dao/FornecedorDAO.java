package br.com.sof3.clinivet.dao;

import static br.com.sof3.clinivet.dao.CidadeDAO.populateCidadeInfo;
import br.com.sof3.clinivet.entidade.Cidade;
import br.com.sof3.clinivet.entidade.Cliente;
import br.com.sof3.clinivet.entidade.Fornecedor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class FornecedorDAO extends GenericoDAO{
    
    public int adicionaFornecedor(Fornecedor fornecedor) throws SQLException {
        String query = "INSERT INTO fornecedores (id,"
                                           + " nome,"
                                            + "cnpj,"
                                            + "telefone, "
                                            + "email, "
                                            + "bairro, "
                                            + "endereco, "
                                            + "id_cidade,inativo) VALUES (?,?,?,?,?,?,?,?,?)";
        executeCommand(query,
                         fornecedor.getId(),
                         fornecedor.getNome(),
                         fornecedor.getCnpj(),
                         fornecedor.getTelefone(),
                         fornecedor.getEmail(),
                         fornecedor.getBairro(),
                         fornecedor.getEndereco(),
                         fornecedor.getCidade().getId(),
                         fornecedor.isInativo());
        return fornecedor.getId();
    }
    public int getIdFornecedor(String cnpj) throws SQLException{
        String sql = "select * from fornecedores where cnpj = ?";
        int id=-1;
        Fornecedor forne = new Fornecedor();
        ResultSet rs = executeQuery(sql,cnpj);
        while(rs.next()){
            forne=populateFornecedorInfo(rs);
            id=forne.getId();
        }
        return id;
    }
    public void atualizaFornecedor(Fornecedor fornecedor) throws SQLException{
       try{
           String query = "update fornecedores set nome=?, cnpj=?, telefone=?, email=?, bairro=?, endereco=?, id_cidade=?, inativo = ? where id = ?";
           executeCommand(query,fornecedor.getNome(),fornecedor.getCnpj(),fornecedor.getTelefone(),fornecedor.getEmail(),fornecedor.getBairro(),fornecedor.getEndereco(), fornecedor.getCidade().getId(),fornecedor.isInativo(),fornecedor.getId());
           //JOptionPane.showMessageDialog(null, "Depois de atualizar");
       }catch(Exception ex){
           JOptionPane.showMessageDialog(null,"Erro atualizar fornecedor no metodo atualizaFornecedor na classe FornecedorDAO: "+ ex);
       }
    }
    
    public List<Fornecedor> getAllFornecedores() throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM fornecedores where inativo = 0");
        List<Fornecedor> toReturn = new LinkedList<Fornecedor>();
        
        while (rs.next()) {
            toReturn.add(populateFornecedorInfo(rs));
        }
        rs.close();
        
        return toReturn;
    }
    
    public Fornecedor getFornecedorByCnpj(String cnpj) throws SQLException{
        Fornecedor toReturn = new Fornecedor();
        
        ResultSet rs = executeQuery("SELECT * FROM fornecedores WHERE inativo = 0 and cnpj = ?",cnpj);//testando funcao
        try{
            while(rs.next()) {
                toReturn = populateFornecedorInfo(rs);
            }
            rs.close();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao buscar Fornecedor :: classe FornecedorDAO metodo getFornecedorByCnpj");
        }
       // JOptionPane.showMessageDialog(null,toReturn.exibir());
        return toReturn;
    }
    public ArrayList <Fornecedor> FiltrarFornecedorTelefone(String telefone) throws SQLException{
        ArrayList<Fornecedor> toReturn = new ArrayList<>();
        
        ResultSet rs = executeQuery("SELECT * FROM fornecedores WHERE inativo = 0 and telefone like \""+telefone+"%\";");//testando funcao
        try{
            while (rs.next()) {
                toReturn.add(populateFornecedorInfo(rs));
            }
            rs.close();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao buscar Fornecedor :: classe FornecedorDAO metodo getFornecedorByCnpj");
        }
        return toReturn;
    }
    public ArrayList <Fornecedor> FiltrarFornecedorNome(String nome) throws SQLException{
        ArrayList<Fornecedor> toReturn = new ArrayList<>();
        
        ResultSet rs = executeQuery("SELECT * FROM fornecedores WHERE inativo = 0 and nome like \""+nome+"%\";");//testando funcao
        try{
            while (rs.next()) {
                toReturn.add(populateFornecedorInfo(rs));
            }
            rs.close();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao buscar Fornecedor :: classe FornecedorDAO metodo getFornecedorByCnpj");
        }
        return toReturn;
    }
    public ArrayList <Fornecedor> FiltrarFornecedorCnpj(String cnpj) throws SQLException{
        ArrayList<Fornecedor> toReturn = new ArrayList<>();
     
        ResultSet rs = executeQuery("SELECT * FROM fornecedores WHERE inativo = 0 and cnpj like \""+cnpj+"%\";");//testando funcao
        try{
            while(rs.next()) {
                toReturn.add(populateFornecedorInfo(rs));
            }
            rs.close();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao buscar Fornecedor :: classe FornecedorDAO metodo getFornecedorByCnpj");
        }
        return toReturn;
    }
    public Fornecedor getTodosFornecedorAteInativos(int idFornecedor) throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM fornecedores WHERE ID = ?", idFornecedor);
        Fornecedor fornecedor = null;
        if (rs.next()) {
            fornecedor = populateFornecedorInfo(rs);
        }
        rs.close();
        return fornecedor;
    }
    public Fornecedor getFornecedor(int idFornecedor) throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM fornecedores WHERE inativo = 0 and ID = ?", idFornecedor);
        Fornecedor fornecedor = null;
        if (rs.next()) {
            fornecedor = populateFornecedorInfo(rs);
        }
        rs.close();
        return fornecedor;
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
        toReturn.setInativo(rs.getBoolean("inativo"));
        return toReturn;
    }
    public void inativarFornecedor(int idFornecedor){
        try{
            executeCommand("update fornecedores set inativo = ? where id = ?", true,idFornecedor);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro ao inutilizar fornecedor na classe fornecedorDAO: "+ ex);
        }
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
    public boolean getCNPJDuplicado(String cnpj) throws SQLException{
        ResultSet rs = executeQuery("SELECT * FROM fornecedores WHERE cnpj =  ?", cnpj);//Pesquisando CNPJ do fornecedor a ser cadastrado
        boolean found = false;  
        
        while (rs.next()) {   
             found = true;  //Caso seja encontrado um cadastro retorna verdadeiro
        }
        
        return found;
    }
}
