package br.com.sof3.clinivet.dao;

import br.com.sof3.clinivet.entidade.Agenda;
import java.sql.Date;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AgendaDAO extends GenericoDAO{
    
    public void fazerAgendamento(Agenda agenda) throws SQLException{
        String query = "insert into agendamentos(data,hora_inicio,hora_termino,tipo_servico,observacoes,id_dono,id_animal) values (?,?,?,?,?,?,?)";
        try{
            JOptionPane.showMessageDialog(null, agenda.getData());
            executeCommand(query, agenda.getData(),agenda.getHora_inicio(),agenda.getHora_termino(), agenda.getTipo_servico(),agenda.getObservacoes(),agenda.getCliente().getId(),agenda.getAnimal().getId());
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao fazer agendamento na classe AgendaDAO: "+ex);
        }
        
    }
    
    
}
