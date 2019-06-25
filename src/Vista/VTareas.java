
package Vista;

import Controlador.FCalificaciones;
import Controlador.FEncuentro;
import Controlador.FMaestra;
import Controlador.FTareas;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class VTareas extends javax.swing.JFrame {
 private File direccionFot ;
    public VTareas() {
        initComponents();
        asignar();
         this.setTitle("Kinder Fer-Ed");
        this.setResizable(false);
          this.setLocationRelativeTo(null);
          
          try {
            iniciarComboMaestra();
            iniciarComboCalificaciones();
        } catch (Exception e) {
        }
    }
     public void asignar(){
        
        
       ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/icono.png"));
       Image img = imagen.getImage();
       Image nuevaImagen = img.getScaledInstance(128, 128,Image.SCALE_DEFAULT);
       ImageIcon image = new ImageIcon(nuevaImagen);
       Llb_logo.setIcon(image);
    
    }
     
      public void buscarfoto(){
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG & PNG", "jpg", "png");
        
       
        
         JFileChooser archivo = new JFileChooser();
          archivo.setFileFilter(filtro);
         int ventana = archivo.showOpenDialog(null);
         
         if ( ventana == JFileChooser.APPROVE_OPTION){
             File file = archivo.getSelectedFile();
         
             direccionFot = file;
            
         }
         else{
             System.out.println("Sin imagen en foto niño");
         }
         
    
    }

    
      
      public void iniciarComboMaestra(){
         ArrayList<Object> registro = new ArrayList<Object>();
        FMaestra funciones = new FMaestra();
        
        registro = funciones.consulta_PersonalizadaIDMAESTRA();
        for (int i = 0; i < registro.size(); i++) {
             ComboMaestra.addItem((registro.get(i)).toString());
        }
         
    }
       public void iniciarComboCalificaciones(){
         ArrayList<Object> registro = new ArrayList<Object>();
        FCalificaciones funciones = new FCalificaciones();
        
        registro = funciones.consulta_Calificaciones();
        for (int i = 0; i < registro.size(); i++) {
             ComboCalificaciones.addItem((registro.get(i)).toString());
        }
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lbl_Niño_Maestra1 = new javax.swing.JLabel();
        ComboMaestra = new javax.swing.JComboBox<>();
        Lbl_Niño_Maestra2 = new javax.swing.JLabel();
        ComboCalificaciones = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Lbl_Niño_Maestra3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Llb_logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lbl_Niño_Maestra1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Niño_Maestra1.setText("Maestra:");
        Lbl_Niño_Maestra1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Niño_Maestra1MouseClicked(evt);
            }
        });

        ComboMaestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboMaestraActionPerformed(evt);
            }
        });

        Lbl_Niño_Maestra2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Niño_Maestra2.setText("Calificaciones:");
        Lbl_Niño_Maestra2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Niño_Maestra2MouseClicked(evt);
            }
        });

        ComboCalificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCalificacionesActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Lbl_Niño_Maestra3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Niño_Maestra3.setText("Tareas:");
        Lbl_Niño_Maestra3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Niño_Maestra3MouseClicked(evt);
            }
        });

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Llb_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lbl_Niño_Maestra1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ComboMaestra, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lbl_Niño_Maestra2)
                                    .addComponent(Lbl_Niño_Maestra3))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton1)
                                        .addComponent(ComboCalificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Llb_logo)
                        .addGap(134, 134, 134))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Llb_logo)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboMaestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_Niño_Maestra1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboCalificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_Niño_Maestra2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Lbl_Niño_Maestra3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lbl_Niño_Maestra1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Niño_Maestra1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Niño_Maestra1MouseClicked

    private void ComboMaestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboMaestraActionPerformed

        FMaestra funciones = new FMaestra();
        String seleccionado;
        seleccionado= ComboMaestra.getSelectedItem().toString();

        ArrayList<Object> registro = new ArrayList<Object>();
        registro = funciones.consulta_PersonalizadaIDMAESTRA();

        //Txt_Niño.setText(registro.get(0).toString());
    }//GEN-LAST:event_ComboMaestraActionPerformed

    private void Lbl_Niño_Maestra2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Niño_Maestra2MouseClicked
       
    }//GEN-LAST:event_Lbl_Niño_Maestra2MouseClicked

    private void ComboCalificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCalificacionesActionPerformed
    
        FCalificaciones funciones = new FCalificaciones();
        String seleccionado;
        seleccionado= ComboCalificaciones.getSelectedItem().toString();

        ArrayList<Object> registro = new ArrayList<Object>();
        registro = funciones.consulta_Calificaciones();

        
    }//GEN-LAST:event_ComboCalificacionesActionPerformed

    private void Lbl_Niño_Maestra3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Niño_Maestra3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Niño_Maestra3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        buscarfoto();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        
        int valorMaestra = Integer.parseInt( ComboMaestra.getSelectedItem().toString());
     
        int valorCalificaciones = Integer.parseInt( ComboCalificaciones.getSelectedItem().toString());
        
        
        FTareas funciones = new FTareas(direccionFot, valorMaestra, valorCalificaciones);
        
        funciones.insertar();
        
      
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(VTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VTareas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboCalificaciones;
    private javax.swing.JComboBox<String> ComboMaestra;
    private javax.swing.JLabel Lbl_Niño_Maestra1;
    private javax.swing.JLabel Lbl_Niño_Maestra2;
    private javax.swing.JLabel Lbl_Niño_Maestra3;
    private javax.swing.JLabel Llb_logo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
