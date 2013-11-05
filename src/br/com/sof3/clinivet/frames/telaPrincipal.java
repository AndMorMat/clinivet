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
import javax.swing.SwingConstants;
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
    
    
    //button.setHorizontalTextPosition(SwingConstants.CENTER); 
    public telaPrincipal() {
        
        
        
        
        dialogLogin.setVisible(true);
        
        
        try{//caso o usuario só feche a tela login sem validar os dados os menus são definidos como setEnabled(false);
            if(vdao.isValidLoginSenha(dialogLogin.usuarioLogado(), dialogLogin.senhaUsuario())){
                
                initComponents();
                alinharTextBotao(); 
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblUsuarioLogado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAddCliente = new javax.swing.JButton();
        btnAgendamentos = new javax.swing.JButton();
        btnVendas = new javax.swing.JButton();
        btnAddAnimal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
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
        jMenuItem7 = new javax.swing.JMenuItem();
        Vendas = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
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
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        setTitle("Clinivet");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(214, 255, 213));

        jPanel1.setBackground(new java.awt.Color(168, 252, 173));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblUsuarioLogado.setText("Usuario:");

        jLabel1.setForeground(new java.awt.Color(254, 73, 34));
        jLabel1.setText("Sair");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sof3/clinivet/frames/icone-usuario.png"))); // NOI18N
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuarioLogado)
                    .addComponent(jLabel1))
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblUsuarioLogado))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap())
        );

        btnAddCliente.setBackground(new java.awt.Color(168, 252, 173));
        btnAddCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sof3/clinivet/frames/Imagens/adicionar_usuario.png"))); // NOI18N
        btnAddCliente.setText("Cadastrar Cliente");
        btnAddCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddClienteActionPerformed(evt);
            }
        });

        btnAgendamentos.setBackground(new java.awt.Color(168, 252, 173));
        btnAgendamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sof3/clinivet/frames/Imagens/fazer_agendamento.png"))); // NOI18N
        btnAgendamentos.setText("Fazer agendamento");
        btnAgendamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendamentosActionPerformed(evt);
            }
        });

        btnVendas.setBackground(new java.awt.Color(168, 252, 173));
        btnVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sof3/clinivet/frames/Imagens/fazer_venda.png"))); // NOI18N
        btnVendas.setText("Efetuar venda");
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });

        btnAddAnimal.setBackground(new java.awt.Color(168, 252, 173));
        btnAddAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sof3/clinivet/frames/Imagens/adicionar_animais.png"))); // NOI18N
        btnAddAnimal.setText("Cadastrar Animal");
        btnAddAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAnimalActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(179, 179, 179));
        jLabel3.setText("Ctrl+c = Cadastrar Cliente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(btnAgendamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(356, 356, 356)
                                .addComponent(btnAddCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 348, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(375, 375, 375)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(btnAddAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgendamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(181, Short.MAX_VALUE))
        );

        jMenuCadastrarUsuario.setMnemonic('c');
        jMenuCadastrarUsuario.setText("Cadastrar");

        jMenuCadastrarCliente.setMnemonic('u');
        jMenuCadastrarCliente.setText("Usuario");
        jMenuCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastrarClienteActionPerformed(evt);
            }
        });
        jMenuCadastrarUsuario.add(jMenuCadastrarCliente);

        jMenuCadastrarAnimal.setMnemonic('c');
        jMenuCadastrarAnimal.setText("Cliente");
        jMenuCadastrarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastrarAnimalActionPerformed(evt);
            }
        });
        jMenuCadastrarUsuario.add(jMenuCadastrarAnimal);

        jMenuCadastrarProduto.setMnemonic('a');
        jMenuCadastrarProduto.setText("Animal");
        jMenuCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastrarProdutoActionPerformed(evt);
            }
        });
        jMenuCadastrarUsuario.add(jMenuCadastrarProduto);

        jMenuItem3.setMnemonic('p');
        jMenuItem3.setText("Produto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuCadastrarUsuario.add(jMenuItem3);

        jMenuCadFornecedor.setMnemonic('f');
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

        editarUsuario.setMnemonic('u');
        editarUsuario.setText("Usuário");
        editarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarUsuarioActionPerformed(evt);
            }
        });
        Cliente.add(editarUsuario);

        jMenuItem4.setMnemonic('c');
        jMenuItem4.setText("Cliente");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        Cliente.add(jMenuItem4);

        jMenuItem5.setMnemonic('a');
        jMenuItem5.setText("Animal");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        Cliente.add(jMenuItem5);

        jMenuItem6.setMnemonic('p');
        jMenuItem6.setText("Produto");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        Cliente.add(jMenuItem6);

        JMenuItem7.setMnemonic('f');
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

        jMenuItem7.setText("Clientes");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        Vendas.setText("Vendas");
        jMenu3.add(Vendas);

        jMenu1.setText("Produtos");

        jMenuItem10.setText("Todos");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenu3.add(jMenu1);

        jMenuBar1.add(jMenu3);

        jMenuConsultas.setMnemonic('p');
        jMenuConsultas.setText("Pesquisar");
        jMenuConsultas.setToolTipText("");
        jMenuConsultas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenuConsultasItemStateChanged(evt);
            }
        });

        jMenuItemVendedores.setMnemonic('v');
        jMenuItemVendedores.setText("Vendedores");
        jMenuItemVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVendedoresActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemVendedores);

        jMenuItemClientes.setMnemonic('c');
        jMenuItemClientes.setText("Clientes");
        jMenuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClientesActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemClientes);

        jMenuAnimais.setMnemonic('a');
        jMenuAnimais.setText("Animais");
        jMenuAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAnimaisActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuAnimais);

        jMenuItem2.setMnemonic('p');
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

        submenuAgendar.setMnemonic('f');
        submenuAgendar.setText("Agendamento");
        submenuAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuAgendarActionPerformed(evt);
            }
        });
        menuAgenda.add(submenuAgendar);

        submenuConsultarAgenda.setMnemonic('c');
        submenuConsultarAgenda.setText("Consultar");
        submenuConsultarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuConsultarAgendaActionPerformed(evt);
            }
        });
        menuAgenda.add(submenuConsultarAgenda);

        jMenuItem1.setMnemonic('a');
        jMenuItem1.setText("Cancelar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuAgenda.add(jMenuItem1);

        jMenuBar1.add(menuAgenda);

        jMenuVendas.setMnemonic('v');
        jMenuVendas.setText("Vendas");

        jMenuEfetuarVenda.setMnemonic('e');
        jMenuEfetuarVenda.setText("Efetuar Venda");
        jMenuEfetuarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEfetuarVendaActionPerformed(evt);
            }
        });
        jMenuVendas.add(jMenuEfetuarVenda);

        jMenuVendasEfetuadas.setMnemonic('v');
        jMenuVendasEfetuadas.setText("Vendas Efetuadas");
        jMenuVendasEfetuadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVendasEfetuadasActionPerformed(evt);
            }
        });
        jMenuVendas.add(jMenuVendasEfetuadas);

        jMenuBar1.add(jMenuVendas);

        jMenu2.setText("Estoque");

        jMenuItem8.setText("Repor Estoque");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        frmAddCliente addCliente = new frmAddCliente("cadastrar",c);
    }//GEN-LAST:event_jMenuCadastrarAnimalActionPerformed
    private void alinharTextBotao(){
        btnAddCliente.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnAddCliente.setHorizontalTextPosition(SwingConstants.CENTER);
        btnAddAnimal.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnAddAnimal.setHorizontalTextPosition(SwingConstants.CENTER);
        btnVendas.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnVendas.setHorizontalTextPosition(SwingConstants.CENTER);
        btnAgendamentos.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnAgendamentos.setHorizontalTextPosition(SwingConstants.CENTER);
    }
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
        frmEscolheClienteVenda clienteVenda = new frmEscolheClienteVenda(dialogLogin.usuarioLogado());
        clienteVenda.setVisible(true);
//        frmEfetuarVenda venda = new frmEfetuarVenda(new Frame(), true, dao, dialogLogin.usuarioLogado());
//        venda.setVisible(true);
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

    private void submenuConsultarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuConsultarAgendaActionPerformed
        frmConsultarAgendamento frmConsultar = new frmConsultarAgendamento();
    }//GEN-LAST:event_submenuConsultarAgendaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frmCancelarAgendamento frmCancelar = new frmCancelarAgendamento();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        relatorioClientes relClientes = new relatorioClientes();
        relClientes.visualizar();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        relatorioProduto relProdutos = new relatorioProduto();
        relProdutos.visualizar();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void btnAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClienteActionPerformed
        Cliente cli = new Cliente();
        frmAddCliente frmAddCli = new frmAddCliente("cadastrar",cli);
    }//GEN-LAST:event_btnAddClienteActionPerformed

    private void btnAddAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAnimalActionPerformed
        Animal ani = new Animal();
        frmAddAnimal frmAddAni = new frmAddAnimal("cadastrar", ani);
        
    }//GEN-LAST:event_btnAddAnimalActionPerformed

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
        frmEscolheClienteVenda frmEscolha = new frmEscolheClienteVenda(dialogLogin.usuarioLogado());
        frmEscolha.setVisible(true);
        frmEscolha.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btnVendasActionPerformed

    private void btnAgendamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendamentosActionPerformed
        frmAgendamento frmAgendamento = new frmAgendamento();
    }//GEN-LAST:event_btnAgendamentosActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        frmReporEstoque reporEstoque = new frmReporEstoque();
        reporEstoque.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

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
    private javax.swing.JMenu Vendas;
    private javax.swing.JButton btnAddAnimal;
    private javax.swing.JButton btnAddCliente;
    private javax.swing.JButton btnAgendamentos;
    private javax.swing.JButton btnVendas;
    private javax.swing.JMenuItem editarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
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
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItemClientes;
    private javax.swing.JMenuItem jMenuItemVendedores;
    private javax.swing.JMenu jMenuVendas;
    private javax.swing.JMenuItem jMenuVendasEfetuadas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblUsuarioLogado;
    private javax.swing.JMenu menuAgenda;
    private javax.swing.JMenuItem submenuAgendar;
    private javax.swing.JMenuItem submenuConsultarAgenda;
    // End of variables declaration//GEN-END:variables
}
