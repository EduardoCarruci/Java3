
package Controlador;

import Modelo.Boleta;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import otros.Conexion;
import otros.TablaImagen;

public class FBoleta {

    private Boleta boleta;
     private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    
    
    public FBoleta(String comentarios, int niños) {
    boleta = new Boleta(comentarios, niños);
    }
    
    
    public FBoleta(){
        
    }
    public JTable consulta_general(JTable tabla) {
           String rutaFoto = "/imagenes/pdf1.png";
        ImageIcon icono = new ImageIcon(getClass().getResource(rutaFoto));
      
        DefaultTableModel dt = new DefaultTableModel();
       
        String[] titulos = {"id","comentarios","niños"};
        Object[] registro = new Object[3];
        
        tabla.setDefaultRenderer(Object.class, new TablaImagen());
        //tabla.setCellEditor((TableCellEditor) this);

        dt.addColumn("id");
        dt.addColumn("comentarios");
        dt.addColumn("niños");
       
        sSQL = "select * from boleta ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
             tabla.setDefaultRenderer(Object.class, new TablaImagen());

            while (rs.next()) {
                
               //(rs.getString("idCliente"));
               registro[0]= rs.getObject("id");
               registro[1]= rs.getObject("comentarios");
               registro[2]= rs.getObject("niños");
              
       
              dt.addRow(registro);

            }
            tabla.setModel(dt);
            tabla.setRowHeight(128);
            
           return tabla;
        } catch (Exception e) {
            
            System.out.println("MORI");
            return null;
          
        }
    }
    public ArrayList consultaIDNIÑO(int buscar) {
          ArrayList<Object> registro = new ArrayList<Object>();
        sSQL = "select niños from boleta where id='"+buscar+"' ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
          

            while (rs.next()) {
                
              
              registro.add(rs.getObject("niños"));
              
              
            }
           
            
           return registro;
        } catch (Exception e) {
            
            System.out.println("mori buscando tu registro en consultaIDNIÑO");
            return null;
          
        }
    }
    public JTable consulta_Personalizada(int buscar,JTable tabla) {
          
        String rutaFoto = "/imagenes/pdf1.png";
        ImageIcon icono = new ImageIcon(getClass().getResource(rutaFoto));
        
      tabla.setDefaultRenderer(Object.class, new TablaImagen());
        DefaultTableModel dt = new DefaultTableModel();
        
      
        String[] titulos = {"id","comentarios","niños"};
        Object[] registro = new Object[4];
        
        
        

        dt.addColumn("id");
        dt.addColumn("comentarios");
        dt.addColumn("niños");
       
        sSQL = "select id,comentarios,niños from boleta where id= '"+buscar+"' ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
             tabla.setDefaultRenderer(Object.class, new TablaImagen());

            while (rs.next()) {
                
               //(rs.getString("idCliente"));
               registro[0]= rs.getObject("id");
               registro[1]= rs.getObject("comentarios");
  
                 registro[3]= rs.getObject("niños");
       
              dt.addRow(registro);

            }
            tabla.setModel(dt);
            tabla.setRowHeight(128);
            
           return tabla;
        } catch (Exception e) {
            
            System.out.println("MORI: "+e);
            return null;
          
        }
    }
     
    public boolean insertar() {
        sSQL = "insert into boleta (comentarios,niños)"
                + "values (?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
           // pst.setInt(1, niños.getId());
            pst.setString(1,boleta.getComentarios());
            pst.setInt(2,boleta.getNiños());
            
         
           
            Integer n = pst.executeUpdate();
            if (n != 0) {
                System.out.println("Guardado de la boleta exitoso ");
                return true;
                
                
            } else {
                return false;
            }

        } catch (Exception e) {
            
             System.out.println(""+e);
            return false;
        }

    }
    
    
    public ArrayList consulta_Boleta() {
          ArrayList<Object> registro = new ArrayList<Object>();
        sSQL = "select id from boleta ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
          

            while (rs.next()) {
                
              
              registro.add(rs.getObject("id"));
              
              
            }
           
            
           return registro;
        } catch (Exception e) {
            
            System.out.println("mori buscando tu registro en consulta_boleta");
            return null;
          
        }
    }
    
    
    
}
