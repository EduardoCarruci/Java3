
package Vista;

import Controlador.FNiños;
import Controlador.FRepresentante;
import Controlador.FTipoUsuario;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class VNiños extends javax.swing.JFrame {
  private File direcciondeFOTONiño = null;
  private File direccionDeFOTOfamiliar = null;
  private File pdfservicio = null;
  private File pdfpartidanacimiento = null;
  private File pdfInformeMedico = null;
  private File pdfvacunas = null;
  ArrayList<Object> registroGlobaldelID = new ArrayList<Object>();
  
    private FileInputStream fis;
  private int longitudBytes;

    public VNiños() {
        initComponents();
        this.setTitle("Kinder Fer-Ed");
        this.setResizable(false);
          this.setLocationRelativeTo(null);
          Txt_NoEditable.setEditable(false);
          this.setSize(1012, 548);
          try{
              iniciarComboBox();
      
          }catch(Exception e){
              System.out.println(""+e);
          }
          
        
          
    }
    
    
    
    public void iniciarComboBox(){
        ArrayList<Object> registro = new ArrayList<Object>();
        FRepresentante funciones = new FRepresentante();
        
        registro = funciones.consultaComboBox();
        for (int i = 0; i < registro.size(); i++) {
             jComboBox1.addItem((registro.get(i)).toString());
        }
         registroGlobaldelID.add(registro.get(0));
         System.out.println("registro global: "+registroGlobaldelID);
        
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
             direcciondeFOTONiño = file;
             Image foto = getToolkit().getImage(""+direcciondeFOTONiño);
             foto = foto.getScaledInstance(150, 150, foto.SCALE_DEFAULT);
             jlabelFoto.setIcon(new ImageIcon (foto));
             
         }
         else{
             System.out.println("Sin imagen en foto niño");
         }
         
    
    }
      public void busquedaImage2(){
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG & PNG", "jpg", "png");
        
       
        
         JFileChooser archivo = new JFileChooser();
          archivo.setFileFilter(filtro);
         int ventana = archivo.showOpenDialog(null);
         
         if ( ventana == JFileChooser.APPROVE_OPTION){
             File file = archivo.getSelectedFile();
             //T_Ruta.setText(String.valueOf(file));
             System.out.println(""+file);
             direccionDeFOTOfamiliar = file;
             Image foto = getToolkit().getImage(""+direccionDeFOTOfamiliar);
             foto = foto.getScaledInstance(150, 150, foto.SCALE_DEFAULT);
             Jlabel_FotoFamiliar.setIcon(new ImageIcon (foto));
             
         }
         else{
             System.out.println("Sin imagen en foto familiar");
         }
         
    
    }
      
      public void buscar_pdfServicio(){
          JFileChooser filechooser = new JFileChooser();
       FileNameExtensionFilter filtro = new FileNameExtensionFilter("pdf", "pdf");
       filechooser.setFileFilter(filtro);
       
        int ventana = filechooser.showOpenDialog(this);
         
         if ( ventana == 0){
              File file =  filechooser.getSelectedFile();
             pdfservicio = file;
             System.out.println("Pdf servicio: "+file);
       
         }else{
             System.out.println("No selecciono archivo PDF de Servicio");
            
         }
    }
      
      public void buscar_pdfPartidaNacimiento(){
          JFileChooser filechooser = new JFileChooser();
       FileNameExtensionFilter filtro = new FileNameExtensionFilter("pdf", "pdf");
       filechooser.setFileFilter(filtro);
       
        int ventana = filechooser.showOpenDialog(this);
         
         if ( ventana == 0){
              File file =  filechooser.getSelectedFile();
             pdfpartidanacimiento = file;
             System.out.println("Pdf Partida: "+file);
       
         }else{
             System.out.println("No selecciono archivo PDF de partida de nacimiento");
            
         }
    }
      public void buscar_pdfVacunas(){
          JFileChooser filechooser = new JFileChooser();
       FileNameExtensionFilter filtro = new FileNameExtensionFilter("pdf", "pdf");
       filechooser.setFileFilter(filtro);
       
        int ventana = filechooser.showOpenDialog(this);
         
         if ( ventana == 0){
              File file =  filechooser.getSelectedFile();
             pdfvacunas = file;
              System.out.println("Pdf vacunas: "+file);
       
         }else{
             System.out.println("No selecciono archivo PDF de Vacunas");
            
         }
    }
      public void buscar_pdfInformeMedico(){
          JFileChooser filechooser = new JFileChooser();
       FileNameExtensionFilter filtro = new FileNameExtensionFilter("pdf", "pdf");
       filechooser.setFileFilter(filtro);
       
        int ventana = filechooser.showOpenDialog(this);
         
         if ( ventana == 0){
              File file =  filechooser.getSelectedFile();
             pdfInformeMedico = file;
              System.out.println("Pdf informe: "+file);
       
         }else{
             System.out.println("No selecciono archivo PDF de Informe Medico");
            
         }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Llb_logo = new javax.swing.JLabel();
        Lbl_Ficha = new javax.swing.JLabel();
        Lbl_fotoFamiliar = new javax.swing.JLabel();
        Lbl_Nivelaprendizaje = new javax.swing.JLabel();
        Lbl_Ficha3 = new javax.swing.JLabel();
        Lbl_Ficha4 = new javax.swing.JLabel();
        Lbl_Ficha5 = new javax.swing.JLabel();
        Lbl_Ficha6 = new javax.swing.JLabel();
        Lbl_Ficha7 = new javax.swing.JLabel();
        T_Nombre = new javax.swing.JTextField();
        T_Apellido = new javax.swing.JTextField();
        T_Edad = new javax.swing.JTextField();
        T_Direccion = new javax.swing.JTextField();
        T_NivelAprendizaje = new javax.swing.JTextField();
        DateChooser = new datechooser.beans.DateChooserCombo();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Btn_Buscar = new javax.swing.JButton();
        Txt_BusquedaAvanzada = new javax.swing.JTextField();
        Txt_NoEditable = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jlabelFoto = new javax.swing.JLabel();
        Jlabel_FotoFamiliar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Lbl_Ficha8 = new javax.swing.JLabel();
        Lbl_Ficha9 = new javax.swing.JLabel();
        Lbl_Ficha10 = new javax.swing.JLabel();
        Btn_Servicio = new javax.swing.JButton();
        Btn_Partida = new javax.swing.JButton();
        Btn_Vacunas = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Lbl_Ficha11 = new javax.swing.JLabel();
        Btn_InformeMedico = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Btn_Guardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1010, 462));
        setMinimumSize(new java.awt.Dimension(1010, 462));
        setPreferredSize(new java.awt.Dimension(1010, 462));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(510, 700));

        Llb_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.png"))); // NOI18N

        Lbl_Ficha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Ficha.setText("Nombre:");
        Lbl_Ficha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_FichaMouseClicked(evt);
            }
        });

        Lbl_fotoFamiliar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_fotoFamiliar.setText("Foto Familiar:");
        Lbl_fotoFamiliar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_fotoFamiliarMouseClicked(evt);
            }
        });

        Lbl_Nivelaprendizaje.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Nivelaprendizaje.setText("Nivel de Aprendizaje");
        Lbl_Nivelaprendizaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_NivelaprendizajeMouseClicked(evt);
            }
        });

        Lbl_Ficha3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Ficha3.setText("Edad:");
        Lbl_Ficha3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Ficha3MouseClicked(evt);
            }
        });

        Lbl_Ficha4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Ficha4.setText("Apellido:");
        Lbl_Ficha4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Ficha4MouseClicked(evt);
            }
        });

        Lbl_Ficha5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Ficha5.setText("Fecha de Nacimiento:");
        Lbl_Ficha5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Ficha5MouseClicked(evt);
            }
        });

        Lbl_Ficha6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Ficha6.setText("Direccion:");
        Lbl_Ficha6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Ficha6MouseClicked(evt);
            }
        });

        Lbl_Ficha7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Ficha7.setText("Foto:");
        Lbl_Ficha7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Ficha7MouseClicked(evt);
            }
        });

        T_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_NombreActionPerformed(evt);
            }
        });

        T_Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_DireccionActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setMinimumSize(new java.awt.Dimension(282, 220));
        jPanel4.setPreferredSize(new java.awt.Dimension(282, 220));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Datos del Padre");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 2, -1, -1));

        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 53, 151, -1));

        Btn_Buscar.setText("Buscar");
        Btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BuscarActionPerformed(evt);
            }
        });
        jPanel4.add(Btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 52, -1, -1));
        jPanel4.add(Txt_BusquedaAvanzada, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 53, 234, -1));

        Txt_NoEditable.setEditable(false);
        jPanel4.add(Txt_NoEditable, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 81, 234, -1));

        jLabel4.setText("Puedes Buscar por C.I,ID");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 32, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(Llb_logo)
                .addContainerGap(206, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Lbl_Nivelaprendizaje, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lbl_Ficha6))
                                    .addGap(24, 24, 24)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(T_NivelAprendizaje)
                                        .addComponent(T_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(Lbl_Ficha5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Lbl_Ficha))
                        .addGap(1, 1, 1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Lbl_Ficha4)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(Lbl_Ficha3)
                            .addGap(91, 91, 91)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(T_Apellido)
                                .addComponent(T_Nombre)
                                .addComponent(T_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_fotoFamiliar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Lbl_Ficha7)
                        .addContainerGap())))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Llb_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Lbl_Ficha7)
                        .addGap(124, 124, 124)
                        .addComponent(Lbl_fotoFamiliar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_Ficha)
                            .addComponent(T_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbl_Ficha4)
                            .addComponent(T_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_Ficha3)
                            .addComponent(T_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_Ficha6)
                            .addComponent(T_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_Nivelaprendizaje)
                            .addComponent(T_NivelAprendizaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(Lbl_Ficha5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 510));

        jlabelFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jlabelFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabelFotoMouseClicked(evt);
            }
        });
        getContentPane().add(jlabelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 170, 170));

        Jlabel_FotoFamiliar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Jlabel_FotoFamiliar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jlabel_FotoFamiliarMouseClicked(evt);
            }
        });
        getContentPane().add(Jlabel_FotoFamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 170, 170));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(204, 255, 204));

        jLabel1.setText("PDFS");

        Lbl_Ficha8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Ficha8.setText("Servicio:");
        Lbl_Ficha8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Ficha8MouseClicked(evt);
            }
        });

        Lbl_Ficha9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Ficha9.setText("Vacunas:");
        Lbl_Ficha9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Ficha9MouseClicked(evt);
            }
        });

        Lbl_Ficha10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Ficha10.setText("Partida de Nacimiento:");
        Lbl_Ficha10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Ficha10MouseClicked(evt);
            }
        });

        Btn_Servicio.setText("Cargar");
        Btn_Servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ServicioActionPerformed(evt);
            }
        });

        Btn_Partida.setText("Cargar");
        Btn_Partida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PartidaActionPerformed(evt);
            }
        });

        Btn_Vacunas.setText("Cargar");
        Btn_Vacunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_VacunasActionPerformed(evt);
            }
        });

        Lbl_Ficha11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Ficha11.setText("Informe Medico:");
        Lbl_Ficha11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_Ficha11MouseClicked(evt);
            }
        });

        Btn_InformeMedico.setText("Cargar");
        Btn_InformeMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_InformeMedicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lbl_Ficha11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_InformeMedico)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Ficha11)
                    .addComponent(Btn_InformeMedico))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jLabel5.setText("Opcional");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Lbl_Ficha8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_Servicio))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Lbl_Ficha10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(Btn_Partida))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Lbl_Ficha9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_Vacunas)))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addGap(132, 132, 132))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_Ficha8)
                            .addComponent(Btn_Servicio))
                        .addGap(33, 33, 33)
                        .addComponent(Lbl_Ficha10))
                    .addComponent(Btn_Partida))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Ficha9)
                    .addComponent(Btn_Vacunas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 310, 430));

        Btn_Guardar.setText("Guardar");
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, -1, -1));

        jLabel2.setText("FOTOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lbl_FichaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_FichaMouseClicked
        System.out.println("huevop");
    }//GEN-LAST:event_Lbl_FichaMouseClicked

    private void Lbl_fotoFamiliarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_fotoFamiliarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_fotoFamiliarMouseClicked

    private void Lbl_NivelaprendizajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_NivelaprendizajeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_NivelaprendizajeMouseClicked

    private void Lbl_Ficha3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Ficha3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Ficha3MouseClicked

    private void Lbl_Ficha4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Ficha4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Ficha4MouseClicked

    private void Lbl_Ficha5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Ficha5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Ficha5MouseClicked

    private void Lbl_Ficha6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Ficha6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Ficha6MouseClicked

    private void Lbl_Ficha7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Ficha7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Ficha7MouseClicked

    private void Lbl_Ficha8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Ficha8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Ficha8MouseClicked

    private void Lbl_Ficha9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Ficha9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Ficha9MouseClicked

    private void Lbl_Ficha10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Ficha10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Ficha10MouseClicked

    private void Lbl_Ficha11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_Ficha11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lbl_Ficha11MouseClicked

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
        if (T_Nombre.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa un Nombre del Infante");
            T_Nombre.requestFocus();
            return;
        }
         if (T_Apellido.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa un Apellido del Infante");
            T_Apellido.requestFocus();
            return;
        }
          if (T_Edad.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa una Edad del Infante");
            T_Edad.requestFocus();
            return;
        }
            if (T_Direccion.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa una Direccion del Infante");
            T_Direccion.requestFocus();
            return;
        }
             if (T_NivelAprendizaje.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingresa el Nivel de Aprendizaje del Infante");
            T_NivelAprendizaje.requestFocus();
            return;
        }
             
             Calendar cal;
        int d, m, a;
             cal = DateChooser.getSelectedDate();
             d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH)+1;
        a = cal.get(Calendar.YEAR)-1900;
        
        System.out.println("Nivel Aprendizaje: "+T_NivelAprendizaje.getText());
          //venta.setFechaSalida(new Date(a, m, d));
          Date prueba = new Date(a,m,d);
          
          try{
              if(pdfInformeMedico.exists()){
                  System.out.println("esta vacio");
                  
              }
          }catch(Exception e){
              System.out.println("DIOS"+e);
              FNiños fniños = new FNiños(T_Nombre.getText(), T_Apellido.getText(), 
                  Integer.parseInt(T_Edad.getText()), prueba, T_Direccion.getText(),
                  direcciondeFOTONiño, direccionDeFOTOfamiliar,
                  pdfpartidanacimiento, pdfservicio, pdfvacunas,
                  Integer.parseInt(T_NivelAprendizaje.getText()));
          
                  fniños.inserInformeMedico();
                  
                    
         FRepresentante funciones = new FRepresentante();
          ArrayList<Object> registroniño = new ArrayList<Object>();
          registroniño = fniños.buscarNiño(T_Nombre.getText(),T_Apellido.getText(),T_Direccion.getText());
          
          
            int seleccionado = Integer.parseInt(jComboBox1.getSelectedItem().toString());
            
            System.out.println("Seleccionado: "+seleccionado);
            
             ArrayList<Object> registroIDUSER = new ArrayList<Object>();
                    
             registroIDUSER = funciones.consultaID(seleccionado);
            
            System.out.println("registroIDUSER: "+registroIDUSER.get(0));
            
           funciones.guardarRepresante_niños(Integer.parseInt(registroniño.get(0).toString()), 
                                              Integer.parseInt(registroIDUSER.get(0).toString()));
                
             
          }
          
          //--- PARA CUANDO SEA UN NIÑO CON INFORME MEDICO 
          
          
          FNiños fniños = new FNiños(T_Nombre.getText(), T_Apellido.getText(), 
                  Integer.parseInt(T_Edad.getText()), prueba, T_Direccion.getText(),
                  direcciondeFOTONiño, direccionDeFOTOfamiliar,
                  pdfpartidanacimiento, pdfservicio, pdfvacunas, pdfInformeMedico,
                  Integer.parseInt(T_NivelAprendizaje.getText()));
          
          fniños.insertar();
            
          
    
         
         FRepresentante funciones = new FRepresentante();
          ArrayList<Object> registroniño = new ArrayList<Object>();
          registroniño = fniños.buscarNiño(T_Nombre.getText(),T_Apellido.getText(),T_Direccion.getText());
          
          
            int seleccionado = Integer.parseInt(jComboBox1.getSelectedItem().toString());
            
            System.out.println("Seleccionado: "+seleccionado);
            
             ArrayList<Object> registroIDUSER = new ArrayList<Object>();
                    
             registroIDUSER = funciones.consultaID(seleccionado);
            
           
            
            funciones.guardarRepresante_niños(Integer.parseInt(registroniño.get(0).toString()), 
                                              Integer.parseInt(registroIDUSER.get(0).toString()));
     
            
             
            
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void T_DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_DireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_DireccionActionPerformed

    private void T_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_NombreActionPerformed

    private void jlabelFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabelFotoMouseClicked
         busquedaImage();
    }//GEN-LAST:event_jlabelFotoMouseClicked

    private void Jlabel_FotoFamiliarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jlabel_FotoFamiliarMouseClicked
       busquedaImage2();
    }//GEN-LAST:event_Jlabel_FotoFamiliarMouseClicked

    private void Btn_ServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ServicioActionPerformed
       buscar_pdfServicio();
    }//GEN-LAST:event_Btn_ServicioActionPerformed

    private void Btn_PartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PartidaActionPerformed
       buscar_pdfPartidaNacimiento();
    }//GEN-LAST:event_Btn_PartidaActionPerformed

    private void Btn_VacunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_VacunasActionPerformed
        buscar_pdfVacunas();
    }//GEN-LAST:event_Btn_VacunasActionPerformed

    private void Btn_InformeMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_InformeMedicoActionPerformed
        buscar_pdfInformeMedico();
    }//GEN-LAST:event_Btn_InformeMedicoActionPerformed

    private void Btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarActionPerformed
       try{
       FRepresentante funciones = new FRepresentante();
        ArrayList<Object> registro = new ArrayList<Object>();
        ArrayList<Object> registro2 = new ArrayList<Object>();
            try{

             registro = funciones.consulta_PersonalizadaID(Txt_BusquedaAvanzada.getText());
         
            Txt_NoEditable.setText(" "+registro.get(0).toString()+" "+registro.get(1).toString()+" "+registro.get(2).toString());  

            registroGlobaldelID.add(registro.get(0));

            }catch(Exception e){
                
                registro2 = funciones.consulta_Cedula(Txt_BusquedaAvanzada.getText());
                System.out.println(" "+Txt_BusquedaAvanzada.getText());
                Txt_NoEditable.setText(" "+registro2.get(0).toString()+" "+registro2.get(1).toString()+" "+registro2.get(2).toString());  
                registroGlobaldelID.add(registro.get(0));
                System.out.println("Registro global: "+registroGlobaldelID.get(0));
            }
           
       }catch(Exception e){
           System.out.println("Sin registros");
       }
        
     
       
       
       
    }//GEN-LAST:event_Btn_BuscarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       FRepresentante funciones = new FRepresentante();
        String seleccionado;
        seleccionado= jComboBox1.getSelectedItem().toString();
      
        ArrayList<Object> registro = new ArrayList<Object>();
        registro = funciones.consulta_idtipo_user(seleccionado);
        
        Txt_NoEditable.setText(registro.get(0).toString()+" "+registro.get(1).toString()+" "+registro.get(2).toString());
        registroGlobaldelID.add(registro.get(0));
        
       
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        
           
    }//GEN-LAST:event_jComboBox1MouseClicked

    
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
            java.util.logging.Logger.getLogger(VNiños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VNiños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VNiños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VNiños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VNiños().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Buscar;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_InformeMedico;
    private javax.swing.JButton Btn_Partida;
    private javax.swing.JButton Btn_Servicio;
    private javax.swing.JButton Btn_Vacunas;
    private datechooser.beans.DateChooserCombo DateChooser;
    private javax.swing.JLabel Jlabel_FotoFamiliar;
    private javax.swing.JLabel Lbl_Ficha;
    private javax.swing.JLabel Lbl_Ficha10;
    private javax.swing.JLabel Lbl_Ficha11;
    private javax.swing.JLabel Lbl_Ficha3;
    private javax.swing.JLabel Lbl_Ficha4;
    private javax.swing.JLabel Lbl_Ficha5;
    private javax.swing.JLabel Lbl_Ficha6;
    private javax.swing.JLabel Lbl_Ficha7;
    private javax.swing.JLabel Lbl_Ficha8;
    private javax.swing.JLabel Lbl_Ficha9;
    private javax.swing.JLabel Lbl_Nivelaprendizaje;
    private javax.swing.JLabel Lbl_fotoFamiliar;
    private javax.swing.JLabel Llb_logo;
    private javax.swing.JTextField T_Apellido;
    private javax.swing.JTextField T_Direccion;
    private javax.swing.JTextField T_Edad;
    private javax.swing.JTextField T_NivelAprendizaje;
    private javax.swing.JTextField T_Nombre;
    private javax.swing.JTextField Txt_BusquedaAvanzada;
    private javax.swing.JTextField Txt_NoEditable;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jlabelFoto;
    // End of variables declaration//GEN-END:variables

    
}
