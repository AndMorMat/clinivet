/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.frames;

import br.com.sof3.clinivet.dao.CidadeDAO;
import br.com.sof3.clinivet.dao.EstadoDAO;
import br.com.sof3.clinivet.dao.FornecedorDAO;
import br.com.sof3.clinivet.dao.ProdutoDAO;
import br.com.sof3.clinivet.entidade.Cidade;
import br.com.sof3.clinivet.entidade.EnumTipoAnimal;
import br.com.sof3.clinivet.entidade.EnumTipoProduto;
import br.com.sof3.clinivet.entidade.Estado;
import br.com.sof3.clinivet.entidade.Fornecedor;
import br.com.sof3.clinivet.entidade.Produto;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andrematos
 */
public class frmAddProduto extends javax.swing.JFrame {

    /**
     * Creates new form frmAddProduto
     */
    public frmAddProduto() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WIDTH);
        loadInitialTableData();
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblPrecoCusto = new javax.swing.JLabel();
        lblMargemLucro = new javax.swing.JLabel();
        lblValidade = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtMargemLucro = new javax.swing.JTextField();
        txtValidade = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblEstoque = new javax.swing.JLabel();
        txtEstoque = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFornecedores = new javax.swing.JTable();
        btnFiltrar = new javax.swing.JButton();
        btnCadastrarFornecedor = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrecoCusto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbxTipoProduto = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setText("Cadastrar Produto");

        lblNome.setText("Nome:");

        lblPrecoCusto.setText("Preco de Custo:");

        lblMargemLucro.setText("Margem de Lucro:");

        lblValidade.setText("Validade:");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        lblEstoque.setText("Estoque");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione um fornecedor"));

        tblFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CNPJ", "Telefone", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFornecedores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblFornecedores);

        btnFiltrar.setText("Filtrar por");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        btnCadastrarFornecedor.setText("Cadastrar Fornecedor");
        btnCadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarFornecedorActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastrarFornecedor)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFiltrar)
                    .addComponent(btnCadastrarFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        jLabel2.setText("Codigo:");

        jLabel3.setText("Tipo produto:");

        cbxTipoProduto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o tipo" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addGap(262, 262, 262))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEstoque)
                            .addComponent(lblValidade)
                            .addComponent(lblPrecoCusto)
                            .addComponent(lblMargemLucro)
                            .addComponent(lblNome)
                            .addComponent(jLabel3))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(txtMargemLucro)
                            .addComponent(txtEstoque, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtValidade, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPrecoCusto)
                            .addComponent(cbxTipoProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrecoCusto)
                            .addComponent(txtPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMargemLucro)
                            .addComponent(txtMargemLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEstoque))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnCancelar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if(!verificaCampos()){ 
            return;
        }
        
        int opc = JOptionPane.showConfirmDialog(this, "Você tem certeza?","Adiciona Produto",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if (opc != 0) {
            return;
        }
        try {
            Produto prod = new Produto();
            ProdutoDAO pdao = new ProdutoDAO();
            FornecedorDAO fdao = new FornecedorDAO();
            DefaultTableModel dtm =  (DefaultTableModel) tblFornecedores.getModel();
            
            /*int linha = tblFornecedores.getSelectedRow();
            Object obj = dtm.getValueAt(linha, 2);
            String valor = String.valueOf(obj);
            JOptionPane.showMessageDialog(null, valor);
            */
            
            prod.cadastrar(0, txtCodigo.getText(),
                              txtNome.getText(),
                              Double.parseDouble(txtPrecoCusto.getText()),
                              Double.parseDouble(txtMargemLucro.getText()),
                              prod.calcularPrecoVenda(Double.parseDouble(txtPrecoCusto.getText()), Double.parseDouble(txtMargemLucro.getText())),
                              txtValidade.getText(),
                              fdao.getFornecedorByCnpj(String.valueOf(dtm.getValueAt(tblFornecedores.getSelectedRow(), 1))),
                              Integer.parseInt(txtEstoque.getText()),String.valueOf(cbxTipoProduto.getSelectedItem()));//pegando o cnpj da tabela e mandando pra função getFornecedorByCnpj que retornara o Fornecedor
            Fornecedor forn = new Fornecedor();
            forn = fdao.getFornecedorByCnpj(String.valueOf(dtm.getValueAt(tblFornecedores.getSelectedRow(), 1)));
//            JOptionPane.showMessageDialog(null,"id: "+ forn.getId());
//            JOptionPane.showMessageDialog(null,"cnpj: "+ String.valueOf(dtm.getValueAt(tblFornecedores.getSelectedRow(), 1)));
//            JOptionPane.showMessageDialog(null,"nome: "+ prod.getFornecedor().getNome());
//            JOptionPane.showMessageDialog(null, prod.exibir());
            pdao.adicionaProduto(prod);
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
            setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Produto :: na Classe frmAddProduto no botao cadastrar");
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed
    
    private void btnCadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarFornecedorActionPerformed
        Fornecedor forn = new Fornecedor();
        frmAddFornecedor frmAddFornecedor = new frmAddFornecedor("telaAddProduto",forn);  
    }//GEN-LAST:event_btnCadastrarFornecedorActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
         frmFiltrarPor filtrarFornecedor = new frmFiltrarPor("fornecedor");
    }//GEN-LAST:event_btnFiltrarActionPerformed
    
    public boolean verificaCampos(){
        if(txtCodigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo Codigo");
            return false;
        }else if(txtNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome");
            return false;
        }else if(txtPrecoCusto.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo Preço de Custo");
            return false;
        }else if(txtEstoque.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo Estoque");
            return false;
        }else if(txtValidade.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo Validade");
            return false;
        }else if(!(tblFornecedores.getSelectedRow()>=0 && tblFornecedores.getSelectedRow()<tblFornecedores.getRowCount())){
            JOptionPane.showMessageDialog(null, "Selecione um fornecedor");
            return false;
        }else if(!(cbxTipoProduto.getSelectedIndex()>0)){
            JOptionPane.showMessageDialog(null, "Selecione um Tipo");
            return false;
        }else return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCadastrarFornecedor;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JComboBox cbxTipoProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEstoque;
    private javax.swing.JLabel lblMargemLucro;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPrecoCusto;
    private javax.swing.JLabel lblValidade;
    public static javax.swing.JTable tblFornecedores;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEstoque;
    private javax.swing.JTextField txtMargemLucro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPrecoCusto;
    private javax.swing.JTextField txtValidade;
    // End of variables declaration//GEN-END:variables
    private void loadInitialTableData() {//função que vai preencher a tabela fornecedores
        try {
            Fornecedor forn = new Fornecedor();
            FornecedorDAO fornecedorDAO = new FornecedorDAO();
            
            Vector<Fornecedor> fornecedor = new Vector<Fornecedor>(fornecedorDAO.getAllFornecedores());
            
            DefaultTableModel dtm =  (DefaultTableModel) tblFornecedores.getModel();
            for(int aux=0;aux<fornecedor.size();aux++){//adicionando os fornecedores na tabela
                dtm.addRow(fornecedor.get(aux).addTable());
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao adicionar fornecedores na tabela");
        }
        try{
            
            for(EnumTipoProduto ep: EnumTipoProduto.values()){
               cbxTipoProduto.addItem(ep.getNome());   
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao adicionar tipo do produto na cbxTipoProduto");
        }
    }
}
