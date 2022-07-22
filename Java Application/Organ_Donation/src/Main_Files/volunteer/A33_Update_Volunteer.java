//Main package
package Main_Files.volunteer;

//Imported class files
import java.io.File;
import java.awt.Toolkit;
import java.nio.file.Path;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import Class_Files.GetImage;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import Class_Files.ErrorReason;
import javax.swing.JFileChooser;
import Main_Files.A02_SignIn_Page;
import java.awt.HeadlessException;
import java.awt.geom.RoundRectangle2D;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.filechooser.FileNameExtensionFilter;

//Function class
public class A33_Update_Volunteer extends javax.swing.JFrame {
    public A33_Update_Volunteer(String e) {
        initComponents();
        setIcon();
        getDetail(e);
        getInfo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        kButton1 = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();
        kButton3 = new keeptoo.KButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Volunteer Profile");
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

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_prev.png"))); // NOI18N
        jLabel18.setToolTipText("Go Back");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel18MousePressed(evt);
            }
        });
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_close_window.png"))); // NOI18N
        jLabel17.setToolTipText("Close");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 30));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_minimize_window.png"))); // NOI18N
        jLabel16.setToolTipText("Minimize");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, -1, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText(getTitle());
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel19MousePressed(evt);
            }
        });
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 0, 0));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("DCompany");
        kGradientPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 40));

        jLabel14.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("dcompany.uit@gmail.com");
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 780, 20));

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_caution.png"))); // NOI18N
        kGradientPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 20));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 100));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel1.setText("Volunteer ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 30));

        jLabel2.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel2.setText("Organizer Reference ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 140, 30));

        jLabel3.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel3.setText("First Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 120, 30));

        jLabel4.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel4.setText("Last Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 120, 30));

        jLabel5.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel5.setText("Email ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 120, 30));

        jLabel7.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel7.setText("City");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 120, 30));

        jLabel8.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel8.setText("District");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 120, 30));

        jLabel9.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel9.setText("Contact Details");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 120, 30));

        jLabel10.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel10.setText("Address");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 50, 30));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/180px_new_volunteer_cover.png"))); // NOI18N
        jLabel25.setToolTipText("Click here to upload profile picture ");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel25MousePressed(evt);
            }
        });
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 160, 180));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/180px_new_volunteer.png"))); // NOI18N
        jLabel11.setOpaque(true);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 160, 180));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField1.setToolTipText("Your Volunteer ID");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 270, 30));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField2.setToolTipText("The refered Organizer ID");
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 270, 30));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField3.setToolTipText("Enter your first name");
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 290, 30));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField4.setToolTipText("Enter your last name");
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 290, 30));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField5.setToolTipText("Enter your Email ID");
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 290, 30));

        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField9.setToolTipText("Enter your contact details");
        jTextField9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 290, 30));

        kButton1.setBorder(null);
        kButton1.setText("Reset ");
        kButton1.setToolTipText("Reset all fields");
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
        jPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 220, 45));

        kButton2.setBorder(null);
        kButton2.setText("Update Profile");
        kButton2.setToolTipText("Click here to update profile");
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
        jPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 290, 45));

        kButton3.setBorder(null);
        kButton3.setText("Get Current Info");
        kButton3.setToolTipText("Get your current information");
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
        jPanel1.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 230, 45));

        jLabel6.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 0));
        jLabel6.setText("You cannot edit above fields. For more details");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 270, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setToolTipText("Enter your current address");
        jTextArea1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 280, 150));

        jLabel12.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Upload your profile picture");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 160, -1));

        jLabel29.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 102, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("Profile picture must be less");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 160, -1));

        jLabel30.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 102, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("than 1 MB and picture");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 160, -1));

        jLabel20.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 102, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("4 : 3 ratio. Note that if you");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 160, -1));

        jLabel23.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 102, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("update profile picture you");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 160, -1));

        jLabel24.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 102, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("previous one will be");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 160, -1));

        jLabel15.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("resoulution can be up to");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 160, -1));

        jLabel21.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 102, 0));
        jLabel21.setText("please contact your corresponding Organizer.");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 270, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a option", "Alappuzha", "Ernakulam", "Idukki", "Kannur", "Kasaragod", "Kollam", "Kottayam", "Kozhikode", "Lakshadweep", "Malappuram", "Palakkad", "Pathanamthitta", "Thiruvananthapuram", "Thrissur", "Wayanad" }));
        jComboBox1.setToolTipText("Choose your district");
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 290, 30));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox2.setModel(new DefaultComboBoxModel());
        jComboBox2.setToolTipText("Choose your city");
        jComboBox2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jComboBox2.setEnabled(false);
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 290, 30));

        jLabel22.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 102, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("retrived.");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 160, -1));

        jLabel26.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 102, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("removed and it cannot be");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 160, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 800, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Global variables declared
    String Email;
    ResultSet rs= null;
    Statement stmt= null;
    Connection conn= null;
    int mousepX, mousepY, VID;
    GetImage Image= new GetImage();
    ErrorReason ER= new ErrorReason();
    
    //Code for setting JFrame minimized in taskbar
    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel16MouseClicked

    //Code for closing the application
    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        int CO= JOptionPane.showConfirmDialog(this, "Are you sure to close the application?", "Close Application", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(CO==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jLabel17MouseClicked

    //Code for going back to volunteer home page
    private void jLabel18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MousePressed
        int OP= JOptionPane.showConfirmDialog(this, "Are you sure that you want to go back to volunteer home page?\nIf Yes please choose Yes  ", "Are you sure to logout", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(OP==JOptionPane.YES_OPTION){
            new A32_Volunteer_Page(Email).setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel18MousePressed

    //Code for dragging screen across the screen
    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int coordX= evt.getXOnScreen();
        int coordY= evt.getYOnScreen();
        this.setLocation(coordX-mousepX, coordY-mousepY);
    }//GEN-LAST:event_jPanel3MouseDragged

    //Code for getting mouse pressed position
    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    //Code for executing profile update
    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        if(getChecked()==1){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                String db_url="jdbc:mysql://localhost:3306/project";
                String pwd="root";
                String user="root";
                conn= (Connection)DriverManager.getConnection(db_url,user,pwd);
                stmt= conn.createStatement();
                VID= Integer.parseInt(jTextField1.getText());
                String FN= jTextField3.getText();           
                String LN = jTextField4.getText();            
                String EMAIL= jTextField5.getText();
                String CITY= (String)jComboBox2.getSelectedItem();
                String DIS= (String)jComboBox1.getSelectedItem();
                String MOB= jTextField9.getText();
                String VADD= jTextArea1.getText();
                int OP= JOptionPane.showConfirmDialog(this, "Are you sure that you want to update your profile?\nIf Yes please choose Yes  ", "Update Profile", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
                if(OP==JOptionPane.YES_OPTION){
                    String SQL="UPDATE volunteer SET FName='"+FN+"',"
                            + "LName='"+LN+"',"
                            + "Email='"+EMAIL+"',"
                            + "City='"+CITY+"',"
                            + "District='"+DIS+"',"
                            + "Contact='"+MOB+"',"
                            + "VAddress='"+VADD+"'"
                            + "WHERE Email='"+Email+"'";
                    int row= stmt.executeUpdate(SQL);
                    if(row==1){
                        JOptionPane.showMessageDialog(this, "Your profile has been successfully updated.\nPlease Sign-In again to continue.", "Update Success", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_update.png")));
                        new A02_SignIn_Page().setVisible(true);
                        this.setVisible(false);
                    }
                }
            }
            catch(HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e){
                ER.copyReason(e.toString());
                JOptionPane.showMessageDialog(this, "An error occured while updating data into servers.\nError have been copied into your clipboard.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
            } 
        }
    }//GEN-LAST:event_kButton2ActionPerformed

    //Code for resetting fields & components
    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        new A33_Update_Volunteer(Email).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kButton1ActionPerformed

    //Code for generating cities in JComboBox 2
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
                String[] Alappuzha={"Ambalapuzha","Alappuzha","Chengannur","Cherthala",
                    "Haripad","Karthikappally","Kuttanad","Mankombu","Mavelikkara"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Alappuzha);
                jComboBox2.setModel(ComboBoxModelCity);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Ernakulam":
            {
                String[] Ernakulam={"Aluva","Ernakulam","Fort Kochi","Kanayannur","Kochi",
                    "Kothamangalam","Kunnathunad","Muvattupuzha","North Paravur","Perumbavoor"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Ernakulam);
                jComboBox2.setModel(ComboBoxModelCity);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Idukki":
            {
                String[] Idukki={"Devikulam","Idukki","Nedumkandam","Painavu","Peermade",
                    "Thodupuzha","Udumbanchola"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Idukki);
                jComboBox2.setModel(ComboBoxModelCity);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Kannur":
            {
                String[] Kannur={"Thalassery","Iritty","Kannur","Thalipparamba","Payyanur"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kannur);
                jComboBox2.setModel(ComboBoxModelCity);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Kasaragod":
            {
                String[] Kasaragod={"Hosdurg","Kasaragod","Manjeshwaram","Uppala","Vellarikundu"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kasaragod);
                jComboBox2.setModel(ComboBoxModelCity);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Kollam":
            {
                String[] Kollam={"Chathannoor","Karunagappally","Kollam","Kottarakkara",
                    "Kunnathur","Pathanapuram","Paravur","Punalur","Sasthamkotta"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kollam);
                jComboBox2.setModel(ComboBoxModelCity);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Kottayam":
            {
                String[] Kottayam={"Changanasserry","Kanjirappally","Kottayam","Meenachil",
                    "Palai","Vaikom"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kottayam);
                jComboBox2.setModel(ComboBoxModelCity);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Kozhikode":
            {
                String[] Kozhikode={"Koyilandy","Kozhikode","Thamarassery","Vatakara"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kozhikode);
                jComboBox2.setModel(ComboBoxModelCity);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Malappuram":
            {
                String[] Malappuram={"Eranad","Kondotty","Manjeri","Nilambur",
                    "Perinthalmanna","Ponnani","Tirur","Tirurangadi"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Malappuram);
                jComboBox2.setModel(ComboBoxModelCity);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Palakkad":
            {
                String[] Palakkad={"Alathur","Chittur","Mannarkkad","Ottappalam",
                    "Palakkad","Pattambi"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Palakkad);
                jComboBox2.setModel(ComboBoxModelCity);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Pathanamthitta":
            {
                String[] Pathanamthitta={"Adoor","Konni","Kozhencherry","Mallappally",
                    "Pathanamthitta","Ranni","Thiruvalla"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Pathanamthitta);
                jComboBox2.setModel(ComboBoxModelCity);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Thiruvananthapuram":
            {
                String[] Thiruvananthapuram={"Attingal","Chirayinkeezhu","Kattakada","Nedumangad",
                    "Neyyattinkara","Thiruvananthapuram","Varkala"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Thiruvananthapuram);
                jComboBox2.setModel(ComboBoxModelCity);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Thrissur":
            {
                String[] Thrissur={"Chalakudy","Chavakkad","Irinjalakuda","Kodungallur",
                    "Kunnamkulam","Mukundapuram","Thalapilly","Thrissur","Wadakkancheri"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Thrissur);
                jComboBox2.setModel(ComboBoxModelCity);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Wayanad":
            {
                String[] Wayanad={"Kalpetta","Mananthavady","Sultan Battery","Vythiri"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Wayanad);
                jComboBox2.setModel(ComboBoxModelCity);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Lakshadweep":
            {
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

    //Code for getting previous values in the fields & items
    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        getInfo();
    }//GEN-LAST:event_kButton3ActionPerformed

    //Code for updating profile picture
    private void jLabel25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MousePressed
        VID= Integer.parseInt(jTextField1.getText());
        String SelectPath;
        JFileChooser FileChoose= new JFileChooser();
        FileNameExtensionFilter Filter= new FileNameExtensionFilter("JPEG(*.jpg,*.jpeg)","jpg","jpeg");
        FileChoose.addChoosableFileFilter(Filter);
        int status= FileChoose.showOpenDialog(A33_Update_Volunteer.this);
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
                    ER.copyReason(e.toString());
                    jLabel51.setVisible(true);
                }
            }
            else if(!(temp.exists())){
                try{
                    Files.copy(SPath, DPath);
                }
                catch(IOException e){
                    ER.copyReason(e.toString());
                    jLabel51.setVisible(true);
                }
            }
            jLabel11.setIcon(Image.getImage("volunteer",VID, 160, 180));
        }
    }//GEN-LAST:event_jLabel25MousePressed

    //Code for setting icon image in taskbar
    private void setIcon() {
        setShape(new RoundRectangle2D.Double(0,0,800,550,25,25));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/32px_heart_with_pulse.png")));
    }
    
    //Code for setting profile image, Name, Email ID in JFrame
    private void getDetail(String email) {
        Email= email;
        try{
            String FN, LN;
            Class.forName("com.mysql.jdbc.Driver");
            conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt= conn.createStatement();
            rs= stmt.executeQuery("SELECT * FROM volunteer WHERE Email='"+Email+"'");
            while (rs.next()) {
                FN= rs.getString("FName");
                LN= rs.getString("LName");
                VID= rs.getInt("VID");
                jLabel11.setIcon(Image.getImage("volunteer",VID, 160, 180));
                jLabel13.setText(FN.concat(" "+LN));
                jLabel14.setText(Email);
            }
            jLabel51.setVisible(false);
        }
        catch(ClassNotFoundException | SQLException e){
            ER.copyReason(e.toString());
            jLabel13.setText("Volunteer");
            jLabel14.setText("");
            jLabel51.setVisible(true);
        }
    }
    
    //Code for getting info on fields
    private void getInfo(){
        try{
            int OrgRef;
            String FN, LN, Mob, Add, City, Dis, item;
            Class.forName("com.mysql.jdbc.Driver");
            conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt= conn.createStatement();
            rs= stmt.executeQuery("SELECT * FROM volunteer WHERE Email='"+Email+"'");
            if(rs.next()) {
                VID= rs.getInt("VID");
                OrgRef= rs.getInt("OrgRef");
                FN= rs.getString("FName");
                LN= rs.getString("LName");
                Mob= rs.getString("Contact");
                Add= rs.getString("VAddress");
                City= rs.getString("City");
                Dis= rs.getString("District");
                jTextField1.setText(Integer.toString(VID));
                jTextField2.setText(Integer.toString(OrgRef));
                jTextField3.setText(FN);
                jTextField4.setText(LN);
                jTextField5.setText(Email);
                jTextField9.setText(Mob);
                jTextArea1.setText(Add);
                for(int j=0; j<jComboBox1.getItemCount();j++){
                    item= jComboBox1.getItemAt(j);
                    if(Dis.equalsIgnoreCase(item)){
                        jComboBox1.setSelectedIndex(j);
                        break;
                    }
                }
                for(int j=0; j<jComboBox2.getItemCount();j++){
                    item= jComboBox2.getItemAt(j);
                    if(City.equalsIgnoreCase(item)){
                        jComboBox2.setSelectedIndex(j);
                        break;
                    }
                }
            }
        }
        catch(ClassNotFoundException | SQLException e){
            ER.copyReason(e.toString());
                JOptionPane.showMessageDialog(this, "An error occured while pulling data from our servers.\nError have been copied into your clipboard.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
    }

    private int getChecked(){
        int flag=0;
        if(!(jTextField3.getText().equalsIgnoreCase(""))){
            if(!(jTextField5.getText().equalsIgnoreCase(""))){
                if(!(jTextField9.getText().equalsIgnoreCase(""))){
                    if(!(jTextArea1.getText().equalsIgnoreCase(""))){
                        if(!(jComboBox1.getSelectedItem().equals("Choose a option")))
                            flag=1;
                        else
                            JOptionPane.showMessageDialog(this, "Please choose District & City.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                    }
                    else
                        JOptionPane.showMessageDialog(this, "Please enter Address of volunteer building.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                }
                else
                    JOptionPane.showMessageDialog(this, "Please enter Contact details(i.e., Mobile Number, Telephone Number, etc.).\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
            }
            else
                JOptionPane.showMessageDialog(this, "Please enter the Email ID.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
        else
            JOptionPane.showMessageDialog(this, "Please enter the First Name.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        return flag;
    }
    
    //Un-used action events
    private void jLabel19MousePressed(java.awt.event.MouseEvent evt) {}
    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {}
    
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField9;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private keeptoo.KButton kButton3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}