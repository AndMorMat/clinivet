/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.frames;

import br.com.sof3.clinivet.dao.AgendaDAO;
import br.com.sof3.clinivet.entidade.Agenda;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andrematos
 */
public class frmConsultarAgendamento extends javax.swing.JFrame {

    /**
     * Creates new form frmConsultarAgendamento
     */
    public frmConsultarAgendamento() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WIDTH);
        lblTotalDeAgend.setText("Total de agendamentos: 0");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        data = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_horarios = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblTotalDeAgend = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_horarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"08:00", null},
                {"08:30", null},
                {"09:00", null},
                {"09:30", null},
                {"10:00", null},
                {"10:30", null},
                {"11:00", null},
                {"11:30", null},
                {"12:00", null},
                {"12:30", null},
                {"13:00", null},
                {"13:30", null},
                {"14:00", null},
                {"14:30", null},
                {"15:00", null},
                {"15:30", null},
                {"16:00", null},
                {"16:30", null},
                {"17:00", null},
                {"17:30", null},
                {"18:00", null}
            },
            new String [] {
                "Horário", "Dia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_horarios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_horarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_horarios);
        tbl_horarios.getColumnModel().getColumn(0).setPreferredWidth(100);
        tbl_horarios.getColumnModel().getColumn(1).setPreferredWidth(800);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setText("Consultar Agendamentos");

        lblTotalDeAgend.setText("Total de agendamentos: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(lblTotalDeAgend))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTotalDeAgend)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        AgendaDAO agendaDAO = new AgendaDAO();
        List<Agenda> agenda = new LinkedList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  
        String dataFormatada="";
        
        try {
            limparTabela();
            if(data.getDate()!= null){
                
                dataFormatada = sdf.format(data.getDate());
      
                agenda = agendaDAO.buscarAgendamentosDia(dataFormatada);
                
                if(agenda.size() > 0){
                    int cont=-1;
                    DefaultTableModel dtm = (DefaultTableModel)tbl_horarios.getModel();
                    for(int aux = 0; aux < agenda.size(); aux++){
                        for(int aux1 = 0; aux1 < tbl_horarios.getRowCount(); aux1++){
                            
                            if(dtm.getValueAt(aux1, 0).equals(agenda.get(aux).getHora_inicio())){
                                dtm.setValueAt(agenda.get(aux).addTable(), aux1, 1);
                                cont=1;//significa o horario inicial da consulta
                            }
                            if(cont==1){//se o cont for igual a 1 significa que a consulta iniciou e ainda não terminou então pode ser setado o addTable na tabela
                                dtm.setValueAt(agenda.get(aux).addTable(), aux1, 1);
                            }
                            if(dtm.getValueAt(aux1, 0).equals(agenda.get(aux).getHora_termino())){
                                dtm.setValueAt(agenda.get(aux).addTable(), aux1, 1);
                                cont=0;//significa o horario final da consulta
                            }
                               
                        }
                   }
//                    
                    
                }
                
            }
            lblTotalDeAgend.setText("Total de agendamentos: "+agenda.size());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao carregar agendamentos na tabela" +ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    public void limparTabela(){
        DefaultTableModel dtm =  (DefaultTableModel) tbl_horarios.getModel();
        int cont = dtm.getRowCount();
            for(int aux=cont-1 ;   aux>=0;  aux--){//removendo valores da tabela
                dtm.setValueAt("", aux, 1);
            }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private com.toedter.calendar.JDateChooser data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotalDeAgend;
    private static javax.swing.JTable tbl_horarios;
    // End of variables declaration//GEN-END:variables
}
