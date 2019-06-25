package Controlador;


import otros.TablaImagen;
import otros.Conexion;
import Modelo.Cliente;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;


public class FCliente {
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private Cliente cliente;
     //persona = new class_persona(cedula,nombre,apellido,foto);
    public FCliente() {
        
    }
    public FCliente(Integer ID,File fotox,File pdfx) {
        cliente = new Cliente(ID, fotox, pdfx);
    }
    
    public FCliente(int id){
        cliente = new Cliente(id);
    }
    
   
      public boolean insertar(Cliente cliente,File file,File rutaPdf) {
        sSQL = "insert into cliente (idCliente,foto,pdf)"
                + "values (?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, cliente.getIdCliente());
           
           
            FileInputStream archivo;     
            archivo = new FileInputStream(file);
     
            pst.setBinaryStream(2, archivo);
            
            //-------------------
           byte[] pdf = new byte[(int) rutaPdf.length()];
            InputStream input = new FileInputStream(rutaPdf);
            input.read(pdf);
          
             pst.setBytes(3,pdf);
            //------------------------
         
           
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
         public boolean guardar() {
        sSQL = "insert into cliente (idCliente,foto,pdf)"
                + "values (?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, cliente.getIdCliente());
           
           
            FileInputStream archivo;     
            archivo = new FileInputStream(cliente.getFotox());
     
            pst.setBinaryStream(2, archivo);
            
            //-------------------
           byte[] pdf = new byte[(int) cliente.getPdfx().length()];
            InputStream input = new FileInputStream(cliente.getPdfx());
            input.read(pdf);
          
             pst.setBytes(3,pdf);
            //------------------------
         
           
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
      
    /* public  ArrayList consultar(String buscar) {
         ArrayList<Cliente> registro = new ArrayList<Cliente>();
     
          // sSQL = "select * from cliente where Cedula like '%" + buscar + "%' order by Nombre";
          //id = ' " +id+ " ' "
          //select * from cliente where idcliente='1';
          //Placa=Placa
         
          
      sSQL = "select * from cliente where idCliente=  '" + buscar + "'    ";
        try {
            
            Statement st = cn.createStatement();
            
            ResultSet rs = st.executeQuery(sSQL);
            
                   

            while (rs.next()) {
                Cliente cliente = new Cliente();
              
            
                    
              cliente.setIdCliente(Integer.parseInt(rs.getString("idCliente")));
              cliente.setRuta(rs.getString("ruta"));
                  
               
               Image I=null;
               Blob blob= rs.getBlob("foto");
               I = javax.imageio.ImageIO.read(blob.getBinaryStream());
               ImageIcon image = new ImageIcon(I);
               cliente.setFoto((Blob) image);
               registro.add(cliente);

            }
            return registro;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
      
      
    }
      */
     
      
      //DEFAULTABLEMODEL
      public JTable consulta_Personalizada(String buscar,JTable tabla) {
          
        String rutaFoto = "/imagenes/pdf1.png";
        ImageIcon icono = new ImageIcon(getClass().getResource(rutaFoto));
        
      tabla.setDefaultRenderer(Object.class, new TablaImagen());
        DefaultTableModel dt = new DefaultTableModel();
        
      
        String[] titulos = {"ID","Foto","PDF"};
        Object[] registro = new Object[3];
        
        
        

        dt.addColumn("idCliente");
        dt.addColumn("foto");
        dt.addColumn("pdf");
        sSQL = "select idCliente,foto from cliente where idCliente= '"+buscar+"' ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
             tabla.setDefaultRenderer(Object.class, new TablaImagen());

            while (rs.next()) {
                
               //(rs.getString("idCliente"));
               registro[0]= rs.getObject("idCliente");
              
                                      
               Image I= null;
               Blob blob= rs.getBlob("foto");
               I = javax.imageio.ImageIO.read(blob.getBinaryStream());
               I = I.getScaledInstance(150, 150, Image.SCALE_DEFAULT);
               ImageIcon image = new ImageIcon(I);
               
               /*  Image foto = getToolkit().getImage(T_Ruta.getText());
             foto = foto.getScaledInstance(150, 150, 0);*/
              
               registro[1]= new JLabel(image);
               registro[2] = new JButton (icono);
       
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
      public JTable consulta_general(JTable tabla) {
           String rutaFoto = "/imagenes/pdf1.png";
        ImageIcon icono = new ImageIcon(getClass().getResource(rutaFoto));
      
        DefaultTableModel dt = new DefaultTableModel();
       
        String[] titulos = {"idCliente","Foto","PDF"};
        Object[] registro = new Object[4];
        
        tabla.setDefaultRenderer(Object.class, new TablaImagen());
        //tabla.setCellEditor((TableCellEditor) this);

        dt.addColumn("ID");
        dt.addColumn("Foto");
        dt.addColumn("PDF");
        sSQL = "select * from cliente ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
             tabla.setDefaultRenderer(Object.class, new TablaImagen());

            while (rs.next()) {
                
               //(rs.getString("idCliente"));
               registro[0]= rs.getObject("idCliente");
             
                                      
               Image I= null;
               Blob blob= rs.getBlob("foto");
               I = javax.imageio.ImageIO.read(blob.getBinaryStream());
               I = I.getScaledInstance(150, 150, Image.SCALE_DEFAULT);
               ImageIcon image = new ImageIcon(I);
               
               /*  Image foto = getToolkit().getImage(T_Ruta.getText());
             foto = foto.getScaledInstance(150, 150, 0);*/
              
               registro[1]= new JLabel(image);
               registro[2] = new JButton (icono);
              
       
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
      
  
      
      
       public boolean editarFoto(int texto,File file) {
        
      sSQL = "update cliente set foto=? "
              + "where idCliente='"+texto+"'";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            FileInputStream archivo;
         
           archivo = new FileInputStream(file);

            pst.setBinaryStream(1, archivo);
        
            int n = pst.executeUpdate();
            if (n != 0) {
                
                return true;
            } else {
                 
                return false;
            }

        } catch (Exception e) {
             System.out.println("catch");
            System.out.println(e);
            return false;
        }

    }
       
       
    public boolean editarPDF(int texto,File rutaPDF){
        
        //update cliente set idCliente='10' where idCliente='5';
          sSQL = "update cliente set pdf=? "
              + "where idCliente='"+texto+"'";
        try {
            
            PreparedStatement pst = cn.prepareStatement(sSQL);
  
           /*pst.setInt(1, datos.getIdCliente());

             FileInputStream archivo;
         
           archivo = new FileInputStream(file);

            pst.setBinaryStream(2, archivo);
            */
            //--------
           
            byte[] pdf = new byte[(int) rutaPDF.length()];

            InputStream input = new FileInputStream(rutaPDF);
             
            input.read(pdf);
  
             pst.setBytes(1,pdf);
            //----------------------
      
           
            int n = pst.executeUpdate();
            if (n != 0) {
                  System.out.println("TRUE");
                return true;
              
            } else {
                   System.out.println("FALSE");
                return false;
            }

        } catch (Exception e) {
             System.out.println("catch");
            System.out.println("Aca estas"+e);
            return false;
        }
        
        
       
        
    }   
      
       
        public boolean eliminar(int texto) {
        // eliminar por cedula
            
        sSQL = "delete from cliente where idCliente=? ";
           
        try {
            
            PreparedStatement pst = cn.prepareStatement(sSQL);
        
            pst.setInt(1,texto);

            //resultado de la ejecucion del statement
            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }
      
      
        
        public boolean ejecutar_ArchivoPDF(int ID){
            ResultSet rs = null;
         
            
            byte[] bytes = null;
            sSQL = "select pdf from cliente where idCliente=?;";
            try{
         
               PreparedStatement pst = cn.prepareStatement(sSQL);
                  
               pst.setInt(1, ID);
                
               rs = pst.executeQuery();
                 
               while(rs.next()){
                   bytes = rs.getBytes(1);
                      
               }
              
             
               
               InputStream bos = new ByteArrayInputStream(bytes);
               int LargoInput = bos.available();
               
               byte[] datosPDF = new byte[LargoInput];
               bos.read(datosPDF, 0, LargoInput);
               
               OutputStream out = new FileOutputStream("new.pdf");
               out.write(datosPDF);
               
              
               //-------------
               out.close();
               bos.close();
               rs.close();
               return true;
            }catch(Exception e){
                System.out.println("Error al abrir PDF: "+e);
                return false;
            }
            
        }
        
        
        
      
      
}


/* public FCliente(Integer ID){
        this.cliente.setIdCliente(ID);
    }*/
    
    
    //ArrayList<Object> registro = new ArrayList<Object>();
    
                    ///-------------------------------FILE RUTAPDF
/*
Blob blob = rs.getBlob(3);
               byte[] data = blob.getBytes(1, (int)blob.length());
               BufferedImage img = null;
               try{
                   img = ImageIO.read(new ByteArrayInputStream(data));
               }catch(Exception e){
                   System.out.println("aca");  
               }
                       ImageIcon icono = new ImageIcon(img);
                       registro[2]= new JLabel(icono);

*/

