package Controlador;


import Modelo.Usuario;
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


public class FUsuario {
    private Usuario user;
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    
    
    public FUsuario(String usuario,String password,String correo, File fotoAvatar, int id_tipo){
        
        user = new Usuario(usuario,password,correo, fotoAvatar, id_tipo);
    }
    public FUsuario(){
        
    }
    
    
    
     public ArrayList consulta_TipoUsuario( ) {
       
       
       ArrayList<Object> registro = new ArrayList<Object>();

        sSQL = "SELECT tipo_user.nombre FROM usuario  INNER JOIN tipo_user   where tipo_user.id=usuario.id_tipo;";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro.add(rs.getObject("tipo_user.nombre"));

            }
           
            
           return registro;
        } catch (Exception e) {
            
            System.out.println("consultado tipos de usuarios");
            return null;
          
        }
    }
     //ArrayList<Object> registro = new ArrayList<Object>();
    public ArrayList consultaID(){
         ArrayList<Object> iduser = new ArrayList<Object>();

        sSQL = "SELECT usuario.idusuario from usuario where usuario.idtipo_user='3'";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                iduser.add(rs.getInt("usuario.idusuario"));

            }
           
            
           return iduser;
        } catch (Exception e) {
            
            System.out.println("consultando usuarios registrados para la seleccion del representante");
            return null;
          
        }
    }
     public ArrayList consultaIDMaestras(){
         ArrayList<Object> iduser = new ArrayList<Object>();

        sSQL = "SELECT usuario.idusuario from usuario where usuario.idtipo_user='2'";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                iduser.add(rs.getInt("usuario.idusuario"));

            }
           
            
           return iduser;
        } catch (Exception e) {
            
            System.out.println("consultando usuarios para maestras");
            return null;
          
        }
    }
    
      public String consultaID(String ID){
         String cadena="";

        sSQL = "SELECT usuario.usuario from usuario where usuario.idusuario='"+ID+"'";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                cadena= rs.getString("usuario.usuario");
              
            }
           
            System.out.println(""+cadena);
           return cadena;
        } catch (Exception e) {
            
            System.out.println("consultando usuarios ID al combobox");
            return null;
          
        }
    }
    
    
     
      public boolean guardar() {
        sSQL = "insert into usuario (usuario,password,correo,idtipo_user,avatar)"
                + "values (?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, user.getUsuario());
             pst.setString(2, user.getPassword());
              pst.setString(3, user.getCorreo());
               pst.setInt(4, user.getId_tipo());
           
           
            FileInputStream archivo;     
            archivo = new FileInputStream(user.getFotoAvatar());
            pst.setBinaryStream(5, archivo);
           
         
           
            Integer n = pst.executeUpdate();
            if (n != 0) {
                System.out.println("Guardado exitoso con foto en USER ");
                return true;
                
                
            } else {
                return false;
            }

        } catch (Exception e) {
            
             System.out.println(""+e);
            return false;
        }

    }
      
     public ArrayList consultaUsuarioRegistrado(String user,String password) {
      
        ArrayList<Object> registro = new ArrayList<Object>();

       //select u.usuario,u.password,tu.nombre from usuario as u inner join tipo_user as tu where u.idtipo_user=tu.idtipo_user AND u.usuario='papi' AND u.password='papi';
        sSQL = "select u.usuario,u.password,tu.nombre from usuario as u inner join tipo_user as tu where "
                + "u.idtipo_user=tu.idtipo_user AND u.usuario='"+user+"' AND u.password='"+password+"';";
               
        
        try {
              
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
            
               registro.add(rs.getObject("u.usuario"));
               registro.add(rs.getObject("u.password"));
               registro.add(rs.getObject("tu.nombre"));
            }
            
           return registro;
        } catch (Exception e) {
            
            System.out.println("Buscando user registrado");
            return null;
          
        }
    } 
     
     public ArrayList consultaUserID( ) {
       
       
       ArrayList<Object> registro = new ArrayList<Object>();

        sSQL = "select idusuario from usuario;";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro.add(rs.getObject("idusuario"));

            }
           
            
           return registro;
        } catch (Exception e) {
            
            System.out.println("error en consultaUserID");
            return null;
          
        }
    }
    
     
     
     
}
