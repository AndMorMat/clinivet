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
import javax.swing.SwingConstants;
/**
 *
 * @author xps-l502x
 */
public class frmPesquisaProduto extends javax.swing.JFrame {

    /**
     * Creates new form frmPesquisaProduto
     */
    ProdutoDAO pdao = new ProdutoDAO();
    
    public frmPesquisaProduto(String param) {
        initComponents();
        
        setLocationRelativeTo(null);
        rbtNome.setSelected(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        carregarCbx();
        if(param.equals("pesquisar")){
            btnEditar.setVisible(false);
            btnExcluir.setVisible(false);
            lblAviso.setVisible(false);
            
        }
        alinharTextBotao();
        setVisible(true);
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
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuscaPro = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        lblQuant = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        rbtNome = new javax.swing.JRadioButton();
        rbtCod = new javax.swing.JRadioButton();
        rbtQuant = new javax.swing.JRadioButton();
        txtBuscaPro = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cbxTipoProduto = new javax.swing.JComboBox();
        btnBuscar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblBuscaProdutos = new javax.swing.JLabel();
        lblAviso = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(195, 239, 198));

        jPanel2.setBackground(new java.awt.Color(214, 255, 213));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        lblTotal.setText("0 Resultado(s)");

        lblValor.setText("Valor total (nessa busca): R$ 0,00");

        lblQuant.setText("Quant Total Estoque(nessa busca): 0 Iten(s)");

        jPanel4.setBackground(new java.awt.Color(214, 255, 213));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        txtBuscaPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaProActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(rbtNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtCod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtQuant))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtBuscaPro, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtNome)
                    .addComponent(rbtCod)
                    .addComponent(rbtQuant))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(214, 255, 213));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        jLabel1.setText("Buscar por tipo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbxTipoProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar1)
                    .addComponent(cbxTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sof3/clinivet/frames/Imagens/editarproduto.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sof3/clinivet/frames/Imagens/excluir-produto.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lblTotal)
                                .addGap(162, 162, 162)
                                .addComponent(lblValor)))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblQuant)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEditar)
                        .addComponent(btnExcluir))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(lblTotal)
                    .addComponent(lblQuant))
                .addContainerGap())
        );

        lblBuscaProdutos.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        lblBuscaProdutos.setText("Buscar Produtos");

        lblAviso.setText("Pesquise um produto para editar ou excluir");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sof3/clinivet/frames/Imagens/pesquisa_prod_top.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblBuscaProdutos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAviso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBuscaProdutos)
                            .addComponent(lblAviso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
               lblQuant.setText("Quant Total Estoque (nessa busca): 0 Iten(s)");//Usado para "Zerar" Caso já tenha reazlizado uma busca anteriorfa
               lblValor.setText("Valor total(nessa busca): R$ 0,00");            //Usado para "Zerar" Caso já tenha reazlizado uma busca anteriorfa
               lblTotal.setText("0 Resultado(s)");  //Usado para "Zerar" Caso já tenha reazlizado uma busca anteriorfa
          
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
                        lblQuant.setText("Quant Total Estoque (nessa busca): 0 Iten(s)");
                        lblValor.setText("Valor total (nessa busca): R$ 0,00");
                        lblTotal.setText("0 Resultado(s)");
                    }
                }
                
                
                for(int aux =0;aux<pro.size();aux++){
                    if(!pro.get(aux).isInativo()){
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
                }
                
                
                lblQuant.setText("Quant Total Estoque (nessa busca): "+quantEst+" Iten(s)");
                lblValor.setText("Valor total (nessa busca): R$ "+String.format("%.2f",preco));
                lblTotal.setText(quantResul+" resultado(s)");
                
                
                
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
                        if(!pro.get(aux).isInativo()){
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
                    }
                    
                    if(pro.size()==0){
                        lblQuant.setText("Quant Total Estoque (nessa busca): 0 Iten(s)");
                        lblValor.setText("Valor total (nessa busca): R$ 0,00");
                        lblTotal.setText("0 resultado(s)");
                    }
                    
                     lblQuant.setText("Quant Total Estoque (nessa busca): "+quantEst+" Iten(s)");
                     lblValor.setText("Valor total (nessa busca): R$ "+String.format("%.2f",preco));
                     lblTotal.setText(quantResul+" resultado(s)");
                
                    if(cont==0)//para exibir caso procura não exiba nada
                        JOptionPane.showMessageDialog(null, "Nenhum Registro encontrado");
        }catch(SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro no try da classe frmPesquisaProduto no botao buscar");
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
            JOptionPane.showMessageDialog(null, "Selecione um registro");
        }
            
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       ProdutoDAO produtoDAO = new ProdutoDAO();
        if(tblBuscaPro.getSelectedRow() >= 0 && tblBuscaPro.getSelectedRow() < tblBuscaPro.getRowCount()){
            int result = JOptionPane.showConfirmDialog(this, "Você tem certeza?","Excluir produto",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
            if (result==2) return;
            
            List<Produto> prod = new LinkedList<>();
            DefaultTableModel dtm = (DefaultTableModel)tblBuscaPro.getModel();
            try{
                 prod = produtoDAO.getProdutoByCodigo(String.valueOf(dtm.getValueAt(tblBuscaPro.getSelectedRow(), 0)));
                 produtoDAO.inativarProduto(prod.get(0).getId());
                 prod = produtoDAO.getTodosProdutos();
                 limparTabela();
                 atualizarTabela(prod);
            }catch(Exception ex){
                 JOptionPane.showMessageDialog(null,"Erro ao excluir vendedor na classe frmPesquisaVendedor: "+ ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um registro");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed
    public void carregarCbx(){
        for(EnumTipoProduto ep: EnumTipoProduto.values()){
               cbxTipoProduto.addItem(ep.getNome());
            }
    }
    public void alinharTextBotao(){
        
        btnEditar.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnEditar.setHorizontalTextPosition(SwingConstants.CENTER);
        btnExcluir.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnExcluir.setHorizontalTextPosition(SwingConstants.CENTER);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbxTipoProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAviso;
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

     public void atualizarTabela(List<Produto> produtos){
        DefaultTableModel dtm = (DefaultTableModel)tblBuscaPro.getModel();
        double preco=0;
        int quantResul=0,quantEst=0;
        for(int aux=0;aux<produtos.size();aux++){
            if(!produtos.get(aux).isInativo())
                 dtm.addRow(produtos.get(aux).addTableConsulta());
                 quantResul++;
                 quantEst+=produtos.get(aux).getEstoque();
                 preco+=produtos.get(aux).getPrecoVenda()*produtos.get(aux).getEstoque();
        }
        lblQuant.setText("Quant Total Estoque (nessa busca): "+quantEst+" Iten(s)");
        lblValor.setText("Valor total (nessa busca): R$ "+String.format("%.2f",preco));
        lblTotal.setText(quantResul+" resultado(s)");
        
    }
    public void limparTabela(){
        DefaultTableModel dtm =  (DefaultTableModel) tblBuscaPro.getModel();
        
        int cont = dtm.getRowCount();
            for(int aux=cont-1 ;   aux>=0 ;  aux--){//removendo valores da tabela
               
                dtm.removeRow(aux);
                
            }
    }
}