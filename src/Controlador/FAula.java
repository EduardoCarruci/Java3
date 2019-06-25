
package Controlador;

import Modelo.Aula;
import java.awt.Image;

import java.io.File;
import java.io.FileInputStream;
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


public class FAula {
    
    private Aula aula;
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    
    public FAula(String nombre, File fotox, int capacidad){
        aula = new Aula(nombre, fotox, capacidad);
    }
    
    public FAula(){
        
    }
    
    public boolean guardar() {
        sSQL = "insert into aula (nombre,foto,capacidad)"
                + "values (?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, aula.getNombre());

            FileInputStream archivo;     
            archivo = new FileInputStream(aula.getFotox());
     
            pst.setBinaryStream(2, archivo);
       
            pst.setInt(3, aula.getCapacidad());
            

            Integer n = pst.executeUpdate();
            if (n != 0) {
                System.out.println("Guardado exitoso en aula ");
                return true;
      
            } else {
                return false;
            }

        } catch (Exception e) {
            
             System.out.println(" "+e);
            return false;
        }

    }
    
    public JTable consulta_general(JTable tabla) {
           String rutaFoto = "/imagenes/pdf1.png";
        ImageIcon icono = new ImageIcon(getClass().getResource(rutaFoto));
      
        DefaultTableModel dt = new DefaultTableModel();
       
        String[] titulos = {"id","nombre","foto","capacidad"};
        Object[] registro = new Object[4];
        
        tabla.setDefaultRenderer(Object.class, new TablaImagen());
        //tabla.setCellEditor((TableCellEditor) this);

        dt.addColumn("id");
        dt.addColumn("nombre");
        dt.addColumn("foto");
        dt.addColumn("capacidad");
        sSQL = "select * from aula ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
             tabla.setDefaultRenderer(Object.class, new TablaImagen());

            while (rs.next()) {
                
               //(rs.getString("idCliente"));
               registro[0]= rs.getObject("id");
               registro[1]= rs.getObject("nombre");
             
                                      
               Image I= null;
               Blob blob= rs.getBlob("foto");
               I = javax.imageio.ImageIO.read(blob.getBinaryStream());
               I = I.getScaledInstance(150, 150, Image.SCALE_DEFAULT);
               ImageIcon image = new ImageIcon(I);
           
              
               registro[2]= new JLabel(image);
               registro[3]= rs.getObject("capacidad");
              
       
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
     public JTable consulta_Personalizada(int buscar,JTable tabla) {
          
        String rutaFoto = "/imagenes/pdf1.png";
        ImageIcon icono = new ImageIcon(getClass().getResource(rutaFoto));
        
      tabla.setDefaultRenderer(Object.class, new TablaImagen());
        DefaultTableModel dt = new DefaultTableModel();
        
      
        String[] titulos = {"id","nombre","foto","capacidad"};
        Object[] registro = new Object[4];
        
        
        

        dt.addColumn("id");
        dt.addColumn("nombre");
        dt.addColumn("foto");
        dt.addColumn("capacidad");
        sSQL = "select id,nombre,foto,capacidad from aula where id= '"+buscar+"' ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
             tabla.setDefaultRenderer(Object.class, new TablaImagen());

            while (rs.next()) {
                
               //(rs.getString("idCliente"));
               registro[0]= rs.getObject("id");
               registro[1]= rs.getObject("nombre");
              
                                      
               Image I= null;
               Blob blob= rs.getBlob("foto");
               I = javax.imageio.ImageIO.read(blob.getBinaryStream());
               I = I.getScaledInstance(150, 150, Image.SCALE_DEFAULT);
               ImageIcon image = new ImageIcon(I);
               
               /*  Image foto = getToolkit().getImage(T_Ruta.getText());
             foto = foto.getScaledInstance(150, 150, 0);*/
              
               registro[2]= new JLabel(image);
                 registro[3]= rs.getObject("capacidad");
       
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
    
    
       public ArrayList buscarAula(String nombre,int capacidad){
        ArrayList<Object> registro = new ArrayList<Object>();
       
        sSQL = "select id from aula where aula.nombre='"+nombre+"' and aula.capacidad='"+capacidad+"' ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {

               registro.add(rs.getObject("id"));

            }
           
            
           return registro;
        } catch (Exception e) {
            
            System.out.println("mori buscando tu aula registrada xd");
            return null;
          
        }
        
       
    }
       
       
     public boolean guardarmaestra_aula(int maestra,int aula) {
        sSQL = "insert into maestra_aula (maestra,aula)"
                + "values (?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, maestra);
             pst.setInt(2, aula);
           
            Integer n = pst.executeUpdate();
            if (n != 0) {
                System.out.println("Guardado exitoso en tabla maestra_aula ");
                return true;
                
                
            } else {
                return false;
            }

        } catch (Exception e) {
            
             System.out.println("Explotaste en guardarmaestra_aula"+e);
            return false;
        }

    }
    
     public ArrayList consultaAulas() {
          ArrayList<Object> registro = new ArrayList<Object>();
        sSQL = "select id from aula ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

              registro.add(rs.getObject("id"));
              
              
            }
           
            
           return registro;
        } catch (Exception e) {
            
            System.out.println("mori buscando tu registro de consultaAulas");
            return null;
          
        }
    }
    
}
