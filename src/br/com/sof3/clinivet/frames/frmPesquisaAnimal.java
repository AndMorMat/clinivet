/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.frames;

import br.com.sof3.clinivet.dao.AnimalDAO;
import br.com.sof3.clinivet.dao.ClienteDAO;
import br.com.sof3.clinivet.entidade.Animal;
import br.com.sof3.clinivet.entidade.Cliente;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author xps-l502x
 */
public class frmPesquisaAnimal extends javax.swing.JFrame {
    AnimalDAO anidao = new AnimalDAO();
    /**
     * Creates new form frmPesquisaAnimal
     */
    public frmPesquisaAnimal(String parametro) {
        initComponents();
        
        setVisible(true);
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WIDTH);
        rbtID.setSelected(true);
        if (parametro.equals("editar")){
            btnEditar.setVisible(true);
        }else if(parametro.equals("consultar")){
            btnEditar.setVisible(false);
            btnExcluir.setVisible(false);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblNomeVendedor = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbtRaca = new javax.swing.JRadioButton();
        rbtNome = new javax.swing.JRadioButton();
        btnUltimosCad = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscaAnimais = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuscaAnimal = new javax.swing.JTable();
        rbtID = new javax.swing.JRadioButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNomeVendedor.setText("Buscar Animais");

        buttonGroup1.add(rbtRaca);
        rbtRaca.setText("Raça");
        rbtRaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtRacaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtNome);
        rbtNome.setText("Nome");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rbtNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtRaca)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rbtRaca)
                .addComponent(rbtNome))
        );

        btnUltimosCad.setText("Ultimos Cadastros");
        btnUltimosCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimosCadActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblBuscaAnimal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID/Código", "Nome", "Raça", "Tipo do Animal"
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
        tblBuscaAnimal.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblBuscaAnimal);
        tblBuscaAnimal.getColumnModel().getColumn(0).setPreferredWidth(2);
        tblBuscaAnimal.getColumnModel().getColumn(1).setPreferredWidth(200);

        buttonGroup1.add(rbtID);
        rbtID.setText("ID / Código");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeVendedor)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBuscaAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUltimosCad, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(36, 42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNomeVendedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscaAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUltimosCad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUltimosCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimosCadActionPerformed
        // TODO add your handling code here:

        DefaultTableModel dtm = (DefaultTableModel)tblBuscaAnimal.getModel();

        for(int aux=0;aux<dtm.getRowCount();aux++)
        dtm.removeRow(aux);

        try {
            
            List<Animal>  listan = new LinkedList<Animal>();

            Animal a = new Animal();

            int cont = dtm.getRowCount();
            
            for(int aux=cont-1 ;   aux>=0;  aux--){//removendo valores da tabela
                dtm.removeRow(aux);
            }
            
            
            listan = anidao.getMaxAnimal();
            
            
            for(int aux=0 ;aux<listan.size();aux++){
                if(aux<6){                  
                    a.setId(listan.get(aux).getId());
                    a.setNome(listan.get(aux).getNome());
                    a.setRaca(listan.get(aux).getRaca());
                    a.setTipoAnimal(listan.get(aux).getTipoAnimal());
                    if(!listan.get(aux).isInativo())
                        dtm.addRow(a.addTableConsulta());
                }

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no try da classe frmPesquisaAnimal no botao  Ultimos Cadastros");
        }
    }//GEN-LAST:event_btnUltimosCadActionPerformed

    @SuppressWarnings("UnusedAssignment")
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        DefaultTableModel dtm = (DefaultTableModel)tblBuscaAnimal.getModel();

        int cont2 = dtm.getRowCount();
        for(int aux=cont2-1 ;   aux>=0;  aux--){//removendo valores da tabela
            dtm.removeRow(aux);
        }

        if(txtBuscaAnimais.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite para pesquisar");

        }else{
            int cont=0;
            try {

                 List<Animal>  listan = new LinkedList<Animal>();

                Animal a= new Animal();
                
                if(rbtID.isSelected()){//Prcura por ID/Codigo
                    int validador=0; 
                        String letras="abcdefghyjklmnopqrstuvwxyz";

                        String    texto = txtBuscaAnimais.getText().toLowerCase();
                        for(int i=0; i<texto.length(); i++){
                            if (letras.indexOf(texto.charAt(i),0)!=-1){
                                    validador =1;
                            }
                        }
                        if(validador==0){ 
                           listan = anidao.getAnimalbyIDcod(Integer.parseInt(txtBuscaAnimais.getText()));
                        }else{
                            cont++;//para acrescentar e não exibir nenhum resitro, já ira exibir somente numeros
                            JOptionPane.showMessageDialog(null, "Informe somente números");
                        }
                }else if(rbtNome.isSelected()){//Procura por Nome
                    
                         listan = anidao.getAnimalByName(txtBuscaAnimais.getText());
                    
                }else{
                    listan = anidao.getAnimalbyTipoAni(txtBuscaAnimais.getText());
                }
               
                for(int aux =0;aux<listan.size();aux++){
                    a.setId(listan.get(aux).getId());
                    a.setNome(listan.get(aux).getNome());
                    a.setRaca(listan.get(aux).getRaca());
                    a.setTipoAnimal(listan.get(aux).getTipoAnimal());
                    if(!listan.get(aux).isInativo()){
                        dtm.addRow(a.addTableConsulta());
                        cont++;
                    }
                }

                if(cont==0)//para exibir caso procura não exiba nada
                JOptionPane.showMessageDialog(null, "Nenhum Registro encontrado");

            }catch (SQLException ex){

                JOptionPane.showMessageDialog(null, "Erro no try da classe frmPesquisaVendedor no botao buscar");
            }

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void rbtRacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtRacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtRacaActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        List<Animal> ani = new LinkedList<>();
        AnimalDAO adao = new AnimalDAO();
        DefaultTableModel dtm = (DefaultTableModel)tblBuscaAnimal.getModel();
        if(tblBuscaAnimal.getSelectedRow()>=0 && tblBuscaAnimal.getSelectedRow()<tblBuscaAnimal.getRowCount()){
            try{
               ani = adao.getAnimalbyIDcod(Integer.parseInt(String.valueOf(dtm.getValueAt(tblBuscaAnimal.getSelectedRow(), 0))));
               
               frmAddAnimal frmAddAniamal = new frmAddAnimal("editar",ani.get(0));
               
               
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Erro no btnEditar");
            }
        }else JOptionPane.showMessageDialog(null, "Selecione um Cliente para editar");
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        List<Animal> ani = new LinkedList<>();
        AnimalDAO adao = new AnimalDAO();
        DefaultTableModel dtm = (DefaultTableModel)tblBuscaAnimal.getModel();
        try{
            if(tblBuscaAnimal.getSelectedRow()>=0 && tblBuscaAnimal.getSelectedRow()<tblBuscaAnimal.getRowCount()){
            try{
               ani = adao.getAnimalbyIDcod(Integer.parseInt(String.valueOf(dtm.getValueAt(tblBuscaAnimal.getSelectedRow(), 0))));
               adao.inativarAnimais(ani.get(0).getId());
               ani = adao.getAllAnimais();
               limparTabela();
               atualizarTabela(ani);
      
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Erro no btnEditar");
            }
        }else JOptionPane.showMessageDialog(null, "Selecione um Cliente para editar");
        }catch(Exception ex){
            
        }
    }//GEN-LAST:event_btnExcluirActionPerformed
    public void atualizarTabela(List<Animal> animais){
        DefaultTableModel dtm = (DefaultTableModel)tblBuscaAnimal.getModel();
        for(int aux=0;aux<animais.size();aux++){
                    if(!animais.get(aux).isInativo())
                        dtm.addRow(animais.get(aux).addTableConsulta());
                }
    }
    public void limparTabela(){
        DefaultTableModel dtm =  (DefaultTableModel) tblBuscaAnimal.getModel();
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNomeVendedor;
    private javax.swing.JRadioButton rbtID;
    private javax.swing.JRadioButton rbtNome;
    private javax.swing.JRadioButton rbtRaca;
    private javax.swing.JTable tblBuscaAnimal;
    private javax.swing.JTextField txtBuscaAnimais;
    // End of variables declaration//GEN-END:variables
}
