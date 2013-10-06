/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.frames;

import br.com.sof3.clinivet.dao.AnimalDAO;
import br.com.sof3.clinivet.dao.ClienteDAO;
import br.com.sof3.clinivet.dao.VendedorDAO;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author xps-l502x
 */
public class telaPrincipal extends javax.swing.JDialog {
    private final ClienteDAO cdao = new ClienteDAO();
    private final VendedorDAO vdao = new VendedorDAO();
    private final AnimalDAO adao = new AnimalDAO();
    /**
     * Creates new form telaPrincipal
     */
    public telaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("CliniVet");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frmLogin dialogLogin = new frmLogin(new javax.swing.JFrame(), true);
        dialogLogin.setVisible(true);
        lblUsuarioLogado.setText("Usuario: "+dialogLogin.usuarioLogado());//pegando o nome do usuario que esta logado no sistema
        
        try{//caso o usuario só feche a tela login sem validar os dados os menus são definidos como setEnabled(false);
            if(!vdao.isValidLoginSenha(dialogLogin.usuarioLogado(), dialogLogin.senhaUsuario())){
                jMenu2.setEnabled(false);//editar
                jMenu3.setEnabled(false);//relatorios
                jMenuCadastrarUsuario.setEnabled(false);//usuarios
                jMenuConsultas.setEnabled(false);
                lblUsuarioLogado.setText("Usuario não logado");
            }
            if(!dialogLogin.usuarioLogado().equals("admin")){//somente o administrador poderá cadastrar um novo vendedor
                jMenuCadastrarCliente.setEnabled(false);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro dentro da classe principal no metodo telaPrincipal");
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

        lblUsuarioLogado = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastrarUsuario = new javax.swing.JMenu();
        jMenuCadastrarCliente = new javax.swing.JMenuItem();
        jMenuCadastrarAnimal = new javax.swing.JMenuItem();
        jMenuCadastrarProduto = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuCadFornecedor = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuConsultas = new javax.swing.JMenu();
        jMenuItemVendedores = new javax.swing.JMenuItem();
        jMenuItemClientes = new javax.swing.JMenuItem();

        setResizable(false);

        lblUsuarioLogado.setText("Usuario:");

        jMenuCadastrarUsuario.setText("Cadastrar");
        jMenuCadastrarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCadastrarUsuarioMouseClicked(evt);
            }
        });

        jMenuCadastrarCliente.setText("Usuario");
        jMenuCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastrarClienteActionPerformed(evt);
            }
        });
        jMenuCadastrarUsuario.add(jMenuCadastrarCliente);

        jMenuCadastrarAnimal.setText("Cliente");
        jMenuCadastrarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastrarAnimalActionPerformed(evt);
            }
        });
        jMenuCadastrarUsuario.add(jMenuCadastrarAnimal);

        jMenuCadastrarProduto.setText("Animal");
        jMenuCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastrarProdutoActionPerformed(evt);
            }
        });
        jMenuCadastrarUsuario.add(jMenuCadastrarProduto);

        jMenuItem3.setText("Produto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuCadastrarUsuario.add(jMenuItem3);

        jMenuCadFornecedor.setText("Fornecedor");
        jMenuCadFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadFornecedorActionPerformed(evt);
            }
        });
        jMenuCadastrarUsuario.add(jMenuCadFornecedor);

        jMenuBar1.add(jMenuCadastrarUsuario);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatórios");
        jMenuBar1.add(jMenu3);

        jMenuConsultas.setText("Consultas");

        jMenuItemVendedores.setText("Vendedores");
        jMenuItemVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVendedoresActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemVendedores);

        jMenuItemClientes.setText("Clientes");
        jMenuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClientesActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemClientes);

        jMenuBar1.add(jMenuConsultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(1082, Short.MAX_VALUE)
                .addComponent(lblUsuarioLogado)
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuarioLogado)
                .addContainerGap(662, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCadastrarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCadastrarUsuarioMouseClicked
        //não serve pra nada!!!!!!!!!!
    }//GEN-LAST:event_jMenuCadastrarUsuarioMouseClicked

    private void jMenuCadastrarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastrarAnimalActionPerformed
        //cadastrar cliente
        frmAddCliente addCliente = new frmAddCliente(new javax.swing.JFrame(), true, cdao, adao);
    }//GEN-LAST:event_jMenuCadastrarAnimalActionPerformed

    private void jMenuCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastrarClienteActionPerformed
        //cadastrar usuario
        frmAddVendedor addUsuario = new frmAddVendedor(new javax.swing.JFrame(), true, vdao);
    }//GEN-LAST:event_jMenuCadastrarClienteActionPerformed

    private void jMenuCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastrarProdutoActionPerformed
        frmAddAnimal addAnimal = new frmAddAnimal(new javax.swing.JFrame(), true, adao,cdao);
        
    }//GEN-LAST:event_jMenuCadastrarProdutoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       //cadastrar produto
        frmAddProduto addProduto = new frmAddProduto();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClientesActionPerformed
        frmPesquisaCliente pesquisaCliente = new frmPesquisaCliente();
    }//GEN-LAST:event_jMenuItemClientesActionPerformed

    private void jMenuItemVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVendedoresActionPerformed
        frmPesquisaVendedor pesquisaVendedor = new frmPesquisaVendedor();
    }//GEN-LAST:event_jMenuItemVendedoresActionPerformed

    private void jMenuCadFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadFornecedorActionPerformed
       frmAddFornecedor addFornecedor = new frmAddFornecedor();
    }//GEN-LAST:event_jMenuCadFornecedorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCadFornecedor;
    private javax.swing.JMenuItem jMenuCadastrarAnimal;
    private javax.swing.JMenuItem jMenuCadastrarCliente;
    private javax.swing.JMenuItem jMenuCadastrarProduto;
    private javax.swing.JMenu jMenuCadastrarUsuario;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemClientes;
    private javax.swing.JMenuItem jMenuItemVendedores;
    private javax.swing.JLabel lblUsuarioLogado;
    // End of variables declaration//GEN-END:variables
}
