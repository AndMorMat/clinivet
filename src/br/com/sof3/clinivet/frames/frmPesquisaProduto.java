/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.frames;

import br.com.sof3.clinivet.dao.ProdutoDAO;
import br.com.sof3.clinivet.entidade.Cliente;
import br.com.sof3.clinivet.entidade.EnumTipoProduto;
import br.com.sof3.clinivet.entidade.Produto;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

import java.text.DecimalFormat;//Formatar numero decimal duas casas   
/**
 *
 * @author xps-l502x
 */
public class frmPesquisaProduto extends javax.swing.JFrame {

    /**
     * Creates new form frmPesquisaProduto
     */
    ProdutoDAO pdao = new ProdutoDAO();
    
    public frmPesquisaProduto() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        rbtNome.setSelected(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        carregarCbx();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of DecimalFormat df = new DecimalFormat("#,###.00"); this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbtNome = new javax.swing.JRadioButton();
        rbtCod = new javax.swing.JRadioButton();
        rbtQuant = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        cbxTipoProduto = new javax.swing.JComboBox();
        btnBuscar1 = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscaPro = new javax.swing.JTextField();
        lblBuscaProdutos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuscaPro = new javax.swing.JTable();
        lblValor = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblQuant = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(rbtNome);
        rbtNome.setText("Nome");
        rbtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNomeActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtCod);
        rbtCod.setText("Código");
        rbtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtCodActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtQuant);
        rbtQuant.setText("Quant abaixo de:");
        rbtQuant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtQuantActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar por tipo"));

        cbxTipoProduto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o tipo", "Todos" }));
        cbxTipoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoProdutoActionPerformed(evt);
            }
        });

        btnBuscar1.setText("Buscar");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(cbxTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar1)))
        );

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtBuscaPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaProActionPerformed(evt);
            }
        });

        lblBuscaProdutos.setText("Buscar Produtos:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtCod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtQuant))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtBuscaPro, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblBuscaProdutos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lblBuscaProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtNome)
                            .addComponent(rbtCod)
                            .addComponent(rbtQuant))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscaPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar)))))
        );

        tblBuscaPro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Tipo", "Preço", "Estoque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBuscaPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBuscaProMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBuscaPro);
        tblBuscaPro.getColumnModel().getColumn(0).setResizable(false);
        tblBuscaPro.getColumnModel().getColumn(0).setPreferredWidth(60);
        tblBuscaPro.getColumnModel().getColumn(1).setResizable(false);
        tblBuscaPro.getColumnModel().getColumn(1).setPreferredWidth(250);
        tblBuscaPro.getColumnModel().getColumn(2).setResizable(false);
        tblBuscaPro.getColumnModel().getColumn(2).setPreferredWidth(200);
        tblBuscaPro.getColumnModel().getColumn(3).setResizable(false);
        tblBuscaPro.getColumnModel().getColumn(4).setResizable(false);

        lblValor.setText("Valor total: R$ 0,00");

        lblTotal.setText("Total da Busca: 0 Resultado(s)");

        lblQuant.setText("Quant Total Estoque: 0 Iten(s)");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(42, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblValor)
                                .addGap(69, 69, 69)
                                .addComponent(lblQuant)))
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(lblTotal)
                    .addComponent(lblQuant))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNomeActionPerformed

    }//GEN-LAST:event_rbtNomeActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        DefaultTableModel dtm = (DefaultTableModel)tblBuscaPro.getModel();

        int cont2 = dtm.getRowCount();
        for(int aux=cont2-1 ;   aux>=0;  aux--){//removendo valores da tabela
            dtm.removeRow(aux);
        }
        
        if(txtBuscaPro.getText().isEmpty()){
               JOptionPane.showMessageDialog(null, "Digite para pesquisar");
               lblQuant.setText("Quant Total Estoque: 0 Iten(s)");//Usado para "Zerar" Caso já tenha reazlizado uma busca anteriorfa
               lblValor.setText("Valor total: R$ 0,00");            //Usado para "Zerar" Caso já tenha reazlizado uma busca anteriorfa
               lblTotal.setText("Total da Busca: 0 Resultado(s)");  //Usado para "Zerar" Caso já tenha reazlizado uma busca anteriorfa
          
        }else{//Caso não esteja campo vazio
            int cont=0, quantEst=0, quantResul=0;//Variaveis de contagem  para resgistros encontrados, estoque, resultados de busca
            double preco = 0;//Valor total Estoque 
            
            try {

                List<Produto> pro = new LinkedList<Produto>();//Criando lista de produtos para armazenar busca

                Produto p  = new Produto();
                
                if(rbtNome.isSelected()){//Se tiver buscando pelo nome
                   pro = pdao.getProdutoByName(txtBuscaPro.getText());//Manda buscar nome
                }else if(rbtCod.isSelected()){//Se tiver buscando pelo Código
                    pro = pdao.getProdutoByCodigo(txtBuscaPro.getText());
                }else{//Senão pela Quantidade
                    int validador=0;//Verificando maiusculas e minusculas
                    String letras="abcdefghyjklmnopqrstuvwxyz";//Validadores

                    String    texto = txtBuscaPro.getText().toLowerCase();
                    for(int i=0; i<texto.length(); i++){//FOr para pesuqisa na palavra
                        if (letras.indexOf(texto.charAt(i),0)!=-1){
                            validador =1;
                        }
                    }
                    if(validador==0){
                        pro = pdao.getProdutosByQuant(Integer.parseInt(txtBuscaPro.getText()));
                    }else{
                        
                        cont++;//para acrescentar e não exibir nenhum resitro, já ira exibir somente numeros
                        JOptionPane.showMessageDialog(null, "Informe somente números");
                        lblQuant.setText("Quant Total Estoque: 0 Iten(s)");
                        lblValor.setText("Valor total: R$ 0,00");
                        lblTotal.setText("Total da Busca: 0 Resultado(s)");
                    }
                }
                
                
                for(int aux =0;aux<pro.size();aux++){
                    p.setCodigo(pro.get(aux).getCodigo());
                    p.setNome(pro.get(aux).getNome());
                    p.setTipoProduto(pro.get(aux).getTipoProduto());
                    p.setPrecoVenda(pro.get(aux).getPrecoVenda());
                    p.setEstoque(pro.get(aux).getEstoque());
                    
                    quantResul++;
                    quantEst+=pro.get(aux).getEstoque();
                    preco+=pro.get(aux).getPrecoVenda();

                    dtm.addRow(p.addTableConsulta());
                    cont++;
                }
                
                
                lblQuant.setText("Quant Total Estoque: "+quantEst+" Iten(s)");
                lblValor.setText("Valor total: R$ "+String.format("%.2f",preco));
                lblTotal.setText("Total da Busca: "+quantResul+" Resultado(s)");
                
                
                
                if(cont==0)//para exibir caso procura não exiba nada
                JOptionPane.showMessageDialog(null, "Nenhum Registro encontrado");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro no try da classe frmPesquisaCliente no botao buscar");
            }

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblBuscaProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBuscaProMouseClicked
        
        String BuscCodigo;
        if (evt.getClickCount() == 2) {
            Produto p = new Produto();

            frmExibirProduto frmExibirProduto = new frmExibirProduto();

            BuscCodigo = String.valueOf(tblBuscaPro.getValueAt(tblBuscaPro.getSelectedRow(),0));

            try {
                 p = pdao.getDetalhes(BuscCodigo);
            }catch(SQLException ex){
                Logger.getLogger(frmPesquisaProduto.class.getName()).log(Level.SEVERE, null, ex);
            }

            frmExibirProduto.CadastrarDados(p);
        }
    }//GEN-LAST:event_tblBuscaProMouseClicked

    private void rbtQuantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtQuantActionPerformed

    }//GEN-LAST:event_rbtQuantActionPerformed

    private void rbtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtCodActionPerformed

    }//GEN-LAST:event_rbtCodActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)tblBuscaPro.getModel();
        
        int quantEst=0, quantResul=0;
        double preco = 0;
        
        int cont2 = dtm.getRowCount();
        for(int aux=cont2-1 ;   aux>=0;  aux--){//removendo valores da tabela
            dtm.removeRow(aux);
        }
        try {
                List<Produto> pro = new LinkedList<Produto>();

                Produto p  = new Produto();
                int cont=0;
                               
                if(!"Todos".equals(cbxTipoProduto.getSelectedItem())){//comparando combo caso usuario queira ver todos os tipos
                   pro = pdao.getProdutosByTipo(String.valueOf(cbxTipoProduto.getSelectedItem()));
                }else{ 
                   pro = pdao.getProdutoByName("");
                }
                   

                    for(int aux =0;aux<pro.size();aux++){
                                p.setCodigo(pro.get(aux).getCodigo());
                                p.setNome(pro.get(aux).getNome());
                                p.setTipoProduto(pro.get(aux).getTipoProduto());
                                p.setPrecoVenda(pro.get(aux).getPrecoVenda());
                                p.setEstoque(pro.get(aux).getEstoque());
                                    
                                quantResul++;
                                quantEst+=pro.get(aux).getEstoque();
                                preco+=pro.get(aux).getPrecoVenda()*pro.get(aux).getEstoque();
                    
                                dtm.addRow(p.addTableConsulta());
                                cont++;
                    }
                    
                    if(pro.size()==0){
                        lblQuant.setText("Quant Total Estoque: 0 Iten(s)");
                        lblValor.setText("Valor total: R$ 0,00");
                        lblTotal.setText("Total da Busca: 0 Resultado(s)");
                    }
                    
                     lblQuant.setText("Quant Total Estoque: "+quantEst+" Iten(s)");
                     lblValor.setText("Valor total: R$ "+String.format("%.2f",preco));
                     lblTotal.setText("Total da Busca: "+quantResul+" Resultado(s)");
                
                    if(cont==0)//para exibir caso procura não exiba nada
                        JOptionPane.showMessageDialog(null, "Nenhum Registro encontrado");
        }catch(SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro no try da classe frmPesquisaCliente no botao buscar");
            }
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void cbxTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoProdutoActionPerformed

    private void txtBuscaProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaProActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtBuscaProActionPerformed
    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(tblBuscaPro.getSelectedRow()>=0 && tblBuscaPro.getSelectedRow()<tblBuscaPro.getRowCount()){
            Produto prod = new Produto();
            ProdutoDAO produtoDAO = new ProdutoDAO();
            DefaultTableModel dtm = (DefaultTableModel)tblBuscaPro.getModel();
            try{
                prod = produtoDAO.getDetalhes(String.valueOf(dtm.getValueAt(tblBuscaPro.getSelectedRow(), 0)));
                
                frmAddProduto frmAddProduto = new frmAddProduto("editar",prod);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Erro no botao editar na classe frmPesquisaProduto: "+ ex);
            }
       }else{
            JOptionPane.showMessageDialog(null, "Selecione um produto");
        }
            
    }//GEN-LAST:event_btnEditarActionPerformed
    public void carregarCbx(){
        for(EnumTipoProduto ep: EnumTipoProduto.values()){
               cbxTipoProduto.addItem(ep.getNome());
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbxTipoProduto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscaProdutos;
    private javax.swing.JLabel lblQuant;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblValor;
    private javax.swing.JRadioButton rbtCod;
    private javax.swing.JRadioButton rbtNome;
    private javax.swing.JRadioButton rbtQuant;
    private javax.swing.JTable tblBuscaPro;
    private javax.swing.JTextField txtBuscaPro;
    // End of variables declaration//GEN-END:variables
}