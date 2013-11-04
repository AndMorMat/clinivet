/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.frames;

import br.com.sof3.clinivet.dao.GenericoDAO;
import java.util.Locale;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author andrematos
 */
public class relatorioClientes extends GenericoDAO{
    public void visualizar(){
        try{
            
            String arqRelatorio = "src/relatorios/relatorioClientes.jasper";
           
            JasperPrint jp = JasperFillManager.fillReport(arqRelatorio,null, getConnection());
            JasperViewer.viewReport(jp, false);
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro no metodo visualizar na classe relatorioClientes: "+ ex);
        }
    }
}
