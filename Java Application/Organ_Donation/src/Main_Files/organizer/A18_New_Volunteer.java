//Main package
package Main_Files.organizer;

//Imported class files
import java.io.File;
import java.util.Arrays;
import java.awt.Toolkit;
import java.nio.file.Path;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import java.nio.file.Paths;
import java.sql.Connection;
import java.io.IOException;
import java.nio.file.Files;
import Class_Files.GetImage;
import java.sql.SQLException;
import java.sql.DriverManager;
import Class_Files.ErrorReason;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.filechooser.FileNameExtensionFilter;

//Function class
public class A18_New_Volunteer extends javax.swing.JFrame {
    public A18_New_Volunteer(String e) {
        initComponents();
        setIcon();
        getDetail(e);
        getVID();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        kButton1 = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Volunteer");
        setMaximumSize(new java.awt.Dimension(800, 550));
        setMinimumSize(new java.awt.Dimension(800, 550));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkBorderRadius(25);
        kGradientPanel2.setkEndColor(new java.awt.Color(102, 102, 102));
        kGradientPanel2.setkFillBackground(false);
        kGradientPanel2.setkStartColor(new java.awt.Color(102, 102, 102));
        kGradientPanel2.setOpaque(false);
        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 550));

        jPanel1.setBackground(new java.awt.Color(255, 81, 47));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
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

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_minimize_window.png"))); // NOI18N
        jLabel10.setToolTipText("Minimize");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 40, 30));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_close_window.png"))); // NOI18N
        jLabel11.setToolTipText("Close");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 30));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_prev.png"))); // NOI18N
        jLabel12.setToolTipText("Go Back");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText(this.getTitle());
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 81, 47));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Akil Sundhar");
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 760, 40));

        jLabel15.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("dcompany.uit@gmail.com");
        kGradientPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 760, 20));

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_caution.png"))); // NOI18N
        jLabel51.setToolTipText("Internal error");
        kGradientPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 20));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 110));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel1.setText("Volunteer ID");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 30));

        jLabel2.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel2.setText("Organizer Refered");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 110, 30));

        jLabel3.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel3.setText("First Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 110, 30));

        jLabel4.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel4.setText("Last Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 110, 30));

        jLabel5.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel5.setText("Email ID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 110, 30));

        jLabel6.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel6.setText("New Password");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 110, 30));

        jLabel7.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel7.setText("City");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 50, 30));

        jLabel8.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel8.setText("District");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 50, 30));

        jLabel9.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel9.setText("Mobile");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 50, 30));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField1.setToolTipText("New Volunteer ID");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField1MousePressed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 270, 30));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField2.setToolTipText("Your Organization ID");
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField2MousePressed(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 270, 30));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField3.setToolTipText("Enter the first name of volunteer");
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 270, 30));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField4.setToolTipText("Enter the last name of volunteer");
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 270, 30));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField5.setToolTipText("Enter the Email ID of volunteer");
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 270, 30));

        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField8.setToolTipText("Enter contact numbers for volunteer");
        jTextField8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 290, 30));

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPasswordField1.setToolTipText("Enter password for volunteer");
        jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 230, 30));

        jPasswordField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPasswordField2.setToolTipText("Confirm password for volunteer");
        jPasswordField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPasswordField2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jPasswordField2CaretUpdate(evt);
            }
        });
        jPanel2.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 230, 30));

        kButton1.setBorder(null);
        kButton1.setText("Create Profile");
        kButton1.setToolTipText("Ready to create profile ");
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
        jPanel2.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 370, 50));

        kButton2.setBorder(null);
        kButton2.setText("Reset");
        kButton2.setToolTipText("Reset all values");
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
        jPanel2.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 370, 50));

        jLabel16.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 255));
        jLabel16.setText("You can't modify above values or details");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 270, -1));

        jLabel17.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel17.setText("Confirm Password");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 110, 30));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a option", "Alappuzha", "Ernakulam", "Idukki", "Kannur", "Kasaragod", "Kollam", "Kottayam", "Kozhikode", "Lakshadweep", "Malappuram", "Palakkad", "Pathanamthitta", "Thiruvananthapuram", "Thrissur", "Wayanad" }));
        jComboBox1.setToolTipText("Choose the district for volunteer");
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 290, 30));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox2.setModel(new DefaultComboBoxModel());
        jComboBox2.setToolTipText("Choose the city for volunteer");
        jComboBox2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jComboBox2.setEnabled(false);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 290, 30));

        jLabel18.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Please Insert a Profile Picture");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 180, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/180px_new_volunteer_cover.png"))); // NOI18N
        jLabel20.setToolTipText("Press here to add profile picture");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel20MousePressed(evt);
            }
        });
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 160, 180));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/180px_new_volunteer.png"))); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 160, 180));

        jLabel29.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 51, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("Profile picture must be less");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 180, -1));

        jLabel30.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 51, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("than 1 MB and picture");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 180, -1));

        jLabel31.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 51, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("resoulution can be up to 4 : 3");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 180, -1));

        jLabel34.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 51, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel34.setText("be removed and it cannot be");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 180, -1));

        jLabel33.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 51, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setText("picture you previous  one will");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 180, -1));

        jLabel32.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 51, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("ratio. Note that if you update");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 180, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/30px_checkmark.png"))); // NOI18N
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 30, 30));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/30px_delete.png"))); // NOI18N
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 30, 30));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/30px_eye.png"))); // NOI18N
        jLabel27.setToolTipText("Like to see what you typed");
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel27MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel27MouseReleased(evt);
            }
        });
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, 30));

        jLabel21.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 51, 255));
        jLabel21.setText("retrived.");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 180, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 800, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Global variables declared
    ResultSet rs= null;
    Connection con= null;
    Statement stmt= null;
    int mousepX, mousepY, OID, VID;
    String Email, District, City, Query;
    ErrorReason ER= new ErrorReason();
    GetImage Image= new GetImage();
    
    //Code for setting JFrame minimized in taskbar
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel10MouseClicked

    //Code for closing application
    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        int CO= JOptionPane.showConfirmDialog(this, "Are you sure to close the application?", "Close Application", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(CO==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jLabel11MouseClicked

    //Code for going back to organization home page
    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
        int OP= JOptionPane.showConfirmDialog(this, "Are you sure that you want to go back to organization home page?\nIf Yes please choose Yes  ", "Are you sure to logout", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(OP==JOptionPane.YES_OPTION){
            new A15_Organizer_Page(Email).setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel12MousePressed

    //Code for dragging JFrame across screen
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int coordX= evt.getXOnScreen();
        int coordY= evt.getYOnScreen();
        this.setLocation(coordX-mousepX, coordY-mousepY);
    }//GEN-LAST:event_jPanel1MouseDragged

    //Code for getting mouse pressed position
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    //Code for resetting fields
    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        new A18_New_Volunteer(Email).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kButton2ActionPerformed

    //Code for inserting record into database
    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        int flag=0;
        if(!("".equals(jTextField3.getText()))){
            if(!("".equals(jTextField5.getText()))){
                if(!("".equals(jTextField8.getText()))){
                    if(!("".equals(Arrays.toString(jPasswordField1.getPassword())))){
                        if(!("".equals(Arrays.toString(jPasswordField2.getPassword())))){
                            if(Arrays.equals(jPasswordField1.getPassword(), jPasswordField2.getPassword())){
                                if(!(District==null)){
                                    flag=1;
                                }
                                else
                                    JOptionPane.showMessageDialog(this, "Please choose a district and state.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                            }
                            else
                                JOptionPane.showMessageDialog(this, "Passwords are not matching.", "Password Mismatch", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                        }
                        else
                            JOptionPane.showMessageDialog(this, "Please enter a password.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                    }
                    else
                        JOptionPane.showMessageDialog(this, "Please enter a password.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                }
                else
                    JOptionPane.showMessageDialog(this, "Please enter the contact details.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
            }
            else
                JOptionPane.showMessageDialog(this, "Please enter the Email ID.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
        else
            JOptionPane.showMessageDialog(this, "Please enter the first name.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        if(flag==1){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
                stmt= con.createStatement();
                VID= Integer.parseInt(jTextField1.getText());
                OID= Integer.parseInt(jTextField2.getText());
                String FN= jTextField3.getText();
                String LN= jTextField4.getText();
                String EID= jTextField5.getText();
                String Pass= new String(jPasswordField1.getPassword());
                String MO= jTextField8.getText();
                City= (String)jComboBox2.getSelectedItem();
                Query = "INSERT INTO volunteer VALUES("+VID+","+OID+",'"+FN+"','"+LN+"',"
                        + "'"+EID+"','"+Pass+"','"+MO+"','Please enter your current address','"+City+"','"+District+"',0)";
                int row= stmt.executeUpdate(Query);
                if(row==1)
                    JOptionPane.showMessageDialog(this, "New volunteer profile has been created successfully.\nName: "+FN+" "+LN+"\nEmail ID: "+EID+"\nPassword: "+Pass+"", "Update Success", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_update.png")));
        }
        catch(ClassNotFoundException | NumberFormatException | SQLException e)
        {
            ER.copyReason(e.toString());
            JOptionPane.showMessageDialog(this, "An error occured while updating data into servers.\nError have been copied into your clipboard.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
    }
    }//GEN-LAST:event_kButton1ActionPerformed

    //Code for changing password field to visible
    private void jLabel27MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MousePressed
        jPasswordField1.setEchoChar((char)0);
    }//GEN-LAST:event_jLabel27MousePressed

    //code for encrypting password fields
    private void jLabel27MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseReleased
        jPasswordField1.setEchoChar('*');
    }//GEN-LAST:event_jLabel27MouseReleased

    //Code for checking wether passwords are correct
    private void jPasswordField2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jPasswordField2CaretUpdate
        if(Arrays.equals(jPasswordField1.getPassword(), jPasswordField2.getPassword())){
            jLabel26.setVisible(false);
            jLabel25.setVisible(true);
        }
        else if(!(Arrays.equals(jPasswordField1.getPassword(), jPasswordField2.getPassword()))){
            jLabel25.setVisible(false);
            jLabel26.setVisible(true);
        }
    }//GEN-LAST:event_jPasswordField2CaretUpdate

    //Code for setting values in jComboBox2
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        switch (jComboBox1.getSelectedItem().toString()) {
            case "Choose a option":
                String[] Choose={"Choose a option"};
                DefaultComboBoxModel ComboBoxModel = new DefaultComboBoxModel(Choose);
                jComboBox2.setModel(ComboBoxModel);
                jComboBox2.setEnabled(false);
                break;
            case "Alappuzha":
                {
                    District="Alappuzha";
                    String[] Alappuzha={"Ambalapuzha","Alappuzha","Chengannur","Cherthala",
                        "Haripad","Karthikappally","Kuttanad","Mankombu","Mavelikkara"};
                    DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Alappuzha);
                    jComboBox2.setModel(ComboBoxModelCity);
                    jComboBox2.setEnabled(true);
                    break;
                }
            case "Ernakulam":
                {
                    District="Ernakulam";
                    String[] Ernakulam={"Aluva","Ernakulam","Fort Kochi","Kanayannur","Kochi",
                        "Kothamangalam","Kunnathunad","Muvattupuzha","North Paravur","Perumbavoor"};
                    DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Ernakulam);
                    jComboBox2.setModel(ComboBoxModelCity);
                    jComboBox2.setEnabled(true);
                    break;
                }    
            case "Idukki":
                {
                    District="Idukki";
                    String[] Idukki={"Devikulam","Idukki","Nedumkandam","Painavu","Peermade",
                        "Thodupuzha","Udumbanchola"};
                    DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Idukki);
                    jComboBox2.setModel(ComboBoxModelCity);
                    jComboBox2.setEnabled(true);
                    break;
                }  
            case "Kannur":
                {
                    District="Kannur";
                    String[] Kannur={"Thalassery","Iritty","Kannur","Thalipparamba","Payyanur"};
                    DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kannur);
                    jComboBox2.setModel(ComboBoxModelCity);
                    jComboBox2.setEnabled(true);
                    break;
                }
            case "Kasaragod":
                {
                    District="Kasaragod";
                    String[] Kasaragod={"Hosdurg","Kasaragod","Manjeshwaram","Uppala","Vellarikundu"};
                    DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kasaragod);
                    jComboBox2.setModel(ComboBoxModelCity);
                    jComboBox2.setEnabled(true);
                    break;
                }
            case "Kollam":
                {
                    District="Kollam";
                    String[] Kollam={"Chathannoor","Karunagappally","Kollam","Kottarakkara",
                        "Kunnathur","Pathanapuram","Paravur","Punalur","Sasthamkotta"};
                    DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kollam);
                    jComboBox2.setModel(ComboBoxModelCity);
                    jComboBox2.setEnabled(true);
                    break;
                }
            case "Kottayam":
                {
                    District="Kottayam";
                    String[] Kottayam={"Changanasserry","Kanjirappally","Kottayam","Meenachil",
                        "Palai","Vaikom"};
                    DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kottayam);
                    jComboBox2.setModel(ComboBoxModelCity);
                    jComboBox2.setEnabled(true);
                    break;
                }
            case "Kozhikode":
                {
                    District="Kozhikode";
                    String[] Kozhikode={"Koyilandy","Kozhikode","Thamarassery","Vatakara"};
                    DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kozhikode);
                    jComboBox2.setModel(ComboBoxModelCity);
                    jComboBox2.setEnabled(true);
                    break;
                }
            case "Malappuram":
                {
                    District="Malappuram";
                    String[] Malappuram={"Eranad","Kondotty","Manjeri","Nilambur",
                        "Perinthalmanna","Ponnani","Tirur","Tirurangadi"};
                    DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Malappuram);
                    jComboBox2.setModel(ComboBoxModelCity);
                    jComboBox2.setEnabled(true);
                    break;
                }
            case "Palakkad":
                {
                    District="Palakkad";
                    String[] Palakkad={"Alathur","Chittur","Mannarkkad","Ottappalam",
                        "Palakkad","Pattambi"};
                    DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Palakkad);
                    jComboBox2.setModel(ComboBoxModelCity);
                    jComboBox2.setEnabled(true);
                    break;
                }
            case "Pathanamthitta":
                {
                    District="Pathanamthitta";
                    String[] Pathanamthitta={"Adoor","Konni","Kozhencherry","Mallappally",
                        "Pathanamthitta","Ranni","Thiruvalla"};
                    DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Pathanamthitta);
                    jComboBox2.setModel(ComboBoxModelCity);
                    jComboBox2.setEnabled(true);
                    break;
                }
            case "Thiruvananthapuram":
                {
                    District="Thiruvananthapuram";
                    String[] Thiruvananthapuram={"Attingal","Chirayinkeezhu","Kattakada","Nedumangad",
                        "Neyyattinkara","Thiruvananthapuram","Varkala"};
                    DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Thiruvananthapuram);
                    jComboBox2.setModel(ComboBoxModelCity);
                    jComboBox2.setEnabled(true);
                    break;
                }
            case "Thrissur":
                {
                    District="Thrissur";
                    String[] Thrissur={"Chalakudy","Chavakkad","Irinjalakuda","Kodungallur",
                        "Kunnamkulam","Mukundapuram","Thalapilly","Thrissur","Wadakkancheri"};
                    DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Thrissur);
                    jComboBox2.setModel(ComboBoxModelCity);
                    jComboBox2.setEnabled(true);
                    break;
                }  
            case "Wayanad":
                {
                    District="Wayanad";
                    String[] Wayanad={"Kalpetta","Mananthavady","Sultan Battery","Vythiri"};
                    DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Wayanad);
                    jComboBox2.setModel(ComboBoxModelCity);
                    jComboBox2.setEnabled(true);
                    break;
                } 
            case "Lakshadweep":
                {
                    District="Kavaratti";
                    String[] Kavaratti={"Kavaratti"};
                    DefaultComboBoxModel ComboBoxModelDistrict = new DefaultComboBoxModel(Kavaratti);
                    jComboBox2.setModel(ComboBoxModelDistrict);
                    jComboBox2.setEnabled(true);
                    break;
                }
            default:
                break;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    //Code for getting VolunteerID
    private void jTextField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MousePressed
        getVID();
    }//GEN-LAST:event_jTextField1MousePressed

    private void jLabel20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MousePressed
        VID= Integer.parseInt(jTextField1.getText());
        String SelectPath;
        JFileChooser FileChoose= new JFileChooser();
        FileChoose.resetChoosableFileFilters();
        FileChoose.setFileFilter(new FileNameExtensionFilter("JPEG(*.jpg,*.jpeg)","jpg","jpeg"));
        int status= FileChoose.showOpenDialog(A18_New_Volunteer.this);
        if(status==JFileChooser.APPROVE_OPTION){
            SelectPath= FileChoose.getSelectedFile().getAbsolutePath();
            File source= new File(SelectPath);
            File F= new File(System.getProperty("java.class.path"));
            File Dir= F.getAbsoluteFile().getParentFile();
            String S= Dir.toString().concat("\\images\\volunteer\\"+VID+".jpg");
            Path DPath= Paths.get(S);
            Path SPath= source.toPath();
            File temp= new File(S);
            if(temp.exists()){
                temp.delete();
                try{
                    Files.copy(SPath, DPath);
                }
                catch(IOException e){
                    JOptionPane.showMessageDialog(this, "An error occured while uploading data into CDN.\nError have been copied into your clipboard.\nPlease feedback it and try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                    ER.copyReason(e.toString());
                }
            }
            else if(!(temp.exists())){
                try{
                    Files.copy(SPath, DPath);
                }
                catch(IOException e){
                    JOptionPane.showMessageDialog(this, "An error occured while removing previous image from CDN.\nError have been copied into your clipboard.\nPlease feedback it and try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                    ER.copyReason(e.toString());
                }
            }
            jLabel19.setIcon(Image.getImage("volunteer", VID, 160, 180));
        }
    }//GEN-LAST:event_jLabel20MousePressed

    //Code for setting icon in taskbar 
    private void setIcon() {
        setShape(new RoundRectangle2D.Double(0,0,800,550,25,25));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/32px_heart_with_pulse.png")));
    }

    //Code for getting Organizer Details
    private void getDetail(String email) {
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
                OID= rs.getInt("OrgID");
                String OFN= rs.getString("FName");
                String OLN = rs.getString("Lname");
                jLabel14.setText(OFN+" "+OLN);
                jLabel15.setText(Email);
                jTextField2.setText(Integer.toString(OID));
                jLabel51.setVisible(false);
            }
        }
        catch(ClassNotFoundException | SQLException e) {
            ER.copyReason(e.toString());
            jLabel14.setText("Organization");
            jLabel15.setText("");
            jLabel51.setVisible(true);
        }
    }

    //Code for getting VolunteerID
    private void getVID() {
        int i= 0, count= 0,NID = 0,max=0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt=con.createStatement();
            String sql1= "SELECT COUNT(VID) FROM volunteer";
            String sql2= "SELECT * FROM volunteer";
            String sql3= "SELECT MAX(VID) FROM volunteer";
            ResultSet R1= stmt.executeQuery(sql1);
            while(R1.next()){
                count= R1.getInt("COUNT(VID)");
            }
            int[] ids= new int[count];
            ResultSet R2= stmt.executeQuery(sql2);
            while(R2.next()){
                ids[i]= R2.getInt("VID");
                i++;
            }
            if(!(ids.length==0)){
                ResultSet R3= stmt.executeQuery(sql3);
                if(R3.next())
                    max= R3.getInt("MAX(VID)");
                Arrays.parallelSort(ids);
                int numberArrayIndex=0;
                for(i=0;i<ids[ids.length-1];i++) {
                    if(i==ids[numberArrayIndex]) {
                        numberArrayIndex++;
                    }
                    else{
                        if(i>100000){
                            NID=i;
                        }
                    }
                }
                if(NID==0){
                    NID= ++max;
                    jTextField1.setText(Integer.toString(NID));
                }
                else{
                    jTextField1.setText(Integer.toString(NID));
                }
            }
            else{
                NID= 100000;
                jTextField1.setText(Integer.toString(NID));
            }
            jLabel51.setVisible(false);
        }
        catch(ClassNotFoundException | SQLException e){
            ER.copyReason(e.toString());
            jLabel51.setVisible(true);
        }
    }

    //Un-used action events
    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {}
    private void jTextField2MousePressed(java.awt.event.MouseEvent evt) {}
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {}
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}