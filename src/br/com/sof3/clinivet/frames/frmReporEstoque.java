/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sof3.clinivet.frames;

import br.com.sof3.clinivet.dao.ProdutoDAO;
import br.com.sof3.clinivet.entidade.EnumTipoProduto;
import br.com.sof3.clinivet.entidade.Produto;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmReporEstoque extends javax.swing.JFrame {

    ProdutoDAO pdao = new ProdutoDAO();
    
    public frmReporEstoque() {
        initComponents();
        setDefaultCloseOperation(WIDTH);
        setLocationRelativeTo(null);
        carregarCbx();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupBusca = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        radioNome = new javax.swing.JRadioButton();
        radioCodigo = new javax.swing.JRadioButton();
        txtBusca = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cbxTipoProduto = new javax.swing.JComboBox();
        btnBuscar1 = new javax.swing.JButton();
        btnRepor = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblBuscaPro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Repor Estoque");

        jLabel3.setText("Buscar por:");

        groupBusca.add(radioNome);
        radioNome.setSelected(true);
        radioNome.setText("Nome Produto");

        groupBusca.add(radioCodigo);
        radioCodigo.setText("Código");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar por tipo"));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar1)
                    .addComponent(cbxTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnRepor.setText("Repor Estoque");
        btnRepor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporActionPerformed(evt);
            }
        });

        tblBuscaPro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Tipo", "Preço", "Estoque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblBuscaPro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioCodigo)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnRepor)
                            .addComponent(jScrollPane3))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioNome)
                            .addComponent(radioCodigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnRepor)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoProdutoActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed

        DefaultTableModel dtm = (DefaultTableModel)tblBuscaPro.getModel();
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

                for(int aux =0;aux<pro.size();aux++){
                                p.setCodigo(pro.get(aux).getCodigo());
                                p.setNome(pro.get(aux).getNome());
                                p.setTipoProduto(pro.get(aux).getTipoProduto());
                                p.setPrecoVenda(pro.get(aux).getPrecoVenda());
                                p.setEstoque(pro.get(aux).getEstoque());

                                dtm.addRow(p.addTableConsulta());
                                cont++;
                    }

                    if(cont==0)//para exibir caso procura não exiba nada
                        JOptionPane.showMessageDialog(null, "Nenhum Registro encontrado");
        }catch(SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro no try da classe frmPesquisaCliente no botao buscar");
        }
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        DefaultTableModel dtm = (DefaultTableModel)tblBuscaPro.getModel();

        int cont2 = dtm.getRowCount();
        for(int aux=cont2-1 ;   aux>=0;  aux--){//removendo valores da tabela
            dtm.removeRow(aux);
        }
        
        if(txtBusca.getText().isEmpty()){
               JOptionPane.showMessageDialog(null, "Digite para pesquisar");
         
        }else{//Caso não esteja campo vazio
            int cont=0;
            
                List<Produto> pro = new LinkedList<Produto>(); //Criando lista de produtos para armazenar busca

                Produto p  = new Produto();
                
                if(radioNome.isSelected()){ 
                    try {
                    //Manda buscar nome
                    pro = pdao.getProdutoByName(txtBusca.getText());//Manda buscar nome
                } catch (SQLException ex) {
                    Logger.getLogger(frmReporEstoque.class.getName()).log(Level.SEVERE, null, ex);
                }
                }else{
                    try {
                    //Se tiver buscando pelo Código
                    pro = pdao.getProdutoByCodigo(txtBusca.getText());
                } catch (SQLException ex) {
                    Logger.getLogger(frmReporEstoque.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
                
                
                for(int aux =0;aux<pro.size();aux++){
                    p.setCodigo(pro.get(aux).getCodigo());
                    p.setNome(pro.get(aux).getNome());
                    p.setTipoProduto(pro.get(aux).getTipoProduto());
                    p.setPrecoVenda(pro.get(aux).getPrecoVenda());
                    p.setEstoque(pro.get(aux).getEstoque());

                    dtm.addRow(p.addTableConsulta());
                    cont++;
                }

                if(cont==0)//para exibir caso procura não exiba nada
                JOptionPane.showMessageDialog(null, "Nenhum Registro encontrado");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnReporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel)tblBuscaPro.getModel();
            
            ProdutoDAO pdao = new ProdutoDAO();
            Produto pro = new Produto();
            int codProduto, quantidade = 0;
            
            codProduto = pdao.getIdBCod(String.valueOf(dtm.getValueAt(tblBuscaPro.getSelectedRow(), 0)));
            pro = pdao.getProduto(codProduto);
            
            if (tblBuscaPro.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "Você deve selecionar um produto para repor o estoque","Erro",JOptionPane.ERROR_MESSAGE);
                return;
            }
            do {
                quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade que deseja "));
                if(quantidade < 0) {
                    JOptionPane.showMessageDialog(null, "Quantidade inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }while(quantidade < 0);

            pdao.atualizaEstoque(codProduto, pro.getEstoque() + quantidade);
            JOptionPane.showMessageDialog(null, "O estoque do produto " + pro.getNome() + " foi atualizado com sucesso!");
            
             int cont2 = dtm.getRowCount();
             for(int aux=cont2-1 ;   aux>=0;  aux--){//removendo valores da tabela
                dtm.removeRow(aux);
             }
        } catch (SQLException ex) {
            Logger.getLogger(frmReporEstoque.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnReporActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnRepor;
    private javax.swing.JComboBox cbxTipoProduto;
    private javax.swing.ButtonGroup groupBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton radioCodigo;
    private javax.swing.JRadioButton radioNome;
    private javax.swing.JTable tblBuscaPro;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables

    public void carregarCbx(){
        for(EnumTipoProduto ep: EnumTipoProduto.values()){
               cbxTipoProduto.addItem(ep.getNome());
            }
    }
}
