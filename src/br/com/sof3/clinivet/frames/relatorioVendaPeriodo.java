/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.frames;

import br.com.sof3.clinivet.dao.GenericoDAO;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author andrematos
 */
public class relatorioVendaPeriodo extends GenericoDAO{
    public void visualizar(String data_inicio, String data_termino){
        try{
            
            String arqRelatorio = "src/relatorios/relatorioVendaPeriodo.jasper";
            HashMap<String, Object> param = new HashMap<>();
           //JOptionPane.showMessageDialog(null, data_inicio+" "+data_termino);
            //$P{data_inicial} and data_venda<=$P{data_final};
            param.put("data_inicial", data_inicio);
            param.put("data_final", data_termino);
            
            JasperPrint jp = JasperFillManager.fillReport(arqRelatorio,param, getConnection());
            JasperViewer.viewReport(jp, false);
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro no metodo visualizar na classe relatorioProduto: "+ ex);
        }
    }
}
