/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sof3.clinivet.frames;

import br.com.sof3.clinivet.dao.ClienteDAO;
import br.com.sof3.clinivet.dao.VendaDAO;
import br.com.sof3.clinivet.entidade.Cliente;
import java.awt.Frame;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Renan
 */
public class frmPesquisaParaEnviarSMS extends javax.swing.JFrame {
    private final VendaDAO dao = new VendaDAO();
    ClienteDAO cdao = new ClienteDAO();
    /**
     * Creates new form frmPesquisaParaEnviarSMS
     */
    public frmPesquisaParaEnviarSMS() {
        initComponents();
        setDefaultCloseOperation(WIDTH);
        setLocationRelativeTo(null);;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblNomeVendedor = new javax.swing.JLabel();
        rbtNome = new javax.swing.JRadioButton();
        rbtCpf = new javax.swing.JRadioButton();
        txtBuscaCliente = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnUltimosCad = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuscaCli = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNomeVendedor.setText("Buscar Clientes:");

        buttonGroup1.add(rbtNome);
        rbtNome.setSelected(true);
        rbtNome.setText("Nome");
        rbtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNomeActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtCpf);
        rbtCpf.setText("CPF");
        rbtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtCpfActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnUltimosCad.setText("Ultimos Cadastros");
        btnUltimosCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimosCadActionPerformed(evt);
            }
        });

        jButton1.setText("Enviar SMS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Escolha o cliente para enviar SMS");

        tblBuscaCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Celular"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBuscaCli);
        if (tblBuscaCli.getColumnModel().getColumnCount() > 0) {
            tblBuscaCli.getColumnModel().getColumn(1).setResizable(false);
            tblBuscaCli.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNomeVendedor)
                                .addGap(354, 354, 354)
                                .addComponent(btnUltimosCad, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtCpf))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeVendedor)
                    .addComponent(btnUltimosCad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtNome)
                    .addComponent(rbtCpf))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtNomeActionPerformed

    private void rbtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtCpfActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        DefaultTableModel dtm = (DefaultTableModel)tblBuscaCli.getModel();

        int cont2 = dtm.getRowCount();
        for(int aux=cont2-1 ;   aux>=0;  aux--){//removendo valores da tabela
            dtm.removeRow(aux);
        }

        if(txtBuscaCliente.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite para pesquisar");

        }else{
            int cont=0;
            try {

                List<Cliente> cli = new LinkedList<Cliente>();

                Cliente c = new Cliente();

                if(rbtNome.isSelected()){

                    cli = cdao.getClientesByName(txtBuscaCliente.getText());

                }else{

                    int validador=0;
                    String letras="abcdefghyjklmnopqrstuvwxyz.";
                    String    texto = txtBuscaCliente.getText().toLowerCase();

                    for(int i=0; i<texto.length(); i++){
                        if (letras.indexOf(texto.charAt(i),0)!=-1){
                            validador =1;
                        }
                    }

                    if(validador==0){

                        StringBuilder stringBuilder = new StringBuilder(texto);

                        for(int i=0; i<texto.length(); i++){
                            if(i==3)
                            stringBuilder.insert(3, '.');
                            else if(i==8)
                            stringBuilder.insert(7, '.');
                            else if(i==11)
                            stringBuilder.insert(11, '-');
                            else if (letras.indexOf(texto.charAt(i),0)!=-1){
                                validador =1;
                            }
                        }

                        cli = cdao.getClientesByCPF(stringBuilder.toString());

                    }else{
                        cont++;//para acrescentar e não exibir nenhum resitro, já ira exibir somente numeros
                        JOptionPane.showMessageDialog(null, "Informe somente números");
                    }
                }
                for(int aux =0;aux<cli.size();aux++){
                    c.setNome(cli.get(aux).getNome());
                    c.setCpf(cli.get(aux).getCpf());
                    c.setCelular(cli.get(aux).getCelular());

                    dtm.addRow(c.addTable());
                    cont++;
                }
                if(cont==0)//para exibir caso procura não exiba nada
                JOptionPane.showMessageDialog(null, "Nenhum Registro encontrado");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro no try da classe frmPesquisaCliente no botao ultimos cadastros ");
            }

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnUltimosCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimosCadActionPerformed
        // TODO add your handling code here:

        DefaultTableModel dtm = (DefaultTableModel)tblBuscaCli.getModel();

        for(int aux=0;aux<dtm.getRowCount();aux++)
        dtm.removeRow(aux);

        try {

            List<Cliente> cli = new LinkedList<Cliente>();

            Cliente c = new Cliente();

            int cont = dtm.getRowCount();
            for(int aux=cont-1 ;   aux>=0;  aux--){//removendo valores da tabela
                dtm.removeRow(aux);
            }

            cli = cdao.getClientesByID();

            for(int aux=0 ;aux<cli.size();aux++){
                if(aux<6){
                    c.setNome(cli.get(aux).getNome());
                    c.setCpf(cli.get(aux).getCpf());
                    c.setTelefone(cli.get(aux).getTelefone());

                    dtm.addRow(c.addTable());
                }

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no try da classe frmPesquisaCliente no botao buscar ");
        }

    }//GEN-LAST:event_btnUltimosCadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel)tblBuscaCli.getModel();
            
            ClienteDAO cdao = new ClienteDAO();
            Cliente cliente = new Cliente();
            int idCliente;
            
            if (tblBuscaCli.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "Você deve selecionar um cliente para enviar SMS","Erro",JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            idCliente = cdao.getIdByCpf(String.valueOf(dtm.getValueAt(tblBuscaCli.getSelectedRow(), 1)));
            cliente = cdao.getCliente(idCliente);
            
            frmEnviaSMS enviaSMS = new frmEnviaSMS(cliente);
            enviaSMS.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(frmReporEstoque.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnUltimosCad;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNomeVendedor;
    private javax.swing.JRadioButton rbtCpf;
    private javax.swing.JRadioButton rbtNome;
    private javax.swing.JTable tblBuscaCli;
    private javax.swing.JTextField txtBuscaCliente;
    // End of variables declaration//GEN-END:variables
}
