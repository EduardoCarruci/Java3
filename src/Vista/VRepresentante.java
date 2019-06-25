
package Vista;

import Controlador.FRepresentante;
import Controlador.FUsuario;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;


public class VRepresentante extends javax.swing.JFrame {
    private File direccionDearchivo = null;
    public VRepresentante() {
        
        initComponents();
          this.setTitle("Kinder Fer-Ed");
        this.setResizable(false);
          this.setLocationRelativeTo(null);
          Txt.setEditable(false);
          iniciarComboBox();
    }
    
    public void iniciarComboBox(){
        ArrayList<Object> iduser = new ArrayList<>();
        FUsuario fusuario = new FUsuario();
        iduser = fusuario.consultaID();
      
         for (int i = 0; i < iduser.size(); i++) {
               ComboUser.addItem(String.valueOf(iduser.get(i))); 
         }
        
        
        
        
    }
     
    
    
    
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
             foto = foto.getScaledInstance(100, 100, foto.SCALE_DEFAULT);
             Label_Foto.setIcon(new ImageIcon (foto));
             
         }
         else{
             System.out.println("Sin imagen");
         }
     }

    public void limpiarcampos(){
        Txt_Nombre.setText("");
        Txt_Apellido.setText("");
         Txt.setText("");
         direccionDearchivo=null;
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lbl_Maestra = new javax.swing.JLabel();
        Lbl_Ficha = new javax.swing.JLabel();
        Lbl_Aula = new javax.swing.JLabel();
        Label_Foto = new javax.swing.JLabel();
        Lbl_Maestra1 = new javax.swing.JLabel();
        Txt_Apellido = new javax.swing.JTextField();
        Txt_Nombre = new javax.swing.JTextField();
        Lbl_Maestra2 = new javax.swing.JLabel();
        ComboBox_Parentesco = new javax.swing.JComboBox<>();
        Btn_Guardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ComboUser = new javax.swing.JComboBox<>();
        Txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lbl_Maestra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Maestra.setText("Apellido:");
        Lbl_Maestra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_MaestraMouseClicked(evt);
            }
        });

        Lbl_Ficha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Ficha.setText("Nombre:");
        Lbl_Ficha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_FichaMouseClicked(evt);
            }
        });

        Lbl_Aula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Aula.setText("Foto");
        Lbl_Aula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_AulaMouseClicked(evt);
            }
        });

        Label_Foto.setBackground(new java.awt.Color(255, 204, 204));
        Label_Foto.setForeground(new java.awt.Color(255, 255, 204));
        Label_Foto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Label_Foto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_FotoMouseClicked(evt);
            }
        });

        Lbl_Maestra1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Maestra1.setText("Parentesco:");
        Lbl_Maestra1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Maestra1MouseClicked(evt);
            }
        });

        Lbl_Maestra2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Maestra2.setText("ID User:");
        Lbl_Maestra2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Maestra2MouseClicked(evt);
            }
        });

        ComboBox_Parentesco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Madre", "Padre" }));

        Btn_Guardar.setText("Guardar");
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText(" Representante");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ComboUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboUserActionPerformed(evt);
            }
        });

        Txt.setEditable(false);

        jLabel1.setText(" User");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Lbl_Aula)
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Btn_Guardar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lbl_Maestra)
                                    .addComponent(Lbl_Maestra1))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_Apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(ComboBox_Parentesco, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lbl_Ficha)
                                .addGap(32, 32, 32)
                                .addComponent(Txt_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)))
                        .addGap(10, 10, 10)
                        .addComponent(Label_Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lbl_Maestra2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboUser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Lbl_Aula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label_Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1)
                        .addGap(1, 1, 1)
                        .addComponent(Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_Ficha)
                            .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Lbl_Maestra))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_Maestra1)
                            .addComponent(ComboBox_Parentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_Maestra2)
                            .addComponent(ComboUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(Btn_Guardar)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lbl_MaestraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_MaestraMouseClicked

    }//GEN-LAST:event_Lbl_MaestraMouseClicked

    private void Lbl_FichaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_FichaMouseClicked
      
    }//GEN-LAST:event_Lbl_FichaMouseClicked

    private void Lbl_AulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_AulaMouseClicked

    }//GEN-LAST:event_Lbl_AulaMouseClicked

    private void Lbl_Maestra1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Maestra1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Maestra1MouseClicked

    private void Lbl_Maestra2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Maestra2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Maestra2MouseClicked

    private void Label_FotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_FotoMouseClicked
        busquedaImage();
    }//GEN-LAST:event_Label_FotoMouseClicked

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
         FRepresentante funciones;
         String cadenaParentesco = ComboBox_Parentesco.getSelectedItem().toString();
        
      
         String cadenaUser = ComboUser.getSelectedItem().toString();
         int user = Integer.parseInt(cadenaUser);
         if (Txt_Nombre.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Ingresa nombre");
             Txt_Nombre.requestFocus();
             return;
         }
         if (Txt_Apellido.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Ingresa Apellido");
             Txt_Apellido.requestFocus();
             return;
         }
         try{
             if(direccionDearchivo.getPath()==""){
              
             }
                 
         }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ingresa Foto"); 
            return;
            
         }
             
         
        
         try{
         funciones = new FRepresentante(Txt_Nombre.getText(), Txt_Apellido.getText(), direccionDearchivo, cadenaParentesco, user);
         funciones.guardar();
         if(JOptionPane.showConfirmDialog(null, "Agregaras otro Representante?")== 0){
             System.out.println("quieres otro ");
             limpiarcampos();
         } else 
             System.out.println("no quiere otro");
             Principal vista = new Principal();
             vista.setVisible(true);
             this.dispose();
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, "El Represetante que estas ingresando ya esta asociado a un Usuario, por favor agregalo con otro usuario que no este asociado");
             System.out.println(""+e);
         }
       
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void ComboUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboUserActionPerformed
       FUsuario fusuario = new FUsuario();
        Txt.setText(fusuario.consultaID(ComboUser.getSelectedItem().toString()));
    }//GEN-LAST:event_ComboUserActionPerformed

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
            java.util.logging.Logger.getLogger(VRepresentante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VRepresentante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VRepresentante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VRepresentante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VRepresentante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JComboBox<String> ComboBox_Parentesco;
    private javax.swing.JComboBox<String> ComboUser;
    private javax.swing.JLabel Label_Foto;
    private javax.swing.JLabel Lbl_Aula;
    private javax.swing.JLabel Lbl_Ficha;
    private javax.swing.JLabel Lbl_Maestra;
    private javax.swing.JLabel Lbl_Maestra1;
    private javax.swing.JLabel Lbl_Maestra2;
    private javax.swing.JTextField Txt;
    private javax.swing.JTextField Txt_Apellido;
    private javax.swing.JTextField Txt_Nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
