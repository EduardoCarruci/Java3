
package Vista;

import Controlador.FBoleta;
import Controlador.FNiños;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;


public class VBoleta extends javax.swing.JFrame {

  
    public VBoleta() {
        initComponents();
        asignar();
        Txt_Niño.setEditable(false);
        try{
           iniciarComboNiño(); 
        }catch(Exception e){
            System.out.println(""+e ); 
        }
        
    }

     public void asignar(){
        
        
       ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/icono.png"));
       Image img = imagen.getImage();
       Image nuevaImagen = img.getScaledInstance(128, 128,Image.SCALE_DEFAULT);
       ImageIcon image = new ImageIcon(nuevaImagen);
       Llb_logo.setIcon(image);
    
    }
     
      public void iniciarComboNiño(){
         ArrayList<Object> registro = new ArrayList<Object>();
        FNiños funciones = new FNiños();
        
        registro = funciones.consulta_PersonalizadaNiño();
        for (int i = 0; i < registro.size(); i++) {
             ComboBox.addItem((registro.get(i)).toString());
        }
         
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Llb_logo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Lbl_Ficha = new javax.swing.JLabel();
        Lbl_Ficha4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Txt_Comentario = new javax.swing.JTextArea();
        ComboBox = new javax.swing.JComboBox<>();
        Txt_Niño = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        Llb_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.png"))); // NOI18N

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Lbl_Ficha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Ficha.setText("Comentario:");
        Lbl_Ficha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_FichaMouseClicked(evt);
            }
        });

        Lbl_Ficha4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Ficha4.setText("Niño:");
        Lbl_Ficha4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Ficha4MouseClicked(evt);
            }
        });

        Txt_Comentario.setColumns(20);
        Txt_Comentario.setRows(5);
        jScrollPane2.setViewportView(Txt_Comentario);

        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Lbl_Ficha4)
                            .addComponent(Lbl_Ficha))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Llb_logo)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 8, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Txt_Niño)
                                .addGap(18, 18, 18)
                                .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Llb_logo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(Lbl_Ficha, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_Ficha4)
                            .addComponent(Txt_Niño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lbl_FichaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_FichaMouseClicked

    }//GEN-LAST:event_Lbl_FichaMouseClicked

    private void Lbl_Ficha4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Ficha4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Ficha4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     if (Txt_Comentario.getText().equals("")){
         Txt_Comentario.requestFocus();
         return;
     }
     
       
        int valorNiño = Integer.parseInt( ComboBox.getSelectedItem().toString());
        
        FBoleta funcion = new FBoleta(Txt_Comentario.getText(),valorNiño);
        funcion.insertar();
        
     
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
          FNiños funciones = new FNiños();
        String seleccionado;
        seleccionado= ComboBox.getSelectedItem().toString();
      
        ArrayList<Object> registro = new ArrayList<Object>();
        registro = funciones.consultaNiño(Integer.parseInt(seleccionado));
        
        Txt_Niño.setText(registro.get(0).toString());
    }//GEN-LAST:event_ComboBoxActionPerformed

    
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
            java.util.logging.Logger.getLogger(VBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VBoleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JLabel Lbl_Ficha;
    private javax.swing.JLabel Lbl_Ficha4;
    private javax.swing.JLabel Llb_logo;
    private javax.swing.JTextArea Txt_Comentario;
    private javax.swing.JTextField Txt_Niño;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
