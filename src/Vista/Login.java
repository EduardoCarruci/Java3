package Vista;


import Controlador.FUsuario;
import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

   
    public Login() {
        initComponents();
            this.setTitle("Kinder Fer-Ed");
        this.setResizable(false);
          this.setLocationRelativeTo(null);
          this.setSize(512, 512);
          this.setMinimumSize(new Dimension(512, 512));
          this.setMaximumSize(new Dimension(512, 512));
        asignarImagen();
        
    }
    public void asignarImagen(){
            String rutaFoto = "/imagenes/fondo.png";
        ImageIcon icono = new ImageIcon(getClass().getResource(rutaFoto));
       Llb_Fondo.setIcon(icono);
      
       
       
       
       ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/icono.png"));
       Image img = imagen.getImage();
       Image nuevaImagen = img.getScaledInstance(128, 128,Image.SCALE_DEFAULT);
       ImageIcon image = new ImageIcon(nuevaImagen);
       Llb_logo.setIcon(image);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Llb_logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Btn_entrar = new javax.swing.JButton();
        Txt_User = new javax.swing.JTextField();
        Btn_entrar2 = new javax.swing.JButton();
        Txt_Pass = new javax.swing.JPasswordField();
        Llb_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(512, 512));
        setMinimumSize(new java.awt.Dimension(512, 512));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Llb_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.png"))); // NOI18N
        getContentPane().add(Llb_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 128, 128));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("User:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Pass:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        Btn_entrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Btn_entrar.setText("Registro");
        Btn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_entrarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 100, 30));
        getContentPane().add(Txt_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 140, -1));

        Btn_entrar2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Btn_entrar2.setText("Entrar");
        Btn_entrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_entrar2ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_entrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 100, 30));
        getContentPane().add(Txt_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 140, -1));

        Llb_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        getContentPane().add(Llb_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 512, 512));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_entrarActionPerformed
     VUsuario user = new VUsuario();
     user.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_Btn_entrarActionPerformed

    private void Btn_entrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_entrar2ActionPerformed
        try{
            FUsuario buscandousuario = new FUsuario();
        
        char[] arrayC = Txt_Pass.getPassword(); 
        String pass = new String(arrayC); 
        
         ArrayList<Object> registro = new ArrayList<Object>();
        registro =  buscandousuario.consultaUsuarioRegistrado(Txt_User.getText(), pass);
         
        String cadena =  registro.get(2).toString();
          Principal frame = new Principal();
        if(cadena.equals("Administrador")){
            
          frame.permisos_admin();
          frame.setVisible(true);
         this.dispose();
         
        }else if(cadena.equals("Maestra")){
         frame.permisosmaestra();
         frame.setVisible(true);
         this.dispose();
        
        }else if(cadena.equals("Representante")){
         frame.permisos_representante();
         frame.setVisible(true);
         this.dispose();
        }
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "USUARIO NO REGISTRADO"); 
             System.out.println(""+e);
        }
        
          
       
         
        
     
   
            
        
    }//GEN-LAST:event_Btn_entrar2ActionPerformed


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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_entrar;
    private javax.swing.JButton Btn_entrar2;
    private javax.swing.JLabel Llb_Fondo;
    private javax.swing.JLabel Llb_logo;
    private javax.swing.JPasswordField Txt_Pass;
    private javax.swing.JTextField Txt_User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
