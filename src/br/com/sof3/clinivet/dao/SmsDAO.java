/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.dao;

import br.com.sof3.clinivet.entidade.Sms;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author andrematos
 */
public class SmsDAO extends GenericoDAO{
    
    public void adicionaSms(Sms sms){
        try{
            sms.setId(getNextId("sms"));
            executeCommand("insert into sms(id,data,texto,id_vendedor,id_cliente,hora) values (?,?,?,?,?,?)", sms.getId(),sms.getData(),sms.getTexto(),sms.getVendedor().getId(),sms.getCliente().getId(),sms.getHora());
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro ao adicionar sms: "+ ex);
        }
    }
    public List<Sms> getSmsByDate(String data)throws SQLException{
        List<Sms> msgns = new LinkedList<>();
        try{
            ResultSet rs = executeQuery("select * from sms where data = ?", data);
            while(rs.next()){
                msgns.add(popullateSms(rs));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro ao buscar sms pela data na classe smsDAO: "+ ex);
        }
        return msgns;
    }
    public List<Sms> getAllSms(){
        List<Sms> mensagens = new LinkedList<>();
        try{
            ResultSet rs = executeQuery("select * from sms");
            
            while(rs.next()){
                mensagens.add(popullateSms(rs));
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro ao buscar todos os sms: "+ ex);
        }
        return mensagens;
    }
    public List<Sms> getSmsByIdVendedor(int id_vendedor)throws SQLException{
        List<Sms> toReturn = new LinkedList<>();
        try{
            ResultSet rs = executeQuery("select * from sms where id_vendedor = ?",id_vendedor);
            while(rs.next()){
                toReturn.add(popullateSms(rs));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao buscar sms por vendedor: "+ex);
        }
        return toReturn;
    }
    private Sms popullateSms(ResultSet rs)throws SQLException{
        Sms toReturn = new Sms();
        VendedorDAO vendedorDAO = new VendedorDAO();
        ClienteDAO clienteDAO = new ClienteDAO();
        toReturn.setId(rs.getInt("id"));
        toReturn.setData(rs.getString("data"));
        toReturn.setTexto(rs.getString("texto"));
        toReturn.setVendedor(vendedorDAO.getVendedor(rs.getInt("id_vendedor")));
        toReturn.setCliente(clienteDAO.getCliente(rs.getInt("id_cliente")));
        toReturn.setHora(rs.getString("hora"));
        return toReturn;
    }
    
}
