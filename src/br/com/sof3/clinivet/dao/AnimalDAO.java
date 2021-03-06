package br.com.sof3.clinivet.dao;

import static br.com.sof3.clinivet.dao.AnimalDAO.populateAnimal;
import br.com.sof3.clinivet.entidade.Animal;
import br.com.sof3.clinivet.entidade.EnumTipoAnimal;
import br.com.sof3.clinivet.entidade.Raca;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class AnimalDAO extends GenericoDAO {

    public AnimalDAO() {
        
    }

    /*public int adicionaAnimal(Animal an) throws SQLException {
        an.setId(getNextId("animais"));
        String query = "INSERT INTO animais (ID, NOME, TIPO_ANIMAL, RACA, DATA_NASCIMENTO, SEXO, ID_DONO) VALUES "
                + "(\""+an.getId()+"\","
                + "\""+an.getNome()+"\""
                + "\""+an.getTipoAnimal()+"\","
                + "\""+an.getRaca()+"\","
                + "\""+an.getDataNasc()+","
                + "\""+an.getSexo()+"\""
                + "\""+an.getId()+"\")";
        JOptionPane.showMessageDialog(null, query);
        
        JOptionPane.showMessageDialog(null, "Antes de executar a query");
        executeCommand(query, an.getId(), an.getNome(), an.getTipoAnimal().toString(), an.getRaca(), an.getDataNasc(), an.getSexo(), an.getDono().getId());
        JOptionPane.showMessageDialog(null, "Depois de executar a query");
        return an.getId();
    }*/
    
    
    
    public int adicionaAnimal(Animal an) throws SQLException {
        try{
            an.setId(getNextId("animais"));
            String query = "INSERT INTO animais (ID, NOME, TIPO_ANIMAL, ID_RACA, ANO_NASCIMENTO, SEXO, ID_DONO, INATIVO) VALUES (?,?,?,?,?,?,?,?)";
            executeCommand(query, an.getId(), an.getNome(), an.getTipoAnimal(), an.getRaca().getId(), an.getDataNasc(), an.getSexo(), an.getDono().getId(),an.isInativo());
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar animal no metodo adicionaAnimal na classe AnimalDAO"+ex);
        }
        return an.getId();
    }
    public void inativarAnimais(int idAnimal) throws SQLException{
        try{
            executeCommand("update animais set inativo=? where id=?", true,idAnimal);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao inativar animal na classe animalDAO: "+ex);
        }
    }
    /*
    public void removeAnimal(int idAnimal) throws SQLException {
        executeCommand("DELETE FROM animais WHERE ID = ?", idAnimal);
    }*/

    public void atualizarAnimal(Animal an) throws SQLException {
        try{
            String query = "UPDATE animais SET ID_DONO = ?,NOME=?,TIPO_ANIMAL=?,ID_RACA=?,ANO_NASCIMENTO=?, SEXO=? WHERE ID = ?";
            executeCommand(query, an.getDono().getId(), an.getNome(), an.getTipoAnimal().toString(), an.getRaca().getId(), an.getDataNasc(), an.getSexo(),an.getId());
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar animal na classe AnimalDAO: "+ex);
        }
    }

    public Animal getAnimal(int idAnimal) throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM animais  a WHERE ID = ?", idAnimal);
        Animal an = null;
        while (rs.next()) {
            an = populateAnimal(rs);
        }
        rs.close();
        return an;
    }

    public List<Animal> getAllAnimais() throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM animais a");
        List<Animal> toReturn = new LinkedList<Animal>();
        while (rs.next()) {
            toReturn.add(populateAnimal(rs));
        }
        rs.close();
        return toReturn;

    }

    public List<Animal> getAnimalByName(String nome) throws SQLException {
        List<Animal> toReturn = new LinkedList<Animal>();
        ResultSet rs = executeQuery("SELECT * FROM animais a WHERE nome like \""+nome+"%\";");
        while (rs.next()) {
            toReturn.add(populateAnimal(rs));
        }
        rs.close();
        return toReturn;
    }
    
       
    public List<Animal> getAnimaisDoCliente(int idCliente) throws SQLException {//função com defeito
        List<Animal> toReturn = new LinkedList<Animal>();
        
        ResultSet rs = executeQuery("SELECT a.nome FROM clientes c INNER JOIN animais a on c.id = a.id_dono WHERE c.id = ?;", idCliente);
        
        while (rs.next()) {
            toReturn.add(populateAnimal(rs));
        }
        rs.close();
        return toReturn;
    }

    
    public List<Animal> getTodosAnimaisDoCliente(int idCliente) throws SQLException {
        List<Animal> toReturn = new LinkedList<Animal>();
   
        ResultSet rs = executeQuery("SELECT * FROM clientes c INNER JOIN animais a on c.id = a.id_dono WHERE c.id = ?;", idCliente);
        
        while (rs.next()) {
            toReturn.add(populateAnimal(rs));
        }
        rs.close();
        return toReturn;
    }
    

    public static Animal populateAnimal(ResultSet rs) throws SQLException {
        final ClienteDAO clienteDAO = new ClienteDAO();
        final RacaDAO racaDAO = new RacaDAO();
        Animal toReturn = new Animal();
        toReturn.setId(rs.getInt("a.ID"));
        toReturn.setNome(rs.getString("a.NOME"));//ajustado para exibir somente o nome do animal e não do 
        toReturn.setTipoAnimal(rs.getString("TIPO_ANIMAL"));
        toReturn.setRaca(racaDAO.getRacaById(rs.getInt("ID_RACA")));
        toReturn.setDataNasc(rs.getString("ANO_NASCIMENTO"));
        toReturn.setSexo(rs.getString("SEXO"));
        toReturn.setDono(clienteDAO.getCliente(rs.getInt("ID_DONO")));
        toReturn.setInativo(rs.getBoolean("a.INATIVO"));
     
        return toReturn;
    }
    
    public List<Animal> getMaxAnimal() throws SQLException {
        List<Animal> toReturn = new LinkedList<Animal>();
        ResultSet rs = executeQuery("SELECT * FROM animais  a ORDER BY id DESC;");
   
        while (rs.next()) {
            toReturn.add(populateAnimal(rs));
        }
        
        rs.close();
        
        return toReturn;
    }
    
    public List<Animal> getAnimalbyIDcod(int id) throws SQLException {//procurar somente por código
        List<Animal> toReturn = new LinkedList<Animal>();
        
        ResultSet rs = executeQuery("SELECT * FROM animais a WHERE id = ?",id);
        
        while (rs.next()) {
            toReturn.add(populateAnimal(rs));
        }
        rs.close();
        return toReturn;
    }
    
    public List<Animal> getAnimalbyTipoAni(String tipo) throws SQLException {//procurar somente por código
        List<Animal> toReturn = new LinkedList<Animal>();
                            
        ResultSet rs = executeQuery("SELECT * FROM animais a INNER JOIN raca r on a.id_raca = r.id WHERE r.nome like \""+tipo+"%\";");
        
        while (rs.next()) {
            toReturn.add(populateAnimal(rs));
        }
        rs.close();
        return toReturn;
    }
}
