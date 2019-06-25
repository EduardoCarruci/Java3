package otros;


import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TablaImagen extends  DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object value,
            boolean bln, boolean bln1, int i, int i1) {
        if(value instanceof JLabel){
            return (JLabel)value;
            
        }
        
        if(value instanceof JButton){
        JButton btn = (JButton) value;
            if(bln){
               btn.setForeground(jtable.getSelectionForeground());
               btn.setBackground(jtable.getSelectionBackground());
            }
            return btn;
        }
           //else{
            
    return super.getTableCellRendererComponent(jtable, value, bln, bln1, i, i1); 
            
        
        
    }
    
   
    
}
