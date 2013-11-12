/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.frames;
    
import br.com.sof3.clinivet.dao.ClienteDAO;
import br.com.sof3.clinivet.dao.VendaDAO;
import br.com.sof3.clinivet.entidade.Animal;
import br.com.sof3.clinivet.entidade.Cliente;
import java.awt.Frame;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andrematos
 */
public class frmPesquisaClienteVenda extends javax.swing.JFrame {
    private final VendaDAO dao = new VendaDAO();
    String vendedorLogado;
    ClienteDAO cdao = new ClienteDAO();
    /**
     * Creates new form Pesquisa
     */
    public frmPesquisaClienteVenda(String parametro, String vendedor) {
        vendedorLogado = vendedor;
        initComponents();
        setLocationRelativeTo(null);
        rbtNome.setSelected(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        if (parametro.equals("editar")){
            btnEditar.setVisible(true);
            lblNomeVendedor.setText("Editar Cliente");
        }else if(parametro.equals("consultar")){
            btnEditar.setVisible(false);
            btnExcluir.setVisible(false);
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
        txtBuscaCliente = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuscaCli = new javax.swing.JTable();
        lblNomeVendedor = new javax.swing.JLabel();
        btnUltimosCad = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rbtNome = new javax.swing.JRadioButton();
        rbtCpf = new javax.swing.JRadioButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblBuscaCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Telefone"
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
        tblBuscaCli.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblBuscaCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBuscaCliMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBuscaCli);
        tblBuscaCli.getColumnModel().getColumn(0).setPreferredWidth(200);
        tblBuscaCli.getColumnModel().getColumn(2).setResizable(false);

        lblNomeVendedor.setText("Buscar Clientes:");

        btnUltimosCad.setText("Ultimos Cadastros");
        btnUltimosCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimosCadActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtNome);
        rbtNome.setText("Nome");
        rbtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNomeActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtCpf);
        rbtCpf.setText("CPF");
        rbtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtCpfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rbtNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtCpf)
                .addGap(0, 33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rbtNome)
                .addComponent(rbtCpf))
        );

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

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
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeVendedor)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUltimosCad, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeVendedor)
                            .addComponent(btnUltimosCad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscar)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       
        DefaultTableModel dtm = (DefaultTableModel)tblBuscaCli.getModel();
        
        int cont2 = dtm.getRowCount();
        for(int aux=cont2-1 ;   aux>=0;  aux--){//removendo valores da tabela
            dtm.removeRow(aux);
        }

        if(txtBuscaCliente.getText().isEmpty()){
               JOptionPane.showMessageDialog(null, "Digite para pesquisar");
          
        }else{
                int cont=0;
                try {

                    List<Cliente> cli = new LinkedList<Cliente>();

                    Cliente c = new Cliente();
                    
                     if(rbtNome.isSelected()){

                         cli = cdao.getClientesByName(txtBuscaCliente.getText());
                        
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
                                if(i==3)
                                stringBuilder.insert(3, '.');
                                else if(i==8)
                                stringBuilder.insert(7, '.');
                                else if(i==11)
                                stringBuilder.insert(11, '-');
                                else if (letras.indexOf(texto.charAt(i),0)!=-1){
                                        validador =1;
                                }
                            }
                        
                            
                            cli = cdao.getClientesByCPF(stringBuilder.toString());
                           
                        }else{
                            cont++;//para acrescentar e não exibir nenhum resitro, já ira exibir somente numeros
                            JOptionPane.showMessageDialog(null, "Informe somente números");
                        }
                     }
                    for(int aux =0;aux<cli.size();aux++){
                        c.setNome(cli.get(aux).getNome());
                        c.setCpf(cli.get(aux).getCpf());
                        c.setTelefone(cli.get(aux).getTelefone());

                        dtm.addRow(c.addTable());
                        cont++;
                    }
                    if(cont==0)//para exibir caso procura não exiba nada
                         JOptionPane.showMessageDialog(null, "Nenhum Registro encontrado");

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro no try da classe frmPesquisaCliente no botao ultimos cadastros ");
                }
            
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    
    private void btnUltimosCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimosCadActionPerformed
        // TODO add your handling code here:
       
        DefaultTableModel dtm = (DefaultTableModel)tblBuscaCli.getModel();
        
        for(int aux=0;aux<dtm.getRowCount();aux++)
              dtm.removeRow(aux);
        
        try {
                   
                List<Cliente> cli = new LinkedList<Cliente>();

                Cliente c = new Cliente(); 
                
                int cont = dtm.getRowCount();
                for(int aux=cont-1 ;   aux>=0;  aux--){//removendo valores da tabela
                  dtm.removeRow(aux);
                }
                
                cli = cdao.getClientesByID();
                
                for(int aux=0 ;aux<cli.size();aux++){
                    if(aux<6){
                        c.setNome(cli.get(aux).getNome());
                        c.setCpf(cli.get(aux).getCpf());
                        c.setTelefone(cli.get(aux).getTelefone());

                        dtm.addRow(c.addTable());
                    }
                        
                }
                
                

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro no try da classe frmPesquisaCliente no botao buscar ");
            }
        
           
    }//GEN-LAST:event_btnUltimosCadActionPerformed

    private void tblBuscaCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBuscaCliMouseClicked
        String NumCpf;
        if (evt.getClickCount() == 2) {  
           Cliente cli = new Cliente();
           
           setVisible(false);
           
           
           NumCpf = String.valueOf(tblBuscaCli.getValueAt(tblBuscaCli.getSelectedRow(),1));
           
            try {
                cli = cdao.getDetalhes(NumCpf);
                frmEfetuarVenda efetuarVenda = new frmEfetuarVenda(new Frame(), true, dao, vendedorLogado, cli);
                efetuarVenda.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(frmPesquisaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_tblBuscaCliMouseClicked

    private void rbtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtNomeActionPerformed

    private void rbtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtCpfActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        List<Cliente> cli = new LinkedList<>();
        ClienteDAO cdao = new ClienteDAO();
        DefaultTableModel dtm = (DefaultTableModel)tblBuscaCli.getModel();
        if(tblBuscaCli.getSelectedRow()>=0 && tblBuscaCli.getSelectedRow()<tblBuscaCli.getRowCount()){
            try{
                cli = cdao.getClientesByCPF(String.valueOf(dtm.getValueAt(tblBuscaCli.getSelectedRow(), 1)));

                frmAddCliente frmEditarCliente = new frmAddCliente("editar",cli.get(0));
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Erro no btnEditar");
            }
        }else JOptionPane.showMessageDialog(null, "Selecione um Cliente para editar");
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnUltimosCad;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNomeVendedor;
    private javax.swing.JRadioButton rbtCpf;
    private javax.swing.JRadioButton rbtNome;
    private javax.swing.JTable tblBuscaCli;
    private javax.swing.JTextField txtBuscaCliente;
    // End of variables declaration//GEN-END:variables
}
