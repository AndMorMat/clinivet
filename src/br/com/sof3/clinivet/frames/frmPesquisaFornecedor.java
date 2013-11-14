/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.frames;

import br.com.sof3.clinivet.dao.FornecedorDAO;
import br.com.sof3.clinivet.entidade.Cliente;
import br.com.sof3.clinivet.entidade.Fornecedor;
import br.com.sof3.clinivet.entidade.Produto;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andrematos
 */
public class frmPesquisaFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form frmPesquisaFornecedor
     */
    public frmPesquisaFornecedor() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WIDTH);
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
        lblNomeVendedor = new javax.swing.JLabel();
        rbtNome = new javax.swing.JRadioButton();
        rbtCpf = new javax.swing.JRadioButton();
        txtBuscaCliente = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFornecedor = new javax.swing.JTable();
        btnUltimosCad = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNomeVendedor.setText("Buscar fornecedor");

        buttonGroup1.add(rbtNome);
        rbtNome.setText("Nome");
        rbtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNomeActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtCpf);
        rbtCpf.setSelected(true);
        rbtCpf.setText("CNPJ");
        rbtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtCpfActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("Buscar um fornecedor");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CNPJ", "Telefone"
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
        tblFornecedor.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFornecedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFornecedor);

        btnUltimosCad.setText("Ultimos Cadastros");
        btnUltimosCad.setToolTipText("Exibir ultimos cadastros");
        btnUltimosCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimosCadActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setToolTipText("Editar fornecedor selecionado");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Excluir fornecedor selecionado");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeVendedor)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbtCpf)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbtNome))
                                    .addComponent(txtBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar)))
                        .addGap(330, 330, 330)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnUltimosCad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblNomeVendedor)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtCpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscar)))
                            .addComponent(rbtNome)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnUltimosCad)
                        .addGap(8, 8, 8)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir)))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtNomeActionPerformed

    private void rbtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtCpfActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        DefaultTableModel dtm = (DefaultTableModel)tblFornecedor.getModel();
        FornecedorDAO fdao = new FornecedorDAO();
        int cont2 = dtm.getRowCount();
        for(int aux=cont2-1 ;   aux>=0;  aux--){//removendo valores da tabela
            dtm.removeRow(aux);
        }

        if(txtBuscaCliente.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite para pesquisar");

        }else{
            int cont=0;
            try {

                List<Fornecedor> fornecedor = new LinkedList<Fornecedor>();

                Fornecedor f = new Fornecedor();

                if(rbtNome.isSelected()){

                    fornecedor = fdao.FiltrarFornecedorNome(txtBuscaCliente.getText());

                }else{

                    int validador=0;
                    String letras="abcdefghyjklmnopqrstuvwxyz.";
                    String    texto = txtBuscaCliente.getText().toLowerCase();

                    for(int i=0; i<texto.length(); i++){
                        if (letras.indexOf(texto.charAt(i),0)!=-1){
                            validador =1;
                        }
                    }

                    if(validador==0){

                        StringBuilder stringBuilder = new StringBuilder(texto);

                        for(int i=0; i<texto.length(); i++){
                            if(i==2)
                                stringBuilder.insert(2, '.');
                            else if(i==6)
                                stringBuilder.insert(6, '.');
                            else if(i==10)
                                stringBuilder.insert(10, '/');
                            else if(i==14)
                                stringBuilder.insert(10, '-');
                            else if (letras.indexOf(texto.charAt(i),0)!=-1){
                                validador =1;
                            }
                        }

                        fornecedor = fdao.FiltrarFornecedorCnpj(stringBuilder.toString());

                    }else{
                        cont++;//para acrescentar e não exibir nenhum resitro, já ira exibir somente numeros
                        JOptionPane.showMessageDialog(null, "Informe somente números");
                    }
                }
                for(int aux =0;aux<fornecedor.size();aux++){
                    f.setNome(fornecedor.get(aux).getNome());
                    f.setCnpj(fornecedor.get(aux).getCnpj());
                    f.setTelefone(fornecedor.get(aux).getTelefone());
                    if(!fornecedor.get(aux).isInativo()){
                        dtm.addRow(f.addTable());
                        cont++;
                    }
                }
                if(cont==0)//para exibir caso procura não exiba nada
                JOptionPane.showMessageDialog(null, "Nenhum Registro encontrado");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro no try da classe frmPesquisaCliente no botao ultimos cadastros ");
            }

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFornecedorMouseClicked
        String NumCnpj = String.valueOf(tblFornecedor.getValueAt(tblFornecedor.getSelectedRow(),1));
        FornecedorDAO fdao = new FornecedorDAO();
        if (evt.getClickCount() == 2) {
            Fornecedor forn = new Fornecedor();

            frmExibirCliente frmExibirCliente1 = new frmExibirCliente();

            

//            try {
//                
//            } catch (SQLException ex) {
//                Logger.getLogger(frmPesquisaCliente.class.getName()).log(Level.SEVERE, null, ex);
//            }

            //frmExibirCliente1.CadastrarDados(forn);

        }
    }//GEN-LAST:event_tblFornecedorMouseClicked

    private void btnUltimosCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimosCadActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel dtm = (DefaultTableModel)tblFornecedor.getModel();
        FornecedorDAO fdao = new FornecedorDAO();
        for(int aux=0;aux<dtm.getRowCount();aux++)
        dtm.removeRow(aux);

        try {

            List<Fornecedor> fornecedor = new LinkedList<>();

            Fornecedor forn = new Fornecedor();

            int cont = dtm.getRowCount();
            for(int aux=cont-1 ;   aux>=0;  aux--){//removendo valores da tabela
                dtm.removeRow(aux);
            }

            fornecedor = fdao.getAllFornecedores();

            for(int aux=0 ;aux<fornecedor.size();aux++){
                
                    forn.setNome(fornecedor.get(aux).getNome());
                    forn.setCnpj(fornecedor.get(aux).getCnpj());
                    forn.setTelefone(fornecedor.get(aux).getTelefone());
                    if(!fornecedor.get(aux).isInativo())
                        dtm.addRow(forn.addTable());
                

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no try da classe frmPesquisaCliente no botao buscar ");
        }

    }//GEN-LAST:event_btnUltimosCadActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        List<Fornecedor> fornecedor = new LinkedList<>();
        FornecedorDAO fdao = new FornecedorDAO();
        DefaultTableModel dtm = (DefaultTableModel)tblFornecedor.getModel();
        if(tblFornecedor.getSelectedRow()>=0 && tblFornecedor.getSelectedRow()<tblFornecedor.getRowCount()){
            try{
                fornecedor = fdao.FiltrarFornecedorCnpj(String.valueOf(dtm.getValueAt(tblFornecedor.getSelectedRow(), 1)));

                frmAddFornecedor frmAddFornecedor = new frmAddFornecedor("editar",fornecedor.get(0));
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Erro no btnEditar");
            }
        }else JOptionPane.showMessageDialog(null, "Selecione um Cliente para editar");
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        FornecedorDAO fdao = new FornecedorDAO();
        Fornecedor fornecedor = new Fornecedor();
        List<Fornecedor> fornecedores = new LinkedList<>();
        if(tblFornecedor.getSelectedRow()>=0 && tblFornecedor.getSelectedRow()<tblFornecedor.getRowCount()){
            int result = JOptionPane.showConfirmDialog(this, "Você tem certeza?","Excluir fornecedor",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
            if (result==2) return;
            DefaultTableModel dtm = (DefaultTableModel)tblFornecedor.getModel();
            try{
                 fornecedor = fdao.getFornecedorByCnpj(String.valueOf(dtm.getValueAt(tblFornecedor.getSelectedRow(), 1)));
                 fdao.inativarFornecedor(fornecedor.getId());
                 fornecedores = fdao.getAllFornecedores();
                 limparTabela();
                 atualizarTabela(fornecedores);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Erro ao excluir cliente na classe frmPesquisaCliente"+ ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um registro");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed
    public void atualizarTabela(List<Fornecedor> fornecedor){
        DefaultTableModel dtm = (DefaultTableModel)tblFornecedor.getModel();
        for(int aux=0;aux<fornecedor.size();aux++){
            if(!fornecedor.get(aux).isInativo())
                  dtm.addRow(fornecedor.get(aux).addTable());
        }
    }
    public void limparTabela(){
        DefaultTableModel dtm =  (DefaultTableModel) tblFornecedor.getModel();
        int cont = dtm.getRowCount();
            for(int aux=cont-1 ;   aux>=0 ;  aux--){//removendo valores da tabela
               dtm.removeRow(aux);
            }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnUltimosCad;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNomeVendedor;
    private javax.swing.JRadioButton rbtCpf;
    private javax.swing.JRadioButton rbtNome;
    private javax.swing.JTable tblFornecedor;
    private javax.swing.JTextField txtBuscaCliente;
    // End of variables declaration//GEN-END:variables
}
