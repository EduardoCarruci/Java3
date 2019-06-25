
package Vista;

import Controlador.FAula;
import Controlador.FUsuario;
import com.emaraic.recorder.CamRecorder;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class ConsultaMultiple extends javax.swing.JFrame {

    
    public ConsultaMultiple() {
        initComponents();
        asignar();
         this.setTitle("Kinder Fer-Ed");
        this.setResizable(false);
          this.setLocationRelativeTo(null);
          
          try {
            iniciarComboAula();
            iniciarComboUser();
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
 
 
      public void iniciarComboAula(){
         ArrayList<Object> registro = new ArrayList<Object>();
        FAula funciones = new FAula();
        
        registro = funciones.consultaAulas();
        for (int i = 0; i < registro.size(); i++) {
             ComboAula.addItem((registro.get(i)).toString());
        }
         
    }
       public void iniciarComboUser(){
         ArrayList<Object> registro = new ArrayList<Object>();
        FUsuario funciones = new FUsuario();
        
        registro = funciones.consultaUserID();
        for (int i = 0; i < registro.size(); i++) {
             ComboUser.addItem((registro.get(i)).toString());
        }
         
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Llb_logo = new javax.swing.JLabel();
        Lbl_Ficha = new javax.swing.JLabel();
        Lbl_Ficha4 = new javax.swing.JLabel();
        ComboUser = new javax.swing.JComboBox<>();
        ComboAula = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Llb_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.png"))); // NOI18N

        Lbl_Ficha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Ficha.setText("Aula:");
        Lbl_Ficha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_FichaMouseClicked(evt);
            }
        });

        Lbl_Ficha4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Ficha4.setText("User ID:");
        Lbl_Ficha4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Ficha4MouseClicked(evt);
            }
        });

        ComboUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboUserActionPerformed(evt);
            }
        });

        ComboAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboAulaActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(Llb_logo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbl_Ficha)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lbl_Ficha4)
                                .addGap(4, 4, 4)))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ComboUser, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboAula, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jButton1)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Llb_logo)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Ficha)
                    .addComponent(ComboAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Ficha4)
                    .addComponent(ComboUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jButton1)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lbl_FichaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_FichaMouseClicked

    }//GEN-LAST:event_Lbl_FichaMouseClicked

    private void Lbl_Ficha4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Ficha4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Ficha4MouseClicked

    private void ComboUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboUserActionPerformed
        FUsuario funciones = new FUsuario();
        String seleccionado;
        seleccionado= ComboUser.getSelectedItem().toString();

        ArrayList<Object> registro = new ArrayList<Object>();
        registro = funciones.consultaID();

    }//GEN-LAST:event_ComboUserActionPerformed

    private void ComboAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboAulaActionPerformed
         FAula funciones = new FAula();
        String seleccionado;
        seleccionado= ComboAula.getSelectedItem().toString();

        ArrayList<Object> registro = new ArrayList<Object>();
        registro = funciones.consultaAulas();
    }//GEN-LAST:event_ComboAulaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    
        CamRecorder cam = new CamRecorder();
        cam.valorcomboUser = Integer.parseInt( ComboUser.getSelectedItem().toString());;
        cam.valorcomboAula = Integer.parseInt( ComboAula.getSelectedItem().toString());
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaMultiple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaMultiple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaMultiple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaMultiple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaMultiple().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboAula;
    private javax.swing.JComboBox<String> ComboUser;
    private javax.swing.JLabel Lbl_Ficha;
    private javax.swing.JLabel Lbl_Ficha4;
    private javax.swing.JLabel Llb_logo;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
