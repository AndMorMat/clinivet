/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.frames;
    
import br.com.sof3.clinivet.dao.ClienteDAO;
import br.com.sof3.clinivet.entidade.Agenda;
import br.com.sof3.clinivet.entidade.Animal;
import br.com.sof3.clinivet.entidade.Cliente;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.List;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andrematos
 */
public class frmPesquisaCliente extends javax.swing.JFrame {
    
    ClienteDAO cdao = new ClienteDAO();
    String param;
    public frmPesquisaCliente(String parametro) {
        param = parametro;
        initComponents();
        setLocationRelativeTo(null);
        rbtNome.setSelected(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        alinharTextBotao();
        if (parametro.equals("editar")){
            btnExcluir.setVisible(true);
            btnEditar.setVisible(true);
            lblNomeVendedor.setText("Editar Cliente");
        }else if(parametro.equals("consultar")){
            btnEditar.setVisible(false);
            btnExcluir.setVisible(false);
        }else if(parametro.equals("agendar")){
            btnEditar.setText("OK");
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
        jPanel3 = new javax.swing.JPanel();
        lblNomeVendedor = new javax.swing.JLabel();
        rbtNome = new javax.swing.JRadioButton();
        rbtCpf = new javax.swing.JRadioButton();
        txtBuscaCliente = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnUltimosCad = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuscaCli = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(214, 255, 213));

        lblNomeVendedor.setText("Buscar Clientes:");

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

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnUltimosCad.setBackground(new java.awt.Color(168, 252, 173));
        btnUltimosCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sof3/clinivet/frames/Imagens/ultimos_cadastros.png"))); // NOI18N
        btnUltimosCad.setText("Ultimos Cadastros");
        btnUltimosCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimosCadActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(168, 252, 173));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sof3/clinivet/frames/Imagens/editar_usuario.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(168, 252, 173));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sof3/clinivet/frames/Imagens/excluir_usuario.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        tblBuscaCli.setBackground(new java.awt.Color(214, 255, 213));
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
        tblBuscaCli.setToolTipText("");
        tblBuscaCli.setSelectionBackground(new java.awt.Color(40, 85, 146));
        tblBuscaCli.setSelectionForeground(new java.awt.Color(254, 254, 254));
        tblBuscaCli.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblBuscaCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBuscaCliMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBuscaCli);
        tblBuscaCli.getColumnModel().getColumn(0).setPreferredWidth(200);
        tblBuscaCli.getColumnModel().getColumn(2).setResizable(false);

        jPanel1.setBackground(new java.awt.Color(214, 255, 213));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 774, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNomeVendedor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(rbtNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbtCpf))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUltimosCad, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNomeVendedor)
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtNome)
                            .addComponent(rbtCpf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(btnUltimosCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                limparTabela();
//                int cont = dtm.getRowCount();
//                for(int aux=cont-1 ;   aux>=0;  aux--){//removendo valores da tabela
//                    dtm.removeRow(aux);
//                }
                
                cli = cdao.getClientesByID();
                
                for(int aux=0 ;aux<cli.size();aux++){
                    if(aux<6){
                        c.setNome(cli.get(aux).getNome());
                        c.setCpf(cli.get(aux).getCpf());
                        c.setTelefone(cli.get(aux).getTelefone());
                        if(!cli.get(aux).isInativo())//so será exibido cliente se ele estiver ativo
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
           
           
           
           NumCpf = String.valueOf(tblBuscaCli.getValueAt(tblBuscaCli.getSelectedRow(),1));
           
            try {
                cli = cdao.getDetalhes(NumCpf);
            } catch (SQLException ex) {
                Logger.getLogger(frmPesquisaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            frmExibirCliente frmExibir = new frmExibirCliente();
            frmExibir.CadastrarDados(cli);
            
           
           
           
        }
    }//GEN-LAST:event_tblBuscaCliMouseClicked

    private void rbtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtNomeActionPerformed

    private void rbtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtCpfActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(param.equals("editar")){
            List<Cliente> cli = new LinkedList<>();
            //ClienteDAO cdao = new ClienteDAO();
            DefaultTableModel dtm = (DefaultTableModel)tblBuscaCli.getModel();
            if(tblBuscaCli.getSelectedRow()>=0 && tblBuscaCli.getSelectedRow()<tblBuscaCli.getRowCount()){
                try{
                    cli = cdao.getClientesByCPF(String.valueOf(dtm.getValueAt(tblBuscaCli.getSelectedRow(), 1)));
                    frmAddCliente frmEditarCliente = new frmAddCliente("editar",cli.get(0));
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Erro no btnEditar");
                }
            }else JOptionPane.showMessageDialog(null, "Selecione um Cliente para editar");
        }else if(param.equals("agendar")){
            List<Cliente> cli = new LinkedList<>();
            //ClienteDAO cdao = new ClienteDAO();
            DefaultTableModel dtm = (DefaultTableModel)tblBuscaCli.getModel();
            if(tblBuscaCli.getSelectedRow()>=0 && tblBuscaCli.getSelectedRow()<tblBuscaCli.getRowCount()){
                try{
                    cli = cdao.getClientesByCPF(String.valueOf(dtm.getValueAt(tblBuscaCli.getSelectedRow(), 1)));
                    
                    frmAgendamento.setDados(cli.get(0));
                    setVisible(false);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Erro no btnEditar");
                }
            }else JOptionPane.showMessageDialog(null, "Selecione um Cliente");
            
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(tblBuscaCli.getSelectedRow()>=0 && tblBuscaCli.getSelectedRow()<tblBuscaCli.getRowCount()){
            List<Cliente> cli = new LinkedList<>();
            DefaultTableModel dtm = (DefaultTableModel)tblBuscaCli.getModel();
            try{
                 cli = cdao.getClientesByCPF(String.valueOf(dtm.getValueAt(tblBuscaCli.getSelectedRow(), 1)));
                 cdao.inativarCliente(cli.get(0).getId());
                 cli = cdao.getAllClientes();
                 limparTabela();
                 atualizarTabela(cli);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Erro ao excluir cliente na classe frmPesquisaCliente"+ ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um registro");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed
    public void atualizarTabela(List<Cliente> clientes){
        DefaultTableModel dtm = (DefaultTableModel)tblBuscaCli.getModel();
        for(int aux=0;aux<clientes.size();aux++){
                    if(!clientes.get(aux).isInativo())
                        dtm.addRow(clientes.get(aux).addTable());
                }
    }
    public void limparTabela(){
        DefaultTableModel dtm =  (DefaultTableModel) tblBuscaCli.getModel();
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNomeVendedor;
    private javax.swing.JRadioButton rbtCpf;
    private javax.swing.JRadioButton rbtNome;
    private javax.swing.JTable tblBuscaCli;
    private javax.swing.JTextField txtBuscaCliente;
    // End of variables declaration//GEN-END:variables
}
