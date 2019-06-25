/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.FMaestra;
import Controlador.FUsuario;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class VMaestra extends javax.swing.JFrame {
  private File direccionFot = null;
  private File direccionCI = null;
  private File direccionTitulo = null;
    public VMaestra() {
        initComponents();
        
             this.setTitle("Kinder Fer-Ed");
        this.setResizable(false);
          this.setLocationRelativeTo(null);
          try{
              iniciarComboBox();
          }catch(Exception e){
              System.out.println("No hay registros");   
          }
          
           asignarImagen();
           Txt.setEditable(false);
    }

    public void asignarImagen(){
       ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/icono.png"));
       Image img = imagen.getImage();
       Image nuevaImagen = img.getScaledInstance(128, 128,Image.SCALE_DEFAULT);
       ImageIcon image = new ImageIcon(nuevaImagen);
       Lbl_logo.setIcon(image);
    }
    public void busquedaImageFoto(){
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG & PNG", "jpg", "png");
        
       
        
         JFileChooser archivo = new JFileChooser();
          archivo.setFileFilter(filtro);
         int ventana = archivo.showOpenDialog(null);
         
         if ( ventana == JFileChooser.APPROVE_OPTION){
             File file = archivo.getSelectedFile();
             //T_Ruta.setText(String.valueOf(file));
             System.out.println(""+file);
             direccionFot = file;
             Image foto = getToolkit().getImage(""+direccionFot);
             foto = foto.getScaledInstance(170, 170, foto.SCALE_DEFAULT);
             Lbb_FotoPersonal.setIcon(new ImageIcon (foto));
             
         }
         else{
             System.out.println("Sin imagen en foto niño");
         }
         
    
    }
     public void buscar_pdfTITULO(){
          JFileChooser filechooser = new JFileChooser();
       FileNameExtensionFilter filtro = new FileNameExtensionFilter("pdf", "pdf");
       filechooser.setFileFilter(filtro);
       
        int ventana = filechooser.showOpenDialog(this);
         
         if ( ventana == 0){
              File file =  filechooser.getSelectedFile();
             direccionTitulo = file;
          
           
         }else{
             System.out.println("No selecciono archivo tITULO");
            
         }
    }
     public void buscar_pdfCI(){
          JFileChooser filechooser = new JFileChooser();
       FileNameExtensionFilter filtro = new FileNameExtensionFilter("pdf", "pdf");
       filechooser.setFileFilter(filtro);
       
        int ventana = filechooser.showOpenDialog(this);
         
         if ( ventana == 0){
              File file =  filechooser.getSelectedFile();
             direccionCI = file;
          
           
         }else{
             System.out.println("No selecciono archivo CI");
            
         }
    }
     
     public int comprobarEstadoFileCI(){
         int bandera = 1 ;
         if(!direccionCI.equals("") ){
             System.out.println("CARGADOS PDF CI");
             bandera = 1;
             
         }
         
         else 
             bandera=0;
 
         return bandera;
     }
     public int comprobarEstadoFileTitulo(){
         int bandera =1;
         if(!direccionTitulo.equals("")){
                 System.out.println("CARGADOS PDF Titulo");
                 bandera = 1;
         }else bandera=0;
         return bandera;
     
     }
      
    public void iniciarComboBox(){
        ArrayList<Object> iduser = new ArrayList<>();
        FUsuario fusuario = new FUsuario();
        iduser = fusuario.consultaIDMaestras();
      
         for (int i = 0; i < iduser.size(); i++) {
               ComboUser.addItem(String.valueOf(iduser.get(i))); 
         }
        
        
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Lbl_logo = new javax.swing.JLabel();
        T_Nombre = new javax.swing.JTextField();
        Lbl_Ficha = new javax.swing.JLabel();
        Lbl_Ficha4 = new javax.swing.JLabel();
        T_Apellido = new javax.swing.JTextField();
        Lbl_Ficha5 = new javax.swing.JLabel();
        T_Direccion = new javax.swing.JTextField();
        Lbb_FotoPersonal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Btn_CI = new javax.swing.JButton();
        Btn_Titulo = new javax.swing.JButton();
        Lbl_Bueno = new javax.swing.JLabel();
        ComboUser = new javax.swing.JComboBox<>();
        Btn_Guardar = new javax.swing.JButton();
        Txt = new javax.swing.JTextField();
        Lbl_Ficha6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.png"))); // NOI18N

        T_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_NombreActionPerformed(evt);
            }
        });

        Lbl_Ficha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Ficha.setText("Nombre:");
        Lbl_Ficha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_FichaMouseClicked(evt);
            }
        });

        Lbl_Ficha4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Ficha4.setText("Apellido:");
        Lbl_Ficha4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Ficha4MouseClicked(evt);
            }
        });

        Lbl_Ficha5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Ficha5.setText("Direccion:");
        Lbl_Ficha5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Ficha5MouseClicked(evt);
            }
        });

        Lbb_FotoPersonal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        Lbb_FotoPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbb_FotoPersonalMouseClicked(evt);
            }
        });

        jLabel1.setText("Foto");

        Btn_CI.setText("Buscar Cedula PDF");
        Btn_CI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CIActionPerformed(evt);
            }
        });

        Btn_Titulo.setText("Buscar Titulo PDF");
        Btn_Titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_TituloActionPerformed(evt);
            }
        });

        ComboUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboUserActionPerformed(evt);
            }
        });

        Btn_Guardar.setText("Guardar");
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });

        Lbl_Ficha6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Ficha6.setText("Usuario");
        Lbl_Ficha6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Ficha6MouseClicked(evt);
            }
        });

        jLabel2.setText("Registro Maestra");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(100, 100, 100)
                .addComponent(Lbl_logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(86, 86, 86))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lbl_Ficha)
                                    .addComponent(Lbl_Ficha4))
                                .addGap(47, 47, 47))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Lbl_Ficha5)
                                .addGap(40, 40, 40)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(T_Direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(T_Nombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(T_Apellido, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Btn_CI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addComponent(Lbl_Bueno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(82, 82, 82)
                .addComponent(Lbb_FotoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ComboUser, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_Guardar)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(Lbl_Ficha6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbl_logo)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Lbl_Ficha)
                                .addGap(18, 18, 18)
                                .addComponent(Lbl_Ficha4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(T_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(T_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Lbl_Ficha5)
                            .addComponent(T_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Btn_CI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn_Titulo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Lbl_Bueno, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lbb_FotoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Lbl_Ficha6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_Guardar)
                        .addGap(25, 25, 25))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void T_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_NombreActionPerformed

    private void Lbl_FichaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_FichaMouseClicked
      
    }//GEN-LAST:event_Lbl_FichaMouseClicked

    private void Lbl_Ficha4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Ficha4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Ficha4MouseClicked

    private void Lbl_Ficha5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Ficha5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Ficha5MouseClicked

    private void Btn_CIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CIActionPerformed
    buscar_pdfCI();
    
    }//GEN-LAST:event_Btn_CIActionPerformed

    private void Btn_TituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_TituloActionPerformed
     buscar_pdfTITULO();
    
     try{
         if (comprobarEstadoFileCI()==1 && comprobarEstadoFileTitulo()==1){
         ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/vistobueno.png"));
       Image img = imagen.getImage();
       Image nuevaImagen = img.getScaledInstance(74, 74,Image.SCALE_DEFAULT);
       ImageIcon image = new ImageIcon(nuevaImagen);
       Lbl_Bueno.setIcon(image);
     }
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Carga los Pdfs");
     }
     
          
       
    }//GEN-LAST:event_Btn_TituloActionPerformed

    private void Lbb_FotoPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbb_FotoPersonalMouseClicked
      busquedaImageFoto();
    }//GEN-LAST:event_Lbb_FotoPersonalMouseClicked

    private void ComboUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboUserActionPerformed
       FUsuario fusuario = new FUsuario();
        Txt.setText(fusuario.consultaID(ComboUser.getSelectedItem().toString()));
    }//GEN-LAST:event_ComboUserActionPerformed

    private void Lbl_Ficha6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Ficha6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Ficha6MouseClicked

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
    if(direccionCI.equals("")){
        JOptionPane.showMessageDialog(null,"Te falto cargar tu documento CI");   
        return ;
    }
    if(direccionFot.equals("")){
        JOptionPane.showMessageDialog(null,"Te falto cargar tu documento Foto");   
        return ;
    }
    if(direccionTitulo.equals("")){
        JOptionPane.showMessageDialog(null,"Te falto cargar tu documento Titulo");   
        return ;
    }
    if(T_Nombre.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Te falto cargar tu nombre");   
        T_Nombre.requestFocus();
        return ;
    }
    if(T_Apellido.getText().equals("")){
       JOptionPane.showMessageDialog(null,"Te falto cargar tu aapellido");
         T_Apellido.requestFocus();
        return ;
    }
    if(T_Direccion.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Te falto cargar tu direccion");  
         T_Direccion.requestFocus();
        return ;
    }
       String cadenaUser = ComboUser.getSelectedItem().toString();
         int user = Integer.parseInt(cadenaUser);
            
   FMaestra funcion = new FMaestra(T_Nombre.getText(), T_Apellido.getText(), T_Direccion.getText(), 
           direccionFot, direccionCI, direccionTitulo, user);
    funcion.insertar();
    
    
    
    }//GEN-LAST:event_Btn_GuardarActionPerformed

  
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
            java.util.logging.Logger.getLogger(VMaestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VMaestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VMaestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VMaestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VMaestra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_CI;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Titulo;
    private javax.swing.JComboBox<String> ComboUser;
    private javax.swing.JLabel Lbb_FotoPersonal;
    private javax.swing.JLabel Lbl_Bueno;
    private javax.swing.JLabel Lbl_Ficha;
    private javax.swing.JLabel Lbl_Ficha4;
    private javax.swing.JLabel Lbl_Ficha5;
    private javax.swing.JLabel Lbl_Ficha6;
    private javax.swing.JLabel Lbl_logo;
    private javax.swing.JTextField T_Apellido;
    private javax.swing.JTextField T_Direccion;
    private javax.swing.JTextField T_Nombre;
    private javax.swing.JTextField Txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
