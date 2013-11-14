/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.frames;

import br.com.sof3.clinivet.dao.AnimalDAO;
import br.com.sof3.clinivet.dao.ClienteDAO;
import br.com.sof3.clinivet.dao.RacaDAO;
import br.com.sof3.clinivet.entidade.Animal;
import br.com.sof3.clinivet.entidade.EnumTipoAnimal;
import br.com.sof3.clinivet.entidade.Cliente;
import br.com.sof3.clinivet.entidade.EnumTipoAnimal;
import br.com.sof3.clinivet.entidade.Raca;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Renan
 */
public class frmAddAnimal extends javax.swing.JDialog {
    
    
    String param;
    Animal animalAntigo = new Animal();
    public frmAddAnimal(String parametro, Animal ani){
        
        initComponents();
        animalAntigo = ani;
        param = parametro;
        addEnumTipo();
        loadInitialData();
        carregaRacas();
        ocultarNotificacoes();
        
        //setDefaultCloseOperation(WIDTH);
        if(parametro.equals("editar")){
            carregaCampos(ani);
            btnFiltrarPor.setVisible(false);
            setTitle("Editar Animais");
            tituloAnimais.setText("Editar animal   ");
            
        }else if(parametro.equals("cadastrar")){
            setTitle("Cadastrar Animais");
            tituloAnimais.setText("Cadastrar animal");
        }
         
        setLocationRelativeTo(null);
        setVisible(true);
        txtNome.requestFocus();
        tblClientes.setRowSelectionInterval(0, 0);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkSexo = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        comboTipoAnimal = new javax.swing.JComboBox();
        lblIdade = new javax.swing.JLabel();
        txtNasc = new javax.swing.JFormattedTextField();
        btnFiltrarPor = new javax.swing.JButton();
        comboRaca = new javax.swing.JComboBox();
        lblDono = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        checkMacho = new javax.swing.JRadioButton();
        checkFemea = new javax.swing.JRadioButton();
        lblTipoAnimal = new javax.swing.JLabel();
        lblRaca = new javax.swing.JLabel();
        lblValidacoesDono = new javax.swing.JLabel();
        lblValidacoesNome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblValidacoesAnoNasc = new javax.swing.JLabel();
        auxNotificacao = new javax.swing.JLabel();
        auxNotificacao2 = new javax.swing.JLabel();
        tituloAnimais = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(214, 255, 213));

        jPanel2.setBackground(new java.awt.Color(195, 239, 198));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNome.setText("Nome:");

        comboTipoAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoAnimalActionPerformed(evt);
            }
        });

        lblIdade.setText("Ano Nasc.");

        try {
            txtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnFiltrarPor.setText("Filtrar dono por");
        btnFiltrarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarPorActionPerformed(evt);
            }
        });

        lblDono.setText("Dono:");

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Telefone"
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
        tblClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblClientes);
        tblClientes.getColumnModel().getColumn(0).setPreferredWidth(150);
        tblClientes.getColumnModel().getColumn(1).setResizable(false);

        jPanel1.setBackground(new java.awt.Color(195, 239, 198));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        checkSexo.add(checkMacho);
        checkMacho.setSelected(true);
        checkMacho.setText("Macho");

        checkSexo.add(checkFemea);
        checkFemea.setText("Fêmea");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(checkMacho)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(checkFemea)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(checkMacho)
                    .add(checkFemea))
                .add(0, 3, Short.MAX_VALUE))
        );

        lblTipoAnimal.setText("Tipo Animal:");

        lblRaca.setText("Raça:");

        lblValidacoesDono.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblValidacoesDono.setForeground(new java.awt.Color(255, 0, 0));
        lblValidacoesDono.setText("Selecione um dono!");

        lblValidacoesNome.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblValidacoesNome.setForeground(new java.awt.Color(255, 0, 0));
        lblValidacoesNome.setText("Nome não pode ser vazio!");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(195, 239, 198));
        jLabel3.setText("jLabel1");

        lblValidacoesAnoNasc.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblValidacoesAnoNasc.setForeground(new java.awt.Color(255, 0, 0));
        lblValidacoesAnoNasc.setText("Ano Nascimento inválido ou vazio!");

        auxNotificacao.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        auxNotificacao.setForeground(new java.awt.Color(195, 239, 198));
        auxNotificacao.setText("aux");

        auxNotificacao2.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        auxNotificacao2.setForeground(new java.awt.Color(195, 239, 198));
        auxNotificacao2.setText("aux");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(33, 33, 33)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(lblDono)
                    .add(lblNome)
                    .add(lblTipoAnimal)
                    .add(lblIdade))
                .add(18, 18, 18)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(txtNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 425, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel3)
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                        .add(txtNasc, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 184, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(comboTipoAnimal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 184, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(lblValidacoesAnoNasc))
                                .add(17, 17, 17)
                                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jPanel2Layout.createSequentialGroup()
                                        .add(lblRaca)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(comboRaca, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 181, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(jPanel2Layout.createSequentialGroup()
                                        .add(auxNotificacao2)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                            .add(lblValidacoesDono)
                            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(btnFiltrarPor)
                                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 437, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(lblValidacoesNome)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(auxNotificacao)
                        .add(90, 90, 90))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(21, 21, 21)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(btnFiltrarPor)
                    .add(lblValidacoesDono))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 119, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(lblValidacoesNome)
                            .add(auxNotificacao)))
                    .add(lblDono))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblNome)
                    .add(txtNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(3, 3, 3)
                .add(jLabel3)
                .add(3, 3, 3)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblTipoAnimal)
                    .add(comboTipoAnimal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblRaca)
                    .add(comboRaca, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(11, 11, 11)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(lblValidacoesAnoNasc)
                            .add(auxNotificacao2))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(lblIdade)
                            .add(txtNasc, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(101, 101, 101))
        );

        tituloAnimais.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        tituloAnimais.setForeground(new java.awt.Color(36, 114, 76));
        tituloAnimais.setText("Cadastrar Animais");

        btnOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sof3/clinivet/frames/Imagens/adicionar_animais_botao.png"))); // NOI18N
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

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/andrematos/Imagens/Icones/animais_top.png")); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(btnOK, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 115, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnCancelar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(43, 43, 43))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(25, 25, 25))))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(tituloAnimais)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel1))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jLabel1)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(tituloAnimais)
                        .add(34, 34, 34)))
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 353, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(25, 25, 25)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(btnOK, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(btnCancelar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(25, 25, 25))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    public void addEnumTipo(){
        
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
        if(param.equals("cadastrar")){
            
            AnimalDAO dao = new AnimalDAO();
            ClienteDAO cdao = new ClienteDAO();
            DefaultTableModel dtm = (DefaultTableModel)tblClientes.getModel();
            try {
                if(!validaCampos())
                    return;
                    
                    Animal animal = new Animal();
                    RacaDAO racaDAO = new RacaDAO();
                    ClienteDAO clienteDAO = new ClienteDAO();
                    Raca raca = new Raca();
                    raca = racaDAO.getRaca(comboRaca.getSelectedItem().toString());
                    animal.setNome(txtNome.getText());
                    animal.setTipoAnimal(comboTipoAnimal.getSelectedItem().toString());
                    animal.setRaca(raca);
                    
                    animal.setDataNasc((txtNasc.getText()));
                    animal.setSexo(checkMacho.isSelected() ? "Macho" : "Fêmea");
                    animal.setDono(clienteDAO.getClientesByCPF(dtm.getValueAt(tblClientes.getSelectedRow(), 1).toString()).get(0));
                    animal.setInativo(false);
                    dao.adicionaAnimal(animal);
                
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Não foi possível adicionar o animal, tente novamente!");
                return;
            }
        }else if(param.equals("editar")){
                AnimalDAO aniDAO = new AnimalDAO();
                RacaDAO racaDAO = new RacaDAO();
                ClienteDAO clienteDAO = new ClienteDAO();
                DefaultTableModel dtm = (DefaultTableModel)tblClientes.getModel();
                
                try{
                    Animal ani = new Animal(animalAntigo.getId(),
                                        txtNome.getText(),
                                        comboTipoAnimal.getSelectedItem().toString(),
                                        racaDAO.getRaca(comboRaca.getSelectedItem().toString()),
                                        txtNasc.getText(),
                                        checkMacho.isSelected() ? "Macho" : "Fêmea",
                                        clienteDAO.getClientesByCPF(dtm.getValueAt(tblClientes.getSelectedRow(), 1).toString()).get(0),
                                        false);
                    ani.exibir();
                    aniDAO.atualizarAnimal(ani);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null,"Erro ao atualizar animal na classe frmAddAnimal: " +ex);
                }
                
        }
        setVisible(false);
    }//GEN-LAST:event_btnOKActionPerformed
    private boolean validaCampos(){
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        int erros=0;
        if(!(tblClientes.getSelectedRow()>=0 && tblClientes.getSelectedRow()<tblClientes.getRowCount())){
            lblValidacoesDono.setVisible(true);
            erros++;
        }else{
            lblValidacoesDono.setVisible(false);
        }
        
        if(txtNome.getText().trim().length()==0){
            lblValidacoesNome.setVisible(true);
            erros++;
        }else{
            lblValidacoesNome.setVisible(false);
        }
        
        if(txtNasc.getText().trim().length()==0){
            lblValidacoesAnoNasc.setText("Ano nascimento não pode ser vazio!");
            lblValidacoesAnoNasc.setVisible(true);
            erros++;
        }else{
            lblValidacoesAnoNasc.setVisible(false);
            if(Integer.parseInt(txtNasc.getText()) < (anoAtual-200) || Integer.parseInt(txtNasc.getText())>anoAtual){
                lblValidacoesAnoNasc.setText("Informe um ano valido!");
                lblValidacoesAnoNasc.setVisible(true);
                erros++;
            }else{
                lblValidacoesAnoNasc.setVisible(false);
                
            }
        }
        
        
        
        if(erros>0)
            return false;
        return true;
    }
    private void comboTipoAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoAnimalActionPerformed
        carregaRacas();
    }//GEN-LAST:event_comboTipoAnimalActionPerformed

    private void btnFiltrarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarPorActionPerformed
        frmFiltrarPor frFiltrarPor = new frmFiltrarPor("cliente");
    }//GEN-LAST:event_btnFiltrarPorActionPerformed
    private void ocultarNotificacoes(){
        lblValidacoesNome.setVisible(false);
        lblValidacoesDono.setVisible(false);
        lblValidacoesAnoNasc.setVisible(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel auxNotificacao;
    private javax.swing.JLabel auxNotificacao2;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFiltrarPor;
    private javax.swing.JButton btnOK;
    private javax.swing.JRadioButton checkFemea;
    private javax.swing.JRadioButton checkMacho;
    private javax.swing.ButtonGroup checkSexo;
    private javax.swing.JComboBox comboRaca;
    private javax.swing.JComboBox comboTipoAnimal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDono;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRaca;
    private javax.swing.JLabel lblTipoAnimal;
    private javax.swing.JLabel lblValidacoesAnoNasc;
    private javax.swing.JLabel lblValidacoesDono;
    private javax.swing.JLabel lblValidacoesNome;
    public static javax.swing.JTable tblClientes;
    private javax.swing.JLabel tituloAnimais;
    private javax.swing.JFormattedTextField txtNasc;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
    public void carregaCampos(Animal ani){
        txtNome.setText(ani.getNome());
        txtNasc.setText(ani.getDataNasc());
        comboTipoAnimal.setSelectedItem(ani.getTipoAnimal());
        comboRaca.setSelectedItem(ani.getRaca().getNome());
        checkMacho.setSelected(ani.getSexo().equals("Macho") ? true : false);
        checkFemea.setSelected(ani.getSexo().equals("Fêmea")?true:false);
        
    }
    public void carregaRacas(){//Carregar racas de acordo com o tipo do animal
        RacaDAO racaDAO = new RacaDAO();
        List<Raca> racas = new LinkedList<>();   
        try{//carrega combo raça
            if(comboTipoAnimal.getSelectedItem().toString().equals("Cachorro")){
                racas = racaDAO.getAllRaca(1);
                String nomes[] = new String[racas.size()];
                for(int aux=0;aux<racas.size();aux++){
                    nomes[aux]=racas.get(aux).getNome();
                }
                DefaultComboBoxModel cbxRaca = new DefaultComboBoxModel(nomes);
                comboRaca.setModel(cbxRaca);
            }else if(comboTipoAnimal.getSelectedItem().toString().equals("Gato")){
                racas = racaDAO.getAllRaca(2);
                String nomes[] = new String[racas.size()];
                for(int aux=0;aux<racas.size();aux++){
                    nomes[aux]=racas.get(aux).getNome();
                }
                DefaultComboBoxModel cbxRaca = new DefaultComboBoxModel(nomes);
                comboRaca.setModel(cbxRaca);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao carregar raças na comboRaca na classe frmAddAnimal");
        }
    }
    private void loadInitialData() {
       // DefaultComboBoxModel combo = new DefaultComboBoxModel(EnumTipoAnimal.values());
        if(param.equals("cadastrar")){
            try {//carrega combo clientes
                DefaultTableModel dtm = (DefaultTableModel)tblClientes.getModel();
                ClienteDAO clienteDAO = new ClienteDAO();  
                Vector<Cliente> clientes = new Vector<Cliente>(clienteDAO.getAllClientes());
                for(int aux=0;aux<clientes.size();aux++){
                    if(!clientes.get(aux).isInativo())
                        dtm.addRow(clientes.get(aux).addTable());
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Erro ao carregar a lista de donos");
            }
        }else if(param.equals("editar")){
            Cliente cliente = new Cliente();
            ClienteDAO clienteDAO = new ClienteDAO();
            try{
                cliente = clienteDAO.getCliente(animalAntigo.getDono().getId());
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Erro ao carregar dono na tabela na classe frmAddAnimal"+ ex);
            }
            DefaultTableModel dtm = (DefaultTableModel)tblClientes.getModel();
            
            dtm.addRow(cliente.addTable());
            
        }

    }
    
}
