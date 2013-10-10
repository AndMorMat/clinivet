/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.frames;

import br.com.sof3.clinivet.dao.FornecedorDAO;
import br.com.sof3.clinivet.entidade.Fornecedor;
import static br.com.sof3.clinivet.frames.frmAddProduto.tblFornecedores;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andrematos
 */
public class filtrarFornecedorPor extends javax.swing.JFrame {

    /**
     * Creates new form filtrarFornecedorPor
     */
    public filtrarFornecedorPor() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WIDTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGrupFiltro = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtParametro = new javax.swing.JTextField();
        btnFiltrar = new javax.swing.JButton();
        rbtNome = new javax.swing.JRadioButton();
        rbtCnpj = new javax.swing.JRadioButton();
        rbtTelefone = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtrar Fornecedor por"));

        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        buttonGrupFiltro.add(rbtNome);
        rbtNome.setSelected(true);
        rbtNome.setText("Nome");

        buttonGrupFiltro.add(rbtCnpj);
        rbtCnpj.setText("Cnpj");

        buttonGrupFiltro.add(rbtTelefone);
        rbtTelefone.setText("Telefone");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txtParametro, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rbtNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtCnpj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtTelefone)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtNome)
                    .addComponent(rbtCnpj)
                    .addComponent(rbtTelefone))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtParametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrar))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        FornecedorDAO fdao = new FornecedorDAO();
        ArrayList<Fornecedor> fornecedor = new ArrayList<>();
        try{
            if(rbtNome.isSelected()){
                
                fornecedor = fdao.FiltrarFornecedorNome(txtParametro.getText());
                limparTabela();
                DefaultTableModel dtm = (DefaultTableModel)frmAddProduto.tblFornecedores.getModel();
                if(fornecedor.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nenhum Registro encontrado");
                }else{
                    JOptionPane.showMessageDialog(null, fornecedor.size());
                    for(int aux=0;aux<fornecedor.size();aux++)
                        dtm.addRow(fornecedor.get(aux).addTable());
                }
            }else if(rbtCnpj.isSelected()){
               
                fornecedor = fdao.FiltrarFornecedorCnpj(txtParametro.getText());
                limparTabela();
                DefaultTableModel dtm = (DefaultTableModel)frmAddProduto.tblFornecedores.getModel();
                if(fornecedor.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nenhum Registro encontrado");
                }else{
                    for(int aux=0;aux<fornecedor.size();aux++)
                        dtm.addRow(fornecedor.get(aux).addTable());
                }
            }else{
                JOptionPane.showMessageDialog(null, "Por Telefone");
                fornecedor = fdao.FiltrarFornecedorTelefone(txtParametro.getText());
                limparTabela();
                DefaultTableModel dtm = (DefaultTableModel)frmAddProduto.tblFornecedores.getModel();
                if(fornecedor.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nenhum Registro encontrado");
                }else{
                    for(int aux=0;aux<fornecedor.size();aux++)
                        dtm.addRow(fornecedor.get(aux).addTable());
                }
            
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro botao filtrar");
        }
    }//GEN-LAST:event_btnFiltrarActionPerformed

    public void limparTabela(){
        DefaultTableModel dtm = (DefaultTableModel)frmAddProduto.tblFornecedores.getModel();
        int cont = dtm.getRowCount();
            for(int aux=cont-1 ;   aux>=0;  aux--){//removendo valores da tabela
                dtm.removeRow(aux);
            }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrar;
    private javax.swing.ButtonGroup buttonGrupFiltro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbtCnpj;
    private javax.swing.JRadioButton rbtNome;
    private javax.swing.JRadioButton rbtTelefone;
    private javax.swing.JTextField txtParametro;
    // End of variables declaration//GEN-END:variables
}
