/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.frames;

import br.com.sof3.clinivet.dao.ClienteDAO;
import br.com.sof3.clinivet.dao.FornecedorDAO;
import br.com.sof3.clinivet.entidade.Cliente;
import br.com.sof3.clinivet.entidade.Fornecedor;
import static br.com.sof3.clinivet.frames.frmAddProduto.tblFornecedores;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andrematos
 */
public class frmFiltrarPor extends javax.swing.JFrame {

    /**
     * Creates new form frmFiltrarPor
     */
    private String param;
    public frmFiltrarPor(String parametro) {
        initComponents();
        param = parametro;
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WIDTH);
        if(parametro.equals("fornecedor")){
            rbtCnpj.setText("Cnpj");
            btnFiltrar.setText("Cnpj");
        }else if(parametro.equals("cliente")){
            rbtCnpj.setText("Cpf");
            btnFiltrar.setText("CPF");
        }
        
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
        rbtTodos = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtrar por:"));

        txtParametro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtParametroKeyPressed(evt);
            }
        });

        btnFiltrar.setText("Filtrar por Nome");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        buttonGrupFiltro.add(rbtNome);
        rbtNome.setSelected(true);
        rbtNome.setText("Nome");
        rbtNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtNomeMouseClicked(evt);
            }
        });

        buttonGrupFiltro.add(rbtCnpj);
        rbtCnpj.setText("Cnpj");
        rbtCnpj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtCnpjMouseClicked(evt);
            }
        });

        buttonGrupFiltro.add(rbtTelefone);
        rbtTelefone.setText("Telefone");
        rbtTelefone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtTelefoneMouseClicked(evt);
            }
        });

        buttonGrupFiltro.add(rbtTodos);
        rbtTodos.setText("Todos");
        rbtTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtTodosMouseClicked(evt);
            }
        });
        rbtTodos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                rbtTodosAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtParametro, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtCnpj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtTodos)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtNome)
                    .addComponent(rbtCnpj)
                    .addComponent(rbtTelefone)
                    .addComponent(rbtTodos))
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
       if(param.equals("fornecedor")){     
            FornecedorDAO fdao = new FornecedorDAO();
            ArrayList<Fornecedor> fornecedor = new ArrayList<>();
            try{
                if(!rbtTodos.isSelected() && txtParametro.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Digite um valor para pesquisar");
                    return;
                }else
                if(rbtNome.isSelected()){

                    fornecedor = fdao.FiltrarFornecedorNome(txtParametro.getText());
                    limparTabela();
                    DefaultTableModel dtm = (DefaultTableModel)frmAddProduto.tblFornecedores.getModel();
                    if(fornecedor.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Nenhum Registro encontrado");
                    }else{
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
                }else if(rbtTelefone.isSelected()){
                    fornecedor = fdao.FiltrarFornecedorTelefone(txtParametro.getText());
                    limparTabela();
                    DefaultTableModel dtm = (DefaultTableModel)frmAddProduto.tblFornecedores.getModel();
                    if(fornecedor.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Nenhum Registro encontrado");
                    }else{
                        for(int aux=0;aux<fornecedor.size();aux++)
                            dtm.addRow(fornecedor.get(aux).addTable());
                    }
                }else{
                    fornecedor = fdao.FiltrarFornecedorNome("");//mandar Parametro em branco ele filtra todos
                    limparTabela();
                    DefaultTableModel dtm = (DefaultTableModel)frmAddProduto.tblFornecedores.getModel();
                    if(fornecedor.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Nenhum Registro encontrado");
                    }else{
                        for(int aux=0;aux<fornecedor.size();aux++)
                            dtm.addRow(fornecedor.get(aux).addTable());
                    }

                }
                setVisible(false);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Erro botao filtrar");
            }
       }else if(param.equals("cliente")){
            
            ClienteDAO clienteDAO = new ClienteDAO();
            List<Cliente> cliente = new ArrayList<>();
            
            try{
                if(!rbtTodos.isSelected() && txtParametro.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Digite um valor para pesquisar");
                    return;
                }else
                if(rbtNome.isSelected()){
                    
                    cliente = clienteDAO.getClientesByName(txtParametro.getText());
                    
                    limparTabela();
                    
                    DefaultTableModel dtm = (DefaultTableModel)frmAddAnimal.tblClientes.getModel();
                    if(cliente.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Nenhum Registro encontrado");
                    }else{
                        for(int aux=0;aux<cliente.size();aux++)
                            dtm.addRow(cliente.get(aux).addTable());
                    }
                }else if(rbtCnpj.isSelected()){

                    cliente = clienteDAO.getClientesByCPF(txtParametro.getText());
                    limparTabela();
                    DefaultTableModel dtm = (DefaultTableModel)frmAddAnimal.tblClientes.getModel();
                    if(cliente.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Nenhum Registro encontrado");
                    }else{
                        for(int aux=0;aux<cliente.size();aux++)
                            dtm.addRow(cliente.get(aux).addTable());
                    }
                }else if(rbtTelefone.isSelected()){
                    cliente = clienteDAO.getClientesByTelefone(txtParametro.getText());
                    limparTabela();
                    DefaultTableModel dtm = (DefaultTableModel)frmAddAnimal.tblClientes.getModel();
                    if(cliente.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Nenhum Registro encontrado");
                    }else{
                        for(int aux=0;aux<cliente.size();aux++)
                            dtm.addRow(cliente.get(aux).addTable());
                    }
                }else{
                    cliente = clienteDAO.getClientesByName("");//mandar parametro em branco ele busca todos
                    
                    limparTabela();
                    
                    DefaultTableModel dtm = (DefaultTableModel)frmAddAnimal.tblClientes.getModel();
                    if(cliente.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Nenhum Registro encontrado");
                    }else{
                        for(int aux=0;aux<cliente.size();aux++)
                            dtm.addRow(cliente.get(aux).addTable());
                    }
                }
                
                setVisible(false);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Erro botao filtrar");
            }
       }
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void txtParametroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtParametroKeyPressed
        
    }//GEN-LAST:event_txtParametroKeyPressed

    private void rbtTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtTodosMouseClicked
        txtParametro.setEnabled(false);
        btnFiltrar.setText("Filtrar Todos");
    }//GEN-LAST:event_rbtTodosMouseClicked

    private void rbtTodosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_rbtTodosAncestorAdded
        
    }//GEN-LAST:event_rbtTodosAncestorAdded

    private void rbtNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtNomeMouseClicked
        txtParametro.setEnabled(true);
        btnFiltrar.setText("Filtrar por Nome");
    }//GEN-LAST:event_rbtNomeMouseClicked

    private void rbtCnpjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtCnpjMouseClicked
        txtParametro.setEnabled(true);
        btnFiltrar.setText("Filtrar por Cnpj");
    }//GEN-LAST:event_rbtCnpjMouseClicked

    private void rbtTelefoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtTelefoneMouseClicked
        txtParametro.setEnabled(true);
        btnFiltrar.setText("Filtrar por Telefone");
    }//GEN-LAST:event_rbtTelefoneMouseClicked

    public void limparTabela(){
        
        if(param.equals("fornecedor")){
            DefaultTableModel dtm = (DefaultTableModel)frmAddProduto.tblFornecedores.getModel();
            int cont = dtm.getRowCount();
                for(int aux=cont-1 ;   aux>=0;  aux--){//removendo valores da tabela
                    dtm.removeRow(aux);
            }
        }else{
            DefaultTableModel dtm = (DefaultTableModel)frmAddAnimal.tblClientes.getModel();
            int cont = dtm.getRowCount();
            for(int aux=cont-1 ;   aux>=0;  aux--){//removendo valores da tabela
                dtm.removeRow(aux);
            }
        }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrar;
    private javax.swing.ButtonGroup buttonGrupFiltro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbtCnpj;
    private javax.swing.JRadioButton rbtNome;
    private javax.swing.JRadioButton rbtTelefone;
    private javax.swing.JRadioButton rbtTodos;
    private javax.swing.JTextField txtParametro;
    // End of variables declaration//GEN-END:variables
}
