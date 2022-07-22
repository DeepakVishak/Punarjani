//Main package
package Main_Files.organizer;

//Imported class files
import java.io.File;
import java.awt.Toolkit;
import javax.swing.JFrame;
import java.nio.file.Path;
import java.sql.ResultSet;
import java.sql.Statement;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import Class_Files.GetImage;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import Class_Files.ErrorReason;
import javax.swing.JFileChooser;
import Main_Files.A02_SignIn_Page;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.filechooser.FileNameExtensionFilter;

//Function class
public class A16_Organizer_Update extends javax.swing.JFrame {
    public A16_Organizer_Update(String e){
        initComponents();
        getDetails(e);
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        kButton1 = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        kButton3 = new keeptoo.KButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Profile");
        setMaximumSize(new java.awt.Dimension(800, 550));
        setMinimumSize(new java.awt.Dimension(800, 550));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkBorderRadius(25);
        kGradientPanel2.setkEndColor(new java.awt.Color(102, 102, 102));
        kGradientPanel2.setkFillBackground(false);
        kGradientPanel2.setkStartColor(new java.awt.Color(102, 102, 102));
        kGradientPanel2.setOpaque(false);
        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 550));

        jPanel1.setBackground(new java.awt.Color(255, 81, 47));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_minimize_window.png"))); // NOI18N
        jLabel5.setToolTipText("Minimize");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 20, 30));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_close_window.png"))); // NOI18N
        jLabel6.setToolTipText("Close");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 30));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_prev.png"))); // NOI18N
        jLabel7.setToolTipText("Go Back");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText(getTitle());
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 81, 47));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Akil Sundhar");
        kGradientPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 760, 40));

        jLabel22.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("dcompany.uit@gmail.com");
        kGradientPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 760, 20));

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_caution.png"))); // NOI18N
        jLabel51.setToolTipText("Internal error");
        kGradientPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 20));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 130));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel1.setText("First Name");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 120, 30));

        jLabel2.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel2.setText("Last Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 120, 30));

        jLabel3.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel3.setText("Email ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 120, 30));

        jLabel4.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel4.setText("Mobile");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 120, 30));

        jLabel9.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel9.setText("City");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 50, 30));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField1.setToolTipText("Enter your first name");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 260, 30));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField2.setToolTipText("Enter your last name");
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 260, 30));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField3.setToolTipText("Enter your Email ID");
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 260, 30));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField4.setToolTipText("Enter your mobile number");
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 190, 30));

        kButton1.setBorder(null);
        kButton1.setText("Update Profile");
        kButton1.setToolTipText("Update your profile");
        kButton1.setFont(new java.awt.Font("Cambria Math", 1, 26)); // NOI18N
        kButton1.setkEndColor(new java.awt.Color(255, 0, 255));
        kButton1.setkHoverEndColor(new java.awt.Color(2, 161, 203));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkStartColor(new java.awt.Color(2, 161, 203));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 240, -1));

        kButton2.setBorder(null);
        kButton2.setText("Get Info");
        kButton2.setToolTipText("Get your information");
        kButton2.setFont(new java.awt.Font("Cambria Math", 1, 26)); // NOI18N
        kButton2.setkEndColor(new java.awt.Color(255, 0, 255));
        kButton2.setkHoverEndColor(new java.awt.Color(2, 161, 203));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkStartColor(new java.awt.Color(2, 161, 203));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 240, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/180px_new_organizer_cover.png"))); // NOI18N
        jLabel28.setToolTipText("Press here to update profile picture");
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel28MousePressed(evt);
            }
        });
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 160, 180));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/180px_new_organizer.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 160, 180));

        jLabel12.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel12.setText("Administrator Refered");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        jLabel13.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel13.setText("Organizer ID");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 120, 30));

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField6.setToolTipText("Administrator Reffered");
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 260, 30));

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField7.setToolTipText("Your Organization ID");
        jTextField7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 260, 30));

        kButton3.setBorder(null);
        kButton3.setText("Reset");
        kButton3.setToolTipText("Reset all fields");
        kButton3.setFont(new java.awt.Font("Cambria Math", 1, 26)); // NOI18N
        kButton3.setkEndColor(new java.awt.Color(255, 0, 255));
        kButton3.setkHoverEndColor(new java.awt.Color(2, 161, 203));
        kButton3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton3.setkStartColor(new java.awt.Color(2, 161, 203));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 240, -1));

        jLabel10.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Upload Your Profile Picture");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 170, -1));

        jLabel16.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Profile picture must be less");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 170, -1));

        jLabel17.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("than 1 MB and the picture");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 170, -1));

        jLabel18.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 51, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Note that if you update");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 170, -1));

        jLabel19.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 51, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("profile picture you previous");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 170, -1));

        jLabel20.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 51, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("one will be removed and it ");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 170, -1));

        jLabel14.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("picture ratio must be in 4 : 3");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 170, -1));

        jLabel15.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("cannot be retrived");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 170, -1));

        jLabel23.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 51, 255));
        jLabel23.setText("Note: You can't change your refered");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 260, -1));

        jLabel24.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 51, 255));
        jLabel24.setText("Note: You cannot chande you organization ID");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 260, -1));

        jLabel25.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 51, 255));
        jLabel25.setText("administrator ID");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 230, -1));

        jLabel26.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel26.setText("District");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 50, 30));

        jLabel27.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel27.setText("State");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 50, 30));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a option", "Kerala", "Lakshadweep" }));
        jComboBox1.setToolTipText("Choose your state");
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 280, 30));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox2.setToolTipText("Choose your district");
        jComboBox2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 280, 30));

        jComboBox3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox3.setModel(new DefaultComboBoxModel());
        jComboBox3.setToolTipText("Choose your city");
        jComboBox3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 280, 30));

        jComboBox4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+91" }));
        jComboBox4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 60, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 800, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Declared global variables
    int mousepX,mousepY;
    String Email=null;
    Statement stmt = null;
    ResultSet rs = null;
    String SQL = null;
    String FN= null;
    String LN= null;
    String District= null;
    int AID= 0;
    int OID= 0;
    String MO= null;
    String City= null;
    String item= null;
    String State= null;
    ErrorReason ER=new ErrorReason();
    GetImage Image= new GetImage();
    
    //Code for setting JFrame minimized in taskbar
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel5MouseClicked

    //Code for exiting program
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        int CO= JOptionPane.showConfirmDialog(this, "Are you sure to close the application?", "Close Application", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(CO==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    //Code for going back to organization home page
    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        int OP= JOptionPane.showConfirmDialog(this, "Are you sure that you want to go back to organization home page?\nIf Yes please choose Yes  ", "Are you sure to logout", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(OP==JOptionPane.YES_OPTION){
            new A15_Organizer_Page(Email).setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel7MousePressed

    //Code for dragging JFrame across screen
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int coordX= evt.getXOnScreen();
        int coordY= evt.getYOnScreen();
        this.setLocation(coordX-mousepX, coordY-mousepY);
    }//GEN-LAST:event_jPanel1MouseDragged

    //Code for getting current mouse position
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        mousepX= evt.getX();
        mousepY= evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed
    
    //Code for getting information
    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        new A16_Organizer_Update(Email).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kButton2ActionPerformed

    //Code for updating profile
    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        if(!("".equals(jTextField1.getText()))){
            if(!("".equals(jTextField3.getText()))){
                if(!("".equals(jTextField4.getText()))){
                    if(!("Choose a option".equals(jComboBox1.getSelectedItem()))){
                        try{
                            Class.forName("com.mysql.jdbc.Driver");
                            String db_url="jdbc:mysql://localhost:3306/project";
                            String pwd="root";
                            String user="root";
                            Connection conn=(Connection)DriverManager.getConnection(db_url,user,pwd);
                            stmt=conn.createStatement();
                            OID= Integer.parseInt(jTextField7.getText());
                            FN= jTextField1.getText();
                            LN= jTextField2.getText();
                            Email= jTextField3.getText();
                            MO= "+91".concat(jTextField4.getText());
                            City= (String)jComboBox3.getSelectedItem();
                            District= (String)jComboBox2.getSelectedItem();
                            State= (String)jComboBox1.getSelectedItem();
                            int OP= JOptionPane.showConfirmDialog(this, "Are you sure that you want to update your profile?\nIf Yes please choose Yes  ", "Update Profile", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
                            if(OP==JOptionPane.YES_OPTION){
                                SQL="UPDATE organization SET "
                                    + "FName='"+FN+"',"
                                    + "LName='"+LN+"',"
                                    + "Email='"+Email+"',"
                                    + "Mobile='"+MO+"',"
                                    + "City='"+City+"'"
                                    + "District='"+District+"'"
                                    + "WHERE OrgID="+OID; 
                                int re=stmt.executeUpdate(SQL);
                                if(re==1){
                                    JOptionPane.showMessageDialog(this, "Your profile has been successfully updated.\nPlease Sign-In again to continue.", "Update Success", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_update.png")));
                                    new A02_SignIn_Page().setVisible(true);
                                    this.setVisible(false);
                                }   
                            }
                        }
                        catch(ClassNotFoundException | SQLException e){
                            ER.copyReason(e.toString());
                            JOptionPane.showMessageDialog(this, "An error occured while updating data into servers.\nError have been copied into your clipboard.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                        }
                    }
                    else
                        JOptionPane.showMessageDialog(this, "Please choose state, district and city.\nThese are mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                }
                else
                    JOptionPane.showMessageDialog(this, "Please enter the Mobile Number.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
            }
            else
                JOptionPane.showMessageDialog(this, "Please enter the Email ID.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
        else
            JOptionPane.showMessageDialog(this, "Please enter the First Name.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
    }//GEN-LAST:event_kButton1ActionPerformed

    //Code for resetting fields
    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        new A16_Organizer_Update(Email).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kButton3ActionPerformed

    //Code for choosing district
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        switch (jComboBox2.getSelectedItem().toString()) {
            case "Alappuzha":
            {
                String[] Alappuzha={"Ambalapuzha","Alappuzha","Chengannur","Cherthala",
                    "Haripad","Karthikappally","Kuttanad","Mankombu","Mavelikkara"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Alappuzha);
                jComboBox3.setModel(ComboBoxModelCity);
                jComboBox3.setEnabled(true);
                break;
            }
            case "Ernakulam":
            {
                String[] Ernakulam={"Aluva","Ernakulam","Fort Kochi","Kanayannur","Kochi",
                    "Kothamangalam","Kunnathunad","Muvattupuzha","North Paravur","Perumbavoor"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Ernakulam);
                jComboBox3.setModel(ComboBoxModelCity);
                jComboBox3.setEnabled(true);
                break;
            }
            case "Idukki":
            {
                String[] Idukki={"Devikulam","Idukki","Nedumkandam","Painavu","Peermade",
                    "Thodupuzha","Udumbanchola"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Idukki);
                jComboBox3.setModel(ComboBoxModelCity);
                jComboBox3.setEnabled(true);
                break;
            }
            case "Kannur":
            {
                String[] Kannur={"Thalassery","Iritty","Kannur","Thalipparamba","Payyanur"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kannur);
                jComboBox3.setModel(ComboBoxModelCity);
                jComboBox3.setEnabled(true);
                break;
            }
            case "Kasaragod":
            {
                String[] Kasaragod={"Hosdurg","Kasaragod","Manjeshwaram","Uppala","Vellarikundu"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kasaragod);
                jComboBox3.setModel(ComboBoxModelCity);
                jComboBox3.setEnabled(true);
                break;
            }
            case "Kollam":
            {
                String[] Kollam={"Chathannoor","Karunagappally","Kollam","Kottarakkara",
                    "Kunnathur","Pathanapuram","Paravur","Punalur","Sasthamkotta"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kollam);
                jComboBox3.setModel(ComboBoxModelCity);
                jComboBox3.setEnabled(true);
                break;
            }
            case "Kottayam":
            {
                String[] Kottayam={"Changanasserry","Kanjirappally","Kottayam","Meenachil",
                    "Palai","Vaikom"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kottayam);
                jComboBox3.setModel(ComboBoxModelCity);
                jComboBox3.setEnabled(true);
                break;
            }
            case "Kozhikode":
            {
                String[] Kozhikode={"Koyilandy","Kozhikode","Thamarassery","Vatakara"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kozhikode);
                jComboBox3.setModel(ComboBoxModelCity);
                jComboBox3.setEnabled(true);
                break;
            }
            case "Malappuram":
            {
                String[] Malappuram={"Eranad","Kondotty","Manjeri","Nilambur",
                    "Perinthalmanna","Ponnani","Tirur","Tirurangadi"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Malappuram);
                jComboBox3.setModel(ComboBoxModelCity);
                jComboBox3.setEnabled(true);
                break;
            }
            case "Palakkad":
            {
                String[] Palakkad={"Alathur","Chittur","Mannarkkad","Ottappalam",
                    "Palakkad","Pattambi"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Palakkad);
                jComboBox3.setModel(ComboBoxModelCity);
                jComboBox3.setEnabled(true);
                break;
            }
            case "Pathanamthitta":
            {
                String[] Pathanamthitta={"Adoor","Konni","Kozhencherry","Mallappally",
                    "Pathanamthitta","Ranni","Thiruvalla"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Pathanamthitta);
                jComboBox3.setModel(ComboBoxModelCity);
                jComboBox3.setEnabled(true);
                break;
            }
            case "Thiruvananthapuram":
            {
                String[] Thiruvananthapuram={"Attingal","Chirayinkeezhu","Kattakada","Nedumangad",
                    "Neyyattinkara","Thiruvananthapuram","Varkala"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Thiruvananthapuram);
                jComboBox3.setModel(ComboBoxModelCity);
                jComboBox3.setEnabled(true);
                break;
            }
            case "Thrissur":
            {
                String[] Thrissur={"Chalakudy","Chavakkad","Irinjalakuda","Kodungallur",
                    "Kunnamkulam","Mukundapuram","Thalapilly","Thrissur","Wadakkancheri"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Thrissur);
                jComboBox3.setModel(ComboBoxModelCity);
                jComboBox3.setEnabled(true);
                break;
            }
            case "Wayanad":
            {
                String[] Wayanad={"Kalpetta","Mananthavady","Sultan Battery","Vythiri"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Wayanad);
                jComboBox3.setModel(ComboBoxModelCity);
                jComboBox3.setEnabled(true);
                break;
            }
            case "Lakshadweep":
            {
                String[] Kavaratti={"Kavaratti"};
                DefaultComboBoxModel ComboBoxModelDistrict = new DefaultComboBoxModel(Kavaratti);
                jComboBox3.setModel(ComboBoxModelDistrict);
                jComboBox3.setEnabled(true);
                break;
            }
            default:
            break;
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    //Code for choosing state
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        switch (jComboBox1.getSelectedItem().toString()) {
            case "Choose a option":
            String[] Choose={"Choose a option"};
            DefaultComboBoxModel ComboBoxModel = new DefaultComboBoxModel(Choose);
            jComboBox1.setModel(ComboBoxModel);
            jComboBox2.setModel(ComboBoxModel);
            jComboBox1.setEnabled(false);
            jComboBox2.setEnabled(false);
            break;
            case "Kerala":
            {
                String[] Kerala={"Choose a option","Alappuzha","Ernakulam","Idukki","Kannur","Kasaragod","Kollam",
                    "Kottayam","Kozhikode","Malappuram","Palakkad","Pathanamthitta",
                    "Thiruvananthapuram","Thrissur","Wayanad"};
                DefaultComboBoxModel ComboBoxModelDistrict = new DefaultComboBoxModel(Kerala);
                jComboBox2.setModel(ComboBoxModelDistrict);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Lakshadweep":
            {
                String[] Lakshadweep={"Choose a option","Lakshadweep"};
                DefaultComboBoxModel ComboBoxModelDistrict = new DefaultComboBoxModel(Lakshadweep);
                jComboBox2.setModel(ComboBoxModelDistrict);
                jComboBox2.setEnabled(true);
                break;
            }
            default:
            break;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    //Code for consuming excess numbers
    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        if(jTextField4.getText().length()>9)
            evt.consume();
        if(!(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'))
            evt.consume();
    }//GEN-LAST:event_jTextField4KeyTyped

    //Code for updating profile picure
    private void jLabel28MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MousePressed
        OID= Integer.parseInt(jTextField7.getText());
        String SelectPath;
        JFileChooser FileChoose= new JFileChooser();
        FileNameExtensionFilter Filter= new FileNameExtensionFilter("JPEG(*.jpg,*.jpeg)","jpg","jpeg");
        FileChoose.addChoosableFileFilter(Filter);
        int status= FileChoose.showOpenDialog(A16_Organizer_Update.this);
        if(status==JFileChooser.APPROVE_OPTION){
            SelectPath= FileChoose.getSelectedFile().getAbsolutePath();
            File source= new File(SelectPath);
            File F= new File(System.getProperty("java.class.path"));
            File Dir= F.getAbsoluteFile().getParentFile();
            String S= Dir.toString().concat("\\images\\org\\"+OID+".jpg");
            Path DPath= Paths.get(S);
            Path SPath= source.toPath();
            File temp= new File(S);
            if(temp.exists()){
                temp.delete();
                try{
                    Files.copy(SPath, DPath);
                }
                catch(IOException e){
                    ER.copyReason(e.toString());
                    jLabel51.setVisible(true);
                    JOptionPane.showMessageDialog(this, "Failed to add your new image into CDN network.\nPlease try again later.", "Error Occured", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                }
            }
            else if(!(temp.exists())){
                try{
                    Files.copy(SPath, DPath);
                }
                catch(IOException e){
                    ER.copyReason(e.toString());
                    jLabel51.setVisible(true);
                    JOptionPane.showMessageDialog(this, "Failed to add your new image into CDN network.\nPlease try again later.", "Error Occured", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                }
            }
            jLabel11.setIcon(Image.getImage("org",OID, 160, 180));
        }
    }//GEN-LAST:event_jLabel28MousePressed

    //Code for getting information
    private void getDetails(String email) {
        Email= email;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String db_url="jdbc:mysql://localhost:3306/project";
            String pwd="root";
            String user="root";
            Connection conn=(Connection)DriverManager.getConnection(db_url,user,pwd);
            stmt=(Statement) conn.createStatement();
            rs=stmt.executeQuery( "SELECT * FROM organization WHERE Email='"+Email+"'");
            if(rs.next()) {
                AID= rs.getInt("AdminRef");
                OID= rs.getInt("OrgID");
                FN= rs.getString("FName");
                LN = rs.getString("Lname");
                MO= rs.getString("Mobile");
                City= rs.getString("City");
                District= rs.getString("District");
                State= rs.getString("State");
                jTextField6.setText(Integer.toString(AID));
                jTextField7.setText(Integer.toString(OID));
                jTextField1.setText(""+FN);
                jTextField2.setText(""+LN);
                jTextField3.setText(""+Email);
                MO= MO.substring(3);
                jTextField4.setText(""+MO);
                for(int j=0; j<jComboBox1.getItemCount();j++){
                    item= jComboBox1.getItemAt(j);
                    if(State.equalsIgnoreCase(item)){
                        jComboBox1.setSelectedIndex(j);
                        break;
                    }
                }
                for(int j=0; j<jComboBox2.getItemCount();j++){
                    item= jComboBox2.getItemAt(j);
                    if(District.equalsIgnoreCase(item)){
                        jComboBox2.setSelectedIndex(j);
                        break;
                    }
                }
                for(int j=0; j<jComboBox3.getItemCount();j++){
                    item= jComboBox3.getItemAt(j);
                    if(City.equalsIgnoreCase(item)){
                        jComboBox3.setSelectedIndex(j);
                        break;
                    }
                }
                jLabel21.setText(FN+" "+LN);
                jLabel22.setText(Email);
                jLabel11.setIcon(Image.getImage("org",OID, 160, 180));
            }
            jLabel51.setVisible(false);
        }
        catch(ClassNotFoundException | SQLException e) {
            ER.copyReason(e.toString());
            jLabel51.setVisible(true);
            jLabel21.setText("");
            jLabel22.setText("");
        }
    }

    //Code for setting icon image in Taskbar
    private void setIcon() {
        setShape(new RoundRectangle2D.Double(0,0,800,550,25,25));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/32px_heart_with_pulse.png")));
    }
    
    //Un-used action events
    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private keeptoo.KButton kButton3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}