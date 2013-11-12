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
public class frmAddVendedor extends javax.swing.JFrame {
    public VendedorDAO dao = new VendedorDAO();
    public String LoginAntigo;
    
    String param = "";
    
    public frmAddVendedor(String parametro, Vendedor vendedor) {
        
       
        
        initComponents();
        setLocationRelativeTo(null);
        param = parametro;
        if(parametro.equals("editar")){
            LoginAntigo = vendedor.getLogin();
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblRepitaSenha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        txtRepitaSenha = new javax.swing.JPasswordField();
        txtSenha = new javax.swing.JPasswordField();
        lblTitulo = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(213, 239, 190));

        jPanel1.setBackground(new java.awt.Color(212, 240, 169));

        lblLogin.setText("Login:");

        lblNome.setText("Nome:");

        lblRepitaSenha.setText("Repita a Senha:");

        jLabel1.setText("Senha:");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(29, 29, 29)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(lblRepitaSenha)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jPanel1Layout.createSequentialGroup()
                            .add(3, 3, 3)
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(lblLogin)
                                .add(jLabel1)))
                        .add(lblNome)))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, txtNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 227, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, txtRepitaSenha)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, txtSenha)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, txtLogin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblNome)
                    .add(txtNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblLogin)
                    .add(txtLogin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(23, 23, 23)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(txtSenha, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtRepitaSenha, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblRepitaSenha))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        lblTitulo.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        lblTitulo.setText("Cadastrar Vendedor");

        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sof3/clinivet/frames/icone-novo-usuario.png"))); // NOI18N
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

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(69, 69, 69)
                        .add(btnOk)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnCancelar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 145, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(43, 43, 43)
                        .add(lblTitulo)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(lblTitulo)
                .add(18, 18, 18)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(btnOk, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(btnCancelar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        VendedorDAO validalogin = new VendedorDAO();
        
        int validaLogin = 0;
        
        if(validaCampos()){
            
            try {
                if(param.equals("cadastrar")){
                    if (validalogin.getLoginDuplicado(txtLogin.getText())) {
                        validaLogin = JOptionPane.showConfirmDialog (null, "Login já Cadastrado, deseja alterar Login desse cadastro?","login já em uso",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                        
                        if(validaLogin ==2)//Caso o usuario não deseje altera o cpf, apenas cancelar a inserção
                            setVisible(false);
                    } else{//Login não duplicado
                        if (!txtSenha.getText().equals(txtRepitaSenha.getText())) {
                             JOptionPane.showMessageDialog(this, "Senhas não correspondem","Erro",JOptionPane.ERROR_MESSAGE);
                             return;
                         }

                         int result = JOptionPane.showConfirmDialog(this, "Você tem certeza?","Adicionar novo vendedor",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                         if (result==2) return;

                         Vendedor vendedor = new Vendedor();
                         vendedor.setNome(txtNome.getText().toUpperCase());
                         vendedor.setLogin(txtLogin.getText().toUpperCase());
                         vendedor.setSenha(txtSenha.getText());

                         try {
                
                        dao.adicionaVendedor(vendedor);
                
                         } catch (SQLException ex) {
                            ex.printStackTrace();
                
                            JOptionPane.showMessageDialog(this, "Erro ao adicionar o vendedor "+ex,"Erro",JOptionPane.ERROR_MESSAGE);
                         }
                    setVisible(false);
                    }
                        
                
                }else if(param.equals("editar")){
                    
                    if (validalogin.getLoginDuplicado(txtLogin.getText()) && !LoginAntigo.toString().equals(txtLogin.getText())) {
                        validaLogin = JOptionPane.showConfirmDialog (null, "Login já Cadastrado, deseja alterar Login desse cadastro?","login já em uso",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                        
                        if(validaLogin ==2)//Caso o usuario não deseje altera o cpf, apenas cancelar a inserção
                            setVisible(false);
                    } else{//Login não duplicado
                        
                        int result = JOptionPane.showConfirmDialog(this, "Você tem certeza?","Editar esse vendedor",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                         if (result==2) return;
                         Vendedor vendedor = new Vendedor();
                       
                         //Integer id, String nome, String login, String senha
                         
                         try{
                 
                             vendedor.cadastrar(dao.getIdVendedor(LoginAntigo),txtNome.getText(), txtLogin.getText(), txtSenha.getText(),false);
                 
                             dao.atualizaVendedor(vendedor);

                         }catch(Exception ex){
                              JOptionPane.showMessageDialog(null, "Erro ao atualizar vendedor na classe frmAddVendedor");
                        }
                             setVisible(false);
                        }}
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao conectar com banco de vendedores");
            }
        }
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRepitaSenha;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtRepitaSenha;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

 private boolean validaCampos(){
        if(txtNome.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo nome esta vazio!");
            return false;
        }else if(txtLogin.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo Login está vazio!");
            return false;
        }else if(txtSenha.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo Senha está vazio!");
            return false;
        }else if(txtSenha.getText().trim().length()<5){
            JOptionPane.showMessageDialog(null, "A senha deve possuir mais que 4 caracteres!");
            return false;
        }
        else if(txtRepitaSenha.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo repita a senha esta vazio!");
            return false;
        }else if(!txtSenha.getText().equals(txtRepitaSenha.getText())){
            JOptionPane.showMessageDialog(null, "As senhas não correspondem!");
            return false;
        }
        return true;
    }
}
