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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andrematos
 */
public class frmCancelarAgendamento extends javax.swing.JFrame {

    /**
     * Creates new form frmCancelarAgendamento
     */
    public frmCancelarAgendamento() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WIDTH);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        data = new com.toedter.calendar.JDateChooser();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAgendamentos = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        lblTotalAgendamentos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setText("Cancelar Agendamentos");

        jLabel2.setText("Dia");

        tblAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Serviço", "Inicio", "Término", "Observações", "Cliente", "Animal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAgendamentos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblAgendamentos);
        tblAgendamentos.getColumnModel().getColumn(0).setPreferredWidth(5);
        tblAgendamentos.getColumnModel().getColumn(1).setMinWidth(20);
        tblAgendamentos.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblAgendamentos.getColumnModel().getColumn(2).setPreferredWidth(20);
        tblAgendamentos.getColumnModel().getColumn(3).setPreferredWidth(20);
        tblAgendamentos.getColumnModel().getColumn(4).setPreferredWidth(100);
        tblAgendamentos.getColumnModel().getColumn(5).setPreferredWidth(50);
        tblAgendamentos.getColumnModel().getColumn(6).setPreferredWidth(50);

        btnCancelar.setText("Cancelar agendamento");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblTotalAgendamentos.setText("Total de agendamentos: 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblTotalAgendamentos))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar)
                        .addComponent(btnCancelar)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTotalAgendamentos)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        if(data.getDate()!= null){
            AgendaDAO agendaDAO = new AgendaDAO();
            List <Agenda> agendas = new LinkedList<>();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  
            String dataFormatada="";
            dataFormatada = sdf.format(data.getDate());
            DefaultTableModel dtm = (DefaultTableModel)tblAgendamentos.getModel();
            try {
                agendas = agendaDAO.buscarAgendamentosDia(dataFormatada);
                JOptionPane.showMessageDialog(null, agendas.size());
                for(int aux=0;aux<agendas.size();aux++){
                    dtm.addRow(agendas.get(aux).addTableCancelamento());
                }
                lblTotalAgendamentos.setText("Total de agendamentos: "+agendas.size());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao buscar agendamentos pelo dia na classe frmCancelarAgendamentos: "+ ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Escolha uma data");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private com.toedter.calendar.JDateChooser data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotalAgendamentos;
    private javax.swing.JTable tblAgendamentos;
    // End of variables declaration//GEN-END:variables
}