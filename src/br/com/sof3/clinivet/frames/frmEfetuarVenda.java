package br.com.sof3.clinivet.frames;

import br.com.sof3.clinivet.entidade.VendaProduto;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Renan
 */
public class frmEfetuarVenda extends javax.swing.JFrame {

    private List<VendaProduto> itens = new LinkedList<VendaProduto>();
    
    public frmEfetuarVenda() {
        initComponents();
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

        lblDataVenda = new javax.swing.JLabel();
        txtDataVenda = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnAddProduto = new javax.swing.JButton();
        btnRemoverProdutoLista = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();
        btnConcluirVenda = new javax.swing.JButton();
        btnCancelarVenda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        tableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableProdutos);

        btnConcluirVenda.setText("Concluir Venda");
        btnConcluirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirVendaActionPerformed(evt);
            }
        });

        btnCancelarVenda.setText("Cancelar");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(39, 39, 39)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(btnAddProduto)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnRemoverProdutoLista))
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(layout.createSequentialGroup()
                            .add(lblDataVenda)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(txtDataVenda, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(lblTotal)
                            .add(18, 18, 18)
                            .add(txtTotal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 570, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(btnConcluirVenda)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnCancelarVenda)
                .add(44, 44, 44))
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
                .add(37, 37, 37)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnAddProduto)
                    .add(btnRemoverProdutoLista))
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 181, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnConcluirVenda)
                    .add(btnCancelarVenda))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConcluirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirVendaActionPerformed
        if (itens.size() == 0) {
            JOptionPane.showMessageDialog(this, "A lista de produtos está vazia!","Erro",JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnConcluirVendaActionPerformed

    private void btnAddProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProdutoActionPerformed
        frmAddProdutoParaVenda addProdutoParaVenda = new frmAddProdutoParaVenda();
    }//GEN-LAST:event_btnAddProdutoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduto;
    private javax.swing.JButton btnCancelarVenda;
    private javax.swing.JButton btnConcluirVenda;
    private javax.swing.JButton btnRemoverProdutoLista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDataVenda;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tableProdutos;
    private javax.swing.JTextField txtDataVenda;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}