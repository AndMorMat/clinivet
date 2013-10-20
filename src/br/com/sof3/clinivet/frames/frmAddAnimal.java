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
import java.sql.SQLException;
import java.util.ArrayList;
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
    
    
    //private final frmAnimais frame;
    /**
     * Creates new form frmAddAnimal
     */
    
    public frmAddAnimal(){//, frmAnimais frame) {
        
        
        addEnumTipo();
        loadInitialComboData();
        carregaRacas();
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
        txtNasc = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        checkMacho = new javax.swing.JRadioButton();
        checkFemea = new javax.swing.JRadioButton();
        comboRaca = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnFiltrarPor = new javax.swing.JButton();

        tituloAnimais.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        tituloAnimais.setText("Cadastrar Animais");

        lblNome.setText("Nome:");

        lblTipoAnimal.setText("Tipo Animal:");

        lblRaca.setText("Raça:");

        lblIdade.setText("Idade:");

        lblDono.setText("Dono:");

        comboTipoAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoAnimalActionPerformed(evt);
            }
        });

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
                .add(0, 5, Short.MAX_VALUE))
        );

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

        btnFiltrarPor.setText("Filtrar por");
        btnFiltrarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarPorActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(lblNome)
                            .add(lblTipoAnimal))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(txtNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 424, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(comboTipoAnimal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 184, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(lblRaca)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(comboRaca, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 182, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(layout.createSequentialGroup()
                        .add(62, 62, 62)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(lblDono)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 422, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(lblIdade)
                                .add(18, 18, 18)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(btnFiltrarPor)
                                    .add(layout.createSequentialGroup()
                                        .add(txtNasc, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 173, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(47, 47, 47)
                                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))))
                    .add(layout.createSequentialGroup()
                        .add(206, 206, 206)
                        .add(btnOK, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 115, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(btnCancelar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(174, 174, 174)
                        .add(tituloAnimais)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(tituloAnimais)
                .add(37, 37, 37)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblNome)
                    .add(txtNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblTipoAnimal)
                    .add(comboTipoAnimal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblRaca)
                    .add(comboRaca, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(29, 29, 29)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(lblIdade)
                            .add(txtNasc, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(btnFiltrarPor)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 119, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblDono))
                .add(18, 39, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnOK)
                    .add(btnCancelar))
                .add(41, 41, 41))
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
        AnimalDAO dao = new AnimalDAO();
        ClienteDAO cdao = new ClienteDAO();
        DefaultTableModel dtm = (DefaultTableModel)tblClientes.getModel();
        try {
            Animal animal = new Animal();
            RacaDAO racaDAO = new RacaDAO();
            ClienteDAO clienteDAO = new ClienteDAO();
            Raca raca = new Raca();
            raca = racaDAO.getRaca(comboRaca.getSelectedItem().toString());
            animal.setNome(txtNome.getText());
            JOptionPane.showMessageDialog(null, "Nome: "+txtNome.getText());
            animal.setTipoAnimal(comboTipoAnimal.getSelectedItem().toString());
            JOptionPane.showMessageDialog(null, "\nTipo Animal: "+comboTipoAnimal.getSelectedItem());
            JOptionPane.showMessageDialog(null, "Erro antes de adicionar raca");
            animal.setRaca(raca);
            JOptionPane.showMessageDialog(null, "\nRaça: "+raca.getNome());
            animal.setDataNasc((txtNasc.getText()));
            JOptionPane.showMessageDialog(null, "\nData Nasc: "+txtNasc.getText());
            animal.setSexo(checkMacho.isSelected() ? "Macho" : "Fêmea");
            JOptionPane.showMessageDialog(null, "\nSexo: " + (checkMacho.isSelected() ? "Masculino" : "Feminino"));
            //animal.setTipoAnimal((EnumTipoAnimal) comboTipoAnimal.getSelectedItem());
            animal.setDono(clienteDAO.getClientesByCPF(dtm.getValueAt(tblClientes.getSelectedRow(), 1).toString()).get(0));
            animal.exibir();
            dao.adicionaAnimal(animal);
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Não foi possível adicionar o animal, tente novamente!");
            return;
        }
        setVisible(false);
    }//GEN-LAST:event_btnOKActionPerformed

    private void comboTipoAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoAnimalActionPerformed
        carregaRacas();
    }//GEN-LAST:event_comboTipoAnimalActionPerformed

    private void btnFiltrarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarPorActionPerformed
        frmFiltrarPor frFiltrarPor = new frmFiltrarPor("cliente");
    }//GEN-LAST:event_btnFiltrarPorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFiltrarPor;
    private javax.swing.JButton btnOK;
    private javax.swing.JRadioButton checkFemea;
    private javax.swing.JRadioButton checkMacho;
    private javax.swing.ButtonGroup checkSexo;
    private javax.swing.JComboBox comboRaca;
    private javax.swing.JComboBox comboTipoAnimal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDono;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRaca;
    private javax.swing.JLabel lblTipoAnimal;
    public static javax.swing.JTable tblClientes;
    private javax.swing.JLabel tituloAnimais;
    private javax.swing.JTextField txtNasc;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
    
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
    private void loadInitialComboData() {
       // DefaultComboBoxModel combo = new DefaultComboBoxModel(EnumTipoAnimal.values());
        //comboTipoAnimal.setModel(combo);
        try {//carrega combo clientes
            DefaultTableModel dtm = (DefaultTableModel)tblClientes.getModel();
            ClienteDAO clienteDAO = new ClienteDAO();
            
            Vector<Cliente> clientes = new Vector<Cliente>(clienteDAO.getAllClientes());
            
            for(int aux=0;aux<clientes.size();aux++){
                    dtm.addRow(clientes.get(aux).addTable());
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao carregar a lista de donos");
        }

    }
    
}
