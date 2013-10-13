/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.frames;

import br.com.sof3.clinivet.dao.VendedorDAO;
import br.com.sof3.clinivet.entidade.Vendedor;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Renan
 */
public class frmAddVendedor extends javax.swing.JDialog {
    public final VendedorDAO dao;
    
    String param = "";
    
    public frmAddVendedor(java.awt.Frame parent, boolean modal,VendedorDAO dao, String parametro, Vendedor vendedor) {
        
        super(parent, modal);
        this.dao = dao;
        initComponents();
        setLocationRelativeTo(null);
        param = parametro;
        if(parametro.equals("editar")){
            carregarCampos(vendedor);
            btnOk.setText("Editar");
            lblTitulo.setText("Editar Vendedor");
        }else if(parametro.equals("cadastrar")){
            btnOk.setText("Cadastrar");
            lblTitulo.setText("Cadastrar Vendedor");
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

        lblNome = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblRepitaSenha = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        txtRepitaSenha = new javax.swing.JPasswordField();
        txtSenha = new javax.swing.JPasswordField();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNome.setText("Nome:");

        lblLogin.setText("Login:");

        jLabel1.setText("Senha:");

        lblRepitaSenha.setText("Repita a Senha:");

        btnOk.setText("Cadastrar");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblTitulo.setText("Cadastrar Vendedor");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(btnOk)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnCancelar)
                        .add(141, 141, 141))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lblRepitaSenha)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(layout.createSequentialGroup()
                                    .add(3, 3, 3)
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(lblLogin)
                                        .add(jLabel1)))
                                .add(layout.createSequentialGroup()
                                    .add(lblNome)
                                    .add(4, 4, 4))))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, txtNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 227, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, txtRepitaSenha)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, txtSenha)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, txtLogin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(41, 41, 41))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(lblTitulo)
                        .add(152, 152, 152))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(lblTitulo)
                .add(28, 28, 28)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblNome)
                    .add(txtNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblLogin)
                    .add(txtLogin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(txtSenha, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtRepitaSenha, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblRepitaSenha))
                .add(39, 39, 39)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnOk)
                    .add(btnCancelar))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        if(param.equals("cadastrar")){
            if (!txtSenha.getText().equals(txtRepitaSenha.getText())) {
                 JOptionPane.showMessageDialog(this, "As senhas não são iguais","Erro",JOptionPane.ERROR_MESSAGE);
                 return;
             }

             int result = JOptionPane.showConfirmDialog(this, "Você tem certeza?","Adicionar novo vendedor",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
             if (result==2) return;

             Vendedor vendedor = new Vendedor();
             vendedor.setNome(txtNome.getText());
             vendedor.setLogin(txtLogin.getText());
             vendedor.setSenha(txtSenha.getText());
            try {
                dao.adicionaVendedor(vendedor);
            } catch (SQLException ex) {
                ex.printStackTrace();
                
                JOptionPane.showMessageDialog(this, "Erro ao adicionar o vendedor "+ex,"Erro",JOptionPane.ERROR_MESSAGE);
            }
        }else if(param.equals("editar")){
            int result = JOptionPane.showConfirmDialog(this, "Você tem certeza?","Editar esse vendedor",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
             if (result==2) return;
             Vendedor vendedor = new Vendedor();
             //Integer id, String nome, String login, String senha
             
             try{
                 
                 vendedor.cadastrar(dao.getIdVendedor(txtLogin.getText()),txtNome.getText(), txtLogin.getText(), txtSenha.getText());
                 
                 dao.atualizaVendedor(vendedor);
                 
             }catch(Exception ex){
                 JOptionPane.showMessageDialog(null, "Erro ao atualizar vendedor na classe frmAddVendedor");
             }
        }
        setVisible(false);
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed
    public void carregarCampos(Vendedor v){
        txtLogin.setText(v.getLogin());
        txtNome.setText(v.getNome());
        txtSenha.setText(v.getSenha());
        txtRepitaSenha.setText(v.getSenha());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRepitaSenha;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtRepitaSenha;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
