/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.frames;

import br.com.sof3.clinivet.dao.AnimalDAO;
import br.com.sof3.clinivet.dao.ClienteDAO;
import br.com.sof3.clinivet.dao.VendaDAO;
import br.com.sof3.clinivet.dao.VendedorDAO;
import br.com.sof3.clinivet.entidade.Animal;
import br.com.sof3.clinivet.entidade.Cliente;
import br.com.sof3.clinivet.entidade.Fornecedor;
import br.com.sof3.clinivet.entidade.Produto;
import br.com.sof3.clinivet.entidade.Vendedor;
import java.awt.Frame;
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
    private final VendaDAO dao = new VendaDAO();
    public frmLogin dialogLogin = new frmLogin(new javax.swing.JFrame(), true);
    /**
     * Creates new form telaPrincipal
     */
    public telaPrincipal() {
        
        
        
        
        dialogLogin.setVisible(true);
        
        
        try{//caso o usuario só feche a tela login sem validar os dados os menus são definidos como setEnabled(false);
            if(vdao.isValidLoginSenha(dialogLogin.usuarioLogado(), dialogLogin.senhaUsuario())){
                initComponents();
                setLocationRelativeTo(null);
                setVisible(true);
                setTitle("CliniVet");
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                lblUsuarioLogado.setText("Usuario: "+dialogLogin.usuarioLogado());//pegando o nome do usuario que esta logado no sistema
                //                Cliente.setEnabled(false);//editar
//                jMenu3.setEnabled(false);//relatorios
//                jMenuCadastrarUsuario.setEnabled(false);//usuarios
//                jMenuConsultas.setEnabled(false);
//                lblUsuarioLogado.setText("Usuario não logado");
            }
            /*if(!dialogLogin.usuarioLogado().equals("admin")){//somente o administrador poderá cadastrar um novo vendedor
                jMenuCadastrarCliente.setEnabled(false);
            }*/
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
        Cliente = new javax.swing.JMenu();
        editarUsuario = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        JMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuConsultas = new javax.swing.JMenu();
        jMenuItemVendedores = new javax.swing.JMenuItem();
        jMenuItemClientes = new javax.swing.JMenuItem();
        jMenuAnimais = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuAgenda = new javax.swing.JMenu();
        submenuAgendar = new javax.swing.JMenuItem();
        submenuConsultarAgenda = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuVendas = new javax.swing.JMenu();
        jMenuEfetuarVenda = new javax.swing.JMenuItem();
        jMenuVendasEfetuadas = new javax.swing.JMenuItem();

        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblUsuarioLogado.setText("Usuario:");

        jMenuCadastrarUsuario.setMnemonic('c');
        jMenuCadastrarUsuario.setText("Cadastrar");

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

        Cliente.setMnemonic('e');
        Cliente.setText("Editar/Excluir");

        editarUsuario.setText("Usuário");
        editarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarUsuarioActionPerformed(evt);
            }
        });
        Cliente.add(editarUsuario);

        jMenuItem4.setText("Cliente");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        Cliente.add(jMenuItem4);

        jMenuItem5.setText("Animal");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        Cliente.add(jMenuItem5);

        jMenuItem6.setText("Produto");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        Cliente.add(jMenuItem6);

        JMenuItem7.setText("Fornecedor");
        JMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItem7ActionPerformed(evt);
            }
        });
        Cliente.add(JMenuItem7);

        jMenuBar1.add(Cliente);

        jMenu3.setMnemonic('r');
        jMenu3.setText("Relatórios");
        jMenu3.setToolTipText("");
        jMenuBar1.add(jMenu3);

        jMenuConsultas.setMnemonic('o');
        jMenuConsultas.setText("Pesquisar");
        jMenuConsultas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenuConsultasItemStateChanged(evt);
            }
        });

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

        jMenuAnimais.setText("Animais");
        jMenuAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAnimaisActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuAnimais);

        jMenuItem2.setText("Produtos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItem2);

        jMenuBar1.add(jMenuConsultas);

        menuAgenda.setMnemonic('a');
        menuAgenda.setText("Agenda");

        submenuAgendar.setText("Fazer Agendamento");
        submenuAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuAgendarActionPerformed(evt);
            }
        });
        menuAgenda.add(submenuAgendar);

        submenuConsultarAgenda.setText("Consultar Agenda");
        menuAgenda.add(submenuConsultarAgenda);

        jMenuItem1.setText("Cancelar Agendamento");
        menuAgenda.add(jMenuItem1);

        jMenuBar1.add(menuAgenda);

        jMenuVendas.setMnemonic('v');
        jMenuVendas.setText("Vendas");

        jMenuEfetuarVenda.setText("Efetuar Venda");
        jMenuEfetuarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEfetuarVendaActionPerformed(evt);
            }
        });
        jMenuVendas.add(jMenuEfetuarVenda);

        jMenuVendasEfetuadas.setText("Vendas Efetuadas");
        jMenuVendasEfetuadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVendasEfetuadasActionPerformed(evt);
            }
        });
        jMenuVendas.add(jMenuVendasEfetuadas);

        jMenuBar1.add(jMenuVendas);

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
                .addContainerGap(718, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void dispose(){
        System.exit(0);
    }
    
    private void jMenuCadastrarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastrarAnimalActionPerformed
        //cadastrar cliente
        Cliente c= new Cliente();
        frmAddCliente addCliente = new frmAddCliente(new javax.swing.JFrame(), true, cdao, adao,"cadastrar",c);
    }//GEN-LAST:event_jMenuCadastrarAnimalActionPerformed

    private void jMenuCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastrarClienteActionPerformed
        //cadastrar usuario
        Vendedor v = new  Vendedor();
        frmAddVendedor addUsuario = new frmAddVendedor("cadastrar",v);
    }//GEN-LAST:event_jMenuCadastrarClienteActionPerformed

    private void jMenuCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastrarProdutoActionPerformed
        Animal ani = new Animal();
        frmAddAnimal addAnimal = new frmAddAnimal("cadastrar",ani);
        
    }//GEN-LAST:event_jMenuCadastrarProdutoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       //cadastrar produto
        Produto pro = new Produto();
        frmAddProduto addProduto = new frmAddProduto("cadastrar",pro);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClientesActionPerformed
        frmPesquisaCliente pesquisaCliente = new frmPesquisaCliente("consultar");
    }//GEN-LAST:event_jMenuItemClientesActionPerformed

    private void jMenuItemVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVendedoresActionPerformed
        frmPesquisaVendedor pesquisaVendedor = new frmPesquisaVendedor("pesquisar");
    }//GEN-LAST:event_jMenuItemVendedoresActionPerformed

    private void jMenuCadFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadFornecedorActionPerformed
        Fornecedor fornecedor = new Fornecedor();
        frmAddFornecedor addFornecedor = new frmAddFornecedor("cadastrar", fornecedor);
    }//GEN-LAST:event_jMenuCadFornecedorActionPerformed

    private void submenuAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuAgendarActionPerformed
        frmAgendamento frmAgendamento = new frmAgendamento();
    }//GEN-LAST:event_submenuAgendarActionPerformed

    private void jMenuAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAnimaisActionPerformed
        // TODO add your handling code here:
        frmPesquisaAnimal pesquisaAnimal = new frmPesquisaAnimal("consultar");
    }//GEN-LAST:event_jMenuAnimaisActionPerformed

    private void jMenuConsultasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenuConsultasItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuConsultasItemStateChanged

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        frmPesquisaProduto pesquisaProduto = new frmPesquisaProduto();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void editarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarUsuarioActionPerformed
        frmPesquisaVendedor frmPesquisaVendedor = new frmPesquisaVendedor("editar");
    }//GEN-LAST:event_editarUsuarioActionPerformed

    private void jMenuEfetuarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEfetuarVendaActionPerformed
        frmEfetuarVenda venda = new frmEfetuarVenda(new Frame(), true, dao, dialogLogin.usuarioLogado());
        venda.setVisible(true);
    }//GEN-LAST:event_jMenuEfetuarVendaActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        
        frmPesquisaCliente frmEdCliente = new frmPesquisaCliente("editar");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jMenuVendasEfetuadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVendasEfetuadasActionPerformed
        frmVendasEfetuadas vendasEfetuadas = new frmVendasEfetuadas();
        vendasEfetuadas.setVisible(true);
    }//GEN-LAST:event_jMenuVendasEfetuadasActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       frmPesquisaAnimal frmPesquisaAnimal = new frmPesquisaAnimal("editar");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Produto pro = new Produto();
        frmPesquisaProduto frmPesquisaProduto = new frmPesquisaProduto();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void JMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItem7ActionPerformed
        frmPesquisaFornecedor frmPesquisaFornecedor = new frmPesquisaFornecedor();
    }//GEN-LAST:event_JMenuItem7ActionPerformed

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
    private javax.swing.JMenu Cliente;
    private javax.swing.JMenuItem JMenuItem7;
    private javax.swing.JMenuItem editarUsuario;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuAnimais;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCadFornecedor;
    private javax.swing.JMenuItem jMenuCadastrarAnimal;
    private javax.swing.JMenuItem jMenuCadastrarCliente;
    private javax.swing.JMenuItem jMenuCadastrarProduto;
    private javax.swing.JMenu jMenuCadastrarUsuario;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenuItem jMenuEfetuarVenda;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItemClientes;
    private javax.swing.JMenuItem jMenuItemVendedores;
    private javax.swing.JMenu jMenuVendas;
    private javax.swing.JMenuItem jMenuVendasEfetuadas;
    private javax.swing.JLabel lblUsuarioLogado;
    private javax.swing.JMenu menuAgenda;
    private javax.swing.JMenuItem submenuAgendar;
    private javax.swing.JMenuItem submenuConsultarAgenda;
    // End of variables declaration//GEN-END:variables
}
