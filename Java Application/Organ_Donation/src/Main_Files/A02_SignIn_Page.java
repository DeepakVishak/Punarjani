//Main package
package Main_Files;

//Imported class files
import java.awt.*;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Class_Files.ErrorReason;
import Main_Files.admin.A05_Admin_Page;
import Main_Files.member.A25_Member_Page;
import Main_Files.organizer.A15_Organizer_Page;
import Main_Files.volunteer.A32_Volunteer_Page;
import java.awt.geom.RoundRectangle2D;

//Function class
public class A02_SignIn_Page extends javax.swing.JFrame {
    public A02_SignIn_Page() {
        initComponents();
        Info();
        setIcon();
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel52.setVisible(false);
        kButton2.setVisible(false);
        OK6.setVisible(false);
        OK7.setVisible(false);
        OK8.setVisible(false);
        OK9.setVisible(false);
        OK10.setVisible(false);
        OK11.setVisible(false);
        OK12.setVisible(false);
        kGradientPanel6.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel7 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        kButton1 = new keeptoo.KButton();
        jLabel13 = new javax.swing.JLabel();
        OK6 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        OK7 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        OK8 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        OK9 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        OK10 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        OK11 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        OK12 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel27 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        kButton2 = new keeptoo.KButton();
        jLabel23 = new javax.swing.JLabel();
        kButton3 = new keeptoo.KButton();
        jLabel51 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SignIn Page");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel7.setkBorderRadius(25);
        kGradientPanel7.setkEndColor(new java.awt.Color(102, 102, 102));
        kGradientPanel7.setkFillBackground(false);
        kGradientPanel7.setkStartColor(new java.awt.Color(102, 102, 102));
        kGradientPanel7.setOpaque(false);
        getContentPane().add(kGradientPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 600));

        jPanel1.setBackground(new java.awt.Color(2, 161, 203));
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

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_minimize_window.png"))); // NOI18N
        jLabel1.setToolTipText("Minimize");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 20, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_close_window.png"))); // NOI18N
        jLabel2.setToolTipText("Close");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 30, 30));

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_prev.png"))); // NOI18N
        jLabel34.setToolTipText("Go Back");
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel34MousePressed(evt);
            }
        });
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_comments.png"))); // NOI18N
        jLabel35.setToolTipText("Go to feedback page");
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 30, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(getTitle());
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 30));

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(2, 161, 203));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jLabel3.setText("Welcome User");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 430, -1));

        jLabel5.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jLabel5.setText("Login to Punarjani");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 430, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField1.setToolTipText("Enter you Email ID here");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        jTextField1.setOpaque(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 430, 30));

        kButton1.setBorder(null);
        kButton1.setText("Continue");
        kButton1.setToolTipText("Proceed to next step");
        kButton1.setFont(new java.awt.Font("Cambria Math", 1, 26)); // NOI18N
        kButton1.setkBorderRadius(20);
        kButton1.setkEndColor(new java.awt.Color(255, 0, 255));
        kButton1.setkHoverEndColor(new java.awt.Color(2, 161, 203));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkStartColor(new java.awt.Color(2, 161, 203));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 430, 40));

        jLabel13.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel13.setText("Email ID:");
        kGradientPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 430, 30));

        OK6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/30px_ok.png"))); // NOI18N
        kGradientPanel1.add(OK6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 30, 30));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 100, 110));

        OK7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/30px_ok.png"))); // NOI18N
        kGradientPanel1.add(OK7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 30, 30));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 100, 110));

        OK8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/30px_ok.png"))); // NOI18N
        kGradientPanel1.add(OK8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 30, 30));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 100, 110));

        OK9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/30px_ok.png"))); // NOI18N
        kGradientPanel1.add(OK9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 30, 30));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        kGradientPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 100, 110));

        OK10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/30px_ok.png"))); // NOI18N
        kGradientPanel1.add(OK10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 30, 30));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });
        kGradientPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 100, 110));

        OK11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/30px_ok.png"))); // NOI18N
        kGradientPanel1.add(OK11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 30, 30));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });
        kGradientPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 100, 110));

        OK12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/30px_ok.png"))); // NOI18N
        kGradientPanel1.add(OK12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 30, 30));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
        });
        kGradientPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 100, 110));

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPasswordField1.setToolTipText("Enter your password here");
        jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        jPasswordField1.setEnabled(false);
        jPasswordField1.setOpaque(false);
        kGradientPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 390, 30));

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/30px_eye.png"))); // NOI18N
        jLabel27.setToolTipText("Like to see what you typed");
        jLabel27.setEnabled(false);
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel27MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel27MouseReleased(evt);
            }
        });
        kGradientPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 40, 30));

        jLabel14.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel14.setText("Password:");
        jLabel14.setEnabled(false);
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 430, 30));

        kButton2.setBorder(null);
        kButton2.setText("Sign In");
        kButton2.setToolTipText("Sign in to your profile");
        kButton2.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        kButton2.setkBorderRadius(20);
        kButton2.setkEndColor(new java.awt.Color(255, 0, 255));
        kButton2.setkHoverEndColor(new java.awt.Color(2, 161, 203));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkStartColor(new java.awt.Color(2, 161, 203));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 430, -1));

        jLabel23.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("More");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel23MousePressed(evt);
            }
        });
        kGradientPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 430, 40));

        kButton3.setBorder(null);
        kButton3.setText("Sign In");
        kButton3.setEnabled(false);
        kButton3.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        kButton3.setkBackGroundColor(new java.awt.Color(204, 204, 204));
        kButton3.setkBorderRadius(20);
        kButton3.setkEndColor(new java.awt.Color(204, 204, 204));
        kButton3.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        kButton3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton3.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        kButton3.setkSelectedColor(new java.awt.Color(204, 204, 204));
        kButton3.setkStartColor(new java.awt.Color(204, 204, 204));
        kGradientPanel1.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 430, -1));

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_caution.png"))); // NOI18N
        jLabel51.setToolTipText("Internal error");
        kGradientPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 20, 20));

        jLabel24.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Not a member yet. Please Sign Up here! ");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel24MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel24MousePressed(evt);
            }
        });
        kGradientPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 430, 30));

        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("© 2020 DCompany");
        kGradientPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 430, 30));

        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_refresh.png"))); // NOI18N
        jLabel52.setToolTipText("Refresh");
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel52MousePressed(evt);
            }
        });
        kGradientPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 30, 20));

        kGradientPanel2.setkBorderRadius(20);
        kGradientPanel2.setkEndColor(new java.awt.Color(102, 255, 0));
        kGradientPanel2.setkFillBackground(false);
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 153, 0));
        kGradientPanel2.setOpaque(false);
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("  Cities We Cover For You :");
        kGradientPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 210, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("1234567890");
        kGradientPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 200, 30));

        kGradientPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 430, 50));

        kGradientPanel3.setkBorderRadius(20);
        kGradientPanel3.setkEndColor(new java.awt.Color(102, 255, 0));
        kGradientPanel3.setkFillBackground(false);
        kGradientPanel3.setkStartColor(new java.awt.Color(255, 153, 0));
        kGradientPanel3.setOpaque(false);
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("1234567890");
        kGradientPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 120, 30));

        jLabel15.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("  Number Of Volunteers To Help You :");
        kGradientPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 290, 30));

        kGradientPanel4.setkBorderRadius(20);
        kGradientPanel4.setkEndColor(new java.awt.Color(102, 255, 0));
        kGradientPanel4.setkFillBackground(false);
        kGradientPanel4.setkStartColor(new java.awt.Color(255, 153, 0));
        kGradientPanel4.setOpaque(false);
        kGradientPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("12345678901234567890123");
        kGradientPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 280, 40));

        jLabel19.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Number Of Volunteers To Help You");
        kGradientPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 30));

        kGradientPanel3.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 280, 60));

        kGradientPanel1.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 430, 50));

        kGradientPanel5.setkBorderRadius(20);
        kGradientPanel5.setkEndColor(new java.awt.Color(102, 255, 0));
        kGradientPanel5.setkFillBackground(false);
        kGradientPanel5.setkStartColor(new java.awt.Color(255, 153, 0));
        kGradientPanel5.setOpaque(false);
        kGradientPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("  Number Of Members :");
        kGradientPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 180, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("1234567890");
        kGradientPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 230, 30));

        kGradientPanel1.add(kGradientPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 430, 50));

        kGradientPanel6.setkBorderRadius(20);
        kGradientPanel6.setkEndColor(new java.awt.Color(102, 255, 0));
        kGradientPanel6.setkFillBackground(false);
        kGradientPanel6.setkStartColor(new java.awt.Color(255, 153, 0));
        kGradientPanel6.setOpaque(false);
        kGradientPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 0, 0));
        jLabel26.setText("Note:");
        kGradientPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 410, 30));

        jLabel25.setFont(new java.awt.Font("Consolas", 3, 13)); // NOI18N
        jLabel25.setText("Make sure that you Sign in on your personal computer or");
        kGradientPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 410, 20));

        jLabel29.setFont(new java.awt.Font("Consolas", 3, 13)); // NOI18N
        jLabel29.setText("the device which is safe to use and please feedback the");
        kGradientPanel6.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 410, 20));

        jLabel28.setFont(new java.awt.Font("Consolas", 3, 13)); // NOI18N
        jLabel28.setText("errors copied in clipboard so we can improve the");
        kGradientPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 410, 20));

        jLabel31.setFont(new java.awt.Font("Consolas", 3, 13)); // NOI18N
        jLabel31.setText("application features and bug fixes for you.");
        kGradientPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 410, 20));

        jLabel32.setFont(new java.awt.Font("Consolas", 3, 13)); // NOI18N
        jLabel32.setText("The Inter error also copied to clipboard and is informed");
        kGradientPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 410, 20));

        jLabel33.setFont(new java.awt.Font("Consolas", 3, 13)); // NOI18N
        jLabel33.setText("via red error icon in top righ conner of the application.");
        kGradientPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 410, 20));

        kGradientPanel1.add(kGradientPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 430, 170));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 480, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Global variable declaration
    int mousepX, mousepY, check=0, MLog=0, OLog=0, VLog=0, count=0;
    String Email, AdminPass= null, MemPass= null, OrgPass= null, VolPass= null, Level= null;
    ErrorReason ER= new ErrorReason();
    Connection con= null;
    Statement stmt= null;
    
    //Code for minimizing JFrame to taskbar
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

    //Code for closing application
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        int CO= JOptionPane.showConfirmDialog(this, "Are you sure to close the application?", "Close Application", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(CO==JOptionPane.YES_OPTION)
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    //Code for moving JFrame across the screen 
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

    //Code for converting passwords to string
    private void jLabel27MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MousePressed
        jPasswordField1.setEchoChar((char)0);
    }//GEN-LAST:event_jLabel27MousePressed

    //Code to convert password back to its regular form
    private void jLabel27MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseReleased
        jPasswordField1.setEchoChar('*');
    }//GEN-LAST:event_jLabel27MouseReleased

    //Code for continue
    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        Email= jTextField1.getText();
        if(!(Email.equalsIgnoreCase(""))){
            
            String SQL1= "SELECT * FROM administrator WHERE Email='"+Email+"'";
            String SQL2= "SELECT * FROM member WHERE Email='"+Email+"'";
            String SQL3= "SELECT * FROM organization WHERE Email='"+Email+"'";
            String SQL4= "SELECT * FROM volunteer WHERE Email='"+Email+"'";
            int level[]={0,0,0,0};
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
                stmt = con.createStatement();
                ResultSet RS1= stmt.executeQuery(SQL1);
                if(RS1.next()){
                    AdminPass= RS1.getString("Password");
                    level[0]=1;
                }
                ResultSet RS2= stmt.executeQuery(SQL2);
                if(RS2.next()){
                    MemPass= RS2.getString("Password");
                    MLog= RS2.getInt("Login");
                    level[1]=1;
                }
                ResultSet RS3= stmt.executeQuery(SQL3);
                if(RS3.next()){
                    OrgPass= RS3.getString("Password");
                    OLog= RS3.getInt("Login");
                    level[2]=1;
                }
                ResultSet RS4= stmt.executeQuery(SQL4);
                if(RS4.next()){
                    VolPass= RS4.getString("Password");
                    VLog= RS4.getInt("Login");
                    level[3]=1;
                }
                if(level[0]==0 & level[1]==0 & level[2]==0 & level[3]==0){
                    JOptionPane.showMessageDialog(this, "Requested Email ID doesn't found on our server.\nPlease enter a valid Email ID or create new account.", "Error Occured",JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                }
                else{
                    jLabel13.setVisible(false);
                    jTextField1.setVisible(false);
                    kButton1.setVisible(false);
                    this.levelSelection(level);
                }
                jLabel52.setVisible(true);
                jLabel51.setVisible(false);
            }
            catch(HeadlessException | ClassNotFoundException | SQLException e){
                ER.copyReason(e.toString());
                jLabel51.setVisible(true);
            }
        }
        else
            JOptionPane.showMessageDialog(this, "Please enter a valid Email ID in text field.\nPlease try again.", "Missing Information",JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
    }//GEN-LAST:event_kButton1ActionPerformed

    //Code for GUI effects for selection
    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        if(!(OK7.isVisible() | OK8.isVisible() | OK9.isVisible())){
            if(check==0){
                OK6.setVisible(true);
                jLabel7.setEnabled(false);
                jLabel8.setEnabled(false);
                jLabel9.setEnabled(false);
                jLabel14.setEnabled(true);
                jLabel27.setEnabled(true);
                jPasswordField1.setEnabled(true);
                kButton2.setVisible(true);
                check= 1;
                Level= jLabel6.getToolTipText();
            }
            else if(check==1){
                OK6.setVisible(false);
                jLabel7.setEnabled(true);
                jLabel8.setEnabled(true);
                jLabel9.setEnabled(true);
                jLabel14.setEnabled(false);
                jLabel27.setEnabled(false);
                jPasswordField1.setText("");
                jPasswordField1.setEnabled(false);
                kButton2.setVisible(false);
                check= 0;
                Level= null;
            }
        }
    }//GEN-LAST:event_jLabel6MousePressed

    //Code for GUI effects for selection
    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        if(!(OK6.isVisible() | OK8.isVisible() | OK9.isVisible())){
            if(check==0){
                OK7.setVisible(true);
                jLabel6.setEnabled(false);
                jLabel8.setEnabled(false);
                jLabel9.setEnabled(false);
                jLabel14.setEnabled(true);
                jLabel27.setEnabled(true);
                jPasswordField1.setEnabled(true);
                kButton2.setVisible(true);
                check= 1;
                Level= jLabel7.getToolTipText();
            }
            else if(check==1){
                OK7.setVisible(false);
                jLabel6.setEnabled(true);
                jLabel8.setEnabled(true);
                jLabel9.setEnabled(true);
                jLabel14.setEnabled(false);
                jLabel27.setEnabled(false);
                jPasswordField1.setText("");
                jPasswordField1.setEnabled(false);
                kButton2.setVisible(false);
                check= 0;
                Level= null;
            }
        }
    }//GEN-LAST:event_jLabel7MousePressed

    //Code for GUI effects for selection
    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        if(!(OK6.isVisible() | OK7.isVisible() | OK9.isVisible())){
            if(check==0){
                OK8.setVisible(true);
                jLabel6.setEnabled(false);
                jLabel7.setEnabled(false);
                jLabel9.setEnabled(false);
                jLabel14.setEnabled(true);
                jLabel27.setEnabled(true);
                jPasswordField1.setEnabled(true);
                kButton2.setVisible(true);
                check= 1;
                Level= jLabel8.getToolTipText();
            }
            else if(check==1){
                OK8.setVisible(false);
                jLabel6.setEnabled(true);
                jLabel7.setEnabled(true);
                jLabel9.setEnabled(true);
                jLabel14.setEnabled(false);
                jLabel27.setEnabled(false);
                jPasswordField1.setText("");
                jPasswordField1.setEnabled(false);
                kButton2.setVisible(false);
                check= 0;
                Level= null;
            }
        }
    }//GEN-LAST:event_jLabel8MousePressed

    //Code for GUI effects for selection
    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        if(!(OK6.isVisible() | OK7.isVisible() | OK8.isVisible())){
            if(check==0){
                OK9.setVisible(true);
                jLabel6.setEnabled(false);
                jLabel7.setEnabled(false);
                jLabel8.setEnabled(false);
                jLabel14.setEnabled(true);
                jLabel27.setEnabled(true);
                jPasswordField1.setEnabled(true);
                kButton2.setVisible(true);
                check= 1;
                Level= jLabel9.getToolTipText();
            }
            else if(check==1){
                OK9.setVisible(false);
                jLabel6.setEnabled(true);
                jLabel7.setEnabled(true);
                jLabel8.setEnabled(true);
                jLabel14.setEnabled(false);
                jLabel27.setEnabled(false);
                jPasswordField1.setText("");
                jPasswordField1.setEnabled(false);
                kButton2.setVisible(false);
                check= 0;
                Level= null;
            }
        }
    }//GEN-LAST:event_jLabel9MousePressed

    //Code for GUI effects for selection
    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        if(!(OK11.isVisible() | OK12.isVisible())){
            if(check==0){
                OK10.setVisible(true);
                jLabel11.setEnabled(false);
                jLabel12.setEnabled(false);
                jLabel14.setEnabled(true);
                jLabel27.setEnabled(true);
                jPasswordField1.setEnabled(true);
                kButton2.setVisible(true);
                check= 1;
                Level= jLabel10.getToolTipText();
            }
            else if(check==1){
                OK10.setVisible(false);
                jLabel11.setEnabled(true);
                jLabel12.setEnabled(true);
                jLabel14.setEnabled(false);
                jLabel27.setEnabled(false);
                jPasswordField1.setText("");
                jPasswordField1.setEnabled(false);
                kButton2.setVisible(false);
                check= 0;
                Level= null;
            }
        }
    }//GEN-LAST:event_jLabel10MousePressed

    //Code for GUI effects for selection
    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        if(!(OK10.isVisible() | OK12.isVisible())){
            if(check==0){
                OK11.setVisible(true);
                jLabel10.setEnabled(false);
                jLabel12.setEnabled(false);
                jLabel14.setEnabled(true);
                jLabel27.setEnabled(true);
                jPasswordField1.setEnabled(true);
                kButton2.setVisible(true);
                check= 1;
                Level= jLabel11.getToolTipText();
            }
            else if(check==1){
                OK11.setVisible(false);
                jLabel10.setEnabled(true);
                jLabel12.setEnabled(true);
                jLabel14.setEnabled(false);
                jLabel27.setEnabled(false);
                jPasswordField1.setText("");
                jPasswordField1.setEnabled(false);
                kButton2.setVisible(false);
                check= 0;
                Level= null;
            }
        }
    }//GEN-LAST:event_jLabel11MousePressed

    //Code for GUI effects for selection
    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
        if(!(OK10.isVisible() | OK11.isVisible())){
            if(check==0){
                OK12.setVisible(true);
                jLabel11.setEnabled(false);
                jLabel10.setEnabled(false);
                jLabel14.setEnabled(true);
                jLabel27.setEnabled(true);
                jPasswordField1.setEnabled(true);
                kButton2.setVisible(true);
                check= 1;
                Level= jLabel12.getToolTipText();
            }
            else if(check==1){
                OK12.setVisible(false);
                jLabel11.setEnabled(true);
                jLabel10.setEnabled(true);
                jLabel14.setEnabled(false);
                jLabel27.setEnabled(false);
                jPasswordField1.setText("");
                jPasswordField1.setEnabled(false);
                kButton2.setVisible(false);
                check= 0;
                Level= null;
            }
        }
    }//GEN-LAST:event_jLabel12MousePressed

    //Code for signing in into profile 
    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        String Pass= new String(jPasswordField1.getPassword());
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt = con.createStatement();
            if(Level.equalsIgnoreCase("Administrator")){
                if(Pass.equals(AdminPass)){
                    new A05_Admin_Page(Email).setVisible(true);
                    this.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(this, "Sorry! Invalid Email ID or Password.\nPlease try again.", "Invalid Details",JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                }
            }
            else if(Level.equalsIgnoreCase("Organization")){
                if(Pass.equals(OrgPass)){
                    OLog++;
                    int r= stmt.executeUpdate("UPDATE organization SET Login="+OLog+" WHERE Email='"+Email+"'");
                    new A15_Organizer_Page(Email).setVisible(true);
                    this.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(this, "Sorry! Invalid Email ID or Password.\nPlease try again.", "Error Occured",JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                }
            }
            else if(Level.equalsIgnoreCase("Member")){
                if(Pass.equals(MemPass)){
                    MLog++;
                    int r= stmt.executeUpdate("UPDATE member SET Login="+MLog+" WHERE Email='"+Email+"'");
                    new A25_Member_Page(Email).setVisible(true);
                    this.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(this, "Sorry! Invalid Email ID or Password.\nPlease try again.", "Error Occured",JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                }
            }
            else if(Level.equalsIgnoreCase("Volunteer")){
                if(Pass.equals(VolPass)){
                    VLog++;
                    int r= stmt.executeUpdate("UPDATE volunteer SET Login="+VLog+" WHERE Email='"+Email+"'");
                    new A32_Volunteer_Page(Email).setVisible(true);
                    this.setVisible(false);
                }
            }
            jLabel51.setVisible(false);
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e){
            ER.copyReason(e.toString());
            jLabel51.setVisible(true);
        }
    }//GEN-LAST:event_kButton2ActionPerformed

    //Code for GUI effects for More
    private void jLabel23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MousePressed
        if(count==0){
            kGradientPanel2.setVisible(false);
            kGradientPanel3.setVisible(false);
            kGradientPanel5.setVisible(false);
            kGradientPanel6.setVisible(true);
            count= 1;
        }
        else if(count==1){
            kGradientPanel6.setVisible(false);
            kGradientPanel2.setVisible(true);
            kGradientPanel3.setVisible(true);
            kGradientPanel5.setVisible(true);
            count= 0;
        }
    }//GEN-LAST:event_jLabel23MousePressed

    //Code for going back to welcome page
    private void jLabel34MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MousePressed
        new A01_Welcome_Page().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel34MousePressed

    //Code for going to feedback page
    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        new A04_Feedback("SignIn").setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel35MouseClicked

    //Code for GUI effects
    private void jLabel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseEntered
        jLabel24.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel24MouseEntered

    //Code for GUI effects
    private void jLabel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseExited
        jLabel24.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel24MouseExited

    //Code for signing up a new member 
    private void jLabel24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MousePressed
        new A03_SignUp_Page().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel24MousePressed

    //Code for refreshing page
    private void jLabel52MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MousePressed
        new A02_SignIn_Page().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel52MousePressed


    //Code for level selection
    private void levelSelection(int level[]){
        int A= level[0], M= level[1], O= level[2], V= level[3];
        if(A==1 & M==0 & O==0 & V==0){
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_administrator.png")));
            jLabel11.setToolTipText("Administrator");
            jLabel11.setVisible(true);
        }
        if(M==1 & A==0 & O==0 & V==0){
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_member.png")));
            jLabel11.setToolTipText("Member");
            jLabel11.setVisible(true);
        }
        if(O==1 & A==0 & M==0 & V==0){
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_organization.png")));
            jLabel11.setToolTipText("Organization");
            jLabel11.setVisible(true);
        }
        if(V==1 & A==0 & M==0 & O==0){
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_volunteer.png")));
            jLabel11.setToolTipText("Volunteer");
            jLabel11.setVisible(true);
        }
        if(A==1 & M==1 & O==0 & V==0){
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_administrator.png")));
            jLabel7.setToolTipText("Administrator");
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_member.png")));
            jLabel8.setToolTipText("Member");
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
        }
        if(A==1 & O==1 & M==0 & V==0){
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_administrator.png")));
            jLabel7.setToolTipText("Administrator");
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_organization.png")));
            jLabel8.setToolTipText("Organization");
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
        }
        if(A==1 & V==1 & M==0 &O==0){
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_administrator.png")));
            jLabel7.setToolTipText("Administrator");
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_volunteer.png")));
            jLabel8.setToolTipText("Volunteer");
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
        }
        if(M==1 & O==1 & A==0 &V==0){
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_member.png")));
            jLabel7.setToolTipText("Member");
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_organization.png")));
            jLabel8.setToolTipText("Organization");
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
        }
        if(M==1 & V==1 & A==0 &O==0){
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_member.png")));
            jLabel7.setToolTipText("Member");
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_volunteer.png")));
            jLabel8.setToolTipText("Volunteer");
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
        }
        if(O==1 & V==1 & A==0 &M==0){
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_organization.png")));
            jLabel7.setToolTipText("Organization");
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_volunteer.png")));
            jLabel8.setToolTipText("Volunteer");
        }
        if(A==1 & M==1 & O==1 & V==0){
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_administrator.png")));
            jLabel10.setToolTipText("Administrator");
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_member.png")));
            jLabel11.setToolTipText("Member");
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_organization.png")));
            jLabel12.setToolTipText("Organization");
            jLabel10.setVisible(true);
            jLabel11.setVisible(true);
            jLabel12.setVisible(true);
        }
        if(A==1 & M==1 & V==1 & O==0){
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_administrator.png")));
            jLabel10.setToolTipText("Administrator");
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_member.png")));
            jLabel11.setToolTipText("Member");
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_volunteer.png")));
            jLabel12.setToolTipText("Volunteer");
            jLabel10.setVisible(true);
            jLabel11.setVisible(true);
            jLabel12.setVisible(true);
        }
        if(A==1 & O==1 & V==1 & M==0){
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_administrator.png")));
            jLabel10.setToolTipText("Administrator");
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_organization.png")));
            jLabel11.setToolTipText("Organization");
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_volunteer.png")));
            jLabel12.setToolTipText("Volunteer");
            jLabel10.setVisible(true);
            jLabel11.setVisible(true);
            jLabel12.setVisible(true);
        }
        if(M==1 & O==1 & V==1 & A==0){
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_member.png")));
            jLabel10.setToolTipText("Member");
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_organization.png")));
            jLabel11.setToolTipText("Organization");
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_volunteer.png")));
            jLabel12.setToolTipText("Volunteer");
            jLabel10.setVisible(true);
            jLabel11.setVisible(true);
            jLabel12.setVisible(true);
        }
        if(A==1 & M==1 & O==1 & V==1){
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_administrator.png")));
            jLabel6.setToolTipText("Administrator");
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_member.png")));
            jLabel7.setToolTipText("Member");
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_organization.png")));
            jLabel8.setToolTipText("Organization");
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_volunteer.png")));
            jLabel9.setToolTipText("Volunteer");
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
            jLabel9.setVisible(true);
        }
    }
    
    //Code for general information in JFrame
    private void Info() {
        try{
            String S1, S2;
            int i=0;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt = con.createStatement();
            ResultSet rs1 = stmt.executeQuery("SELECT COUNT(MemberID) FROM member");
            if(rs1.next())
                S1=rs1.getString("COUNT(MemberID)");
            else
                S1="0";
            ResultSet rs2 = stmt.executeQuery("SELECT COUNT(VID) FROM volunteer");
            if(rs2.next())
                
                S2=rs2.getString("COUNT(VID)");
            else
                S2="0";
            ResultSet rs3 = stmt.executeQuery("SELECT DISTINCT(City) FROM volunteer");
            while(rs3.next()){
                i++;
            }
            jLabel22.setText(S1);
            jLabel17.setText(S2);
            jLabel20.setText(Integer.toString(i));
            jLabel51.setVisible(false);
        }
        catch(ClassNotFoundException | SQLException e){
            jLabel22.setText("Error");
            jLabel17.setText("Copied To");
            jLabel20.setText("Clipboard");
            ER.copyReason(e.toString());
            jLabel51.setVisible(true);
        }
    }
    
    //Code for setting icon image in taskbar 
    private void setIcon() {
        setShape(new RoundRectangle2D.Double(0,0,480,600,25,25));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/32px_heart_with_pulse.png")));
    }

    //Un-used action events
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OK10;
    private javax.swing.JLabel OK11;
    private javax.swing.JLabel OK12;
    private javax.swing.JLabel OK6;
    private javax.swing.JLabel OK7;
    private javax.swing.JLabel OK8;
    private javax.swing.JLabel OK9;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private keeptoo.KButton kButton3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private keeptoo.KGradientPanel kGradientPanel6;
    private keeptoo.KGradientPanel kGradientPanel7;
    // End of variables declaration//GEN-END:variables
}
