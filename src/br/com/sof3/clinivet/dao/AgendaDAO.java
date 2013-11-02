package br.com.sof3.clinivet.dao;

import br.com.sof3.clinivet.entidade.Agenda;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class AgendaDAO extends GenericoDAO{
    
    public void fazerAgendamento(Agenda agenda) throws SQLException{
        String query = "insert into agendamentos(data,hora_inicio,hora_termino,tipo_servico,observacoes,id_dono,id_animal,sms_inicio_consulta,sms_fim_consulta) values (?,?,?,?,?,?,?,?,?)";
        try{
            JOptionPane.showMessageDialog(null, agenda.getData());
            executeCommand(query, agenda.getData(),agenda.getHora_inicio(),agenda.getHora_termino(), agenda.getTipo_servico(),agenda.getObservacoes(),agenda.getCliente().getId(),agenda.getAnimal().getId(),agenda.isSms_inicio_consulta(),agenda.isSms_fim_consulta());
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao fazer agendamento na classe AgendaDAO: "+ex);
        }
        
    }
    public List<Agenda> buscarAgendamentosDia(String data) throws SQLException{
        List <Agenda> toReturn = new LinkedList<>();
        try{
            String sql = "select * from agendamentos where data = ?";
            ResultSet rs = executeQuery(sql, data);
            while(rs.next()){
                toReturn.add(popullateAgenda(rs));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro ao buscar agendamento pela data na classe AgendaDAO: "+ ex);
        }
        return toReturn;
    }
    public Agenda popullateAgenda(ResultSet rs) throws SQLException{
        Agenda agenda = new Agenda();
        ClienteDAO cliDAO = new ClienteDAO();
        AnimalDAO aniDAO = new AnimalDAO();
        agenda.setData(rs.getString("data"));
        agenda.setHora_inicio(rs.getString("hora_inicio"));
        agenda.setHora_termino(rs.getString("hora_termino"));
        agenda.setTipo_servico(rs.getString("tipo_servico"));
        agenda.setObservacoes(rs.getString("observacoes"));
        agenda.setCliente(cliDAO.getCliente(rs.getInt("id_dono")));
        //JOptionPane.showMessageDialog(null,agenda.getCliente().exibir());
        agenda.setAnimal(aniDAO.getAnimal(rs.getInt("id_animal")));
        agenda.setSms_inicio_consulta(rs.getBoolean("sms_inicio_consulta"));
        agenda.setSms_fim_consulta(rs.getBoolean("sms_fim_consulta"));
        return agenda;
        
    }
    
    
}
