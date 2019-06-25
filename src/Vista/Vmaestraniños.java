
package Vista;

import Controlador.FMaestra;
import Controlador.FNiños;
import Controlador.FRepresentante;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;


public class Vmaestraniños extends javax.swing.JFrame {
     private ArrayList<Object> registromaestra = new ArrayList<Object>();
      private ArrayList<Object> registroniño = new ArrayList<Object>();
     
    public Vmaestraniños() {
        initComponents();
           this.setTitle("Kinder Fer-Ed");
        this.setResizable(false);
          this.setLocationRelativeTo(null);
            asignarImagen();
            Txt_Maestra.setEditable(false);
            Txt_NIño.setEditable(false);
            try {
            iniciarComboMaestra();
            
            iniciarComboNiño();
        } catch (Exception e) {
        }
    }
    
      public void asignarImagen(){

       ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/icono.png"));
       Image img = imagen.getImage();
       Image nuevaImagen = img.getScaledInstance(128, 128,Image.SCALE_DEFAULT);
       ImageIcon image = new ImageIcon(nuevaImagen);
       Llb_logo.setIcon(image);
    }
    
    
    public void iniciarComboMaestra(){
         ArrayList<Object> registro = new ArrayList<Object>();
        FMaestra funciones = new FMaestra();
        
        registro = funciones.consulta_PersonalizadaIDMAESTRA();
        for (int i = 0; i < registro.size(); i++) {
             Combo_Maestra.addItem((registro.get(i)).toString());
        }
         registromaestra.add(registro.get(0));
         System.out.println("registro maestra: "+registromaestra);
    }
    
    public void iniciarComboNiño(){
         ArrayList<Object> registro = new ArrayList<Object>();
        FNiños funciones = new FNiños();
        
        registro = funciones.consulta_PersonalizadaNiño();
        for (int i = 0; i < registro.size(); i++) {
             Combo_Niño.addItem((registro.get(i)).toString());
        }
         registroniño.add(registro.get(0));
         System.out.println("registro niño: "+registroniño);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Llb_logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Txt_Maestra = new javax.swing.JTextField();
        Txt_NIño = new javax.swing.JTextField();
        Combo_Maestra = new javax.swing.JComboBox<>();
        Combo_Niño = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Llb_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Maestra");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Niño:");

        Txt_NIño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_NIñoActionPerformed(evt);
            }
        });

        Combo_Maestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_MaestraActionPerformed(evt);
            }
        });

        Combo_Niño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_NiñoActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(Llb_logo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(33, 33, 33)
                                .addComponent(Txt_NIño))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(Txt_Maestra, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Combo_Niño, 0, 108, Short.MAX_VALUE)
                            .addComponent(Combo_Maestra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jButton1)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Llb_logo)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Txt_Maestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combo_Maestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Txt_NIño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combo_Niño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(35, 35, 35))
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

    private void Txt_NIñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_NIñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NIñoActionPerformed

    private void Combo_MaestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_MaestraActionPerformed
        FMaestra funciones = new FMaestra();
        String seleccionado;
        seleccionado= Combo_Maestra.getSelectedItem().toString();
      
        ArrayList<Object> registro = new ArrayList<Object>();
        registro = funciones.consultaMaestra(Integer.parseInt(seleccionado));
        
        Txt_Maestra.setText(registro.get(0).toString()+" "+registro.get(1).toString()+" "+registro.get(2).toString());
        registromaestra.add(registro.get(0));
    }//GEN-LAST:event_Combo_MaestraActionPerformed

    private void Combo_NiñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_NiñoActionPerformed
       FNiños funciones = new FNiños();
        String seleccionado;
        seleccionado= Combo_Niño.getSelectedItem().toString();
      
        ArrayList<Object> registro = new ArrayList<Object>();
        registro = funciones.consultaNiño(Integer.parseInt(seleccionado));
        
        Txt_NIño.setText(registro.get(0).toString()+" "+registro.get(1).toString()+" "+registro.get(2).toString());
        registroniño.add(registro.get(0));
    }//GEN-LAST:event_Combo_NiñoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int valorNiño = Integer.parseInt( Combo_Niño.getSelectedItem().toString());
        System.out.println(""+valorNiño);
        int valormaestra = Integer.parseInt( Combo_Maestra.getSelectedItem().toString());
        System.out.println(""+valormaestra);
        FMaestra funciones = new FMaestra();
        funciones.registrarmaestrasconniños(valorNiño, valormaestra);
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
            java.util.logging.Logger.getLogger(Vmaestraniños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vmaestraniños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vmaestraniños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vmaestraniños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vmaestraniños().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combo_Maestra;
    private javax.swing.JComboBox<String> Combo_Niño;
    private javax.swing.JLabel Llb_logo;
    private javax.swing.JTextField Txt_Maestra;
    private javax.swing.JTextField Txt_NIño;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
