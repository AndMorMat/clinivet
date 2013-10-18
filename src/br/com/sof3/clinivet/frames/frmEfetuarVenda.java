package br.com.sof3.clinivet.frames;

import br.com.sof3.clinivet.dao.VendaDAO;
import br.com.sof3.clinivet.entidade.Venda;
import br.com.sof3.clinivet.entidade.VendaProduto;
import br.com.sof3.clinivet.entidade.Vendedor;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
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
    private List<VendaProduto> itens = new LinkedList<VendaProduto>();
    
    public frmEfetuarVenda(java.awt.Frame parent, boolean modal, VendaDAO dao) {
        super(parent, modal);
        this.dao = dao;
        initComponents();
        loadInitialData();
        atualizaItens();
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
        lblDataVenda = new javax.swing.JLabel();
        txtDataVenda = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnAddProduto = new javax.swing.JButton();
        btnRemoverProdutoLista = new javax.swing.JButton();
        btnConcluirVenda = new javax.swing.JButton();
        btnCancelarVenda = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblDataVenda.setText("Data da Venda:");

        txtDataVenda.setEditable(false);

        lblTotal.setText("Total:");

        txtTotal.setEditable(false);

        btnAddProduto.setText("Adicionar Produto");
        btnAddProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdutoActionPerformed(evt);
            }
        });

        btnRemoverProdutoLista.setText("Remover Produto da Lista");
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

        tableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Preço"
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

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(39, 39, 39)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(btnConcluirVenda)
                        .add(28, 28, 28)
                        .add(btnCancelarVenda))
                    .add(layout.createSequentialGroup()
                        .add(btnAddProduto)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnRemoverProdutoLista))
                    .add(layout.createSequentialGroup()
                        .add(lblDataVenda)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(txtDataVenda, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(214, 214, 214)
                        .add(lblTotal)
                        .add(18, 18, 18)
                        .add(txtTotal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(61, 61, 61)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblDataVenda)
                    .add(txtDataVenda, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblTotal)
                    .add(txtTotal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(90, 90, 90)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnAddProduto)
                    .add(btnRemoverProdutoLista))
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 144, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btnConcluirVenda)
                    .add(btnCancelarVenda))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConcluirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirVendaActionPerformed
        if (itens.size() == 0) {
            JOptionPane.showMessageDialog(this, "A lista de produtos está vazia!","Erro",JOptionPane.ERROR_MESSAGE);
            return;
        }

        int opt = JOptionPane.showConfirmDialog(this, "Você tem certeza?", "Confirmar", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

        if (opt == 0) {
            frmLogin dialogLogin = new frmLogin(new javax.swing.JFrame(), true);
            Venda venda = new Venda();
            venda.setDataVenda(new java.sql.Date(new java.util.Date().getTime()));
            venda.setTotalVenda(Float.parseFloat(txtTotal.getText().substring(2)));
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

    private void btnAddProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProdutoActionPerformed
        frmAddProdutoParaVenda addProdutoParaVenda = new frmAddProdutoParaVenda(new javax.swing.JFrame(), true, itens, this);
        addProdutoParaVenda.setVisible(true);
    }//GEN-LAST:event_btnAddProdutoActionPerformed

    private void btnRemoverProdutoListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverProdutoListaActionPerformed
        if (tableProdutos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Você deve selecionar um produto antes de remover","Erro",JOptionPane.ERROR_MESSAGE);
            return;
        }

        int opt = JOptionPane.showConfirmDialog(this, "Are you sure ?","Confirm Delete",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

        if (opt == 0) {
            DefaultTableModel dtm =(DefaultTableModel)tableProdutos.getModel();
            itens.remove(tableProdutos.getSelectedRow());
            dtm.removeRow(tableProdutos.getSelectedRow());
            atualizaItens();
        }
    }//GEN-LAST:event_btnRemoverProdutoListaActionPerformed

    private void btnCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVendaActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCancelarVendaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduto;
    private javax.swing.JButton btnCancelarVenda;
    private javax.swing.JButton btnConcluirVenda;
    private javax.swing.JButton btnRemoverProdutoLista;
    private javax.swing.ButtonGroup groupFormaPagamento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDataVenda;
    private javax.swing.JLabel lblTotal;
    public static javax.swing.JTable tableProdutos;
    private javax.swing.JTextField txtDataVenda;
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
}
