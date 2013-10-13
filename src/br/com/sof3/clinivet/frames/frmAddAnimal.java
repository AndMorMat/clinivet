/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.frames;

import br.com.sof3.clinivet.dao.AnimalDAO;
import br.com.sof3.clinivet.dao.ClienteDAO;
import br.com.sof3.clinivet.entidade.Animal;
import br.com.sof3.clinivet.entidade.EnumTipoAnimal;
import br.com.sof3.clinivet.entidade.Cliente;
import br.com.sof3.clinivet.entidade.EnumTipoAnimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Renan
 */
public class frmAddAnimal extends javax.swing.JDialog {
    private final AnimalDAO dao;
    private final ClienteDAO cdao;
    
    //private final frmAnimais frame;
    /**
     * Creates new form frmAddAnimal
     */
    
    public frmAddAnimal(java.awt.Frame parent, boolean modal, AnimalDAO dao, ClienteDAO cdao){//, frmAnimais frame) {
        super(parent, modal);
        //this.frame = frame;
        this.dao = dao;
        this.cdao = cdao;
        
        addEnumTipo();
        loadInitialComboData();
        //initComponents();
         
        setLocationRelativeTo(null);
        setVisible(true);
        txtNome.requestFocus();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkSexo = new javax.swing.ButtonGroup();
        tituloAnimais = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblTipoAnimal = new javax.swing.JLabel();
        lblRaca = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        lblDono = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        comboTipoAnimal = new javax.swing.JComboBox();
        txtRaca = new javax.swing.JTextField();
        txtNasc = new javax.swing.JTextField();
        comboDono = new javax.swing.JComboBox();
        btnOK = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        checkMasculino = new javax.swing.JRadioButton();
        checkFeminino = new javax.swing.JRadioButton();

        tituloAnimais.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        tituloAnimais.setText("Cadastrar Animais");

        lblNome.setText("Nome:");

        lblTipoAnimal.setText("Tipo Animal:");

        lblRaca.setText("Raça:");

        lblIdade.setText("Idade:");

        lblDono.setText("Dono:");

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        checkSexo.add(checkMasculino);
        checkMasculino.setText("Masculino");

        checkSexo.add(checkFeminino);
        checkFeminino.setText("Feminino");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(checkMasculino)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(checkFeminino)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(checkMasculino)
                    .add(checkFeminino))
                .add(0, 9, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(96, 96, 96)
                        .add(tituloAnimais))
                    .add(layout.createSequentialGroup()
                        .add(103, 103, 103)
                        .add(btnOK, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 115, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(btnCancelar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(40, 40, 40)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(44, 44, 44)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(layout.createSequentialGroup()
                                        .add(lblNome)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(txtNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 180, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(layout.createSequentialGroup()
                                        .add(lblRaca)
                                        .add(18, 18, 18)
                                        .add(txtRaca, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 181, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                            .add(layout.createSequentialGroup()
                                .add(36, 36, 36)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(layout.createSequentialGroup()
                                            .add(lblIdade)
                                            .add(18, 18, 18)
                                            .add(txtNasc, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 173, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .add(layout.createSequentialGroup()
                                            .add(lblDono)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(comboDono, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 161, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(lblTipoAnimal)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(comboTipoAnimal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 184, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(3, 3, 3)))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(24, 24, 24)
                .add(tituloAnimais)
                .add(38, 38, 38)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblNome)
                    .add(txtNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblTipoAnimal)
                    .add(comboTipoAnimal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblRaca)
                    .add(txtRaca, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblIdade)
                    .add(txtNasc, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblDono)
                    .add(comboDono, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 58, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnOK)
                    .add(btnCancelar))
                .add(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    public void addEnumTipo(){
        initComponents();
        for(EnumTipoAnimal ea: EnumTipoAnimal.values()){
             comboTipoAnimal.addItem(ea.getNome());   
        }
        
        
    }
    
    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        /*if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nome não pode ficar em branco.");
            txtNome.requestFocus();
        }

        int resp = JOptionPane.showConfirmDialog(this, "Você tem certeza?", "Adicionar Animal", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resp == 2) {
            return;
        }*/

        try {
            Animal animal = new Animal();
            animal.setNome(txtNome.getText());
            JOptionPane.showMessageDialog(null, "Nome: "+txtNome.getText());
            animal.setTipoAnimal(comboTipoAnimal.getSelectedItem().toString());
            JOptionPane.showMessageDialog(null, "\nTipo Animal: "+comboTipoAnimal.getSelectedItem());
            animal.setRaca(txtRaca.getText());
            JOptionPane.showMessageDialog(null, "\nRaça: "+txtRaca.getText());
            animal.setDataNasc((txtNasc.getText()));
            JOptionPane.showMessageDialog(null, "\nData Nasc: "+txtNasc.getText());
            animal.setSexo(checkMasculino.isSelected() ? "Masculino" : "Feminino");
            JOptionPane.showMessageDialog(null, "\nSexo: " + (checkMasculino.isSelected() ? "Masculino" : "Feminino"));
            //animal.setTipoAnimal((EnumTipoAnimal) comboTipoAnimal.getSelectedItem());
            animal.setDono((Cliente) comboDono.getSelectedItem());
            animal.exibir();
            dao.adicionaAnimal(animal);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Não foi possível adicionar o animal, tente novamente!");
            return;
        }
        setVisible(false);
    }//GEN-LAST:event_btnOKActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOK;
    private javax.swing.JRadioButton checkFeminino;
    private javax.swing.JRadioButton checkMasculino;
    private javax.swing.ButtonGroup checkSexo;
    private javax.swing.JComboBox comboDono;
    private javax.swing.JComboBox comboTipoAnimal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDono;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRaca;
    private javax.swing.JLabel lblTipoAnimal;
    private javax.swing.JLabel tituloAnimais;
    private javax.swing.JTextField txtNasc;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRaca;
    // End of variables declaration//GEN-END:variables
    private void loadInitialComboData() {
       // DefaultComboBoxModel combo = new DefaultComboBoxModel(EnumTipoAnimal.values());
        //comboTipoAnimal.setModel(combo);

        try {
            ClienteDAO clienteDAO = new ClienteDAO();
           
            Vector<Cliente> clientes = new Vector<Cliente>(clienteDAO.getAllClientes());
            
            DefaultComboBoxModel comboCliente = new DefaultComboBoxModel(clientes);
            comboDono.setModel(comboCliente);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao carregar a lista de donos");
        }

    }
    
}
