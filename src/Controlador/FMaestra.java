
package Controlador;

import Modelo.Maestra;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import otros.Conexion;
import otros.TablaImagen;

public class FMaestra {
     private Maestra maestra;
     private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    
    
    public FMaestra(String nombre, String apellido, String direccion, File fotox, File cedulax, File titulox, int usuario_id){
        maestra = new Maestra(nombre, apellido, direccion, fotox, cedulax, titulox, usuario_id);
    }
    
    public FMaestra(){
        
    }
    
    public boolean insertar() {
        sSQL = "insert into maestra (nombre,apellido,direccion,foto,cedula,titulo,usuario_id)"
                + "values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
           // pst.setInt(1, niños.getId());
           
            pst.setString(1,maestra.getNombre());
            pst.setString(2,maestra.getApellido());
            pst.setString(3,maestra.getDireccion());
 
            FileInputStream archivo;     
            archivo = new FileInputStream(maestra.getFotoxpersonal());
            pst.setBinaryStream(4, archivo);
            

   
            //-------------------
           byte[] pdf = new byte[(int) maestra.getCedulax().length()];
            InputStream input = new FileInputStream(maestra.getCedulax());
            input.read(pdf);
             pst.setBytes(5,pdf);
            //------------------------
               byte[] pdfservicio = new byte[(int) maestra.getTitulox().length()];
            InputStream inputservicio = new FileInputStream(maestra.getTitulox());
            inputservicio.read(pdfservicio);
             pst.setBytes(6,pdfservicio);
             //--------------
             
             pst.setInt(7, maestra.getUsuario_id());
            
           
            Integer n = pst.executeUpdate();
            if (n != 0) {
                System.out.println("Guardado de la maestra exitoso ");
                return true;
                
                
            } else {
                return false;
            }

        } catch (Exception e) {
            
             System.out.println(""+e);
            return false;
        }

    }
   
    
     public ArrayList consulta_PersonalizadaIDMAESTRA() {
          ArrayList<Object> registro = new ArrayList<Object>();
        sSQL = "select id,nombre,apellido from maestra ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
          

            while (rs.next()) {
                
              
              registro.add(rs.getObject("id"));
              
              
            }
           
            
           return registro;
        } catch (Exception e) {
            
            System.out.println("mori buscando tu registro en maestra personalizada");
            return null;
          
        }
    }
     public JTable consulta_Personalizada(int buscar,JTable tabla) {
          
        String rutaFoto = "/imagenes/pdf1.png";
        ImageIcon icono = new ImageIcon(getClass().getResource(rutaFoto));
        
      tabla.setDefaultRenderer(Object.class, new TablaImagen());
        DefaultTableModel dt = new DefaultTableModel();
        
      
        String[] titulos = {"id","nombre","apellido"};
        Object[] registro = new Object[4];
        
        
        

        dt.addColumn("id");
        dt.addColumn("nombre");
        dt.addColumn("apellido");
       
        sSQL = "select id,nombre,apellido from maestra where id= '"+buscar+"' ";

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
     
     public JTable consulta_general(JTable tabla) {
           String rutaFoto = "/imagenes/pdf1.png";
        ImageIcon icono = new ImageIcon(getClass().getResource(rutaFoto));
      
        DefaultTableModel dt = new DefaultTableModel();
       
        String[] titulos = {"id","nombre","apellido"};
        Object[] registro = new Object[3];
        
        tabla.setDefaultRenderer(Object.class, new TablaImagen());
        //tabla.setCellEditor((TableCellEditor) this);

        dt.addColumn("id");
        dt.addColumn("nombre");
        dt.addColumn("apellido");
       
        sSQL = "select * from maestra ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
             tabla.setDefaultRenderer(Object.class, new TablaImagen());

            while (rs.next()) {
                
               //(rs.getString("idCliente"));
               registro[0]= rs.getObject("id");
               registro[1]= rs.getObject("nombre");
               registro[2]= rs.getObject("apellido");
              
       
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
     
      public ArrayList consultaMaestra(int seleccionado) {
          ArrayList<Object> registro = new ArrayList<Object>();
        sSQL = "select id,nombre,apellido from maestra where maestra.id='"+seleccionado+"'  ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
        
              registro.add(rs.getObject("id"));
              registro.add(rs.getObject("nombre"));
              registro.add(rs.getObject("apellido"));
            }   
            
           return registro;
        } catch (Exception e) {
            
            System.out.println("mori buscando tu registro de consulta maestra");
            return null;
          
        }
    }
      
    public ArrayList consultaporIDuser(int iduser){
          ArrayList<Object> registro = new ArrayList<Object>();
        sSQL = "select id from maestra where maestra.id='"+iduser+"' ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
          

            while (rs.next()) {
                
              
              registro.add(rs.getObject("id"));
              
              
            }
           
            
           return registro;
        } catch (Exception e) {
            
            System.out.println("mori buscando tu registro en maestra por IDUSER");
            return null;
          
        }
    } 
    public ArrayList consultaparareporte(int id){
          ArrayList<Object> registro = new ArrayList<Object>();
        sSQL = "select count(*) from maestra as maes inner join maestra_niños as mn on maes.id=mn.maestra\n" +
                "inner join niños as niños on mn.niños=niños.id where maes.id='"+id+"' ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
          

            while (rs.next()) {
                
              
              registro.add(rs.getObject("count(*)"));
              
              
            }
           
            
           return registro;
        } catch (Exception e) {
            
            System.out.println("mori en consultaparareporte");
            return null;
          
        }
    } 
    
    public ArrayList consultaparareporte_Niños(int id){
          ArrayList<Object> registro = new ArrayList<Object>();
        sSQL = "select niños.id from maestra as maes inner join maestra_niños as mn on maes.id=mn.maestra\n" +
                "inner join niños as niños on mn.niños=niños.id where maes.id='"+id+"' ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
          

            while (rs.next()) {
                
              
              registro.add(rs.getObject("niños.id"));
              
              
            }
           
            
           return registro;
        } catch (Exception e) {
            
            System.out.println("mori en consultaparareporte_Niños");
            return null;
          
        }
    } 
     
      public ArrayList consulta_PersonalizadaIDMAESTRA(String seleccion) {
          ArrayList<Object> registro = new ArrayList<Object>();
        sSQL = "select id,nombre,apellido from maestra  where id='"+seleccion+"'";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
          

            while (rs.next()) {
                
              
              registro.add(rs.getObject("id"));
              registro.add(rs.getObject("nombre"));
              registro.add(rs.getObject("apellido"));
              
              
            }
           
            
           return registro;
        } catch (Exception e) {
            
            System.out.println("mori buscando tu registro en maestra personalizada");
            return null;
          
        }
    }
      
      
      public boolean registrarmaestrasconniños(int niños,int maestras){
           sSQL = "insert into maestra_niños (niños,maestra)"
                + "values (?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, niños);
             pst.setInt(2, maestras);
           
            Integer n = pst.executeUpdate();
            if (n != 0) {
                System.out.println("Guardado exitoso en tabla maestra_niños ");
                return true;
                
                
            } else {
                return false;
            }

        } catch (Exception e) {
            
             System.out.println("Explotaste en guardarRepresante_niños"+e);
            return false;
        }
          
        
      }
}
