/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.frames;

import br.com.sof3.clinivet.dao.ProdutoDAO;
import br.com.sof3.clinivet.entidade.Produto;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Renan
 */
public class frmAddProdutoParaVenda extends javax.swing.JFrame {
    ProdutoDAO pdao = new ProdutoDAO();

    public frmAddProdutoParaVenda() {
        initComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioGroupBuscarPor = new javax.swing.ButtonGroup();
        lblProcurarPor = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();
        btnProcurar = new javax.swing.JToggleButton();
        radioCodigoProduto = new javax.swing.JRadioButton();
        radioNomeProduto = new javax.swing.JRadioButton();
        radioTipo = new javax.swing.JRadioButton();
        txtBuscar = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JToggleButton();
        btnCancelar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblProcurarPor.setText("Procurar por:");

        lblQuantidade.setText("Quantidade:");

        tableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome Produto", "Preço"
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
        jScrollPane1.setViewportView(tableProdutos);
        tableProdutos.getColumnModel().getColumn(0).setResizable(false);
        tableProdutos.getColumnModel().getColumn(2).setResizable(false);

        btnProcurar.setText("Procurar");
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });

        radioGroupBuscarPor.add(radioCodigoProduto);
        radioCodigoProduto.setSelected(true);
        radioCodigoProduto.setText("Código do Produto");

        radioGroupBuscarPor.add(radioNomeProduto);
        radioNomeProduto.setText("Nome do Produto");

        radioGroupBuscarPor.add(radioTipo);
        radioTipo.setText("Tipo");

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(layout.createSequentialGroup()
                                        .add(txtBuscar)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(btnProcurar))
                                    .add(layout.createSequentialGroup()
                                        .add(radioCodigoProduto)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(radioNomeProduto)))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(radioTipo))
                            .add(layout.createSequentialGroup()
                                .add(8, 8, 8)
                                .add(lblQuantidade)
                                .add(18, 18, 18)
                                .add(txtQuantidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 77, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(btnAdicionar)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(btnCancelar))))
                    .add(layout.createSequentialGroup()
                        .add(28, 28, 28)
                        .add(lblProcurarPor)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(37, 37, 37)
                .add(lblProcurarPor)
                .add(29, 29, 29)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(radioCodigoProduto)
                    .add(radioNomeProduto)
                    .add(radioTipo))
                .add(22, 22, 22)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtBuscar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnProcurar))
                .add(37, 37, 37)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(37, 37, 37)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblQuantidade)
                    .add(txtQuantidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(31, 31, 31)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnAdicionar)
                    .add(btnCancelar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                else if(radioCodigoProduto.isSelected()) {
                    pro = pdao.getProdutoByCodigo(txtBuscar.getText());
                }
                else {
                    pro = pdao.getProdutosByTipo(txtBuscar.getText());
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

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        Integer qnt = Integer.parseInt(txtQuantidade.getText());

        if (qnt <= 0) {
            JOptionPane.showMessageDialog(this, "Qnt must be higher than 0","Error",JOptionPane.ERROR_MESSAGE);
            txtQuantidade.requestFocus();
            return;
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAdicionar;
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JToggleButton btnProcurar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProcurarPor;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JRadioButton radioCodigoProduto;
    private javax.swing.ButtonGroup radioGroupBuscarPor;
    private javax.swing.JRadioButton radioNomeProduto;
    private javax.swing.JRadioButton radioTipo;
    private javax.swing.JTable tableProdutos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
