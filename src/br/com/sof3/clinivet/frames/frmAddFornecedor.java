/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.frames;

import br.com.sof3.clinivet.dao.CidadeDAO;
import br.com.sof3.clinivet.dao.EstadoDAO;
import br.com.sof3.clinivet.dao.FornecedorDAO;
import br.com.sof3.clinivet.entidade.Cidade;
import br.com.sof3.clinivet.entidade.Estado;
import br.com.sof3.clinivet.entidade.Fornecedor;
import br.com.sof3.clinivet.entidade.Produto;
import static br.com.sof3.clinivet.frames.frmAddProduto.tblFornecedores;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.Locale;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andrematos
 */
public class frmAddFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form frmAddFornecedor
     */
    private String param; //variavel recebendo um valor da classe frmAddProduto para saber se e uma ação de lá que chamou essa tela
    private Fornecedor fornecedorAntigo = new Fornecedor();
    public frmAddFornecedor(){
        initComponents();
        loadInitialComboData();
        setVisible(true);
        setDefaultCloseOperation(WIDTH);
        setLocationRelativeTo(null);
    }
    public frmAddFornecedor(String parametro, Fornecedor fornecedor) {
        param = parametro;
        fornecedorAntigo = fornecedor;
        initComponents();
        loadInitialComboData();
        setVisible(true);
        setDefaultCloseOperation(WIDTH);
        setLocationRelativeTo(null);
        if(parametro.equals("editar")){
            carregaCampos(fornecedor);
            btnCadastrar.setText("Editar");
        }else if(parametro.equals("cadastrar")){
            btnCadastrar.setText("Cadastrar");
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

        lblCadastrarFornecedor = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCnpj = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        cbxCidade = new javax.swing.JComboBox();
        lblCidade = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtCnpj = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCadastrarFornecedor.setText("Cadastrar Fornecedor");

        lblNome.setText("Nome:");

        lblCnpj.setText("CNPJ:");

        lblTelefone.setText("Telefone:");

        lblEmail.setText("Email:");

        lblBairro.setText("Bairro:");

        lblEndereco.setText("Endereço:");

        lblCidade.setText("Cidade:");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        try {
            txtCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(lblCadastrarFornecedor))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblEndereco)
                                .addComponent(lblCnpj)
                                .addComponent(lblTelefone)
                                .addComponent(lblNome)
                                .addComponent(lblEmail)
                                .addComponent(lblBairro))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblCidade)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNome)
                            .addComponent(txtEmail)
                            .addComponent(txtBairro)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(txtCnpj)
                            .addComponent(txtTelefone)
                            .addComponent(cbxCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)))))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadastrarFornecedor)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCnpj)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
       if(param.equals("cadastrar") || param.equals("telaAddProduto")){
            int opc = JOptionPane.showConfirmDialog(this, "Você tem certeza?","Adiciona Fornecedor",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
            if (opc != 0) {
                return;
            }

            try {
                if(!validaCampos())return;
                Fornecedor forn = new Fornecedor();
                FornecedorDAO fdao = new FornecedorDAO();
                JOptionPane.showMessageDialog(null, txtCnpj.getText());
                forn.cadastrar(0,
                               txtNome.getText(),
                               txtCnpj.getText(),
                               txtTelefone.getText(),
                               txtEmail.getText(),
                               txtEndereco.getText(),
                               txtBairro.getText(),
                               ((Cidade) cbxCidade.getSelectedItem()));
                
                fdao.adicionaFornecedor(forn);
                
                if(param.equals("telaAddProduto")){
                    limparTabela();
                    DefaultTableModel dtm = (DefaultTableModel)frmAddProduto.tblFornecedores.getModel();
                    dtm.addRow(forn.addTable());
                    JOptionPane.showMessageDialog(null, "Antes de selecionar");
                    frmAddProduto.tblFornecedores.setSelectionMode(1);
                    JOptionPane.showMessageDialog(null, "Antes de selecionar certo");
                    frmAddProduto.tblFornecedores.setRowSelectionInterval(0, 0);
                    param = "";
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao adicionar Fornecedor :: na classe frmAddFornecedor no botao Cadastrar");
            }
        }else if(param.equals("editar")){
            JOptionPane.showMessageDialog(null, "Editar");
               try{ 
                    Fornecedor forn = new Fornecedor();
                    FornecedorDAO fdao = new FornecedorDAO();
                    JOptionPane.showMessageDialog(null, txtCnpj.getText());
                    forn.cadastrar(fdao.getIdFornecedor(fornecedorAntigo.getCnpj()),
                                   txtNome.getText(),
                                   txtCnpj.getText(),
                                   txtTelefone.getText(),
                                   txtEmail.getText(),
                                   txtEndereco.getText(),
                                   txtBairro.getText(),
                                   ((Cidade) cbxCidade.getSelectedItem()));
                    
                    fdao.atualizaFornecedor(forn);
                    
               }catch(Exception ex){
                   JOptionPane.showMessageDialog(null,"Erro ao Editar Fornecedor :: na classe frmAddFornecedor" +ex);
               }
        }
        setVisible(false);
    }//GEN-LAST:event_btnCadastrarActionPerformed
    public String[] getDados(){
        String[] dados = {txtNome.getText(),txtCnpj.getText(),txtTelefone.getText(),txtEmail.getText()};
        return dados;
    }
    public void limparTabela(){
        DefaultTableModel dtm =  (DefaultTableModel) tblFornecedores.getModel();
        int cont = dtm.getRowCount();
            for(int aux=cont-1 ;   aux>=0;  aux--){//removendo valores da tabela
                dtm.removeRow(aux);
            }
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox cbxCidade;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCadastrarFornecedor;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCnpj;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCnpj;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
    
    private void carregaCampos(Fornecedor fornecedor){
        txtNome.setText(fornecedor.getNome());
        txtCnpj.setText(fornecedor.getCnpj());
        txtTelefone.setText(fornecedor.getTelefone());
        txtEmail.setText(fornecedor.getEmail());
        txtBairro.setText(fornecedor.getBairro());
        txtEndereco.setText(fornecedor.getEndereco());
    }
    private boolean validaCampos(){
        if(txtNome.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo nome esta vazio!");
            return false;
        }else if(txtCnpj.getText().trim().length()!=18){
            JOptionPane.showMessageDialog(null, "Cnpj inválido!");
            return false;
        }else if(txtTelefone.getText().trim().length()!=13){
            JOptionPane.showMessageDialog(null, "Telefone inválido");
            return false;
        }else if(txtEmail.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo email esta vazio");
            return false;
        }else if(txtBairro.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo bairro esta vazio!");
            return false;
        }else if(txtEndereco.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo endereço esta vazio!");
            return false;
        }
        return true;
    }
    
    private void loadInitialComboData() {

        try {
            
            CidadeDAO cidadeDAO = new CidadeDAO();
            
            Vector<Cidade> cidades = new Vector<Cidade>(cidadeDAO.getAllCidades());
            
            DefaultComboBoxModel comboCidade = new DefaultComboBoxModel(cidades);
            cbxCidade.setModel(comboCidade);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao carregar a lista de cidades");
        }
    }

}
