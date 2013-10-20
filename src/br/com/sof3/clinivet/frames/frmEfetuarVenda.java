package br.com.sof3.clinivet.frames;

import br.com.sof3.clinivet.dao.ProdutoDAO;
import br.com.sof3.clinivet.dao.VendaDAO;
import br.com.sof3.clinivet.entidade.EnumTipoProduto;
import br.com.sof3.clinivet.entidade.Produto;
import br.com.sof3.clinivet.entidade.Venda;
import br.com.sof3.clinivet.entidade.VendaProduto;
import br.com.sof3.clinivet.entidade.Vendedor;
import java.sql.Array;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Renan
 */
public class frmEfetuarVenda extends javax.swing.JDialog {
    private final VendaDAO dao;
    ProdutoDAO pdao = new ProdutoDAO();
    Venda venda = new Venda();
    private List<VendaProduto> itens = new LinkedList<VendaProduto>();
    double desconto = 0;
    
    public frmEfetuarVenda(java.awt.Frame parent, boolean modal, VendaDAO dao) {
        super(parent, modal);
        this.dao = dao;
        this.itens = itens;
        initComponents();
        loadInitialData();
        carregarCbx(); 
        atualizaItens();
        carregaTodosProdutos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupFormaPagamento = new javax.swing.ButtonGroup();
        groupPesquisaProduto = new javax.swing.ButtonGroup();
        lblDataVenda = new javax.swing.JLabel();
        txtDataVenda = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnRemoverProdutoLista = new javax.swing.JButton();
        btnConcluirVenda = new javax.swing.JButton();
        btnCancelarVenda = new javax.swing.JButton();
        lblVendedor = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        radioAvista = new javax.swing.JRadioButton();
        radioCartao = new javax.swing.JRadioButton();
        comboFormaPagamento = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCarrinho = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();
        radioCodigoProduto = new javax.swing.JRadioButton();
        radioNomeProduto = new javax.swing.JRadioButton();
        btnProcurar = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        cbxTipoProduto = new javax.swing.JComboBox();
        btnBuscar1 = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnAdicionarNoCarrinho = new javax.swing.JToggleButton();
        lblQuantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();

        lblDataVenda.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        lblDataVenda.setText("Data da Venda:");

        txtDataVenda.setEditable(false);
        txtDataVenda.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        lblTotal.setFont(new java.awt.Font("Lucida Grande", 1, 17)); // NOI18N
        lblTotal.setText("Total:");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        btnRemoverProdutoLista.setText("Remover Produto do Carrinho");
        btnRemoverProdutoLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverProdutoListaActionPerformed(evt);
            }
        });

        btnConcluirVenda.setText("Concluir Venda");
        btnConcluirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirVendaActionPerformed(evt);
            }
        });

        btnCancelarVenda.setText("Cancelar");
        btnCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVendaActionPerformed(evt);
            }
        });

        lblVendedor.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        lblVendedor.setText("Vendedor:");

        lblCliente.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        lblCliente.setText("Cliente:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Forma de Pagamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N

        groupFormaPagamento.add(radioAvista);
        radioAvista.setText("À Vista");
        radioAvista.setBorder(null);
        radioAvista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAvistaActionPerformed(evt);
            }
        });

        groupFormaPagamento.add(radioCartao);
        radioCartao.setText("Cartão");
        radioCartao.setBorder(null);
        radioCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCartaoActionPerformed(evt);
            }
        });

        comboFormaPagamento.setEnabled(false);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(radioAvista)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(radioCartao)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(comboFormaPagamento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(radioAvista)
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(radioCartao)
                    .add(comboFormaPagamento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Preço", "Estoque"
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
        jScrollPane1.setViewportView(tableCarrinho);
        tableCarrinho.getColumnModel().getColumn(0).setResizable(false);
        tableCarrinho.getColumnModel().getColumn(2).setResizable(false);
        tableCarrinho.getColumnModel().getColumn(3).setResizable(false);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel1.setText("Carrinho de Compra");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Pesquisar Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N

        tableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome Produto", "Preço", "Estoque"
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
        jScrollPane2.setViewportView(tableProdutos);

        groupPesquisaProduto.add(radioCodigoProduto);
        radioCodigoProduto.setSelected(true);
        radioCodigoProduto.setText("Código do Produto");

        groupPesquisaProduto.add(radioNomeProduto);
        radioNomeProduto.setText("Nome do Produto");

        btnProcurar.setText("Procurar");
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar por tipo"));

        cbxTipoProduto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o tipo", "Todos" }));
        cbxTipoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoProdutoActionPerformed(evt);
            }
        });

        btnBuscar1.setText("Buscar");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(cbxTipoProduto, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnBuscar1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(cbxTipoProduto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(btnBuscar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
        );

        txtBuscar.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        btnAdicionarNoCarrinho.setText("Adicona ao Carrinho");
        btnAdicionarNoCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarNoCarrinhoActionPerformed(evt);
            }
        });

        lblQuantidade.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblQuantidade.setText("Quantidade:");

        txtQuantidade.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(radioCodigoProduto)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(radioNomeProduto))
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(txtBuscar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 196, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(btnProcurar)))
                        .add(18, 18, 18)
                        .add(jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 660, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(lblQuantidade)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(txtQuantidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(btnAdicionarNoCarrinho)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(radioCodigoProduto)
                            .add(radioNomeProduto))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtBuscar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnProcurar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 141, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(13, 13, 13)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnAdicionarNoCarrinho, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtQuantidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblQuantidade))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(39, 39, 39)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(lblCliente)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(layout.createSequentialGroup()
                                    .add(lblDataVenda)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(txtDataVenda))
                                .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(lblVendedor)
                            .add(jLabel1))
                        .add(26, 26, 26)
                        .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(btnConcluirVenda)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnRemoverProdutoLista, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 212, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnCancelarVenda, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 155, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(lblTotal)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(txtTotal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jScrollPane1))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(33, 33, 33)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createSequentialGroup()
                        .add(lblVendedor)
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(lblDataVenda, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(txtDataVenda, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(lblCliente)
                        .add(18, 18, 18)
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel1))
                    .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 144, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(btnCancelarVenda, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 54, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(btnRemoverProdutoLista, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 57, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(lblTotal)
                        .add(txtTotal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(btnConcluirVenda, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 55, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConcluirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirVendaActionPerformed
        if (itens.size() == 0) {
            JOptionPane.showMessageDialog(this, "A lista de produtos está vazia!","Erro",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(desconto < 0) {
            JOptionPane.showMessageDialog(null, "Não é permitido valores negativos no desconto" ,"Erro",JOptionPane.ERROR_MESSAGE);
            return;
        }

        int opt = JOptionPane.showConfirmDialog(this, "Você tem certeza?", "Confirmar", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

        if (opt == 0) { 
            venda.setDataVenda(new java.sql.Date(new java.util.Date().getTime()));
            venda.setTotalVenda(Float.parseFloat(txtTotal.getText().substring(2)) - desconto);
            if(radioAvista.isSelected()) {
                venda.setFormaPagamento("À vista");
            }
            venda.setItens(itens);
            
            for (VendaProduto vendaItem : itens) {
                vendaItem.setVenda(venda);
            }
            try {
                dao.addVenda(venda, true);
                setVisible(false);
            } catch (SQLException ex) {
                Logger.getLogger(frmEfetuarVenda.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Erro ao salvar a venda "+ex,"Error",JOptionPane.ERROR_MESSAGE);

            }
        }
    }//GEN-LAST:event_btnConcluirVendaActionPerformed

    private void btnRemoverProdutoListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverProdutoListaActionPerformed
        if (tableCarrinho.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Você deve selecionar um produto antes de remover","Erro",JOptionPane.ERROR_MESSAGE);
            return;
        }

        int opt = JOptionPane.showConfirmDialog(this, "Are you sure ?","Confirm Delete",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

        if (opt == 0) {
            DefaultTableModel dtm =(DefaultTableModel)tableCarrinho.getModel();
            itens.remove(tableCarrinho.getSelectedRow());
            dtm.removeRow(tableCarrinho.getSelectedRow());
            atualizaItens();
        }
    }//GEN-LAST:event_btnRemoverProdutoListaActionPerformed

    private void btnCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVendaActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCancelarVendaActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)tableProdutos.getModel();

        int cont2 = dtm.getRowCount();
        for(int aux=cont2-1 ;   aux>=0;  aux--){//removendo valores da tabela
            dtm.removeRow(aux);
        }
        try {
            List<Produto> pro = new LinkedList<Produto>();

            Produto p  = new Produto();
            int cont=0;

            if(!"Todos".equals(cbxTipoProduto.getSelectedItem())){//comparando combo caso usuario queira ver todos os tipos
                pro = pdao.getProdutosByTipo(String.valueOf(cbxTipoProduto.getSelectedItem()));
            }else{
                pro = pdao.getProdutoByName("");
            }

            for(int aux = 0; aux < pro.size();aux++){
                p.setCodigo(pro.get(aux).getCodigo());
                p.setNome(pro.get(aux).getNome());
                p.setPrecoVenda(pro.get(aux).getPrecoVenda());
                p.setEstoque(pro.get(aux).getEstoque());

                dtm.addRow(p.addTable());
                cont++;
            }

            if(cont==0)//para exibir caso procura não exiba nada
            JOptionPane.showMessageDialog(null, "Nenhum Registro encontrado");
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void cbxTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoProdutoActionPerformed

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
        DefaultTableModel dtm = (DefaultTableModel)tableProdutos.getModel();

        int cont2 = dtm.getRowCount();
        for(int aux = cont2-1; aux >= 0;  aux--){//removendo valores da tabela
            dtm.removeRow(aux);
        }

        if(txtBuscar.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo não pode estar em branco");
        }
        else {
            int cont = 0;

            try {
                List<Produto> pro = new LinkedList<Produto>();

                Produto p = new Produto();

                if(radioNomeProduto.isSelected()){
                    pro = pdao.getProdutoByName(txtBuscar.getText());
                }
                else {
                    pro = pdao.getProdutoByCodigo(txtBuscar.getText());
                }

                for(int aux = 0; aux < pro.size();aux++){
                    p.setCodigo(pro.get(aux).getCodigo());
                    p.setNome(pro.get(aux).getNome());
                    p.setPrecoVenda(pro.get(aux).getPrecoVenda());

                    dtm.addRow(p.addTable());
                    cont++;
                }
                if(cont == 0) {
                    JOptionPane.showMessageDialog(null, "Nenhum Registro encontrado");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro no try da classe frmAddProdutoParaVenda no botao buscar");
            }
        }
    }//GEN-LAST:event_btnProcurarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void radioCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCartaoActionPerformed
        if(radioCartao.isSelected()) {
            comboFormaPagamento.setEnabled(true);
        }
    }//GEN-LAST:event_radioCartaoActionPerformed

    private void radioAvistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAvistaActionPerformed
        if(radioAvista.isSelected()) {
            comboFormaPagamento.setEnabled(false);
        }
    }//GEN-LAST:event_radioAvistaActionPerformed

    private void btnAdicionarNoCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarNoCarrinhoActionPerformed
        DefaultTableModel dtm = (DefaultTableModel)tableProdutos.getModel();
        DefaultTableModel dtm2 = (DefaultTableModel) tableCarrinho.getModel();
        List<Produto> pro = new ArrayList();
        ProdutoDAO pdao = new ProdutoDAO();
        
        Integer qnt = Integer.parseInt(txtQuantidade.getText());
        
        String estoque = String.valueOf(dtm.getValueAt(tableProdutos.getSelectedRow(), 3));
        
        if(qnt > Integer.parseInt(estoque)) {
            JOptionPane.showMessageDialog(null, "Quantidade não permitida! Verifique o estoque.", "Erro",JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (qnt <= 0) {
            JOptionPane.showMessageDialog(this, "Quantidade deve ser maior que 0","Erro",JOptionPane.ERROR_MESSAGE);
            txtQuantidade.requestFocus();
            return;
        }
        
        try {
            pro = pdao.getProdutoByCodigo(String.valueOf(dtm.getValueAt(tableProdutos.getSelectedRow(), 0)));
            VendaProduto item = new VendaProduto();
            dtm2.addRow(pro.get(0).addTable());
            item.setQtd(qnt);
            item.setProduto((Produto) pro.get(0));
            itens.add(item);
            atualizaItens();
         } catch (SQLException ex) {
            Logger.getLogger(frmEfetuarVenda.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btnAdicionarNoCarrinhoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAdicionarNoCarrinho;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnCancelarVenda;
    private javax.swing.JButton btnConcluirVenda;
    private javax.swing.JToggleButton btnProcurar;
    private javax.swing.JButton btnRemoverProdutoLista;
    private javax.swing.JComboBox cbxTipoProduto;
    private javax.swing.JComboBox comboFormaPagamento;
    private javax.swing.ButtonGroup groupFormaPagamento;
    private javax.swing.ButtonGroup groupPesquisaProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblDataVenda;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblVendedor;
    private javax.swing.JRadioButton radioAvista;
    private javax.swing.JRadioButton radioCartao;
    private javax.swing.JRadioButton radioCodigoProduto;
    private javax.swing.JRadioButton radioNomeProduto;
    public static javax.swing.JTable tableCarrinho;
    private javax.swing.JTable tableProdutos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDataVenda;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    private void loadInitialData() {
        txtTotal.setText("R$ 0,00");
        txtDataVenda.setText(new SimpleDateFormat("dd/mm/yyyy").format(new Date()));
    }
    
    public void atualizaItens() {
        float value = 0;
        for (VendaProduto sellItem : itens) {
            value += sellItem.getProduto().getPrecoVenda()*sellItem.getQtd();
            sellItem.setTotal(sellItem.getProduto().getPrecoVenda()*sellItem.getQtd());
        }   
       txtTotal.setText("R$ "+value);
    }

    public void carregarCbx(){
        for(EnumTipoProduto ep: EnumTipoProduto.values()){
            cbxTipoProduto.addItem(ep.getNome());
        }
    }
    
    public void carregaTodosProdutos() {
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)tableProdutos.getModel();

        try {
            List<Produto> pro = new LinkedList<Produto>();

            Produto p  = new Produto();

            pro = pdao.getTodosProdutos();

            for(int aux = 0; aux < pro.size();aux++){
                p.setCodigo(pro.get(aux).getCodigo());
                p.setNome(pro.get(aux).getNome());
                p.setPrecoVenda(pro.get(aux).getPrecoVenda());
                p.setEstoque(pro.get(aux).getEstoque());

                dtm.addRow(p.addTable());
            }
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
}
