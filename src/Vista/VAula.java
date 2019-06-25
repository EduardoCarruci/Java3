
package Vista;

import Controlador.FAula;
import Controlador.FMaestra;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class VAula extends javax.swing.JFrame {
    private File direccionFot ;
      ArrayList<Object> registroGlobaldelID = new ArrayList<Object>();
    public VAula() {
        initComponents();
        
             this.setTitle("Kinder Fer-Ed");
        this.setResizable(false);
          this.setLocationRelativeTo(null);
          asignar();
          Txt_Maestra.setEditable(false);
          
          
          try{
              iniciarComboBox();
          }catch(Exception e){
              System.out.println("ACA: "+e);
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
             Image foto = getToolkit().getImage(""+direccionFot);
             foto = foto.getScaledInstance(90, 130, foto.SCALE_DEFAULT);
             jLabel1.setIcon(new ImageIcon (foto));
             
         }
         else{
             System.out.println("Sin imagen en foto niño");
         }
         
    
    }
    
    
    
    public void limpiar (){
        
    }
       public void iniciarComboBox(){
        ArrayList<Object> registro = new ArrayList<Object>();
        FMaestra funciones = new FMaestra();
        
        registro = funciones.consulta_PersonalizadaIDMAESTRA();
        for (int i = 0; i < registro.size(); i++) {
             jComboBox1.addItem((registro.get(i)).toString());
        }
         registroGlobaldelID.add(registro.get(0));
    
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        T_Capacidad = new javax.swing.JTextField();
        Lbl_Ficha5 = new javax.swing.JLabel();
        Lbl_Ficha4 = new javax.swing.JLabel();
        T_Nombre = new javax.swing.JTextField();
        Lbl_Ficha = new javax.swing.JLabel();
        Lbl_Ficha6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Txt_Maestra = new javax.swing.JTextField();
        Btn_Guardar = new javax.swing.JButton();
        Llb_logo = new javax.swing.JLabel();
        Btn_Foto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lbl_Ficha5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Ficha5.setText("Capacidad:");
        Lbl_Ficha5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Ficha5MouseClicked(evt);
            }
        });

        Lbl_Ficha4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Ficha4.setText("Foto:");
        Lbl_Ficha4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Ficha4MouseClicked(evt);
            }
        });

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

        Lbl_Ficha6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Ficha6.setText("Asignar Maestra");
        Lbl_Ficha6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Ficha6MouseClicked(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        Btn_Guardar.setText("Guardar");
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });

        Llb_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.png"))); // NOI18N

        Btn_Foto.setText("Buscar Foto");
        Btn_Foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_FotoActionPerformed(evt);
            }
        });

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(Btn_Guardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_Ficha6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Lbl_Ficha4)
                        .addComponent(Lbl_Ficha5)
                        .addComponent(Lbl_Ficha)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Llb_logo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Btn_Foto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(Txt_Maestra, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(T_Capacidad)
                            .addComponent(T_Nombre, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, 90, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Llb_logo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Lbl_Ficha, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Lbl_Ficha4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Lbl_Ficha5)
                            .addComponent(T_Capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_Ficha6)
                            .addComponent(Txt_Maestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(T_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn_Foto))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Btn_Guardar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lbl_Ficha5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Ficha5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Ficha5MouseClicked

    private void Lbl_Ficha4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Ficha4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Ficha4MouseClicked

    private void T_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_NombreActionPerformed

    private void Lbl_FichaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_FichaMouseClicked

    }//GEN-LAST:event_Lbl_FichaMouseClicked

    private void Lbl_Ficha6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Ficha6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Ficha6MouseClicked

    private void Btn_FotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_FotoActionPerformed
        buscarfoto();
    }//GEN-LAST:event_Btn_FotoActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
    buscarfoto();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
        if (T_Nombre.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Ingresa nombre");
             T_Nombre.requestFocus();
             return;
         }
        if (T_Capacidad.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Ingresa una capacidad");
             T_Capacidad.requestFocus();
             return;
         }
        
         try{
             if(direccionFot.getPath()==""){
              JOptionPane.showMessageDialog(null, "Ingresa Foto"); 
              return;
             }
                 
         }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ingresa Foto"); 
            return;
            
        }
         
         
         
        try{
            FAula funciones = new FAula(T_Nombre.getText(), direccionFot, Integer.parseInt(T_Capacidad.getText()));
            funciones.guardar();
            
            //----a guardar en la tabla de muchos a muchos
            ArrayList<Object> registro = new ArrayList<Object>();
            registro = funciones.buscarAula(T_Nombre.getText(), Integer.parseInt(T_Capacidad.getText()));
           
            
            
            //vamos aca - - - 
            
            FMaestra maestra = new FMaestra();
            
            int seleccionado = Integer.parseInt(jComboBox1.getSelectedItem().toString());
            
            System.out.println("Seleccionado: "+seleccionado);
            
             ArrayList<Object> registroIDUSER = new ArrayList<Object>()
                     ;
            registroIDUSER = maestra.consultaporIDuser(seleccionado);
            
            System.out.println("registroIDUSER: "+registroIDUSER.get(0));
            
            
            
            
            //--
            funciones.guardarmaestra_aula(Integer.parseInt(registroIDUSER.get(0).toString() ), Integer.parseInt(registro.get(0).toString()));
            
        }catch(Exception e){
            System.out.println(" "+e);
        }
        
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        FMaestra funciones = new FMaestra();
        String seleccionado;
        seleccionado= jComboBox1.getSelectedItem().toString();
      
        ArrayList<Object> registro = new ArrayList<Object>();
        registro = funciones.consulta_PersonalizadaIDMAESTRA(seleccionado);
      
        Txt_Maestra.setText(registro.get(0).toString()+ " "+registro.get(1).toString() + " "+ registro.get(2).toString());
        registroGlobaldelID.add(registro.get(0));
      
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(VAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VAula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Foto;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JLabel Lbl_Ficha;
    private javax.swing.JLabel Lbl_Ficha4;
    private javax.swing.JLabel Lbl_Ficha5;
    private javax.swing.JLabel Lbl_Ficha6;
    private javax.swing.JLabel Llb_logo;
    private javax.swing.JTextField T_Capacidad;
    private javax.swing.JTextField T_Nombre;
    private javax.swing.JTextField Txt_Maestra;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
