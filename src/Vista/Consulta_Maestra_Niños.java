
package Vista;

import Controlador.FBoleta;
import Controlador.FMaestra;
import java.awt.Image;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import otros.Conectar;
import otros.Consultas;


public class Consulta_Maestra_Niños extends javax.swing.JFrame {

    
    public Consulta_Maestra_Niños() {
        initComponents();
        
          this.setTitle("Kinder Fer-Ed");
        this.setResizable(false);
          this.setLocationRelativeTo(null);
                asignarImagen();
                  try {
                 mostrar_general(Tablaso);
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
     
     public void mostrar_general(JTable tabla){
        try{
             DefaultTableModel modelo = new DefaultTableModel();
            FMaestra funciones = new FMaestra();
         Tablaso = funciones.consulta_general(Tablaso);  
        }catch(Exception e){
            System.out.println(""+e);
            
        }
    
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Llb_logo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablaso = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Txt_ID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Llb_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.png"))); // NOI18N

        Tablaso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tablaso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablasoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tablaso);

        jLabel1.setText("Buscar ID:");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Generar Reporte");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Llb_logo)
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Txt_ID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(198, 198, 198))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Llb_logo)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(Txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablasoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablasoMouseClicked

        int fila = Tablaso.rowAtPoint(evt.getPoint());
        Txt_ID.setText(Tablaso.getValueAt(fila, 0).toString());
    }//GEN-LAST:event_TablasoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FMaestra boleta = new FMaestra();
        boleta.consulta_Personalizada(Integer.parseInt(Txt_ID.getText()), Tablaso);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.out.println("boton");
        if (Txt_ID.getText().equals("")) {
            Txt_ID.requestFocus();
            return;

        }
        
        int bandera =0;
        int pivote =0;
        
        int id = Integer.parseInt(Txt_ID.getText().toString());
        FMaestra funcion = new FMaestra();
        
        ArrayList<Object> registrocantidad_de_niños = new ArrayList<Object>();
        registrocantidad_de_niños = funcion.consultaparareporte(id);
        
        System.out.println("Cantidad niños: "+registrocantidad_de_niños.get(0).toString());
        
        bandera = Integer.parseInt(registrocantidad_de_niños.get(0).toString());
        
        System.out.println("Bandera: "+bandera);
        
         ArrayList<Object> registro_id_niños = new ArrayList<Object>();
         registro_id_niños = funcion.consultaparareporte_Niños(id);
         
         for (int i = 0; i < registro_id_niños.size(); i++) {
             System.out.println("id niños: "+registro_id_niños.get(i).toString());
            
        }
        
        int idprofesora = Integer.parseInt(Txt_ID.getText());
        System.out.println("idprofesora: "+idprofesora);
        
        /// TU WHILE
        while(bandera!=0){
            
      
        try {
            JasperReport archivo;
            archivo = JasperCompileManager.compileReport("maestra.jrxml");

            Map<String,Object> mapa = new HashMap<String,Object>();

            //--POR EDITAR
           

            //------------------------------------

            mapa.put("parametro", idprofesora);
            mapa.put("fotoniño", Consultas.Imagenfotoniño(Integer.parseInt(registro_id_niños.get(pivote).toString())));
            
          

            Conectar con = new Conectar("jdbc:mysql://localhost:3306/escuela");

            JasperPrint prin = JasperFillManager.fillReport(archivo,mapa,con.getConnection());

            JasperViewer ver = new JasperViewer(prin,false);

            ver.setVisible(true);
            ver.setTitle("Reportes de las maestras ");
        } catch (JRException ex) {
            Logger.getLogger(Consulta_Aula.class.getName()).log(Level.SEVERE, null, ex);
        }
       pivote++; 
       bandera--;
        
    }//FINE WHILE
        
        
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
            java.util.logging.Logger.getLogger(Consulta_Maestra_Niños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta_Maestra_Niños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta_Maestra_Niños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta_Maestra_Niños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta_Maestra_Niños().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Llb_logo;
    private javax.swing.JTable Tablaso;
    private javax.swing.JTextField Txt_ID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
