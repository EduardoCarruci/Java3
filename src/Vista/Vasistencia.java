
package Vista;

import Controlador.FAsistencia;
import Controlador.FEncuentro;
import Controlador.FMaestra;
import Controlador.FNiños;
import java.awt.Image;
import java.io.File;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Vasistencia extends javax.swing.JFrame {
 private File avatar;

    public Vasistencia() {
        initComponents();
        this.setTitle("Kinder Fer-Ed");
        this.setResizable(false);
          this.setLocationRelativeTo(null);
          asignarImagen();
          asignarImagen2();
          try{
              iniciarComboMaestra();
              iniciarComboEncuentro();
              iniciarComboNiños();
              ocultar();
          }catch(Exception e){
              
          }
    }
    
    public void ocultar(){
        Lbl_Niño_Maestra3.setVisible(false);
         Lbl_Niño_Maestra4.setVisible(false);
          Txt_Comentario.setVisible(false);
           Txt_Justificativo.setVisible(false);
           Lbl_Niño_Maestra5.setVisible(false);
            Btn_Foto.setVisible(false);
        
    }
    
    public void aparecer(){
        Lbl_Niño_Maestra3.setVisible(true);
         Lbl_Niño_Maestra4.setVisible(true);
          Txt_Comentario.setVisible(true);
           Txt_Justificativo.setVisible(true);
           Lbl_Niño_Maestra5.setVisible(true);
            Btn_Foto.setVisible(true);
        
    }
    
    
    
    public void iniciarComboMaestra(){
         ArrayList<Object> registro = new ArrayList<Object>();
        FMaestra funciones = new FMaestra();
        
        registro = funciones.consulta_PersonalizadaIDMAESTRA();
        for (int i = 0; i < registro.size(); i++) {
             ComboBoxContenido.addItem((registro.get(i)).toString());
        }
         
    }
    
     public void iniciarComboEncuentro(){
         ArrayList<Object> registro = new ArrayList<Object>();
        FEncuentro funciones = new FEncuentro();
        
        registro = funciones.consultaEncuentro();
        for (int i = 0; i < registro.size(); i++) {
             ComboEncuentro.addItem((registro.get(i)).toString());
        }
         
    }
     
     public void iniciarComboNiños(){
         ArrayList<Object> registro = new ArrayList<Object>();
        FNiños funciones = new FNiños();
        
        registro = funciones.consulta_PersonalizadaNiño();
        for (int i = 0; i < registro.size(); i++) {
             ComboNiño.addItem((registro.get(i)).toString());
        }
         
    } 
     
     public void refrescarcomboBox(){
          
        ComboEncuentro.updateUI();
          ComboEncuentro.repaint();
          ComboEncuentro.revalidate();
         
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
             avatar = file;
             Image foto = getToolkit().getImage(""+avatar);
             foto = foto.getScaledInstance(120, 113, foto.SCALE_DEFAULT);
             Lbl_Foto.setIcon(new ImageIcon (foto));
             
         }
         else{
             System.out.println("Sin imagen");
         }
         
    
    }

     public void asignarImagen(){

       ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/icono.png"));
       Image img = imagen.getImage();
       Image nuevaImagen = img.getScaledInstance(128, 128,Image.SCALE_DEFAULT);
       ImageIcon image = new ImageIcon(nuevaImagen);
       Llb_logo.setIcon(image);
    }
     public void asignarImagen2(){

       ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/user.png"));
       Image img = imagen.getImage();
       Image nuevaImagen = img.getScaledInstance(128, 128,Image.SCALE_DEFAULT);
       ImageIcon image = new ImageIcon(nuevaImagen);
       Llb_logo1.setIcon(image);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Lbl_Niño_Maestra = new javax.swing.JLabel();
        Lbl_Aula = new javax.swing.JLabel();
        Lbl_Maestra = new javax.swing.JLabel();
        DateChooser = new datechooser.beans.DateChooserCombo();
        jScrollPane1 = new javax.swing.JScrollPane();
        Txt_Contenido = new javax.swing.JTextArea();
        ComboBoxContenido = new javax.swing.JComboBox<>();
        Txt_Maestra = new javax.swing.JTextField();
        Llb_logo = new javax.swing.JLabel();
        Lbl_Maestra1 = new javax.swing.JLabel();
        Btn_Guardar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Llb_logo1 = new javax.swing.JLabel();
        ComboNiño = new javax.swing.JComboBox<>();
        Lbl_Niño_Maestra1 = new javax.swing.JLabel();
        Lbl_Niño_Maestra2 = new javax.swing.JLabel();
        ComboEncuentro = new javax.swing.JComboBox<>();
        Txt_Comentario = new javax.swing.JTextField();
        Lbl_Niño_Maestra3 = new javax.swing.JLabel();
        Lbl_Niño_Maestra4 = new javax.swing.JLabel();
        Txt_Justificativo = new javax.swing.JTextField();
        Txt_Niño = new javax.swing.JTextField();
        Text_Encuentro = new javax.swing.JTextField();
        Lbl_Niño_Maestra5 = new javax.swing.JLabel();
        Btn_Foto = new javax.swing.JButton();
        Radioyes = new javax.swing.JRadioButton();
        RadioNO = new javax.swing.JRadioButton();
        Lbl_Niño_Maestra6 = new javax.swing.JLabel();
        Btn_Guardar = new javax.swing.JButton();
        Lbl_Maestra2 = new javax.swing.JLabel();
        Lbl_Foto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        Lbl_Niño_Maestra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Niño_Maestra.setText("Maestra que impartio el Contenido:");
        Lbl_Niño_Maestra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Niño_MaestraMouseClicked(evt);
            }
        });

        Lbl_Aula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Aula.setText("Contenido:");
        Lbl_Aula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_AulaMouseClicked(evt);
            }
        });

        Lbl_Maestra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Maestra.setText("Fecha:");
        Lbl_Maestra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_MaestraMouseClicked(evt);
            }
        });

        Txt_Contenido.setColumns(20);
        Txt_Contenido.setRows(5);
        jScrollPane1.setViewportView(Txt_Contenido);

        ComboBoxContenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxContenidoActionPerformed(evt);
            }
        });

        Llb_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.png"))); // NOI18N

        Lbl_Maestra1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Maestra1.setText("ENCUENTRO");
        Lbl_Maestra1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Maestra1MouseClicked(evt);
            }
        });

        Btn_Guardar1.setText("Guardar");
        Btn_Guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Guardar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_Maestra)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Lbl_Niño_Maestra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxContenido, 0, 83, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Lbl_Maestra)
                                .addGap(18, 18, 18)
                                .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Lbl_Aula)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Lbl_Maestra1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Llb_logo)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(Btn_Guardar1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_Maestra1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Llb_logo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Lbl_Maestra)
                    .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(Lbl_Aula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Niño_Maestra)
                    .addComponent(ComboBoxContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_Maestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Guardar1)
                .addGap(21, 21, 21))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        Llb_logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N

        ComboNiño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboNiñoActionPerformed(evt);
            }
        });

        Lbl_Niño_Maestra1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Niño_Maestra1.setText("Niño:");
        Lbl_Niño_Maestra1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Niño_Maestra1MouseClicked(evt);
            }
        });

        Lbl_Niño_Maestra2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Niño_Maestra2.setText("Encuentro:");
        Lbl_Niño_Maestra2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Niño_Maestra2MouseClicked(evt);
            }
        });

        ComboEncuentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboEncuentroActionPerformed(evt);
            }
        });

        Lbl_Niño_Maestra3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Niño_Maestra3.setText("Comentario:");
        Lbl_Niño_Maestra3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Niño_Maestra3MouseClicked(evt);
            }
        });

        Lbl_Niño_Maestra4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Niño_Maestra4.setText("Justificativo");
        Lbl_Niño_Maestra4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Niño_Maestra4MouseClicked(evt);
            }
        });

        Lbl_Niño_Maestra5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Niño_Maestra5.setText("Foto:");
        Lbl_Niño_Maestra5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Niño_Maestra5MouseClicked(evt);
            }
        });

        Btn_Foto.setText("Buscar Foto");
        Btn_Foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_FotoActionPerformed(evt);
            }
        });

        Radioyes.setText("YES");
        Radioyes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioyesActionPerformed(evt);
            }
        });

        RadioNO.setText("NO");
        RadioNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioNOActionPerformed(evt);
            }
        });

        Lbl_Niño_Maestra6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Niño_Maestra6.setText("Asistencia");
        Lbl_Niño_Maestra6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Niño_Maestra6MouseClicked(evt);
            }
        });

        Btn_Guardar.setText("Guardar");
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });

        Lbl_Maestra2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Maestra2.setText("ASISTENCIA");
        Lbl_Maestra2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Maestra2MouseClicked(evt);
            }
        });

        Lbl_Foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 255)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Lbl_Niño_Maestra2)
                        .addGap(28, 28, 28)
                        .addComponent(ComboEncuentro, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Text_Encuentro, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Lbl_Niño_Maestra1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ComboNiño, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txt_Niño))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Lbl_Niño_Maestra3)
                            .addComponent(Lbl_Niño_Maestra4)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Btn_Guardar)
                                .addComponent(Lbl_Niño_Maestra6)
                                .addComponent(Lbl_Niño_Maestra5)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txt_Justificativo)
                            .addComponent(Txt_Comentario)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Btn_Foto)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Radioyes)
                                        .addGap(18, 18, 18)
                                        .addComponent(RadioNO)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addComponent(Lbl_Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Llb_logo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Lbl_Maestra2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Llb_logo1))
                    .addComponent(Lbl_Maestra2))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboNiño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_Niño_Maestra1)
                    .addComponent(Txt_Niño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboEncuentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_Niño_Maestra2)
                    .addComponent(Text_Encuentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Niño_Maestra3)
                    .addComponent(Txt_Comentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Niño_Maestra4)
                    .addComponent(Txt_Justificativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_Niño_Maestra5)
                            .addComponent(Btn_Foto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Radioyes)
                            .addComponent(RadioNO)
                            .addComponent(Lbl_Niño_Maestra6))
                        .addGap(18, 18, 18)
                        .addComponent(Btn_Guardar))
                    .addComponent(Lbl_Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lbl_Niño_MaestraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Niño_MaestraMouseClicked

    }//GEN-LAST:event_Lbl_Niño_MaestraMouseClicked

    private void Lbl_AulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_AulaMouseClicked

    }//GEN-LAST:event_Lbl_AulaMouseClicked

    private void Lbl_MaestraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_MaestraMouseClicked
      
    }//GEN-LAST:event_Lbl_MaestraMouseClicked

    private void Lbl_Niño_Maestra1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Niño_Maestra1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Niño_Maestra1MouseClicked

    private void Lbl_Niño_Maestra2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Niño_Maestra2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Niño_Maestra2MouseClicked

    private void Lbl_Niño_Maestra3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Niño_Maestra3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Niño_Maestra3MouseClicked

    private void Lbl_Niño_Maestra4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Niño_Maestra4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Niño_Maestra4MouseClicked

    private void Lbl_Niño_Maestra5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Niño_Maestra5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Niño_Maestra5MouseClicked

    private void Lbl_Niño_Maestra6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Niño_Maestra6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Niño_Maestra6MouseClicked

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
        //A GUARDAR
        
       
        
        String cadena ="";
        
        int valorNiño = Integer.parseInt( ComboNiño.getSelectedItem().toString());
     
        int valorencuentro = Integer.parseInt( ComboEncuentro.getSelectedItem().toString());
        
        if(Radioyes.isSelected() && !RadioNO.isSelected()){
          
            
            System.out.println("seleccionaste radioyes");
              cadena ="Y";
              
              //--A PROGRAMAR
            
               FAsistencia funciones = new FAsistencia(cadena, valorNiño, valorencuentro);
              funciones.guardadoYES();
              
              
            
        }else if (!Radioyes.isSelected() && RadioNO.isSelected()){
             System.out.println("seleccionaste radio NO");
              cadena ="N";
               if(Txt_Comentario.getText().equals("")){
            
            Txt_Comentario.requestFocus();
            JOptionPane.showMessageDialog(null, "Comentario");
            return ;
        }
        if(Txt_Justificativo.getText().equals("")){
            
            Txt_Justificativo.requestFocus();
            JOptionPane.showMessageDialog(null, "Justificativo");
            return ;
        }
              FAsistencia funciones = new FAsistencia(cadena, avatar, Txt_Comentario.getText(), Txt_Justificativo.getText(), valorNiño, valorencuentro);
              funciones.insertar();
        }
        else  if (!Radioyes.isSelected() && !RadioNO.isSelected()) {
            JOptionPane.showMessageDialog(null, "Selecciona una opcion");
            return;
        }
        
        
        
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Btn_FotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_FotoActionPerformed
        busquedaImage();
    }//GEN-LAST:event_Btn_FotoActionPerformed

    private void Lbl_Maestra1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Maestra1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Maestra1MouseClicked

    private void Lbl_Maestra2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Maestra2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Maestra2MouseClicked

    private void Btn_Guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Guardar1ActionPerformed
      if(Txt_Contenido.getText().equals("")){
          Txt_Contenido.requestFocus();
          JOptionPane.showMessageDialog(null, "Que contenido dio?");
          return;
      }
      
           Calendar cal;
        int d, m, a;
             cal = DateChooser.getSelectedDate();
             d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH)+1;
        a = cal.get(Calendar.YEAR)-1900;
        
      
          Date prueba = new Date(a,m,d);
              int seleccionado = Integer.parseInt(ComboBoxContenido.getSelectedItem().toString());
          FEncuentro funciones = new FEncuentro(prueba, Txt_Contenido.getText(), seleccionado);
          funciones.insertar();
          /*
          ArrayList<Object> registro = new ArrayList<Object>();
          registro.add(funciones.sumarEncuentro());
          
          System.out.println("Registro de suma de encuentros: "+registro.get(0).toString());*/
          
          Vasistencia vista = new Vasistencia();
          vista.setVisible(true);
          this.dispose();
         
          
          
    }//GEN-LAST:event_Btn_Guardar1ActionPerformed

    private void ComboBoxContenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxContenidoActionPerformed
         FMaestra funciones = new FMaestra();
        String seleccionado;
        seleccionado= ComboBoxContenido.getSelectedItem().toString();
      
        ArrayList<Object> registro = new ArrayList<Object>();
        registro = funciones.consultaMaestra(Integer.parseInt(seleccionado));
        
        Txt_Maestra.setText(registro.get(0).toString()+" "+registro.get(1).toString()+" "+registro.get(2).toString());
        
    }//GEN-LAST:event_ComboBoxContenidoActionPerformed

    private void ComboEncuentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboEncuentroActionPerformed
    refrescarcomboBox();
    
      FEncuentro funciones = new FEncuentro();
        String seleccionado;
        seleccionado= ComboEncuentro.getSelectedItem().toString();
      
        ArrayList<Object> registro = new ArrayList<Object>();
        registro = funciones.consultaEncuentro();
        
        Text_Encuentro.setText(registro.get(0).toString());
    }//GEN-LAST:event_ComboEncuentroActionPerformed

    private void ComboNiñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboNiñoActionPerformed
     
    
        FNiños funciones = new FNiños();
        String seleccionado;
        seleccionado= ComboNiño.getSelectedItem().toString();
      
        ArrayList<Object> registro = new ArrayList<Object>();
        registro = funciones.consulta_PersonalizadaNiño();
        
        Txt_Niño.setText(registro.get(0).toString());
    }//GEN-LAST:event_ComboNiñoActionPerformed

    private void RadioyesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioyesActionPerformed
        ocultar();
    }//GEN-LAST:event_RadioyesActionPerformed

    private void RadioNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioNOActionPerformed
    aparecer();     
    }//GEN-LAST:event_RadioNOActionPerformed

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
            java.util.logging.Logger.getLogger(Vasistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vasistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vasistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vasistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vasistencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Foto;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Guardar1;
    private javax.swing.JComboBox<String> ComboBoxContenido;
    private javax.swing.JComboBox<String> ComboEncuentro;
    private javax.swing.JComboBox<String> ComboNiño;
    private datechooser.beans.DateChooserCombo DateChooser;
    private javax.swing.JLabel Lbl_Aula;
    private javax.swing.JLabel Lbl_Foto;
    private javax.swing.JLabel Lbl_Maestra;
    private javax.swing.JLabel Lbl_Maestra1;
    private javax.swing.JLabel Lbl_Maestra2;
    private javax.swing.JLabel Lbl_Niño_Maestra;
    private javax.swing.JLabel Lbl_Niño_Maestra1;
    private javax.swing.JLabel Lbl_Niño_Maestra2;
    private javax.swing.JLabel Lbl_Niño_Maestra3;
    private javax.swing.JLabel Lbl_Niño_Maestra4;
    private javax.swing.JLabel Lbl_Niño_Maestra5;
    private javax.swing.JLabel Lbl_Niño_Maestra6;
    private javax.swing.JLabel Llb_logo;
    private javax.swing.JLabel Llb_logo1;
    private javax.swing.JRadioButton RadioNO;
    private javax.swing.JRadioButton Radioyes;
    private javax.swing.JTextField Text_Encuentro;
    private javax.swing.JTextField Txt_Comentario;
    private javax.swing.JTextArea Txt_Contenido;
    private javax.swing.JTextField Txt_Justificativo;
    private javax.swing.JTextField Txt_Maestra;
    private javax.swing.JTextField Txt_Niño;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
