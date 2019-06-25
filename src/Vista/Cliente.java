package Vista;


import Controlador.FCliente;
import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class Cliente extends javax.swing.JFrame {
  private FileInputStream fis;
  private int longitudBytes;
  private File direccionDearchivo = null;
  private File direccionDePdf = null;

    public Cliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.dispose();
        this.setTitle("Proyecto");
        this.setResizable(false);
        mostrar_general(Tablaso);
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Btn_Guardar = new javax.swing.JButton();
        Btn_Consultar = new javax.swing.JButton();
        Lbl_foto = new javax.swing.JLabel();
        T_ID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablaso = new javax.swing.JTable();
        Btn_Modificar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Btn_Pdf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Btn_Guardar.setText("Guardar");
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });

        Btn_Consultar.setText("Consultar");
        Btn_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ConsultarActionPerformed(evt);
            }
        });

        Lbl_foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Lbl_foto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_fotoMouseClicked(evt);
            }
        });

        Tablaso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tablaso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablasoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tablaso);

        Btn_Modificar.setText("Modificar");
        Btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ModificarActionPerformed(evt);
            }
        });

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Limpiar Campos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Btn_Pdf.setText("PDF");
        Btn_Pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(T_ID))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Btn_Consultar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Btn_Modificar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Btn_Pdf)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(T_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn_Guardar)
                            .addComponent(Btn_Consultar))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn_Modificar)
                            .addComponent(jButton1)
                            .addComponent(Btn_Pdf))))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void busquedaImage(){
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG & PNG", "jpg", "png");
        
       
        
         JFileChooser archivo = new JFileChooser();
          archivo.setFileFilter(filtro);
         int ventana = archivo.showOpenDialog(null);
         
         if ( ventana == JFileChooser.APPROVE_OPTION){
             File file = archivo.getSelectedFile();
             //T_Ruta.setText(String.valueOf(file));
             System.out.println(""+file);
             direccionDearchivo = file;
             Image foto = getToolkit().getImage(""+direccionDearchivo);
             foto = foto.getScaledInstance(150, 150, foto.SCALE_DEFAULT);
             Lbl_foto.setIcon(new ImageIcon (foto));
             
         }
         else{
             System.out.println("Sin imagen");
         }
         
    
    }/* void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            FCliente func = new FCliente();
            modelo = func.mostrar(buscar);
            Tabla_listado.setModel(modelo);
            jLabel_totalregistros.setText("Total Registros: " + Integer.toString(func.totalregistros));

        } catch (Exception e) {
            System.out.println(e);

        }
    }*/
    void mostrar(String buscar,JTable tabla) {
        try {
          //  ArrayList<Object> modelo = new ArrayList<Object>();
           DefaultTableModel modelo = new DefaultTableModel();
            FCliente func = new FCliente();
            
            Tablaso = func.consulta_Personalizada(buscar, Tablaso);
 
        } catch (Exception e) {
            
            System.out.println("aca");
            System.out.println(e);

        }
    }
    
    public void mostrar_general(JTable tabla){
        try{
             DefaultTableModel modelo = new DefaultTableModel();
         FCliente fcliente = new FCliente();
         Tablaso = fcliente.consulta_general(Tablaso);  
        }catch(Exception e){
            System.out.println(""+e);
            
        }
    
    }
    
    public void limpiar_pantalla(){
        Lbl_foto.setIcon(null);
       
        T_ID.setText("");
        
    }
    
    public void buscar_pdf(){
          JFileChooser filechooser = new JFileChooser();
       FileNameExtensionFilter filtro = new FileNameExtensionFilter("pdf", "pdf");
       filechooser.setFileFilter(filtro);
       
        int ventana = filechooser.showOpenDialog(this);
         
         if ( ventana == 0){
              File file =  filechooser.getSelectedFile();
             direccionDePdf = file;
          
           
         }else{
             System.out.println("No selecciono archivo PDF");
            
         }
    }
    
    
    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
       
        FCliente fcliente = new FCliente(Integer.parseInt(T_ID.getText()),direccionDearchivo,direccionDePdf);

      System.out.println(""+direccionDePdf);
      
     
        fcliente.guardar();
      

        mostrar_general(Tablaso);
         limpiar_pantalla();
        
        
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Btn_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ConsultarActionPerformed

      
        //mostrar(T_ID.getText());
        mostrar(T_ID.getText(),Tablaso);
      
    }//GEN-LAST:event_Btn_ConsultarActionPerformed

    private void Lbl_fotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_fotoMouseClicked
       busquedaImage();
    }//GEN-LAST:event_Lbl_fotoMouseClicked

    private void TablasoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablasoMouseClicked
     //donde hice click en la tabla
        int fila = Tablaso.rowAtPoint(evt.getPoint());
//------------------------------------
        FCliente fcliente = new FCliente();
        
        T_ID.setText(Tablaso.getValueAt(fila, 0).toString());

        JLabel label =((JLabel) Tablaso.getValueAt(fila, 1));
        Lbl_foto.setIcon(label.getIcon());
        
        //--
        int column = Tablaso.getColumnModel().getColumnIndexAtX(evt.getX());
        int row =evt.getY() / Tablaso.getRowHeight();
        
       // System.out.println("colum: "+column);
       // System.out.println("row: "+row);
        //--------
        
        if(column==2){
            //Para abrir PDF
            //System.out.println("Estas pisando el boton");
             int id = (int) Tablaso.getValueAt(fila, 0);

            //--AL BOTON
            Object value = Tablaso.getValueAt(fila, 2);

            //fcliente.ejecutar_ArchivoPDF(id);

            if(value instanceof JButton){
                ((JButton) value).doClick();
                JButton boton = (JButton) value;
               
                //-- a ejecutar archivo
                //CUADNO SE PRESIONA EL BOTON
                if(boton.getText().equals("vacio")){
                    JOptionPane.showMessageDialog(null, "No hay archivo que mostrar");
            
                }else{
                    fcliente.ejecutar_ArchivoPDF(id);
                 

                   try {
                         Desktop.getDesktop().open(new File("new.pdf"));
                     } catch (IOException ex) {
                        System.out.println(""+ex);
                     }
                }
                    
            }
              

            
            
        }
        
        
         mostrar_general(Tablaso);
         this.pack();
         this.revalidate();
         
        
    }//GEN-LAST:event_TablasoMouseClicked

    private void Btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ModificarActionPerformed
        
    //Cliente cliente = new Cliente();
          
    FCliente fcliente = new FCliente(Integer.parseInt(T_ID.getText()));
      
   // cliente.setIdCliente(Integer.parseInt(T_ID.getText()));
   
 
             
            if(fcliente.editarPDF(Integer.parseInt(T_ID.getText()),direccionDePdf))
                System.out.println("PDF modificado");
            else
            fcliente.editarFoto(Integer.parseInt(T_ID.getText()), direccionDearchivo);
               
            
    System.out.println("foto modificada");     
    mostrar_general(Tablaso);
        
   
       
      
        
    }//GEN-LAST:event_Btn_ModificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      if (!T_ID.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Eliminar Cliente ?", "Confimar", 2);
            if (confirmacion == 0) {
                //Cliente cliente = new Cliente();
                FCliente fcliente = new FCliente();
          
                //cliente.setIdCliente(Integer.parseInt(T_ID.getText()));
                fcliente.eliminar(Integer.parseInt(T_ID.getText()));
                
                mostrar_general(Tablaso);
                limpiar_pantalla();

            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       limpiar_pantalla();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Btn_PdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PdfActionPerformed
     buscar_pdf();
       
    }//GEN-LAST:event_Btn_PdfActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Consultar;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Modificar;
    private javax.swing.JButton Btn_Pdf;
    private javax.swing.JLabel Lbl_foto;
    public javax.swing.JTextField T_ID;
    private javax.swing.JTable Tablaso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
