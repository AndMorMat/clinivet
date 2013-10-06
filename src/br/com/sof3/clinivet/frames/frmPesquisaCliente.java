/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.frames;
    
import br.com.sof3.clinivet.dao.ClienteDAO;
import br.com.sof3.clinivet.entidade.Cliente;
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
public class frmPesquisaCliente extends javax.swing.JFrame {
    
    ClienteDAO cdao = new ClienteDAO();
    /**
     * Creates new form Pesquisa
     */
    public frmPesquisaCliente() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        rbtNome.setSelected(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
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

        buttonGroup1.add(rbtCpf);
        rbtCpf.setText("CPF");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rbtNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtCpf)
                .addGap(0, 13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rbtNome)
                .addComponent(rbtCpf))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeVendedor)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUltimosCad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeVendedor)
                    .addComponent(btnUltimosCad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       
        DefaultTableModel dtm = (DefaultTableModel)tblBuscaCli.getModel();
        
        for(int aux=0;aux<dtm.getRowCount();aux++)
              dtm.removeRow(aux);
        
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
                        String letras="abcdefghyjklmnopqrstuvwxyz";

                        String    texto = txtBuscaCliente.getText().toLowerCase();
                        for(int i=0; i<texto.length(); i++){
                            if (letras.indexOf(texto.charAt(i),0)!=-1){
                                    validador =1;
                            }
                        }
                        if(validador==0){ 
                         cli = cdao.getClientesByCPF(Integer.parseInt(txtBuscaCliente.getText()));
                        }else{
                            cont++;//para acrescentar e não exibir nenhum resitro, já ira exibir somente numeros
                            JOptionPane.showMessageDialog(null, "Informe somente números");
                        }
                     }
                    for(int aux =0 ;aux<cli.size();aux++){
                        c.setNome(cli.get(aux).getNome());
                        c.setCpf(cli.get(aux).getCpf());
                        c.setTelefone(cli.get(aux).getTelefone());

                        dtm.addRow(c.addTable());
                        cont++;
                    }
                    if(cont==0)//para exibir caso procura não exiba nada
                         JOptionPane.showMessageDialog(null, "Nenhum Registro encontrado");

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro no try da classe frmPesquisaCliente no botao buscar");
                }
            
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    
    private void btnUltimosCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimosCadActionPerformed
        // TODO add your handling code here:
        /*
        DefaultTableModel dtm = (DefaultTableModel)tblBuscaCli.getModel();
        
        for(int aux=0;aux<dtm.getRowCount();aux++)
              dtm.removeRow(aux);
        
        try {
                   
                List<Cliente> cli = new LinkedList<Cliente>();

                Cliente c = new Cliente(); 
                
                cli = cdao.getClientesByName(txtBuscaCliente.getText());
                
                JOptionPane.showMessageDialog(null, "Teste");
                for(int aux =0 ;aux<cli.size();aux++){
                    c.setNome(cli.get(aux).getNome());
                    c.setCpf(cli.get(aux).getCpf());
                    c.setTelefone(cli.get(aux).getTelefone());

                    dtm.addRow(c.addTable());
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro no try da classe frmPesquisaCliente no botao buscar");
            }
            * */
    }//GEN-LAST:event_btnUltimosCadActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnUltimosCad;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNomeVendedor;
    private javax.swing.JRadioButton rbtCpf;
    private javax.swing.JRadioButton rbtNome;
    private javax.swing.JTable tblBuscaCli;
    private javax.swing.JTextField txtBuscaCliente;
    // End of variables declaration//GEN-END:variables
}
