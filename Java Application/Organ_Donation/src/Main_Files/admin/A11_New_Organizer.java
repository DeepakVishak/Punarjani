//Main package
package Main_Files.admin;

//Imported class files
import java.io.File;
import Class_Files.*;
import java.util.Arrays;
import java.awt.Toolkit;
import java.nio.file.Path;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import java.awt.HeadlessException;
import java.awt.geom.RoundRectangle2D;
import javax.swing.DefaultComboBoxModel;
import javax.swing.filechooser.FileNameExtensionFilter;

//Function class
public class A11_New_Organizer extends javax.swing.JFrame {
    public A11_New_Organizer(String e){
        initComponents();
        getID();
        setIcon();
        CAInfo(e);
        jLabel19.setVisible(false);
        jLabel20.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel33 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        KButton1 = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create New Organizer");
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

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
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

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_minimize_window.png"))); // NOI18N
        jLabel4.setToolTipText("Minimize");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 20, 30));

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
        jLabel13.setText(getTitle());
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 153, 153));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("DCompany");
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 760, 40));

        jLabel15.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("dcompany.uit@gmail.com");
        kGradientPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 760, 20));

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_caution.png"))); // NOI18N
        jLabel51.setToolTipText("Internal error");
        kGradientPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 20));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 110));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel1.setText("Administrator Refered");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 30));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField1.setToolTipText("Your Administrator ID");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 300, 30));

        jLabel2.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel2.setText("First Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, 30));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField2.setToolTipText("Enter organizer first name");
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 300, 30));

        jLabel3.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel3.setText("Last Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, 30));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField3.setToolTipText("Enter organizer last name");
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 300, 30));

        jLabel5.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel5.setText("Email ID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 120, 30));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField4.setToolTipText("Enter organizer Email ID");
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 300, 30));

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPasswordField1.setToolTipText("Enter organizer password");
        jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 240, 30));

        jLabel6.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel6.setText("Password");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 120, 30));

        jPasswordField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPasswordField2.setToolTipText("Confirm password");
        jPasswordField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPasswordField2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jPasswordField2CaretUpdate(evt);
            }
        });
        jPanel2.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 240, 30));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/180px_new_organizer_cover.png"))); // NOI18N
        jLabel33.setToolTipText("Upload organizer profile picture");
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel33MousePressed(evt);
            }
        });
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 160, 180));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/180px_new_organizer.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel16MousePressed(evt);
            }
        });
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 160, 180));

        jLabel17.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Upload Profile Picture");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 130, 20));

        jLabel18.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel18.setText("Confirm Password");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 120, 30));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/30px_delete.png"))); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 30, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/30px_checkmark.png"))); // NOI18N
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 30, 30));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eye_50px.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel21MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel21MouseReleased(evt);
            }
        });
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 50, 30));

        KButton1.setBorder(null);
        KButton1.setText("Reset");
        KButton1.setToolTipText("Reset all fields");
        KButton1.setFont(new java.awt.Font("Cambria Math", 1, 26)); // NOI18N
        KButton1.setkEndColor(new java.awt.Color(255, 0, 255));
        KButton1.setkHoverEndColor(new java.awt.Color(2, 161, 203));
        KButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        KButton1.setkSelectedColor(new java.awt.Color(255, 0, 0));
        KButton1.setkStartColor(new java.awt.Color(2, 161, 203));
        KButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KButton1MouseClicked(evt);
            }
        });
        KButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(KButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 370, 40));

        kButton2.setBorder(null);
        kButton2.setText("Create New Organizer");
        kButton2.setToolTipText("Click here to add new organizer");
        kButton2.setFont(new java.awt.Font("Cambria Math", 1, 26)); // NOI18N
        kButton2.setkEndColor(new java.awt.Color(255, 0, 255));
        kButton2.setkHoverEndColor(new java.awt.Color(2, 161, 203));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkSelectedColor(new java.awt.Color(255, 0, 0));
        kButton2.setkStartColor(new java.awt.Color(2, 161, 203));
        kButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton2MouseClicked(evt);
            }
        });
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 370, 40));

        jLabel7.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel7.setText("Mobile N0");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 120, 30));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField5.setToolTipText("Enter organizer mobile number");
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 230, 30));

        jLabel9.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel9.setText("Organization ID");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 30));

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField7.setToolTipText("Please press this field before submiting profile");
        jTextField7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 300, 30));

        jLabel22.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel22.setText("District");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 60, 30));

        jLabel10.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel10.setText("City");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 60, 30));

        jLabel8.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Above values cannot be changed");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 320, -1));

        jLabel23.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Profile picture must");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 130, -1));

        jLabel24.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("be less than 1 MB and");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 130, -1));

        jLabel25.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("the picture ratio must");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 130, -1));

        jLabel26.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("you update profile");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 130, -1));

        jLabel27.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("picture you previous");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 130, -1));

        jLabel28.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("one will be removed");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 130, -1));

        jLabel29.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("and it cannot be");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 130, -1));

        jLabel30.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("be in 4:3. Note that if");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 130, -1));

        jLabel31.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 0, 0));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("retrived");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 130, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a option", "Kerala", "Lakshadweep" }));
        jComboBox1.setToolTipText("Choose organizer state");
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 230, 30));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox2.setModel(new DefaultComboBoxModel());
        jComboBox2.setToolTipText("Choose organizer district");
        jComboBox2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jComboBox2.setEnabled(false);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 230, 30));

        jComboBox3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox3.setModel(new DefaultComboBoxModel());
        jComboBox3.setToolTipText("Choose organizer city");
        jComboBox3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jComboBox3.setEnabled(false);
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 230, 30));

        jLabel32.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel32.setText("State");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 60, 30));

        jComboBox6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+91" }));
        jComboBox6.setToolTipText("");
        jComboBox6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 60, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 800, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Global variable declarations
    ResultSet rs= null;
    int mousepX, mousepY;
    Statement stmt= null;
    Connection con= null;
    GetImage Image= new GetImage();
    ErrorReason ER=new ErrorReason();
    CopyImage CI= new CopyImage();
    String Email, Query, ID, AID;
    
    //Code for creating new organization member
    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        if(this.getChecked()==1){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
                stmt=con.createStatement();
                int Aid= Integer.parseInt(jTextField1.getText());
                int Orgid= Integer.parseInt(jTextField7.getText());
                String fn=jTextField2.getText();
                String ln=jTextField3.getText();
                String email=jTextField4.getText();
                String mob = "+91".concat(jTextField5.getText());
                String pass = new String(jPasswordField1.getPassword());
                String state= (String)jComboBox1.getSelectedItem();
                String district= (String)jComboBox2.getSelectedItem();
                String city= (String)jComboBox3.getSelectedItem();
                Query = "INSERT INTO organization VALUES("+Aid+","+Orgid+",'"+fn+"','"+ln+"','"+email+"','"+mob+"','"+pass+"','"+state+"','"+district+"','"+city+"',0)";
                int ROW= stmt.executeUpdate(Query);
                if(ROW==1){
                    JOptionPane.showMessageDialog(this, "New organizer have been sucessfully created.\nOrganizer ID: "+Orgid+"\nName: "+fn+" "+ln+"\nEmail ID: "+email+"\nMobile No: "+mob+"", "Profile Created Sucessfully", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_ok.png")));
                    CI.Copy("org", Orgid);
                    new A11_New_Organizer(Email).setVisible(true);
                    this.setVisible(false);
                }
            }
            catch(HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e){
                ER.copyReason(e.toString());
                JOptionPane.showMessageDialog(this, "An error occured while entering data into servers.\nError have been copied into your clipboard.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
            }
        }
    }//GEN-LAST:event_kButton2ActionPerformed

    //Code for reset all fields
    private void KButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KButton1ActionPerformed
        jTextField1.setText(AID); 
        jTextField2.setText(""); 
        jTextField3.setText(""); 
        jTextField4.setText(""); 
        jTextField5.setText(""); 
        jComboBox1.setSelectedIndex(0);
        jComboBox3.setEditable(false);
        getID();
        jTextField7.setText(ID);
        jPasswordField1.setText("");
        jPasswordField2.setText("");
    }//GEN-LAST:event_KButton1ActionPerformed

    //Code for minimizing the frame
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel4MouseClicked

    //Code for close applaction
    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        int CO= JOptionPane.showConfirmDialog(this, "Are you sure to close the application.\nUnsaved process will be lost.", "Missing Information", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(CO==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jLabel11MouseClicked

    //Code for going back to administrator page
    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
        int OP= JOptionPane.showConfirmDialog(this, "Are you sure that you want to Administrator Home Page?\nIf Yes please choose Yes  ", "Are you sure to go back", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(OP==JOptionPane.YES_OPTION){
            new A05_Admin_Page(Email).setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel12MousePressed

    //Code for dragging the frame all across screen
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int coordX= evt.getXOnScreen();
        int coordY= evt.getYOnScreen();
        this.setLocation(coordX-mousepX, coordY-mousepY);
    }//GEN-LAST:event_jPanel1MouseDragged

    //Code for getting mouse pressed location
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        mousepX= evt.getX();
        mousepY= evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    //Code for decrypting the password field
    private void jLabel21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MousePressed
        jPasswordField1.setEchoChar((char)0);
    }//GEN-LAST:event_jLabel21MousePressed

    //Code for encrypting the password field
    private void jLabel21MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseReleased
        jPasswordField1.setEchoChar('*');
    }//GEN-LAST:event_jLabel21MouseReleased

    //Code for checking wether the passwods are same or not
    private void jPasswordField2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jPasswordField2CaretUpdate
        if(Arrays.equals(jPasswordField1.getPassword(), jPasswordField2.getPassword())){
            jLabel19.setVisible(false);
            jLabel20.setVisible(true);
        }
        else if(!(Arrays.equals(jPasswordField1.getPassword(), jPasswordField2.getPassword()))){
            jLabel20.setVisible(false);
            jLabel19.setVisible(true);
        }
    }//GEN-LAST:event_jPasswordField2CaretUpdate

    //Code for trimming excess numbers entered
    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        if(jTextField5.getText().length()>9)
            evt.consume();
        if(!(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'))
            evt.consume();
    }//GEN-LAST:event_jTextField5KeyTyped

    //Code for choosing state
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(jComboBox1.getSelectedItem().equals("Choose a option"))
            jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        else
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        switch (jComboBox1.getSelectedItem().toString()) {
            case "Choose a option":
            String[] Choose={""};
            DefaultComboBoxModel ComboBoxModel = new DefaultComboBoxModel(Choose);
            jComboBox3.setModel(ComboBoxModel);
            jComboBox2.setModel(ComboBoxModel);
            jComboBox3.setEnabled(false);
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

    //Code for chosing district
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if(jComboBox2.getSelectedItem().equals("Choose a option"))
        jComboBox2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        else
        jComboBox2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        switch (jComboBox2.getSelectedItem().toString()) {
            case "Choose a option":
            String[] Choose={""};
            DefaultComboBoxModel ComboBoxModel = new DefaultComboBoxModel(Choose);
            jComboBox3.setModel(ComboBoxModel);
            jComboBox3.setEnabled(false);
            break;
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

    //Code for uploading image to CDN network or system drive
    private void jLabel33MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MousePressed
        ID= jTextField7.getText();
        String SelectPath= null;
        JFileChooser FileChoose= new JFileChooser();
        FileChoose.resetChoosableFileFilters();
        FileChoose.setFileFilter(new FileNameExtensionFilter("JPEG(*.jpg,*.jpeg)","jpg","jpeg"));
        int status= FileChoose.showOpenDialog(A11_New_Organizer.this);
        if(status==JFileChooser.APPROVE_OPTION){
            SelectPath= FileChoose.getSelectedFile().getAbsolutePath();
            File source= new File(SelectPath);
            File F= new File(System.getProperty("java.class.path"));
            File Dir= F.getAbsoluteFile().getParentFile();
            String S= Dir.toString().concat("\\images\\org\\"+ID+".jpg");
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
                    JOptionPane.showMessageDialog(this, "An error occured while copy image to CDN network.\nError have been copied into your clipboard.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                }
            }
            else if(!(temp.exists())){
                try{
                    Files.copy(SPath, DPath);
                }
                catch(IOException e){
                    ER.copyReason(e.toString());
                    JOptionPane.showMessageDialog(this, "An error occured while copy image to CDN network.\nError have been copied into your clipboard.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                }
            }
            int OID= Integer.parseInt(ID);
            jLabel16.setIcon(Image.getImage("org",OID, 160, 180));
        }
    }//GEN-LAST:event_jLabel33MousePressed

    //Code for setting icon image in taskbar
    private void setIcon() {
        setShape(new RoundRectangle2D.Double(0,0,800,550,25,25));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/32px_heart_with_pulse.png")));
    }
    
    //Code for administrator Name & Email ID in JFrame
    private void CAInfo(String email) {
        Email= email;
        String FN, LN;
        int id;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM administrator WHERE Email='"+Email+"'");
            while(rs.next()) {
                id= rs.getInt("AdminID");
                FN= rs.getString("FName");
                LN= rs.getString("LName");
                String name=FN+" "+LN;
                jLabel14.setText(name);
                jLabel15.setText(Email);
                AID= Integer.toString(id);
                jTextField1.setText(AID);
            }
            jLabel51.setVisible(false);
        }
        catch(ClassNotFoundException | SQLException e){
            ER.copyReason(e.toString());
            jLabel51.setVisible(true);
            jLabel14.setText("Administrator");
            jLabel15.setText("");
        }
    }
    
    //Code for getting new Organization ID
    private void getID() {
        int i= 0, count= 0,NID = 0,max=0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt=con.createStatement();
            String sql1= "SELECT COUNT(OrgID) FROM organization";
            String sql2= "SELECT * FROM organization";
            String sql3= "SELECT MAX(OrgID) FROM organization";
            ResultSet R1= stmt.executeQuery(sql1);
            while(R1.next()){
                count= R1.getInt("COUNT(OrgID)");
            }
            int[] ids= new int[count];
            ResultSet R2= stmt.executeQuery(sql2);
            while(R2.next()){
                ids[i]= R2.getInt("OrgID");
                i++;
            }
            if(!(ids.length==0)){
                ResultSet R3= stmt.executeQuery(sql3);
                if(R3.next())
                    max= R3.getInt("MAX(OrgID)");
                Arrays.sort(ids);
                int numberArrayIndex=0;
                for(i=0;i<ids[ids.length-1];i++) {
                    if(i==ids[numberArrayIndex]) {
                        numberArrayIndex++;
                    }
                    else{
                        if(i>1000){
                            NID=i;
                        }
                    }
                }
                if(NID==0){
                    NID= ++max;
                    jTextField7.setText(Integer.toString(NID));
                }
                else
                    jTextField7.setText(Integer.toString(NID));
                if(NID<1000)
                    jTextField7.setText("1000");
            }
            else{
                jTextField7.setText("1000");
            }
        }
        catch(ClassNotFoundException | SQLException e){
            ER.copyReason(e.toString());
            jLabel51.setVisible(true);
        }
    }
    
    //Code for checking fields are empty or not
    private int getChecked(){
        int i=0;
        if(!(jTextField2.getText().equalsIgnoreCase(""))){
            if(!(jTextField4.getText().equalsIgnoreCase(""))){
                if(!(jTextField5.getText().equalsIgnoreCase(""))){
                    if(!(Arrays.toString(jPasswordField1.getPassword()).equalsIgnoreCase(""))){
                        if(Arrays.equals(jPasswordField1.getPassword(), jPasswordField2.getPassword())){
                            if(!(jComboBox1.getSelectedItem().equals("Choose a option"))){
                                if(!(jComboBox1.getSelectedItem().equals("Choose a option")))
                                    i=1;
                                else
                                    JOptionPane.showMessageDialog(this, "Please choose District and City.\nBoth are mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                            }
                            else
                                JOptionPane.showMessageDialog(this, "Please choose State.\nBoth are mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                        }
                        else
                            JOptionPane.showMessageDialog(this, "Please check wether the passwords are same.\nBoth fields are required to create organizer profile.", "Passwords Mismatch", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                    }
                    else
                        JOptionPane.showMessageDialog(this, "Please enter the Password for the account.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                }
                else
                    JOptionPane.showMessageDialog(this, "Please enter the Mobile Number.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
            }
            else
                JOptionPane.showMessageDialog(this, "Please enter the Email ID.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
        else
            JOptionPane.showMessageDialog(this, "Please enter the First Name.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        return i;
    }

    //Un-used action event
    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {}
    private void KButton1MouseClicked(java.awt.event.MouseEvent evt) {}
    private void kButton2MouseClicked(java.awt.event.MouseEvent evt) {}
    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {}
    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton KButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox6;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
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
    private javax.swing.JTextField jTextField7;
    private keeptoo.KButton kButton2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
