
package Controlador;

import Modelo.Representante;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import otros.Conexion;
import otros.TablaImagen;


public class FRepresentante {
    private Representante representante;
      private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    
    public FRepresentante(String nombre, String apellido, File fotox, String identificador_MA_PA, int usuario_id){
        
        representante = new Representante(nombre, apellido, fotox, identificador_MA_PA, usuario_id);
        
    }
    public FRepresentante(){
        
    }
    
    
     public boolean guardar() {
        sSQL = "insert into representante (nombre,apellido,foto,idtipo_user,identificador_MA_PA)"
                + "values (?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, representante.getNombre());
             pst.setString(2, representante.getApellido());
           
           
            FileInputStream archivo;     
            archivo = new FileInputStream(representante.getFotox());
     
            pst.setBinaryStream(3, archivo);
       
            pst.setInt(4, representante.getUsuario_id());
                 pst.setString(5, representante.getIdentificador_MA_PA());
           
         
           
            Integer n = pst.executeUpdate();
            if (n != 0) {
                System.out.println("Guardado exitoso con foto y pdf ");
                return true;
                
                
            } else {
                return false;
            }

        } catch (Exception e) {
            
             System.out.println(""+e);
            return false;
        }

    }
     
     public boolean guardarRepresante_niños(int niños,int representante) {
        sSQL = "insert into representantes_niños (niños,representante)"
                + "values (?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, niños);
             pst.setInt(2, representante);
           
            Integer n = pst.executeUpdate();
            if (n != 0) {
                System.out.println("Guardado exitoso en tabla represanten_niños ");
                return true;
                
                
            } else {
                return false;
            }

        } catch (Exception e) {
            
             System.out.println("Explotaste en guardarRepresante_niños"+e);
            return false;
        }

    }
     
      public ArrayList consulta_PersonalizadaID(String buscar) {
          ArrayList<Object> registro = new ArrayList<Object>();
        sSQL = "select id,nombre,apellido from representante where id='"+buscar+"' ";

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
            
            System.out.println("mori buscando tu registro en representante");
            return null;
          
        }
    }
      
      public ArrayList consultaComboBox(){
          ArrayList<Object> registro = new ArrayList<Object>();
          //select repre.id,repre.nombre from representante as repre inner join usuario as user on repre.idtipo_user=user.idusuario where user.idtipo_user='3';
            sSQL = "select user.idusuario from representante as repre inner join usuario as user on repre.idtipo_user=user.idusuario where user.idtipo_user='3';";
              
             try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
          
  
            while (rs.next()) {
                
             
              
              registro.add(rs.getString("user.idusuario"));
                
              
              
            }
                 
           return registro;
        } catch (Exception e) {
            
            System.out.println(" "+e);
            return null;
          
        }
          
          
      }
       
      public ArrayList consulta_Cedula(String buscar) {
          ArrayList<Object> registro = new ArrayList<Object>();
          //select * from representante as repre inner join usuario as user on user.idusuario=repre.idtipo_user;
          // sSQL = "select u.usuario,r.id,r.nombre,r.apellido from usuario as u inner join representante as r where u.usuario='"+buscar+"' ";
          
          
          //select * from representante as repre inner join usuario as useron user.idusuario=repre.idtipo_user where user.usuario='jhonexi';
        sSQL = "select user.usuario,repre.id,repre.nombre,repre.apellido from representante as repre inner join usuario as "
                + "user on user.idusuario=repre.idtipo_user where user.usuario='"+buscar+"' ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
          

            while (rs.next()) {

               registro.add(rs.getObject("repre.id"));
               registro.add(rs.getObject("repre.nombre"));
               registro.add(rs.getObject("repre.apellido"));
               
                
              
            }
           
            
           return registro;
        } catch (Exception e) {
            
            System.out.println("mori buscando tu registro en representante");
            return null;
          
        }
    }
      
    public ArrayList consulta_idtipo_user(String buscar){
          ArrayList<Object> registro = new ArrayList<Object>();
        sSQL = "select id,nombre,apellido from representante where idtipo_user='"+buscar+"' ";

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
            
            System.out.println("mori buscando tu registro en representante");
            return null;
          
        }
        
    }  
     public ArrayList consultaID(int buscar){
          ArrayList<Object> registro = new ArrayList<Object>();
        sSQL = "select id,nombre,apellido from representante where idtipo_user='"+buscar+"' ";

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
            
            System.out.println("mori buscando tu registro en representante");
            return null;
          
        }
        
    }  
      
  
}
