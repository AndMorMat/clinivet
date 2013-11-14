/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.frames;

import br.com.sof3.clinivet.dao.CidadeDAO;
import br.com.sof3.clinivet.dao.EstadoDAO;
import br.com.sof3.clinivet.dao.FornecedorDAO;
import br.com.sof3.clinivet.entidade.Cidade;
import br.com.sof3.clinivet.entidade.Estado;
import br.com.sof3.clinivet.entidade.Fornecedor;
import br.com.sof3.clinivet.entidade.Produto;
import static br.com.sof3.clinivet.frames.frmAddProduto.tblFornecedores;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andrematos
 */
public class frmAddFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form frmAddFornecedor
     */
    private String param; //variavel recebendo um valor da classe frmAddProduto para saber se e uma ação de lá que chamou essa tela
    private Fornecedor fornecedorAntigo = new Fornecedor();
    public frmAddFornecedor(){
        initComponents();
        //loadInitialComboData();
        carregaEstados();
        carregaCidades();
        ocultarNotificacoes();
        setDefaultCloseOperation(WIDTH);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public frmAddFornecedor(String parametro, Fornecedor fornecedor) {
        param = parametro;
        fornecedorAntigo = fornecedor;
        initComponents();
        //loadInitialComboData();
        carregaEstados();
        carregaCidades();
        ocultarNotificacoes();
        setDefaultCloseOperation(WIDTH);
        setLocationRelativeTo(null);
        if(parametro.equals("editar")){
            carregaCampos(fornecedor);
            lblCadastrarFornecedor.setText("Editar fornecedor        ");//colocando espaços em branco pra não zuar o layout
            
        }else if(parametro.equals("cadastrar")){
            lblCadastrarFornecedor.setText("Cadastrar fornecedor ");
        }
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

        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCnpj = new javax.swing.JLabel();
        txtCnpj = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboEstados = new javax.swing.JComboBox();
        lblCidade = new javax.swing.JLabel();
        comboCidades = new javax.swing.JComboBox();
        lblValidacaoNome = new javax.swing.JLabel();
        lblValidacaoCnpj = new javax.swing.JLabel();
        lblValidacaoTelefone = new javax.swing.JLabel();
        lblValidacaoEmail = new javax.swing.JLabel();
        lblValidacaoBairro = new javax.swing.JLabel();
        lblValidacaoEndereco = new javax.swing.JLabel();
        lblValidacaoTelefone1 = new javax.swing.JLabel();
        lblValidacaoTelefone2 = new javax.swing.JLabel();
        lblValidacaoTelefone3 = new javax.swing.JLabel();
        lblValidacaoTelefone4 = new javax.swing.JLabel();
        lblValidacaoTelefone5 = new javax.swing.JLabel();
        lblValidacaoTelefone6 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblCadastrarFornecedor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Cnpj inválido ou vazio!");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Telefone não pode ser vazio!");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(214, 255, 213));

        jPanel1.setBackground(new java.awt.Color(195, 239, 198));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNome.setText("Nome:");

        lblCnpj.setText("CNPJ:");

        try {
            txtCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblTelefone.setText("Telefone:");

        lblEmail.setText("Email:");

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        lblEndereco.setText("Endereço:");

        lblBairro.setText("Bairro:");

        jLabel1.setText("Estado:");

        comboEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadosActionPerformed(evt);
            }
        });

        lblCidade.setText("Cidade:");

        lblValidacaoNome.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblValidacaoNome.setForeground(new java.awt.Color(255, 0, 0));
        lblValidacaoNome.setText("Nome não pode ser vazio!");

        lblValidacaoCnpj.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblValidacaoCnpj.setForeground(new java.awt.Color(255, 0, 0));
        lblValidacaoCnpj.setText("Cnpj inválido ou vazio!");

        lblValidacaoTelefone.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblValidacaoTelefone.setForeground(new java.awt.Color(255, 0, 0));
        lblValidacaoTelefone.setText("Telefone não pode ser vazio!");

        lblValidacaoEmail.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblValidacaoEmail.setForeground(new java.awt.Color(255, 0, 0));
        lblValidacaoEmail.setText("Email inválido!");

        lblValidacaoBairro.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblValidacaoBairro.setForeground(new java.awt.Color(255, 0, 0));
        lblValidacaoBairro.setText("Bairro não pode ser vazio!");

        lblValidacaoEndereco.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblValidacaoEndereco.setForeground(new java.awt.Color(255, 0, 0));
        lblValidacaoEndereco.setText("Endereço não pode ser vazio!");

        lblValidacaoTelefone1.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblValidacaoTelefone1.setForeground(new java.awt.Color(195, 239, 198));
        lblValidacaoTelefone1.setText("aux");

        lblValidacaoTelefone2.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblValidacaoTelefone2.setForeground(new java.awt.Color(195, 239, 198));
        lblValidacaoTelefone2.setText("aux");

        lblValidacaoTelefone3.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblValidacaoTelefone3.setForeground(new java.awt.Color(195, 239, 198));
        lblValidacaoTelefone3.setText("aux");

        lblValidacaoTelefone4.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblValidacaoTelefone4.setForeground(new java.awt.Color(195, 239, 198));
        lblValidacaoTelefone4.setText("aux");

        lblValidacaoTelefone5.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblValidacaoTelefone5.setForeground(new java.awt.Color(195, 239, 198));
        lblValidacaoTelefone5.setText("aux");

        lblValidacaoTelefone6.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblValidacaoTelefone6.setForeground(new java.awt.Color(195, 239, 198));
        lblValidacaoTelefone6.setText("aux");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboEstados, 0, 184, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblValidacaoTelefone6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(lblBairro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBairro)))
                                .addGap(12, 12, 12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEndereco, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCidade, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboCidades, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNome)
                            .addComponent(lblTelefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                    .addComponent(txtNome))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCnpj))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lblEmail))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblValidacaoNome)
                                .addGap(47, 47, 47)
                                .addComponent(lblValidacaoTelefone2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblValidacaoTelefone)
                                .addGap(33, 33, 33)
                                .addComponent(lblValidacaoTelefone1))
                            .addComponent(lblValidacaoBairro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblValidacaoCnpj)
                                .addGap(18, 18, 18)
                                .addComponent(lblValidacaoTelefone3))
                            .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblValidacaoEmail)
                                .addGap(52, 52, 52)
                                .addComponent(lblValidacaoTelefone4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblValidacaoEndereco)
                                .addGap(26, 26, 26)
                                .addComponent(lblValidacaoTelefone5)))))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValidacaoNome)
                    .addComponent(lblValidacaoCnpj)
                    .addComponent(lblValidacaoTelefone2)
                    .addComponent(lblValidacaoTelefone3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCnpj)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblValidacaoTelefone)
                        .addComponent(lblValidacaoTelefone1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblValidacaoEmail)
                        .addComponent(lblValidacaoTelefone4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValidacaoBairro)
                    .addComponent(lblValidacaoEndereco)
                    .addComponent(lblValidacaoTelefone5)
                    .addComponent(lblValidacaoTelefone6))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade)
                    .addComponent(comboEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sof3/clinivet/frames/Imagens/adicionar_fornecedor_botao.png"))); // NOI18N
        btnCadastrar.setText("OK");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblCadastrarFornecedor.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        lblCadastrarFornecedor.setForeground(new java.awt.Color(36, 114, 76));
        lblCadastrarFornecedor.setText("Cadastrar Fornecedor");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sof3/clinivet/frames/Imagens/fornecedor_top.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCadastrarFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnCadastrar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblCadastrarFornecedor)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
       if(param.equals("cadastrar") || param.equals("telaAddProduto")){
            

            try {
                if(!validaCampos())return;
                int opc = JOptionPane.showConfirmDialog(this, "Você tem certeza?","Adiciona Fornecedor",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                if (opc != 0) {
                    return;
                }
                Fornecedor forn = new Fornecedor();
                FornecedorDAO fdao = new FornecedorDAO();
                CidadeDAO citydao = new CidadeDAO();
                try{
                forn.cadastrar(0,
                               txtNome.getText(),
                               txtCnpj.getText(),
                               txtTelefone.getText(),
                               txtEmail.getText(),
                               txtEndereco.getText(),
                               txtBairro.getText(),
                               citydao.getCidadeByName(String.valueOf(comboCidades.getSelectedItem())),
                               false);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null,"Erro ao cadastrar fornecedor: "+ ex);
                }
                JOptionPane.showMessageDialog(null, "Erro1");
                
                fdao.adicionaFornecedor(forn);
                JOptionPane.showMessageDialog(null, "Erro2");
                
                if(param.equals("telaAddProduto")){
                    limparTabela();
                    DefaultTableModel dtm = (DefaultTableModel)frmAddProduto.tblFornecedores.getModel();
                    dtm.addRow(forn.addTable());
                    JOptionPane.showMessageDialog(null, "Antes de selecionar");
                    frmAddProduto.tblFornecedores.setSelectionMode(1);
                    JOptionPane.showMessageDialog(null, "Antes de selecionar certo");
                    frmAddProduto.tblFornecedores.setRowSelectionInterval(0, 0);
                    param = "";
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao adicionar Fornecedor :: na classe frmAddFornecedor no botao Cadastrar");
            }
        }else if(param.equals("editar")){
            JOptionPane.showMessageDialog(null, "Editar");
               try{ 
                    Fornecedor forn = new Fornecedor();
                    FornecedorDAO fdao = new FornecedorDAO();
                    CidadeDAO citydao = new CidadeDAO();
                    JOptionPane.showMessageDialog(null, txtCnpj.getText());
                    forn.cadastrar(fdao.getIdFornecedor(fornecedorAntigo.getCnpj()),
                                   txtNome.getText(),
                                   txtCnpj.getText(),
                                   txtTelefone.getText(),
                                   txtEmail.getText(),
                                   txtEndereco.getText(),
                                   txtBairro.getText(),
                                   citydao.getCidadeByName(String.valueOf(comboCidades.getSelectedItem())),
                                    false);
                    
                    fdao.atualizaFornecedor(forn);
                    
               }catch(Exception ex){
                   JOptionPane.showMessageDialog(null,"Erro ao Editar Fornecedor :: na classe frmAddFornecedor" +ex);
               }
        }
        setVisible(false);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadosActionPerformed
        carregaCidades();
    }//GEN-LAST:event_comboEstadosActionPerformed

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        if ((txtEmail.getText().contains("@")) && (txtEmail.getText().contains("."))
                && (!txtEmail.getText().contains(" "))) { String usuario = new String(txtEmail.getText().substring(0, txtEmail.getText().lastIndexOf('@')));
                                                          String dominio = new String(txtEmail.getText().substring(txtEmail.getText().lastIndexOf ('@') + 1, 
                                                                  txtEmail.getText().length()));
                                                          if ((usuario.length() >=1) && (!usuario.contains("@")) && (dominio.contains(".")) && (!dominio.contains("@"))
                                                                  && (dominio.indexOf(".") >= 1) && (dominio.lastIndexOf(".") < dominio.length() - 1)) { 
                                                                  lblValidacaoEmail.setVisible(false);
                                                          } else { 
                                                              txtEmail.setText("E-MAIL INVÁLIDO");
                                                          } 
           lblValidacaoEmail.setVisible(false);
        }else{
            
            lblValidacaoEmail.setVisible(true);
        }
        if(txtEmail.getText().isEmpty()){
           lblValidacaoEmail.setVisible(false); 
        }
    }//GEN-LAST:event_txtEmailFocusLost
    public String[] getDados(){
        String[] dados = {txtNome.getText(),txtCnpj.getText(),txtTelefone.getText(),txtEmail.getText()};
        return dados;
    }
    public void limparTabela(){
        DefaultTableModel dtm =  (DefaultTableModel) tblFornecedores.getModel();
        int cont = dtm.getRowCount();
            for(int aux=cont-1 ;   aux>=0;  aux--){//removendo valores da tabela
                dtm.removeRow(aux);
            }
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox comboCidades;
    private javax.swing.JComboBox comboEstados;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCadastrarFornecedor;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCnpj;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblValidacaoBairro;
    private javax.swing.JLabel lblValidacaoCnpj;
    private javax.swing.JLabel lblValidacaoEmail;
    private javax.swing.JLabel lblValidacaoEndereco;
    private javax.swing.JLabel lblValidacaoNome;
    private javax.swing.JLabel lblValidacaoTelefone;
    private javax.swing.JLabel lblValidacaoTelefone1;
    private javax.swing.JLabel lblValidacaoTelefone2;
    private javax.swing.JLabel lblValidacaoTelefone3;
    private javax.swing.JLabel lblValidacaoTelefone4;
    private javax.swing.JLabel lblValidacaoTelefone5;
    private javax.swing.JLabel lblValidacaoTelefone6;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCnpj;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
    
    private void carregaCampos(Fornecedor fornecedor){
        EstadoDAO estadoDAO = new EstadoDAO();
        txtNome.setText(fornecedor.getNome());
        txtCnpj.setText(fornecedor.getCnpj());
        txtTelefone.setText(fornecedor.getTelefone());
        txtEmail.setText(fornecedor.getEmail());
        txtBairro.setText(fornecedor.getBairro());
        txtEndereco.setText(fornecedor.getEndereco());
        try {
            comboEstados.setSelectedItem(estadoDAO.getEstado(fornecedor.getCidade().getEstado().getId()).getNome());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar cbxEstados: "+ex);
        }
        comboCidades.setSelectedItem(fornecedor.getCidade().getNome());
    }
    private boolean validaCampos(){
        int erros=0;
        if(txtNome.getText().trim().isEmpty()){
            lblValidacaoNome.setVisible(true);
            erros++;
        }else{
            lblValidacaoNome.setVisible(false);
        }
        if(txtCnpj.getText().trim().length()!=18){
            lblValidacaoCnpj.setVisible(true);
            erros++;
        }else{
            lblValidacaoCnpj.setVisible(false);
        }
        if(txtTelefone.getText().trim().length()!=13){
            lblValidacaoTelefone.setVisible(true);
            erros++;
        }else{
            lblValidacaoTelefone.setVisible(false);
        }
        
        if(txtBairro.getText().isEmpty()){
            lblValidacaoBairro.setVisible(true);
            erros++;
        }else{
            lblValidacaoBairro.setVisible(false);
        }
        if(txtEndereco.getText().isEmpty()){
            lblValidacaoEndereco.setVisible(true);
            erros++;
        }else{
            lblValidacaoEndereco.setVisible(false);
        }
        if(erros>0)
            return false;
        return true;
    }
    private void ocultarNotificacoes(){
        lblValidacaoNome.setVisible(false);
        lblValidacaoTelefone.setVisible(false);
        lblValidacaoEndereco.setVisible(false);
        lblValidacaoEmail.setVisible(false);
        lblValidacaoCnpj.setVisible(false);
        lblValidacaoBairro.setVisible(false);
    }
    private void carregaCidades(){
        EstadoDAO estadoDAO = new EstadoDAO();
        CidadeDAO cidadeDAO = new CidadeDAO();
        List<Cidade> cidade = new LinkedList<>();
        
        
        try{
            int id_estado = estadoDAO.getIdEstado(comboEstados.getSelectedItem().toString());
            
            cidade = cidadeDAO.getAllCidadesById_Estado(id_estado);
            
            String nomes[] = new String[cidade.size()];
            for(int aux=0;aux<cidade.size();aux++){
                nomes[aux] = cidade.get(aux).getNome();
            }
            DefaultComboBoxModel comboEstado = new DefaultComboBoxModel(nomes);
            comboCidades.setModel(comboEstado);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao adicionar cidades no comboCidades na classe frmAddCliente");
        }
        
    }
    private void carregaEstados() {

        // carrega combo de estados
        try {
            EstadoDAO estadoDAO = new EstadoDAO();
            Vector<Estado> estados = new Vector<Estado>(estadoDAO.getAllEstados());
            String[] nomes = new String[estados.size()];
            for(int aux=0; aux<estados.size();aux++){
                nomes[aux] = estados.get(aux).getNome();
            }
            DefaultComboBoxModel comboEstado = new DefaultComboBoxModel(nomes);
            comboEstados.setModel(comboEstado);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao carregar a lista de estados");
        }
       
    }

}
