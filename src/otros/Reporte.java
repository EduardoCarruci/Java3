
package otros;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class Reporte {
    
    
    public static void main(String[] args) throws JRException, IOException{
         /*
        JasperReport archivo = JasperCompileManager.compileReport("aula.jrxml");
        Map<String,Object> mapa = new HashMap<String,Object>();
        
        
        mapa.put("foto", Consultas.Imagen());
        mapa.put("idselect",);
        
        
        Conectar con = new Conectar("jdbc:mysql://localhost:3306/escuela");
       
        JasperPrint prin = JasperFillManager.fillReport(archivo,mapa,con.getConnection());
       
        
        JasperViewer ver = new JasperViewer(prin,false);
        
        ver.setVisible(true);
        ver.setTitle("Reportes de las aulas ");*/
    }
    
  /*  public void generar () throws JRException{
       // JasperExportManager.exportReportToPdfFile(prin,"reporte.pdf");
     //JRDataSource data = new JREmptyDataSource();
        
        
    }*/
}
