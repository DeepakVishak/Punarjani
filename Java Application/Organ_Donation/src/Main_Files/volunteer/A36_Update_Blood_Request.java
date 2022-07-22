//Main package
package Main_Files.volunteer;

//Imported class files
import java.awt.Color;
import java.util.Date;
import java.awt.Toolkit;
import javax.swing.JFrame;
import java.sql.ResultSet;
import java.sql.Statement;
import Class_Files.Encrypt;
import java.sql.Connection;
import Class_Files.GetImage;
import java.sql.DriverManager;
import Class_Files.ErrorReason;
import java.awt.HeadlessException;
import java.awt.geom.RoundRectangle2D;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;

//Function class
public class A36_Update_Blood_Request extends javax.swing.JFrame {
    public A36_Update_Blood_Request(String email) {
        initComponents();
        setIcon();
        getDetail(email);
        enableDisable("DISABLE", 0);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Frame = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        kButton1 = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        kButton3 = new keeptoo.KButton();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel58 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blood Collection Process");
        setMaximumSize(new java.awt.Dimension(1280, 670));
        setMinimumSize(new java.awt.Dimension(1280, 670));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkBorderRadius(25);
        kGradientPanel2.setkEndColor(new java.awt.Color(102, 102, 102));
        kGradientPanel2.setkFillBackground(false);
        kGradientPanel2.setkStartColor(new java.awt.Color(102, 102, 102));
        kGradientPanel2.setOpaque(false);
        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 670));

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
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

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_minimize_window.png"))); // NOI18N
        jLabel9.setToolTipText("Minimize");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 20, 30));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_close_window.png"))); // NOI18N
        jLabel10.setToolTipText("Close");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 30, 30));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_prev.png"))); // NOI18N
        jLabel11.setToolTipText("Go Back");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText(getTitle());
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 30));

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 0, 0));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Akil Sundhar");
        jLabel13.setToolTipText("Internal error");
        kGradientPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1260, 40));

        jLabel14.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("akilsundhar324@gmail.com");
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1260, 20));

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_caution.png"))); // NOI18N
        kGradientPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 30, 20));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1280, 90));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setEnabled(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 10, 410));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField1.setToolTipText("Enter a valid Notification ID");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 460, 30));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField2.setToolTipText("Enter the Email Id of the donor");
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 60, 450, 30));

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel1.setText("Enter Notification ID:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 140, 30));

        jLabel2.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel2.setText("Enter Email ID Of Donor: ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, -1, 30));

        jLabel3.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel3.setText("Request ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, 30));

        jLabel4.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel4.setText("Medical ID");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 90, 30));

        jLabel5.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel5.setText("Blood Group");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 90, 30));

        jLabel6.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel6.setText("Request Type");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 90, 30));

        jLabel7.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel7.setText("Member Requested");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 110, 30));

        jLabel8.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel8.setText("Contact Details");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 100, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 600, 150));

        jLabel15.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel15.setText("Request Details");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 90, 20));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 480, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 480, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 480, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 480, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 480, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 310, 30));

        Frame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/160px_new_members_cover.png"))); // NOI18N
        jPanel2.add(Frame, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 110, 140, 160));

        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/160px_new_members.png"))); // NOI18N
        jPanel2.add(Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 110, 140, 160));

        jLabel22.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel22.setText("Member Name");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 100, 30));

        jLabel23.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel23.setText("Email ID");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 100, 30));

        jLabel24.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel24.setText("Mobile Number");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 100, 30));

        jLabel25.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel25.setText("Blood Group");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 100, 30));

        jLabel26.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel26.setText("Last Blood");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 100, 30));

        jLabel27.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel27.setText("Current Priority Level");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 130, 30));

        kButton1.setBorder(null);
        kButton1.setText("Reject Request");
        kButton1.setToolTipText("Reject the request");
        kButton1.setFont(new java.awt.Font("Cambria Math", 1, 26)); // NOI18N
        kButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kButton1.setkEndColor(new java.awt.Color(255, 0, 255));
        kButton1.setkHoverEndColor(new java.awt.Color(2, 161, 203));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkStartColor(new java.awt.Color(2, 161, 203));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 490, 220, -1));

        kButton2.setBorder(null);
        kButton2.setText("Blood Donation Completed");
        kButton2.setToolTipText("Process complete sucessfully");
        kButton2.setFont(new java.awt.Font("Cambria Math", 1, 26)); // NOI18N
        kButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kButton2.setkEndColor(new java.awt.Color(255, 0, 255));
        kButton2.setkHoverEndColor(new java.awt.Color(2, 161, 203));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkStartColor(new java.awt.Color(2, 161, 203));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 490, 360, -1));

        jLabel28.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel28.setText("Blood Verified");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 100, 30));

        jLabel29.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel29.setText("Notification ID");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 100, 30));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, 310, 30));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, 310, 30));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, 310, 30));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, 310, 30));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, 310, 40));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 310, 30));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, 310, 30));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 440, 310, 30));

        jLabel38.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel38.setText("Donation Date");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 100, 20));

        jLabel39.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText(":");
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, 20, 30));

        jLabel40.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel40.setText("Age");
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 100, 30));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 260, 310, 30));

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
        jPanel2.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, -1, -1));

        jLabel42.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText(":");
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, 20, 40));

        jLabel43.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText(":");
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 20, 30));

        jLabel44.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText(":");
        jPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 20, 30));

        jLabel45.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText(":");
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 180, 20, 30));

        jLabel46.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText(":");
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 20, 30));

        jLabel47.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText(":");
        jPanel2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 440, 20, 30));

        jLabel48.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText(":");
        jPanel2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 400, 20, 30));

        jLabel49.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText(":");
        jPanel2.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 20, 30));

        jLabel50.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText(":");
        jPanel2.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 20, 30));

        jLabel52.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText(":");
        jPanel2.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 20, 30));

        jLabel53.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText(":");
        jPanel2.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 20, 30));

        jLabel54.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText(":");
        jPanel2.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 20, 30));

        jLabel55.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText(":");
        jPanel2.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 20, 20));

        jLabel56.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText(":");
        jPanel2.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 20, 30));

        jLabel57.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText(":");
        jPanel2.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 20, 30));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a option", "Yes, I have a blood donor", "No, I don't have a blood donor", "Yes, I have accepted a request" }));
        jComboBox1.setToolTipText("Choose a option for proceeding");
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 220, 30));

        jLabel58.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel58.setText("Please select a option first  :");
        jPanel2.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 170, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1280, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Global variables declared
    Connection con= null;
    Statement stmt= null;
    int mousepX, mousepY;
    Encrypt E= new Encrypt();
    GetImage Img= new GetImage();
    ErrorReason ER= new ErrorReason();
    ResultSet RS1, RS2, RS3, RS4, RS5;
    String Email, SQL1, SQL2, SQL3, SQL4, SQL5;
    SimpleDateFormat DForm= new SimpleDateFormat("dd.MM.yyyy");
    
    //Code for making JFrame minimized in taskbar
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel9MouseClicked

    //Code for closing the appliation
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        int CO= JOptionPane.showConfirmDialog(this, "Are you sure to close the application?", "Close Application", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(CO==JOptionPane.YES_OPTION)
        System.exit(0);
    }//GEN-LAST:event_jLabel10MouseClicked

    //Code for going back to volunteer home page
    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        int OP= JOptionPane.showConfirmDialog(this, "Are you sure that you want to go back to volunteer home page?\nIf Yes please choose Yes  ", "Are you sure to logout", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(OP==JOptionPane.YES_OPTION){
            new A32_Volunteer_Page(Email).setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel11MousePressed

    //Code for dragging JFrame across the screen
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int coordX= evt.getXOnScreen();
        int coordY= evt.getYOnScreen();
        this.setLocation(coordX-mousepX, coordY-mousepY);
    }//GEN-LAST:event_jPanel1MouseDragged

    //Code for getting mouse oressed position
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        mousepX= evt.getX();
        mousepY= evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    //Code for notification based function for getting information
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        String NID= jTextField1.getText();
        if(!(NID.equalsIgnoreCase(""))){
            if(jComboBox1.getSelectedItem().equals("Yes, I have a blood donor")){
                getNotification(NID, 0);
            }
            else if(jComboBox1.getSelectedItem().equals("No, I don't have a blood donor"))
                getNotification(NID, 1);
        }
        else
            JOptionPane.showMessageDialog(this, "Please enter a valid Notification ID.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
    }//GEN-LAST:event_jTextField1ActionPerformed

    //Code for enable & disable JComponents based on conditions
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(jComboBox1.getSelectedItem().equals("Choose a option")){
            enableDisable("DISABLE", 0);
            Reset();
        }
        else if(jComboBox1.getSelectedItem().equals("Yes, I have a blood donor"))
            enableDisable("ENABLE", 0);
        else if(jComboBox1.getSelectedItem().equals("No, I don't have a blood donor"))
            enableDisable("ENABLE", 1);
        else if(jComboBox1.getSelectedItem().equals("Yes, I have accepted a request"))
            enableDisable("ENABLE", 2);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    //Code for member based function for getting information
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        String MID= jTextField2.getText();
        if(!(MID.equalsIgnoreCase(""))){
            if(jComboBox1.getSelectedItem().equals("Yes, I have a blood donor")){
                memberInfo(MID, 0);
            }
            else if(jComboBox1.getSelectedItem().equals("Yes, I have accepted a request"))
                memberInfo(MID, 1);
        }
        else
            JOptionPane.showMessageDialog(this, "Please enter a valid Notification ID.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
    }//GEN-LAST:event_jTextField2ActionPerformed

    //Code for reset all fields
    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        new A36_Update_Blood_Request(Email).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kButton3ActionPerformed

    //Code for rejecting an request
    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        String RID= jLabel16.getText();
        if(!(RID.equalsIgnoreCase(""))){
            if(!(RID.equalsIgnoreCase("jLabel16"))){
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    con= (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
                    stmt= con.createStatement();
                    int EU= stmt.executeUpdate("UPDATE notify SET Accept=0 WHERE RequestID="+RID);
                    if(EU>=1)
                        JOptionPane.showMessageDialog(this, "The request has been successfully modified.", "Update Success", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_update.png")));
                    else
                        JOptionPane.showMessageDialog(this, "The request update has been failed.", "Update Failed", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                }
                catch(HeadlessException | ClassNotFoundException | SQLException e){
                    ER.copyReason(e.toString());
                    JOptionPane.showMessageDialog(this, "An error occured while pulling data from servers.\nError have been copied into your clipboard.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                }
            }
            else
                JOptionPane.showMessageDialog(this, "Please enter a valid Notification ID or Member Email ID.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
        else
            JOptionPane.showMessageDialog(this, "Please enter a valid Notification ID or Member Email ID.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
    }//GEN-LAST:event_kButton1ActionPerformed

    //code for donation sucess condition
    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        int flag=0;
        String MEID= jTextField2.getText();
        String RID= jLabel16.getText();
        if(!(RID.equalsIgnoreCase("") || RID.equalsIgnoreCase("jLabel16"))){
            if(!(MEID.equalsIgnoreCase(""))){
                flag=1;
            }
            else
                JOptionPane.showMessageDialog(this, "Please enter a Member Email ID.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
        else
            JOptionPane.showMessageDialog(this, "Please enter a valid Notification ID or Member Email ID.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        if(flag==1){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con= (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
                stmt= con.createStatement();
                SQL1= "DELETE FROM notify WHERE RequestID="+RID;
                int EU1= stmt.executeUpdate(SQL1);
                if(EU1>=1){
                    JOptionPane.showMessageDialog(this, "The notifications has been deleted successfully.", "Deletion Success", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_ok.png")));
                    SQL2= "SELECT * FROM member WHERE Email='"+MEID+"'";
                    RS1= stmt.executeQuery(SQL2);
                    if(RS1.next()){
                        int MID= RS1.getInt("MemberID");
                        SQL3= "UPDATE blood SET Priority= 3, LastBlood= curdate() WHERE MemberID="+MID;
                        int EU2= stmt.executeUpdate(SQL3);
                        if(EU2==1)
                            JOptionPane.showMessageDialog(this, "The profile has been successfully updated.", "Updation Success", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_ok.png")));
                    }
                    else
                        JOptionPane.showMessageDialog(this, "Failed to fetch Member ID.", "Error Occured", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                }
                else
                    JOptionPane.showMessageDialog(this, "The notifications has been deleted successfully.", "Deletion Success", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
            }
            catch(HeadlessException | ClassNotFoundException | SQLException e){
                ER.copyReason(e.toString());
                JOptionPane.showMessageDialog(this, "An error occured while pulling data from servers.\nError have been copied into your clipboard.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
            }
        }
    }//GEN-LAST:event_kButton2ActionPerformed

    //Code for trimming excess numbers
    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        if(jTextField1.getText().length()>9)
            evt.consume();
        if(!(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'))
            evt.consume();
    }//GEN-LAST:event_jTextField1KeyTyped

    //Code for setting icon image in taskbar
    private void setIcon() {
        setShape(new RoundRectangle2D.Double(0,0,1280,670,25,25));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/32px_heart_with_pulse.png")));
    }
    
    //Code for getting volunteer details
    private void getDetail(String email) {
        Email= email;
        String FN= null;
        String LN= null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt= con.createStatement();
            RS1= stmt.executeQuery("SELECT * FROM volunteer WHERE Email='"+Email+"'");
            while (RS1.next()) {
                FN= RS1.getString("FName");
                LN= RS1.getString("LName");
            }
            String name= FN+" "+LN;
            jLabel13.setText(name);
            jLabel14.setText(Email);
        }
        catch(ClassNotFoundException | SQLException e){
            ER.copyReason(e.toString());
            jLabel13.setText("Volunteer");
            jLabel14.setText("");
            jLabel51.setVisible(true);
        }
    }
    
    //Code for getting information of member
    private void memberInfo(String memail, int flag){
        String MEmail= memail;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt= con.createStatement();
            SQL1= "SELECT * FROM member WHERE Email='"+MEmail+"'";
            RS1= stmt.executeQuery(SQL1);
            if(RS1.next()){
                String FN= RS1.getString("FName");
                String LN= RS1.getString("LName");
                String MO= RS1.getString("Mobile");
                String AG= RS1.getString("Age");
                String BG= RS1.getString("BloodGroup");
                String ID= RS1.getString("MemberID");
                jLabel30.setText(FN+" "+LN);
                jLabel31.setText(MEmail);
                jLabel32.setText(MO);
                jLabel41.setText(AG);
                jLabel33.setText(BG);
                Image.setIcon(Img.getImage("member",Integer.parseInt(ID), 140, 160));
                SQL2= "SELECT * FROM blood WHERE MemberID="+ID;
                RS2= stmt.executeQuery(SQL2);
                if(RS2.next()){
                    String VER= RS2.getString("Verify");
                    Date LBD= RS2.getDate("LastBlood");
                    String PRI= RS2.getString("Priority");
                    String DTS= DForm.format(LBD);
                    if("3".equals(VER))
                        jLabel35.setText("Verified Member");
                    
                    else{
                       jLabel35.setText("Not Verified Member");
                       jLabel35.setForeground(Color.RED);
                    }
                    jLabel34.setText(DTS);
                    if(null!=PRI)switch (PRI) {
                        case "0":
                            jLabel37.setText("Healthy Member");
                            jLabel37.setForeground(Color.GREEN);
                            break;
                        case "1":
                            jLabel37.setText("Average Healthy Member");
                            jLabel37.setForeground(Color.YELLOW);
                            break;
                        case "2":
                            jLabel37.setText("Weak Member");
                            jLabel37.setForeground(Color.ORANGE);
                            break;
                        case "3":
                            jLabel37.setText("Extreamly Weak Member");
                            jLabel37.setForeground(Color.RED);
                            break;
                        default:
                            break;
                    }
                    SQL3= "SELECT * FROM notify WHERE ID="+ID;
                    RS3= stmt.executeQuery(SQL3);
                    if(RS3.next()){
                        String NID= RS3.getString("NID");
                        jLabel36.setText(NID);
                        if(flag==1)
                            getNotification(NID, 0);
                    }
                    else{
                        jLabel36.setText("Not accepted any request");
                        jLabel36.setForeground(Color.RED);
                    }
                }
            }
            else
                JOptionPane.showMessageDialog(this, "The requested Member Details is not found on our servers.\nTry again with different Email ID", "Inncorrect Detail", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
        catch(HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e){
            ER.copyReason(e.toString());
            JOptionPane.showMessageDialog(this, "An error occured while pulling data from servers.\nError have been copied into your clipboard.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
    }
    
    //Code for getting information
    private void getNotification(String NID, int flag){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt= con.createStatement();
            SQL1= "SELECT * FROM notify WHERE NID="+NID;
            RS1= stmt.executeQuery(SQL1);
            if(RS1.next()){
                String RID= RS1.getString("RequestID");
                String BGP= RS1.getString("BloodGroup");
                String BRT= RS1.getString("Type");
                String RDE= RS1.getString("Details");
                String MID= RS1.getString("MedicalID");
                String ID= RS1.getString("ID");
                jLabel16.setText(RID);
                jLabel17.setText(MID);
                jLabel18.setText(BGP);
                jLabel19.setText(BRT);
                jTextArea1.setText(RDE);
                SQL2= "SELECT * FROM request WHERE RequestID="+RID;
                RS2= stmt.executeQuery(SQL2);
                if(RS2.next()){
                    String MeID= RS2.getString("MemberID");
                    SQL3= "SELECT * FROM member WHERE MemberID="+MeID;
                    RS3= stmt.executeQuery(SQL3);
                    if(RS3.next()){
                        String FN= RS3.getString("FName");
                        String LN= RS3.getString("LName");
                        String EID= RS3.getString("Email");
                        String MOB= RS3.getString("Mobile");
                        jLabel20.setText(FN+" "+LN);
                        jLabel21.setText(MOB+" :: "+EID);
                        if(flag==1){
                            SQL4= "SELECT * FROM member WHERE MemberID="+ID;
                            RS4= stmt.executeQuery(SQL4);
                            if(RS4.next()){
                                String AEID= RS4.getString("Email");
                                memberInfo(AEID, 0);
                            }
                        }
                    }
                }
            }
            else
                JOptionPane.showMessageDialog(this, "The requested Notification ID is not found on our servers.\nTry again with different Notification ID", "Inncorrect Detail", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e){
            ER.copyReason(e.toString());
            JOptionPane.showMessageDialog(this, "An error occured while pulling data from servers.\nError have been copied into your clipboard.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
    }
    
    //Code for enablling and disabling JComponents
    private void enableDisable(String FUN, int flag){
        if(FUN.equals("DISABLE")){
            jLabel1.setEnabled(false);
            jLabel2.setEnabled(false);
            jLabel3.setEnabled(false);
            jLabel4.setEnabled(false);
            jLabel5.setEnabled(false);
            jLabel6.setEnabled(false);
            jLabel7.setEnabled(false);
            jLabel8.setEnabled(false);
            jLabel15.setEnabled(false);
            jLabel16.setEnabled(false);
            jLabel17.setEnabled(false);
            jLabel18.setEnabled(false);
            jLabel19.setEnabled(false);
            jLabel20.setEnabled(false);
            jLabel21.setEnabled(false);
            jLabel22.setEnabled(false);
            jLabel23.setEnabled(false);
            jLabel24.setEnabled(false);
            jLabel25.setEnabled(false);
            jLabel26.setEnabled(false);
            jLabel27.setEnabled(false);
            jLabel28.setEnabled(false);
            jLabel29.setEnabled(false);
            jLabel30.setEnabled(false);
            jLabel31.setEnabled(false);
            jLabel32.setEnabled(false);
            jLabel33.setEnabled(false);
            jLabel34.setEnabled(false);
            jLabel35.setEnabled(false);
            jLabel36.setEnabled(false);
            jLabel37.setEnabled(false);
            jLabel38.setEnabled(false);
            jLabel39.setEnabled(false);
            jLabel40.setEnabled(false);
            jLabel41.setEnabled(false);
            jLabel42.setEnabled(false);
            jLabel43.setEnabled(false);
            jLabel44.setEnabled(false);
            jLabel45.setEnabled(false);
            jLabel46.setEnabled(false);
            jLabel47.setEnabled(false);
            jLabel48.setEnabled(false);
            jLabel49.setEnabled(false);
            jLabel50.setEnabled(false);
            jLabel52.setEnabled(false);
            jLabel53.setEnabled(false);
            jLabel54.setEnabled(false);
            jLabel55.setEnabled(false);
            jLabel56.setEnabled(false);
            jLabel57.setEnabled(false);
            kButton1.setEnabled(false);
            kButton2.setEnabled(false);
            kButton3.setEnabled(false);
            jTextArea1.setEnabled(false);
            jTextField1.setEnabled(false);
            jTextField2.setEnabled(false);
            jSeparator1.setForeground(Color.GRAY);
        }
        else if(FUN.equals("ENABLE")){
            jLabel1.setEnabled(true);
            jLabel2.setEnabled(true);
            jLabel3.setEnabled(true);
            jLabel4.setEnabled(true);
            jLabel5.setEnabled(true);
            jLabel6.setEnabled(true);
            jLabel7.setEnabled(true);
            jLabel8.setEnabled(true);
            jLabel15.setEnabled(true);
            jLabel16.setEnabled(true);
            jLabel17.setEnabled(true);
            jLabel18.setEnabled(true);
            jLabel19.setEnabled(true);
            jLabel20.setEnabled(true);
            jLabel21.setEnabled(true);
            jLabel22.setEnabled(true);
            jLabel23.setEnabled(true);
            jLabel24.setEnabled(true);
            jLabel25.setEnabled(true);
            jLabel26.setEnabled(true);
            jLabel27.setEnabled(true);
            jLabel28.setEnabled(true);
            jLabel29.setEnabled(true);
            jLabel30.setEnabled(true);
            jLabel31.setEnabled(true);
            jLabel32.setEnabled(true);
            jLabel33.setEnabled(true);
            jLabel34.setEnabled(true);
            jLabel35.setEnabled(true);
            jLabel36.setEnabled(true);
            jLabel37.setEnabled(true);
            jLabel38.setEnabled(true);
            jLabel39.setEnabled(true);
            jLabel40.setEnabled(true);
            jLabel41.setEnabled(true);
            jLabel42.setEnabled(true);
            jLabel43.setEnabled(true);
            jLabel44.setEnabled(true);
            jLabel45.setEnabled(true);
            jLabel46.setEnabled(true);
            jLabel47.setEnabled(true);
            jLabel48.setEnabled(true);
            jLabel49.setEnabled(true);
            jLabel50.setEnabled(true);
            jLabel52.setEnabled(true);
            jLabel53.setEnabled(true);
            jLabel54.setEnabled(true);
            jLabel55.setEnabled(true);
            jLabel56.setEnabled(true);
            jLabel57.setEnabled(true);
            kButton1.setEnabled(true);
            kButton2.setEnabled(true);
            kButton3.setEnabled(true);
            jTextArea1.setEnabled(true);
            jSeparator1.setForeground(Color.GRAY);
            switch(flag){
                case 0:
                    jTextField1.setEnabled(true);
                    jTextField2.setEnabled(true);
                    break;
                case 1:
                    jTextField1.setEnabled(true);
                    jLabel2.setEnabled(false);
                    jTextField2.setEnabled(false);
                    break;
                case 2:
                    jTextField1.setEnabled(false);
                    jLabel1.setEnabled(false);
                    jTextField2.setEnabled(true);
                    break;
                default:
                    break;
            }
        }
    }
    
    //Code for basic reset function
    private void Reset(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextArea1.setText("");
        jLabel16.setText("");
        jLabel17.setText("");
        jLabel18.setText("");
        jLabel19.setText("");
        jLabel20.setText("");
        jLabel21.setText("");
        jLabel30.setText("");
        jLabel31.setText("");
        jLabel32.setText("");
        jLabel33.setText("");
        jLabel34.setText("");
        jLabel35.setText("");
        jLabel36.setText("");
        jLabel37.setText("");
        jLabel41.setText("");
        jComboBox1.setSelectedItem("Choose a option");
        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/160px_new_members.png")));
        enableDisable("DISABLE", 0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Frame;
    private javax.swing.JLabel Image;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private keeptoo.KButton kButton3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}