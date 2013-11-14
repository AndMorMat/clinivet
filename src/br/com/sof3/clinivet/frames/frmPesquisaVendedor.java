/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.frames;

import br.com.sof3.clinivet.dao.VendedorDAO;
import br.com.sof3.clinivet.entidade.Animal;
import br.com.sof3.clinivet.entidade.Cliente;
import br.com.sof3.clinivet.entidade.Vendedor;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *public void carregaCampos(Animal ani){
        txtNome.setText(ani.getNome());
        txtNasc.setText(ani.getDataNasc());
        comboTipoAnimal.setSelectedItem(ani.getTipoAnimal());
        comboRaca.setSelectedItem(ani.getRaca().getNome());
        checkMacho.setSelected(ani.getSexo().equals("Macho") ? true : false);
        checkFemea.setSelected(ani.getSexo().equals("Fêmea")?true:false);
        
    }
 * @author andrematos
 */
public class frmPesquisaVendedor extends javax.swing.JFrame {
    VendedorDAO vdao = new VendedorDAO();
    /**
     * Creates new form frmPesquisaVendedor
     */
    public frmPesquisaVendedor(String parametro) {
        initComponents();
        alinharTextBotao();
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        
        setLocationRelativeTo(null);
        rbtNome.setSelected(true);
        if(parametro.equals("editar")){//configurações carregadas caso o parametro for editar
            btnEditar.setVisible(true);
            lblBuscarVendedor.setText("Editar Vendedor");
        }else if(parametro.equals("pesquisar")){
            btnEditar.setVisible(false);
            btnExcluir.setVisible(false);
            lblBuscarVendedor.setText("Buscar Vendedor");
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        lblBuscarVendedor = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuscaVendedor = new javax.swing.JTable();
        btnUltimosCad = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblResultados = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbtLogin = new javax.swing.JRadioButton();
        rbtNome = new javax.swing.JRadioButton();
        txtBuscaVendedor = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(195, 239, 198));

        lblBuscarVendedor.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        lblBuscarVendedor.setText("Buscar Vendedores");

        jPanel2.setBackground(new java.awt.Color(214, 255, 213));

        tblBuscaVendedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Login"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBuscaVendedor);
        tblBuscaVendedor.getColumnModel().getColumn(0).setResizable(false);
        tblBuscaVendedor.getColumnModel().getColumn(0).setPreferredWidth(200);
        tblBuscaVendedor.getColumnModel().getColumn(1).setResizable(false);

        btnUltimosCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sof3/clinivet/frames/Imagens/ultimos_cadastros.png"))); // NOI18N
        btnUltimosCad.setText("Ultimos Cadastros");
        btnUltimosCad.setToolTipText("Vendedores cadastrados");
        btnUltimosCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimosCadActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sof3/clinivet/frames/Imagens/editar-vendedor.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("Editar vendedor");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sof3/clinivet/frames/Imagens/excluir-vendedor.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Excluir vendedor");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lblResultados.setText("0 resultado(s)");

        jPanel1.setBackground(new java.awt.Color(214, 255, 213));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(rbtLogin);
        rbtLogin.setText("Login");
        rbtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtLoginActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtNome);
        rbtNome.setText("Nome");
        rbtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNomeActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("Buscar vendedor");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtNome)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtBuscaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtLogin)
                    .addComponent(rbtNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblResultados))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(btnUltimosCad, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUltimosCad)
                        .addComponent(btnEditar)
                        .addComponent(btnExcluir))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResultados)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblBuscarVendedor)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblBuscarVendedor)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUltimosCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimosCadActionPerformed
        // TODO add your handling code here:

        DefaultTableModel dtm = (DefaultTableModel)tblBuscaVendedor.getModel();

        for(int aux=0;aux<dtm.getRowCount();aux++)
        dtm.removeRow(aux);

        try {

            List<Vendedor>  listv = new LinkedList<Vendedor>();

            Vendedor v = new Vendedor();
            limparTabela();
//            int cont = dtm.getRowCount();
//            for(int aux=cont-1 ;   aux>=0;  aux--){//removendo valores da tabela
//                dtm.removeRow(aux);
//            }

            listv = vdao.getVendedorByID();

            for(int aux=0 ;aux<listv.size();aux++){
                if(aux<6){
                    v.setNome(listv.get(aux).getNome());
                    v.setLogin(listv.get(aux).getLogin());
                    if(!listv.get(aux).isInativo()){
                         dtm.addRow(v.addTable());
                    }
                }

            }
            lblResultados.setText(tblBuscaVendedor.getRowCount()+" resultado(s)");
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no try da classe frmPesquisaCliente no botao buscar");
        }

    }//GEN-LAST:event_btnUltimosCadActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        DefaultTableModel dtm = (DefaultTableModel)tblBuscaVendedor.getModel();

        int cont2 = dtm.getRowCount();
        for(int aux=cont2-1 ;   aux>=0;  aux--){//removendo valores da tabela
            dtm.removeRow(aux);
        }

        if(txtBuscaVendedor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite para pesquisar");

        }else{
            int cont=0;
            try {

                 List<Vendedor>  listv = new LinkedList<Vendedor>();

                 Vendedor v = new Vendedor();
                 if(rbtNome.isSelected()){
                   listv = vdao.getVendedorByName(txtBuscaVendedor.getText());
                 }else{
                     listv = vdao.getVendedorByLogin(txtBuscaVendedor.getText());
                 }
                        
                for(int aux =0;aux<listv.size();aux++){
                    v.setLogin(listv.get(aux).getLogin());
                    v.setNome(listv.get(aux).getNome());
                    if(!listv.get(aux).isInativo()){
                        dtm.addRow(v.addTable());
                        cont++;
                    }
                }
                lblResultados.setText(tblBuscaVendedor.getRowCount()+" resultado(s)");
                
                if(cont==0)//para exibir caso procura não exiba nada
                JOptionPane.showMessageDialog(null, "Nenhum Registro encontrado");

            }catch (SQLException ex){
                
                JOptionPane.showMessageDialog(null, "Erro no try da classe frmPesquisaVendedor no botao buscar");
            }

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void rbtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtLoginActionPerformed

    private void rbtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtNomeActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(tblBuscaVendedor.getSelectedRow() >= 0 && tblBuscaVendedor.getSelectedRow()<tblBuscaVendedor.getRowCount()){
            Vendedor vendedor = new Vendedor();
            List<Vendedor> vend = new LinkedList<Vendedor>();
            try{
                DefaultTableModel dtm = (DefaultTableModel)tblBuscaVendedor.getModel();
                String login = String.valueOf(dtm.getValueAt(tblBuscaVendedor.getSelectedRow(), 1));

                vend=vdao.getVendedorByLogin(login);
                
                frmConfirmSenha frmConfirm = new frmConfirmSenha(vend.get(0));
//                String senhaInformada = JOptionPane.showInputDialog(null, "Por favor informe a senha");
//                
//                    if (senhaInformada.equals(vend.get(0).getSenha())) {
//                         frmAddVendedor frmEditarVendedor = new frmAddVendedor("editar", vend.get(0));
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Impossivel Editar, Senhas não correspondem!!");
//                    }
                  
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro no botão editar na classe frmPesquisaVendedor");
            }
        }else JOptionPane.showMessageDialog(null, "Selecione um Vendedor para editar");
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        VendedorDAO vendedorDAO = new VendedorDAO();
        if(tblBuscaVendedor.getSelectedRow()>=0 && tblBuscaVendedor.getSelectedRow()<tblBuscaVendedor.getRowCount()){
            int result = JOptionPane.showConfirmDialog(this, "Você tem certeza?","Excluir vendedor",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
            if (result==2) return;
            List<Vendedor> vend = new LinkedList<>();
            DefaultTableModel dtm = (DefaultTableModel)tblBuscaVendedor.getModel();
            try{
                 vend = vendedorDAO.getVendedorByLogin(String.valueOf(dtm.getValueAt(tblBuscaVendedor.getSelectedRow(), 1)));
                 vendedorDAO.inativarVendedor(vend.get(0).getId());
                 vend = vendedorDAO.getAllVendedores();
                 limparTabela();
                 atualizarTabela(vend);
            }catch(Exception ex){
                 JOptionPane.showMessageDialog(null,"Erro ao excluir vendedor na classe frmPesquisaVendedor: "+ ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um registro");
        }
                
    }//GEN-LAST:event_btnExcluirActionPerformed
    public void atualizarTabela(List<Vendedor> vendedores){
        DefaultTableModel dtm = (DefaultTableModel)tblBuscaVendedor.getModel();
        for(int aux=0;aux<vendedores.size();aux++){
                    if(!vendedores.get(aux).isInativo())
                        dtm.addRow(vendedores.get(aux).addTable());
                }
    }
    public void limparTabela(){
        DefaultTableModel dtm =  (DefaultTableModel) tblBuscaVendedor.getModel();
        int cont = dtm.getRowCount();
            for(int aux=cont-1 ;   aux>=0 ;  aux--){//removendo valores da tabela
               dtm.removeRow(aux);
            }
    }
    public void alinharTextBotao(){
        btnUltimosCad.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnUltimosCad.setHorizontalTextPosition(SwingConstants.CENTER);
        btnEditar.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnEditar.setHorizontalTextPosition(SwingConstants.CENTER);
        btnExcluir.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnExcluir.setHorizontalTextPosition(SwingConstants.CENTER);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnUltimosCad;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscarVendedor;
    private javax.swing.JLabel lblResultados;
    private javax.swing.JRadioButton rbtLogin;
    private javax.swing.JRadioButton rbtNome;
    private javax.swing.JTable tblBuscaVendedor;
    private javax.swing.JTextField txtBuscaVendedor;
    // End of variables declaration//GEN-END:variables
}
