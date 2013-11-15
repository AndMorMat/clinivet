/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.frames;

import br.com.sof3.clinivet.dao.GenericoDAO;
import java.sql.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.commons.collections.map.HashedMap;

/**
 *
 * @author andrematos
 */
public class relatorioAgendamentos extends GenericoDAO{
    public void visualizar(String data_inicio, String data_termino){
        try{
            
            String arqRelatorio = "src/relatorios/relatorioAgendamentos.jasper";
            HashMap<String, Object> param = new HashMap<>();
            
            param.put("data_inicio", data_inicio);
            param.put("data_fim", data_termino);
            
            JasperPrint jp = JasperFillManager.fillReport(arqRelatorio,param, getConnection());
            JasperViewer.viewReport(jp, false);
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro no metodo visualizar na classe relatorioProduto: "+ ex);
        }
    }
}
