/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.frames;

import br.com.sof3.clinivet.dao.CidadeDAO;
import br.com.sof3.clinivet.dao.EstadoDAO;
import br.com.sof3.clinivet.dao.FornecedorDAO;
import br.com.sof3.clinivet.dao.ProdutoDAO;
import br.com.sof3.clinivet.entidade.Cidade;
import br.com.sof3.clinivet.entidade.EnumTipoAnimal;
import br.com.sof3.clinivet.entidade.EnumTipoProduto;
import br.com.sof3.clinivet.entidade.Estado;
import br.com.sof3.clinivet.entidade.Fornecedor;
import br.com.sof3.clinivet.entidade.Produto;
import java.awt.Color;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andrematos
 */
public class frmAddProduto extends javax.swing.JFrame {

    Produto produtoAntigo = new Produto();
    String param;
    public frmAddProduto(String parametro, Produto prod) {
        param = parametro;
        produtoAntigo = prod;
        initComponents();
        ocultarNotificacoes();
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WIDTH);
        loadInitialTableData();
        
        if(parametro.equals("cadastrar")){
            lblCadastrarProd.setText("Cadastrar produto");
            setTitle("Cadastrar produto");
        }else if(parametro.equals("editar")){
            carregaCampos(prod);
            btnCadastrarFornecedor.setVisible(false);
            btnFiltrar.setVisible(false);
            setTitle("Editar produto");
            lblCadastrarProd.setText("Editar produto");
        }
        
        setVisible(true);
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblCadastrarProd = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblValidacaoCodigo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblValidacaoNome = new javax.swing.JLabel();
        lblValidacoesFornecedor = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblValidacaoPrecoCusto = new javax.swing.JLabel();
        lblPrecoCusto = new javax.swing.JLabel();
        txtPrecoCusto = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFornecedores = new javax.swing.JTable();
        btnFiltrar = new javax.swing.JButton();
        btnCadastrarFornecedor = new javax.swing.JButton();
        lblMargemLucro = new javax.swing.JLabel();
        lblValidacaoMargemLucro = new javax.swing.JLabel();
        txtEstoque = new javax.swing.JTextField();
        lblEstoque = new javax.swing.JLabel();
        lblValidacaoEstoque = new javax.swing.JLabel();
        lblValidade = new javax.swing.JLabel();
        txtValidade = new javax.swing.JFormattedTextField();
        lblValidacaoValidade = new javax.swing.JLabel();
        chkIndeterminado = new javax.swing.JCheckBox();
        cbxTipoProduto = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        auxnotificacao1 = new javax.swing.JLabel();
        auxnotificacao2 = new javax.swing.JLabel();
        auxnotificacao3 = new javax.swing.JLabel();
        auxnotificacao4 = new javax.swing.JLabel();
        auxnotificacao5 = new javax.swing.JLabel();
        auxnotificacao6 = new javax.swing.JLabel();
        lblValidacaoTipo = new javax.swing.JLabel();
        auxnotificacao7 = new javax.swing.JLabel();
        txtMargemLucro = new javax.swing.JFormattedTextField();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(214, 255, 213));

        lblCadastrarProd.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        lblCadastrarProd.setText("Cadastrar Produto");

        jPanel2.setBackground(new java.awt.Color(195, 239, 198));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblValidacaoCodigo.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblValidacaoCodigo.setForeground(new java.awt.Color(255, 0, 0));
        lblValidacaoCodigo.setText("Codigo não pode ser vazio!");

        jLabel2.setText("Codigo:");

        lblValidacaoNome.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblValidacaoNome.setForeground(new java.awt.Color(255, 0, 0));
        lblValidacaoNome.setText("Nome não pode ser vazio!");

        lblValidacoesFornecedor.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblValidacoesFornecedor.setForeground(new java.awt.Color(255, 0, 0));
        lblValidacoesFornecedor.setText("Selecione um fornecedor!");

        lblNome.setText("Nome:");

        lblValidacaoPrecoCusto.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblValidacaoPrecoCusto.setForeground(new java.awt.Color(255, 0, 0));
        lblValidacaoPrecoCusto.setText("Preco de custo inválido ou vazio!");

        lblPrecoCusto.setText("Preco de Custo:");

        jPanel1.setBackground(new java.awt.Color(195, 239, 198));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione um fornecedor"));

        tblFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CNPJ", "Telefone", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFornecedores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblFornecedores);

        btnFiltrar.setText("Filtrar por");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        btnCadastrarFornecedor.setText("Cadastrar Fornecedor");
        btnCadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarFornecedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastrarFornecedor)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFiltrar)
                    .addComponent(btnCadastrarFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        lblMargemLucro.setText("Margem de Lucro:");

        lblValidacaoMargemLucro.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblValidacaoMargemLucro.setForeground(new java.awt.Color(255, 0, 0));
        lblValidacaoMargemLucro.setText("Margem de lucro inválido ou vazio!");

        lblEstoque.setText("Estoque");

        lblValidacaoEstoque.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblValidacaoEstoque.setForeground(new java.awt.Color(255, 0, 0));
        lblValidacaoEstoque.setText("Estoque inválido ou vazio!");

        lblValidade.setText("Validade:");

        try {
            txtValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblValidacaoValidade.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblValidacaoValidade.setForeground(new java.awt.Color(255, 0, 0));
        lblValidacaoValidade.setText("Validade inválida ou vazia!");

        chkIndeterminado.setText("Indeterminado");
        chkIndeterminado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkIndeterminadoMouseClicked(evt);
            }
        });

        cbxTipoProduto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o tipo" }));

        jLabel3.setText("Tipo produto:");

        auxnotificacao1.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        auxnotificacao1.setForeground(new java.awt.Color(195, 239, 198));
        auxnotificacao1.setText("aux");

        auxnotificacao2.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        auxnotificacao2.setForeground(new java.awt.Color(195, 239, 198));
        auxnotificacao2.setText("aux");

        auxnotificacao3.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        auxnotificacao3.setForeground(new java.awt.Color(195, 239, 198));
        auxnotificacao3.setText("aux");

        auxnotificacao4.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        auxnotificacao4.setForeground(new java.awt.Color(195, 239, 198));
        auxnotificacao4.setText("aux");

        auxnotificacao5.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        auxnotificacao5.setForeground(new java.awt.Color(195, 239, 198));
        auxnotificacao5.setText("aux");

        auxnotificacao6.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        auxnotificacao6.setForeground(new java.awt.Color(195, 239, 198));
        auxnotificacao6.setText("aux");

        lblValidacaoTipo.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblValidacaoTipo.setForeground(new java.awt.Color(255, 0, 0));
        lblValidacaoTipo.setText("Informe um tipo!");

        auxnotificacao7.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        auxnotificacao7.setForeground(new java.awt.Color(195, 239, 198));
        auxnotificacao7.setText("aux");

        txtMargemLucro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(674, 674, 674))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblValidacaoNome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(auxnotificacao2)
                                    .addGap(581, 581, 581)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblValidacaoCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(auxnotificacao1)
                                .addGap(420, 420, 420))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEstoque)
                            .addComponent(lblValidade)
                            .addComponent(lblPrecoCusto)
                            .addComponent(lblMargemLucro)
                            .addComponent(lblNome)
                            .addComponent(jLabel3))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblValidacaoPrecoCusto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(auxnotificacao3)
                                .addGap(26, 26, 26))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblValidacaoMargemLucro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(auxnotificacao4)
                                .addGap(26, 26, 26))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblValidacaoEstoque)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(auxnotificacao5)
                                .addGap(27, 27, 27))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblValidacaoTipo)
                                .addGap(74, 74, 74)
                                .addComponent(auxnotificacao7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtMargemLucro, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEstoque)
                                    .addComponent(txtPrecoCusto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxTipoProduto, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtValidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chkIndeterminado))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblValidacaoValidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(auxnotificacao6)
                                        .addGap(20, 20, 20)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValidacoesFornecedor)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValidacaoCodigo)
                    .addComponent(auxnotificacao1))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValidacaoNome)
                    .addComponent(lblValidacoesFornecedor)
                    .addComponent(auxnotificacao2))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValidacaoPrecoCusto)
                            .addComponent(auxnotificacao3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrecoCusto)
                            .addComponent(txtPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValidacaoMargemLucro)
                            .addComponent(auxnotificacao4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMargemLucro)
                            .addComponent(txtMargemLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValidacaoEstoque)
                            .addComponent(auxnotificacao5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEstoque))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValidacaoValidade)
                            .addComponent(auxnotificacao6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValidade)
                            .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkIndeterminado))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValidacaoTipo)
                            .addComponent(auxnotificacao7))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        btnCadastrar.setText("OK");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblCadastrarProd)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)))
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadastrarProd)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if(!verificaCampos()){ 
            return;
        }
        if(!verificaValores()){
            return;
        }
        
        if(param.equals("cadastrar")){
            
            int opc = JOptionPane.showConfirmDialog(this, "Você tem certeza?","Adiciona Produto",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
            
            if (opc != 0) {
                return;
            }
            ProdutoDAO consultapro = new ProdutoDAO();
            
            try {
                
                if(consultapro.getIdBCod(txtCodigo.getText())<0){
                         Produto prod = new Produto();
                         ProdutoDAO pdao = new ProdutoDAO();
                         FornecedorDAO fdao = new FornecedorDAO();
                         DefaultTableModel dtm =  (DefaultTableModel) tblFornecedores.getModel();

                         prod.cadastrar(0, txtCodigo.getText(),
                                           txtNome.getText(),
                                           Double.parseDouble(txtPrecoCusto.getText()),
                                           Double.parseDouble(txtMargemLucro.getText()),
                                           prod.calcularPrecoVenda(Double.parseDouble(txtPrecoCusto.getText()), Double.parseDouble(txtMargemLucro.getText())),
                                           chkIndeterminado.isSelected()?"Indeterminado":txtValidade.getText(),
                                           fdao.getFornecedorByCnpj(String.valueOf(dtm.getValueAt(tblFornecedores.getSelectedRow(), 1))),
                                           Integer.parseInt(txtEstoque.getText()),String.valueOf(cbxTipoProduto.getSelectedItem()));//pegando o cnpj da tabela e mandando pra função getFornecedorByCnpj que retornara o Fornecedor
                         Fornecedor forn = new Fornecedor();
                         forn = fdao.getFornecedorByCnpj(String.valueOf(dtm.getValueAt(tblFornecedores.getSelectedRow(), 1)));

                         pdao.adicionaProduto(prod);
                         setVisible(false);
                }else{
                       int  duplicidadeCodigo = JOptionPane.showConfirmDialog (null, "Codigo já cadastrado, deseja alterar Código desse cadastro?","Código já em uso",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                        
                        if(duplicidadeCodigo ==2)//Caso o usuario não deseje altera o cpf, apenas cancelar a inserção
                            setVisible(false);
                }
                        
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar Produto :: na Classe frmAddProduto no botao cadastrar");
            }
        }else if(param.equals("editar")){
            int opc = JOptionPane.showConfirmDialog(this, "Você tem certeza?","Editar Produto",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);

            if (opc != 0) {
                return;
            }
            Produto prod = new Produto();
            
            ProdutoDAO produtoDAO = new ProdutoDAO();
            
            FornecedorDAO fdao = new FornecedorDAO();
            
            DefaultTableModel dtm =  (DefaultTableModel) tblFornecedores.getModel();
            
            try{
                
                if(produtoDAO.getIdBCod(txtCodigo.getText().toString())>0 &&  !produtoAntigo.getCodigo().toString().equals(txtCodigo.getText().toString())){//Consultando no banco o CPf e verifica se foi alterado antes de iniciar a edição
                        int duplicidadeCodigo = JOptionPane.showConfirmDialog (null, "CPF que foi alterado já está cadastrado, deseja alterar CPF desse cadastro?","CPF já em uso",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                        
                        if(duplicidadeCodigo ==2)//Caso o usuario não deseje altera o cpf, apenas cancelar a inserção
                            setVisible(false);
                    }else{//Cpf não encontrado no banco
                
                prod.cadastrar(produtoAntigo.getId(),
                                  txtCodigo.getText(),
                                  txtNome.getText(),
                                  Double.parseDouble(txtPrecoCusto.getText()),
                                  Double.parseDouble(txtMargemLucro.getText()),
                                  prod.calcularPrecoVenda(Double.parseDouble(txtPrecoCusto.getText()), Double.parseDouble(txtMargemLucro.getText())),
                                  chkIndeterminado.isSelected()?"Indeterminado":txtValidade.getText(),
                                  fdao.getFornecedorByCnpj(String.valueOf(dtm.getValueAt(tblFornecedores.getSelectedRow(), 1))),
                                  Integer.parseInt(txtEstoque.getText()),
                                  String.valueOf(cbxTipoProduto.getSelectedItem()));//pegando o cnpj da tabela e mandando pra função getFornecedorByCnpj que retornara o Fornecedor
    
                produtoDAO.atualizaProduto(prod);
                setVisible(false);
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Erro ao editar produto na classe frmAddProduto");
            }
        }
        
    }//GEN-LAST:event_btnCadastrarActionPerformed
    
    private void btnCadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarFornecedorActionPerformed
        Fornecedor forn = new Fornecedor();
        frmAddFornecedor frmAddFornecedor = new frmAddFornecedor("telaAddProduto",forn);  
    }//GEN-LAST:event_btnCadastrarFornecedorActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
         frmFiltrarPor filtrarFornecedor = new frmFiltrarPor("fornecedor");
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void chkIndeterminadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkIndeterminadoMouseClicked
        if (chkIndeterminado.isSelected()) {
            txtValidade.setEnabled(false);
        } else {
            txtValidade.setEnabled(true);
        }
    }//GEN-LAST:event_chkIndeterminadoMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    public void ocultarNotificacoes(){
        lblValidacaoCodigo.setVisible(false);
        lblValidacaoEstoque.setVisible(false);
        lblValidacaoMargemLucro.setVisible(false);
        lblValidacaoNome.setVisible(false);
        lblValidacaoPrecoCusto.setVisible(false);
        lblValidacaoValidade.setVisible(false);
        lblValidacoesFornecedor.setVisible(false);
        lblValidacaoTipo.setVisible(false);
        
    }
    public boolean verificaValores(){
        int erros=0;
        int validador=0;
        String letras="abcdefghyjklmnopqrstuvwxyz,";
        String    texto = txtMargemLucro.getText().toLowerCase();

        for(int i=0; i<texto.length(); i++){
            if (letras.indexOf(texto.charAt(i),0) != -1){
                
                validador = 1;
            }
        }
        if(validador!=0){
            lblValidacaoMargemLucro.setVisible(true);
        }else{
            lblValidacaoMargemLucro.setVisible(false);
            erros++;
        }
        
        if(Integer.parseInt(txtEstoque.getText())<0){
            JOptionPane.showMessageDialog(null, "Quantidade de estoque inválido");
            return false;
        }else if(Double.parseDouble(txtPrecoCusto.getText())<0){
            JOptionPane.showMessageDialog(null, "Preco de custo inválido");
            return false;
        }else if(Double.parseDouble(txtMargemLucro.getText())<0){
            JOptionPane.showMessageDialog(null, "Margem de lucro inválido");
            return false;
        }else return true;
    }
    
    private boolean somenteNumeros(String txt){
        int validador=0;
        String letras="abcdefghyjklmnopqrstuvwxyz,";
        String texto = txt.toLowerCase();

        for(int i=0; i<texto.length(); i++){
            if (letras.indexOf(texto.charAt(i),0)!=-1){
                validador = 1;
            }
        }
        if(validador!=0){
            return false;
        }
        return true;
    }
    public boolean verificaCampos(){
        int erros=0;
        ProdutoDAO proDAO = new ProdutoDAO();
        
        if(txtCodigo.getText().isEmpty()){
            lblValidacaoCodigo.setText("Codigo não pode ser vazio!");
            lblValidacaoCodigo.setVisible(true);
            erros++;
        }else{
            lblValidacaoCodigo.setVisible(false);
            
            if(proDAO.verificaCodigoRepedido(txtCodigo.getText()) && !param.equals("editar")){
                lblValidacaoCodigo.setText("Codigo já cadastrado");
                lblValidacaoCodigo.setVisible(true);
                erros++;
            }else{
                lblValidacaoCodigo.setVisible(false);
            }
        }
        
        
        if(txtNome.getText().isEmpty()){
            lblValidacaoNome.setVisible(true);
            erros++;
        }else{
            lblValidacaoNome.setVisible(false);
        }
        
        
       
            
        
        
        
        if(txtValidade.getText().isEmpty()){
            lblValidacaoValidade.setVisible(true);
            erros++;
        }else{
            lblValidacaoValidade.setVisible(false);
        }
        
        
        if(!(tblFornecedores.getSelectedRow()>=0 && tblFornecedores.getSelectedRow()<tblFornecedores.getRowCount())){
            lblValidacoesFornecedor.setVisible(true);
            erros++;
        }else{
            lblValidacoesFornecedor.setVisible(false);
        }
        
        if(!(cbxTipoProduto.getSelectedIndex()>0)){
            lblValidacaoTipo.setVisible(true);
            erros++;
        }else{
            lblValidacaoTipo.setVisible(false);
        }
        if(txtValidade.getText().trim().length()!=10 && chkIndeterminado.isSelected()==false){
            erros++;
            lblValidacaoValidade.setVisible(true);
        }else{
            lblValidacaoValidade.setVisible(false);
        }
        if(txtMargemLucro.getText().isEmpty()){
            lblValidacaoMargemLucro.setVisible(true);
            erros++;
        }else{
            lblValidacaoMargemLucro.setVisible(false);
            
        }
        if(!somenteNumeros(txtEstoque.getText()) || txtEstoque.getText().isEmpty()){
            lblValidacaoEstoque.setVisible(true);
            erros++;
        }else{
            lblValidacaoEstoque.setVisible(false);
        }
        if(!somenteNumeros(txtPrecoCusto.getText()) || txtPrecoCusto.getText().isEmpty()){
            lblValidacaoPrecoCusto.setVisible(true);
            erros++;
        }else{
            lblValidacaoPrecoCusto.setVisible(false);
        }
        
        if(erros>0)
            return false;
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel auxnotificacao1;
    private javax.swing.JLabel auxnotificacao2;
    private javax.swing.JLabel auxnotificacao3;
    private javax.swing.JLabel auxnotificacao4;
    private javax.swing.JLabel auxnotificacao5;
    private javax.swing.JLabel auxnotificacao6;
    private javax.swing.JLabel auxnotificacao7;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCadastrarFornecedor;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JComboBox cbxTipoProduto;
    private javax.swing.JCheckBox chkIndeterminado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCadastrarProd;
    private javax.swing.JLabel lblEstoque;
    private javax.swing.JLabel lblMargemLucro;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPrecoCusto;
    private javax.swing.JLabel lblValidacaoCodigo;
    private javax.swing.JLabel lblValidacaoEstoque;
    private javax.swing.JLabel lblValidacaoMargemLucro;
    private javax.swing.JLabel lblValidacaoNome;
    private javax.swing.JLabel lblValidacaoPrecoCusto;
    private javax.swing.JLabel lblValidacaoTipo;
    private javax.swing.JLabel lblValidacaoValidade;
    private javax.swing.JLabel lblValidacoesFornecedor;
    private javax.swing.JLabel lblValidade;
    public static javax.swing.JTable tblFornecedores;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEstoque;
    private javax.swing.JFormattedTextField txtMargemLucro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPrecoCusto;
    private javax.swing.JFormattedTextField txtValidade;
    // End of variables declaration//GEN-END:variables
    public void carregaCampos(Produto pro){
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        DefaultTableModel dtm = (DefaultTableModel)tblFornecedores.getModel();
        txtNome.setText(pro.getNome());
        txtCodigo.setText(pro.getCodigo());
        txtPrecoCusto.setText(String.valueOf(pro.getPrecoCusto()));
        txtMargemLucro.setText(String.valueOf(pro.getMargemLucro()));
        txtEstoque.setText(String.valueOf(pro.getEstoque()));
        if(pro.getValidade().equals("Indeterminado")){
            chkIndeterminado.setSelected(true);
            txtValidade.setEnabled(false);
        }else{
            txtValidade.setText(pro.getValidade());
        }
        cbxTipoProduto.setSelectedItem(pro.getTipoProduto());
        limparTabela();
        try{
            //buscando o fornecedor do medoto filtrarFornecedorCnpj, e adicionando na tabela.
            dtm.addRow((fornecedorDAO.FiltrarFornecedorCnpj(pro.getFornecedor().getCnpj())).get(0).addTable());
            tblFornecedores.setRowSelectionInterval(0, 0);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro ao carregar fornecedor na tabela: "+ ex);
        }
        
    }
    public void limparTabela(){
        DefaultTableModel dtm =  (DefaultTableModel) tblFornecedores.getModel();
        int cont = dtm.getRowCount();
            for(int aux=cont-1 ;   aux>=0;  aux--){//removendo valores da tabela
                dtm.removeRow(aux);
            }
    }
    private void loadInitialTableData() {//função que vai preencher a tabela fornecedores
        try {
            Fornecedor forn = new Fornecedor();
            FornecedorDAO fornecedorDAO = new FornecedorDAO();
            
            Vector<Fornecedor> fornecedor = new Vector<Fornecedor>(fornecedorDAO.getAllFornecedores());
            
            DefaultTableModel dtm =  (DefaultTableModel) tblFornecedores.getModel();
            for(int aux=0;aux<fornecedor.size();aux++){//adicionando os fornecedores na tabela
                if(!fornecedor.get(aux).isInativo())
                    dtm.addRow(fornecedor.get(aux).addTable());
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao adicionar fornecedores na tabela");
        }
        try{
            
            for(EnumTipoProduto ep: EnumTipoProduto.values()){
               cbxTipoProduto.addItem(ep.getNome());   
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao adicionar tipo do produto na cbxTipoProduto");
        }
    }
}
