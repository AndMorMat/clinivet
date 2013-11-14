/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.frames;

import br.com.sof3.clinivet.dao.VendaDAO;
import br.com.sof3.clinivet.entidade.Produto;
import br.com.sof3.clinivet.entidade.Venda;
import static java.awt.image.ImageObserver.WIDTH;
import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author xps-l502x
 */
public class frmExibirProduto extends javax.swing.JFrame {

    /**
     * Creates new form frmExibirProduto
     */
    public frmExibirProduto() {
        initComponents();
        setVisible(true);
        setDefaultCloseOperation(WIDTH);
        setLocationRelativeTo(null);
    }
    
    public void CadastrarDados(Produto p){
        txtProduto.setText(p.getNome());
        txtPrecoV.setText(String.valueOf("R$"+String.format("%.2f", p.getPrecoVenda())));
        txtPrecoC.setText(String.valueOf("R$"+String.format("%.2f",p.getPrecoCusto())));
        txtCodigo.setText(p.getCodigo());
        txtMargemLucro.setText(String.valueOf(p.getMargemLucro()+"%"));
        txtTipo.setText(p.getTipoProduto());
        txtQuantEs.setText(String.valueOf(p.getEstoque()));
        txtTelFor.setText(p.getFornecedor().getTelefone());
        txtVencimento.setText(p.getValidade());
        txtFornecedor.setText(p.getFornecedor().getNome());
    }
    
    public void CadastrarVendas(String cod){
       /* DefaultTableModel dtm = (DefaultTableModel)tblAnimal.getModel();
        
        int cont=0;
        int cont2 = dtm.getRowCount();
        
        for(int aux=cont2-1 ;   aux>=0;  aux--){//removendo valores da tabela
            dtm.removeRow(aux);
        }
        
        try {
            VendaDAO Vedao = new VendaDAO();

            List<Venda> ani = new LinkedList<Venda>();

            Venda venEfetuada = new Venda();
         
            ani = Vedao.

            for(int aux =0;aux<ani.size();aux++){
               venEfetuada.setTipoAnimal(ani.get(aux).getTipoAnimal());
               venEfetuada.setRaca(ani.get(aux).getRaca());
               venEfetuada.setNome(ani.get(aux).getNome());//NomeAnimal não está exibindo correto
               venEfetuada.setSexo(ani.get(aux).getSexo());

               dtm.addRow(venEfetuada.addTable());
               cont++;
            }
           // txtTotal.setText(String.valueOf(ani.size()));
            
        } catch(SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro no try da classe frmExibirCliente Cadastrando animais");
      }
        */
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulojanela = new javax.swing.JLabel();
        lblPrecovenda = new javax.swing.JLabel();
        txtPrecoC = new javax.swing.JLabel();
        txtProduto = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        txtVencimento = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JLabel();
        txtPrecoV = new javax.swing.JLabel();
        lblMargemlucro = new javax.swing.JLabel();
        lblPrecoCusto = new javax.swing.JLabel();
        txtMargemLucro = new javax.swing.JLabel();
        lblCelular1 = new javax.swing.JLabel();
        txtQuantEs = new javax.swing.JLabel();
        lblTelefone1 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtFornecedor = new javax.swing.JLabel();
        lblFornecedor = new javax.swing.JLabel();
        lblTelForn = new javax.swing.JLabel();
        txtTelFor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulojanela.setText("Detalhes do Produto selecionado:");

        lblPrecovenda.setText("Preço Venda");

        txtPrecoC.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        txtPrecoC.setForeground(new java.awt.Color(69, 68, 222));
        txtPrecoC.setText("ValorCusto");

        txtProduto.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        txtProduto.setForeground(new java.awt.Color(69, 68, 222));
        txtProduto.setText("NomeProduto");

        lblTelefone.setText("Validade");

        lblCelular.setText("Quant. Est.:");

        txtVencimento.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        txtVencimento.setForeground(new java.awt.Color(69, 68, 222));
        txtVencimento.setText("Data");

        txtCodigo.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(69, 68, 222));
        txtCodigo.setText("Código");

        txtPrecoV.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        txtPrecoV.setForeground(new java.awt.Color(69, 68, 222));
        txtPrecoV.setText("ValorVenda");

        lblMargemlucro.setText("Margem Lucro");

        lblPrecoCusto.setText("Preço Custo");

        txtMargemLucro.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        txtMargemLucro.setForeground(new java.awt.Color(69, 68, 222));
        txtMargemLucro.setText("MargemVEnda");

        lblCelular1.setText("Código:");

        txtQuantEs.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        txtQuantEs.setForeground(new java.awt.Color(69, 68, 222));
        txtQuantEs.setText("Quant");

        lblTelefone1.setText("Tipo:");

        txtTipo.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        txtTipo.setForeground(new java.awt.Color(69, 68, 222));
        txtTipo.setText("Tipo");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato fornecedor"));

        txtFornecedor.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        txtFornecedor.setForeground(new java.awt.Color(69, 68, 222));
        txtFornecedor.setText("Fornecedor");

        lblFornecedor.setText("Nome:");

        lblTelForn.setText("Tel:");

        txtTelFor.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        txtTelFor.setForeground(new java.awt.Color(69, 68, 222));
        txtTelFor.setText("Fornecedor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFornecedor)
                .addGap(18, 18, 18)
                .addComponent(lblTelForn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTelFor)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFornecedor)
                    .addComponent(txtFornecedor)
                    .addComponent(lblTelForn)
                    .addComponent(txtTelFor))
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProduto)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPrecoCusto)
                                            .addComponent(lblMargemlucro)
                                            .addComponent(lblPrecovenda))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtPrecoV))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtMargemLucro)
                                                    .addComponent(txtPrecoC, javax.swing.GroupLayout.Alignment.TRAILING))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTelefone)
                                    .addComponent(lblCelular1)
                                    .addComponent(lblCelular))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtVencimento)
                                    .addComponent(txtQuantEs)
                                    .addComponent(txtCodigo)))
                            .addComponent(lblTitulojanela)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTelefone1)
                                .addGap(18, 18, 18)
                                .addComponent(txtTipo)))
                        .addGap(55, 55, 55))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulojanela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrecoV, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPrecovenda)
                        .addComponent(txtCodigo)
                        .addComponent(lblCelular1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecoCusto)
                    .addComponent(txtPrecoC)
                    .addComponent(lblCelular)
                    .addComponent(txtQuantEs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMargemlucro)
                    .addComponent(txtMargemLucro)
                    .addComponent(lblTelefone)
                    .addComponent(txtVencimento))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone1)
                    .addComponent(txtTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCelular1;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblMargemlucro;
    private javax.swing.JLabel lblPrecoCusto;
    private javax.swing.JLabel lblPrecovenda;
    private javax.swing.JLabel lblTelForn;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTelefone1;
    private javax.swing.JLabel lblTitulojanela;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JLabel txtFornecedor;
    private javax.swing.JLabel txtMargemLucro;
    private javax.swing.JLabel txtPrecoC;
    private javax.swing.JLabel txtPrecoV;
    private javax.swing.JLabel txtProduto;
    private javax.swing.JLabel txtQuantEs;
    private javax.swing.JLabel txtTelFor;
    private javax.swing.JLabel txtTipo;
    private javax.swing.JLabel txtVencimento;
    // End of variables declaration//GEN-END:variables
}
