/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sof3.clinivet.frames;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author andrematos
 */
public class Colorir extends frmAgendamento implements TableCellRenderer{  
  public Colorir(){  
    setOpaque(true);  
  }  
    
  public Component getTableCellRendererComponent(  
     JTable table,   
     Object value, boolean isSelected, boolean hasFocus,  
        int row, int column){  
      
     if(row == table.getRowCount()){  
       setBackground(Color.YELLOW);   
     }  
     else{  
       setBackground(table.getBackground());          
     }       
              
     return this;         
  }  
    
  public void validate() {}  
  public void revalidate() {}  
  protected void firePropertyChange(String propertyName,  
     Object oldValue, Object newValue) {}  
  public void firePropertyChange(String propertyName,  
     boolean oldValue, boolean newValue) {}    

    /*@Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    private void setOpaque(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}  