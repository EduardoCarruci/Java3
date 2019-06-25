
package Controlador;

import Modelo.Cliente;
import Modelo.Niños;
import Vista.VNiños;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import otros.Conexion;
import otros.TablaImagen;




public class FNiños {
     private Niños niños;
     private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    
    
    
    public FNiños(
    String nombre,
    String apellido,
    int edad,
    Date fecha_nacimiento,
    String direccion,
    File fotoNiño,
    File Foto_Familiar,
    File Partida_Nacimiento,
    File ServicioFile,
    File Vacunasfile,
    File Informe_Medico,
    int nivel_aprendizaje){
        niños = new Niños(nombre,apellido,edad,fecha_nacimiento,direccion,fotoNiño,Foto_Familiar,Partida_Nacimiento,ServicioFile,Vacunasfile,Informe_Medico,nivel_aprendizaje);
    }
    
     public FNiños(
    String nombre,
    String apellido,
    int edad,
    Date fecha_nacimiento,
    String direccion,
    File fotoNiño,
    File Foto_Familiar,
    File Partida_Nacimiento,
    File ServicioFile,
    File Vacunasfile,
    int nivel_aprendizaje){
        niños = new Niños(nombre,apellido,edad,fecha_nacimiento,direccion,fotoNiño,Foto_Familiar,Partida_Nacimiento,ServicioFile,Vacunasfile,nivel_aprendizaje);
    }
     
     public FNiños(){
         
     }
    
    
    public boolean insertar() {
        sSQL = "insert into niños (nombre,apellido,edad,fecha_nacimiento,direccion,foto,foto_familiar,partida_nacimiento,servicio,vacunas,informe_medico,nivel_aprendizaje)"
                + "values (?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
           // pst.setInt(1, niños.getId());
            pst.setString(1,niños.getNombre());
            pst.setString(2,niños.getApellido());
            pst.setInt(3,niños.getEdad());
            pst.setDate(4,niños.getFecha_nacimiento());
            pst.setString(5,niños.getDireccion());
            
           
            FileInputStream archivo;     
            archivo = new FileInputStream(niños.getFotoNiño());
            pst.setBinaryStream(6, archivo);
            
            FileInputStream archivofamiliar;     
            archivofamiliar = new FileInputStream(niños.getFoto_Familiar());
            pst.setBinaryStream(7, archivofamiliar);
            
            
            
            //-------------------
           byte[] pdf = new byte[(int) niños.getPartida_Nacimiento().length()];
            InputStream input = new FileInputStream(niños.getPartida_Nacimiento());
            input.read(pdf);
             pst.setBytes(8,pdf);
            //------------------------
               byte[] pdfservicio = new byte[(int) niños.getServicioFile().length()];
            InputStream inputservicio = new FileInputStream(niños.getServicioFile());
            inputservicio.read(pdfservicio);
             pst.setBytes(9,pdfservicio);
             //--------------
              byte[] pdfvacunas = new byte[(int) niños.getVacunasfile().length()];
            InputStream inputvacunas = new FileInputStream(niños.getVacunasfile());
            inputvacunas.read(pdfvacunas);
             pst.setBytes(10,pdfvacunas);
             //---------
             byte[] pdfinforme = new byte[(int) niños.getInforme_Medico().length()];
            InputStream inputinforme = new FileInputStream(niños.getInforme_Medico());
            inputinforme.read(pdfinforme);
             pst.setBytes(11,pdfinforme);
             //-------------------------------------
             System.out.println("Nivel: "+niños.getNivel_aprendizaje());
            pst.setInt(12, niños.getNivel_aprendizaje());
         
           
            Integer n = pst.executeUpdate();
            if (n != 0) {
                System.out.println("Guardado del niño exitoso ");
                return true;
                
                
            } else {
                return false;
            }

        } catch (Exception e) {
            
             System.out.println(""+e);
            return false;
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
       
        sSQL = "select id,nombre,apellido from niños where id= '"+buscar+"' ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
             tabla.setDefaultRenderer(Object.class, new TablaImagen());

            while (rs.next()) {
                
               //(rs.getString("idCliente"));
               registro[0]= rs.getObject("id");
               registro[1]= rs.getObject("nombre");
  
                 registro[3]= rs.getObject("apellido");
       
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
       
        sSQL = "select * from niños ";

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
            
            System.out.println("no moriste consultando general niños");
            return null;
          
        }
    }
      public boolean inserInformeMedico() {
          sSQL = "insert into niños (nombre,apellido,edad,fecha_nacimiento,direccion,foto,foto_familiar,partida_nacimiento,servicio,vacunas,nivel_aprendizaje)"
                + "values (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            System.out.println("1");
            PreparedStatement pst = cn.prepareStatement(sSQL);
           // pst.setInt(1, niños.getId());
           pst.setString(1,niños.getNombre());
            pst.setString(2,niños.getApellido());
            pst.setInt(3,niños.getEdad());
            pst.setDate(4,niños.getFecha_nacimiento());
            pst.setString(5,niños.getDireccion());
            
           
            FileInputStream archivo;     
            archivo = new FileInputStream(niños.getFotoNiño());
            pst.setBinaryStream(6, archivo);
            
            FileInputStream archivofamiliar;     
            archivofamiliar = new FileInputStream(niños.getFoto_Familiar());
            pst.setBinaryStream(7, archivofamiliar);
            
            
            
            //-------------------
           byte[] pdf = new byte[(int) niños.getPartida_Nacimiento().length()];
            InputStream input = new FileInputStream(niños.getPartida_Nacimiento());
            input.read(pdf);
             pst.setBytes(8,pdf);
            //------------------------
               byte[] pdfservicio = new byte[(int) niños.getServicioFile().length()];
            InputStream inputservicio = new FileInputStream(niños.getServicioFile());
            inputservicio.read(pdfservicio);
             pst.setBytes(9,pdfservicio);
             //--------------
              byte[] pdfvacunas = new byte[(int) niños.getVacunasfile().length()];
            InputStream inputvacunas = new FileInputStream(niños.getVacunasfile());
            inputvacunas.read(pdfvacunas);
             pst.setBytes(10,pdfvacunas);
             //---------

             //-------------------------------------
             System.out.println("Nivel: "+niños.getNivel_aprendizaje());
            pst.setInt(11, niños.getNivel_aprendizaje());
         
         
           
            Integer n = pst.executeUpdate();
            if (n != 0) {
                System.out.println("Guardado del niño exitoso sin pdf informe medico");
                return true;
                
                
            } else {
                return false;
            }

        } catch (Exception e) {
            
             System.out.println(""+e);
            return false;
        }

    }
    
    public ArrayList buscarNiño(String nombre,String apellido,String direccion){
        ArrayList<Object> registro = new ArrayList<Object>();
       
        sSQL = "select id from niños where niños.nombre='"+nombre+"' and niños.apellido='"+apellido+"' and niños.direccion='"+direccion+"' ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {

               registro.add(rs.getObject("id"));

            }
           
            
           return registro;
        } catch (Exception e) {
            
            System.out.println("mori buscando tu niño xd");
            return null;
          
        }
        
       
    }
    
 
     public ArrayList consultaNiño(int seleccionado) {
          ArrayList<Object> registro = new ArrayList<Object>();
        sSQL = "select id,nombre,apellido from niños where niños.id='"+seleccionado+"'  ";

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
            
            System.out.println("mori buscando tu registro de consulta niños");
            return null;
          
        }
    }
     
     public ArrayList consulta_PersonalizadaNiño() {
          ArrayList<Object> registro = new ArrayList<Object>();
        sSQL = "select id,nombre,apellido from niños ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
          

            while (rs.next()) {
                
              
              registro.add(rs.getObject("id"));
              
              
            }
           
            
           return registro;
        } catch (Exception e) {
            
            System.out.println("mori buscando tu registro en  niños personalizada");
            return null;
          
        }
    }
    
}

