
package Vista;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import otros.PantallaVideo;


public class Principal extends javax.swing.JFrame {

    
    
    
    public Principal() {
        initComponents();
       // Lbl_Ficha.setVisible(false);
         this.setTitle("Kinder Fer-Ed");
        this.setResizable(false);
          this.setLocationRelativeTo(null);
          this.setSize(512, 512);
          this.setMinimumSize(new Dimension(512, 512));
          this.setMaximumSize(new Dimension(512, 512));
          asignar();
    }
     public void asignar(){
        
        
       ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/icono.png"));
       Image img = imagen.getImage();
       Image nuevaImagen = img.getScaledInstance(128, 128,Image.SCALE_DEFAULT);
       ImageIcon image = new ImageIcon(nuevaImagen);
       Llb_logo.setIcon(image);
    
    }
    
    public void permisos_representante(){
         this.Lbl_Asistencia.setVisible(false);
        this.Lbl_Aula.setVisible(false);
        this.Lbl_Boletas.setVisible(true);
        this.Lbl_Ficha.setVisible(false);
        this.Lbl_Maestra.setVisible(false);
        this.Lbl_Niño_Maestra.setVisible(false);
        this.Lbl_Reporte.setVisible(false);
        this.Lbl_Seguimiento_Niño.setVisible(false);
        this.Lbl_niñosyRepresentantes.setVisible(true);
    }
    public void permisosmaestra(){
           this.Lbl_Asistencia.setVisible(true);
        this.Lbl_Aula.setVisible(true);
        this.Lbl_Boletas.setVisible(true);
        this.Lbl_Ficha.setVisible(true);
        this.Lbl_Maestra.setVisible(true);
        this.Lbl_Niño_Maestra.setVisible(true);
        this.Lbl_Reporte.setVisible(true);
        this.Lbl_Seguimiento_Niño.setVisible(true);
        this.Lbl_niñosyRepresentantes.setVisible(true);
        
        
    }
    //POR MODIDIFICAR
    public void permisos_admin(){
        this.Lbl_Asistencia.setVisible(true);
        this.Lbl_Aula.setVisible(true);
        this.Lbl_Boletas.setVisible(true);
        this.Lbl_Ficha.setVisible(true);
        this.Lbl_Maestra.setVisible(true);
        this.Lbl_Niño_Maestra.setVisible(true);
        this.Lbl_Reporte.setVisible(true);
        this.Lbl_Seguimiento_Niño.setVisible(true);
        this.Lbl_niñosyRepresentantes.setVisible(true);
        
        
    }

  
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Llb_logo = new javax.swing.JLabel();
        Lbl_Ficha = new javax.swing.JLabel();
        Lbl_Reporte = new javax.swing.JLabel();
        Lbl_Maestra = new javax.swing.JLabel();
        Lbl_Aula = new javax.swing.JLabel();
        Lbl_Niño_Maestra = new javax.swing.JLabel();
        Lbl_Seguimiento_Niño = new javax.swing.JLabel();
        Lbl_Boletas = new javax.swing.JLabel();
        Lbl_niñosyRepresentantes = new javax.swing.JLabel();
        Lbl_Asistencia = new javax.swing.JLabel();
        Lbl_Video1 = new javax.swing.JLabel();
        Lbl_Representante1 = new javax.swing.JLabel();
        Lbl_Video2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Llb_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.png"))); // NOI18N
        getContentPane().add(Llb_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 128, 128));

        Lbl_Ficha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Ficha.setText("Registrar Ficha del Niño");
        Lbl_Ficha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_FichaMouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_Ficha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        Lbl_Reporte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Reporte.setText("Reportes");
        Lbl_Reporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_ReporteMouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_Reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        Lbl_Maestra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Maestra.setText("Registrar Maestra");
        Lbl_Maestra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_MaestraMouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_Maestra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        Lbl_Aula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Aula.setText("Registrar Aula");
        Lbl_Aula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_AulaMouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_Aula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        Lbl_Niño_Maestra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Niño_Maestra.setText("Registro de Niño con Maestras");
        Lbl_Niño_Maestra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Niño_MaestraMouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_Niño_Maestra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        Lbl_Seguimiento_Niño.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Seguimiento_Niño.setText("Seguimiento a los Niños");
        Lbl_Seguimiento_Niño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Seguimiento_NiñoMouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_Seguimiento_Niño, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        Lbl_Boletas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Boletas.setText("Boletas");
        Lbl_Boletas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_BoletasMouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_Boletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        Lbl_niñosyRepresentantes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_niñosyRepresentantes.setText("Asignar Maestras y Niños");
        Lbl_niñosyRepresentantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_niñosyRepresentantesMouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_niñosyRepresentantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 150, -1));

        Lbl_Asistencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Asistencia.setText("Registro de Asistencias");
        Lbl_Asistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_AsistenciaMouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_Asistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        Lbl_Video1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Video1.setText("Registrar Usuario");
        Lbl_Video1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Video1MouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_Video1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        Lbl_Representante1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Representante1.setText("Registrar Representante");
        Lbl_Representante1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Representante1MouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_Representante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        Lbl_Video2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Video2.setText("Videos");
        Lbl_Video2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Video2MouseClicked(evt);
            }
        });
        getContentPane().add(Lbl_Video2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jMenu3.setText("Consultas");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenu1.setText("Consultar Aulas");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenu1);

        jMenu4.setText("Reportes Maestras");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu3.add(jMenu4);

        jMenu5.setText("Asistencia");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu3.add(jMenu5);

        jMenu6.setText("Inasistencias");
        jMenu3.add(jMenu6);

        jMenu2.setText("Consultar Boletas");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu3.add(jMenu2);

        jMenuBar1.add(jMenu3);

        jMenu7.setText("Videos");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lbl_FichaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_FichaMouseClicked
        System.out.println("Registrar Niño");
        VNiños vniños = new VNiños();
        vniños.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Lbl_FichaMouseClicked

    private void Lbl_MaestraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_MaestraMouseClicked
        System.out.println("Registrar Maestra");
        VMaestra vmaestra = new VMaestra();
        vmaestra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Lbl_MaestraMouseClicked

    private void Lbl_AulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_AulaMouseClicked
       
    }//GEN-LAST:event_Lbl_AulaMouseClicked

    private void Lbl_Niño_MaestraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Niño_MaestraMouseClicked
 
    }//GEN-LAST:event_Lbl_Niño_MaestraMouseClicked

    private void Lbl_Seguimiento_NiñoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Seguimiento_NiñoMouseClicked
      
    }//GEN-LAST:event_Lbl_Seguimiento_NiñoMouseClicked

    private void Lbl_BoletasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_BoletasMouseClicked
    VBoleta boleta = new VBoleta();
    boleta.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_Lbl_BoletasMouseClicked

    private void Lbl_AsistenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_AsistenciaMouseClicked
        Vasistencia vista = new Vasistencia();
        vista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Lbl_AsistenciaMouseClicked

    private void Lbl_niñosyRepresentantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_niñosyRepresentantesMouseClicked
        //
        
        Vmaestraniños funciones = new Vmaestraniños();
        funciones.setVisible(true);
        this.dispose();
        
        
        
        
        
        
    }//GEN-LAST:event_Lbl_niñosyRepresentantesMouseClicked

    private void Lbl_ReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_ReporteMouseClicked
      
    }//GEN-LAST:event_Lbl_ReporteMouseClicked

    private void Lbl_Video1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Video1MouseClicked
     VUsuario usuario = new VUsuario();
     usuario.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_Lbl_Video1MouseClicked

    private void Lbl_Representante1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Representante1MouseClicked
         VRepresentante repre = new VRepresentante();
     repre.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_Lbl_Representante1MouseClicked

    private void Lbl_Video2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Video2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Video2MouseClicked

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        System.out.println("pene");
        this.dispose();
        Consulta_Aula aula = new Consulta_Aula();
      aula.setVisible(true);
      
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
       
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
     
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
       this.dispose();
        Consulta_Aula aula = new Consulta_Aula();
      aula.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
      this.dispose();
        Consulta_Boleta boleta = new Consulta_Boleta();
      boleta.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
       Consulta_Maestra_Niños consul = new Consulta_Maestra_Niños();
       consul.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
       ConsulNiños consul = new ConsulNiños();
       consul.setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
       PantallaVideo video = new PantallaVideo();
       video.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jMenu7MouseClicked

   
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_Asistencia;
    private javax.swing.JLabel Lbl_Aula;
    private javax.swing.JLabel Lbl_Boletas;
    private javax.swing.JLabel Lbl_Ficha;
    private javax.swing.JLabel Lbl_Maestra;
    private javax.swing.JLabel Lbl_Niño_Maestra;
    private javax.swing.JLabel Lbl_Reporte;
    private javax.swing.JLabel Lbl_Representante1;
    private javax.swing.JLabel Lbl_Seguimiento_Niño;
    private javax.swing.JLabel Lbl_Video1;
    private javax.swing.JLabel Lbl_Video2;
    private javax.swing.JLabel Lbl_niñosyRepresentantes;
    private javax.swing.JLabel Llb_logo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
