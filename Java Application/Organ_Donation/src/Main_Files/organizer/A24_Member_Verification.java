//Main package
package Main_Files.organizer;

//Imported class files
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import Class_Files.ErrorReason;
import java.awt.HeadlessException;
import java.awt.geom.RoundRectangle2D;
import javax.swing.DefaultListModel;

//Function class
public class A24_Member_Verification extends javax.swing.JFrame {
    public A24_Member_Verification(String e) {
        initComponents();
        setIcon();
        getDetail(e);
        getList();
        jLabel25.setVisible(false);
        jLabel26.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        kButton2 = new keeptoo.KButton();
        kButton3 = new keeptoo.KButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        kButton4 = new keeptoo.KButton();
        kButton5 = new keeptoo.KButton();
        jLabel26 = new javax.swing.JLabel();
        kButton1 = new keeptoo.KButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        kButton6 = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Verification of Member Profiles");
        setMaximumSize(new java.awt.Dimension(1280, 640));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkBorderRadius(25);
        kGradientPanel2.setkEndColor(new java.awt.Color(102, 102, 102));
        kGradientPanel2.setkFillBackground(false);
        kGradientPanel2.setkStartColor(new java.awt.Color(102, 102, 102));
        kGradientPanel2.setOpaque(false);
        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 640));

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

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_minimize_window.png"))); // NOI18N
        jLabel2.setToolTipText("Minimize");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, 40, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_close_window.png"))); // NOI18N
        jLabel3.setToolTipText("Close");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 30, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_prev.png"))); // NOI18N
        jLabel4.setToolTipText("Go Back");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(getTitle());
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 30));

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 81, 47));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_caution.png"))); // NOI18N
        jLabel51.setToolTipText("Internal error");
        kGradientPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 30, 20));

        jLabel14.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("DCompany");
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1260, 40));

        jLabel15.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("dcompany.uit@gmail.com");
        kGradientPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1260, 20));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1280, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        jList1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jList1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jList1.setModel(new DefaultListModel());
        jList1.setToolTipText("Choose one of the Member");
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 360, 310));

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel1.setText("Enter Member ID");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 20));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField1.setToolTipText("Enter a valid Member ID");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 360, 30));

        jLabel6.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel6.setText("Fetch Members");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 360, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 81, 47)), "Blood Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Constantia", 1, 14), new java.awt.Color(255, 81, 47))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 280, 30));

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 280, 30));

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 280, 30));

        kButton2.setBorder(null);
        kButton2.setText("Accept");
        kButton2.setToolTipText("Click here if blood verification process is successful");
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
        jPanel3.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 250, 40));

        kButton3.setBorder(null);
        kButton3.setText("Reject");
        kButton3.setToolTipText("Click here if blood verification process is failed");
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
        jPanel3.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 250, 40));

        jLabel9.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel9.setText("Body Mass Index");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 280, 20));

        jLabel10.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel10.setText("Height");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 20));

        jLabel11.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel11.setText("Weight");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 280, 20));

        jLabel12.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel12.setText("Blood Test ID");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 280, 20));

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 280, 30));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_Verfied.png"))); // NOI18N
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 250, 100));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 890, 160));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 81, 47)), "Organ Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Constantia", 1, 14), new java.awt.Color(255, 81, 47))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel13.setText("Organs Test ID");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 20));

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel4.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 280, 30));

        jLabel16.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel16.setText("Liver");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 280, 20));

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel4.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 280, 30));

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel4.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 280, 30));

        jLabel17.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel17.setText("Kidney");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 280, 20));

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel4.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 280, 30));

        jLabel18.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel18.setText("Heart");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 280, 20));

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField12.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel4.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 280, 30));

        jLabel19.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel19.setText("Lungs");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 280, 20));

        jLabel21.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel21.setText("Intestine");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 280, 20));

        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField14.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel4.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 280, 30));

        jLabel22.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel22.setText("Pancreas");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 280, 20));

        jLabel23.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel23.setText("Cornea");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 280, 20));

        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField15.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel4.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 280, 30));

        jTextField16.setEditable(false);
        jTextField16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField16.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel4.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 280, 30));

        jLabel24.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel24.setText("Organ Collection Type");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 250, 20));

        jTextField17.setEditable(false);
        jTextField17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField17.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel4.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 250, 30));

        kButton4.setBorder(null);
        kButton4.setText("Reject");
        kButton4.setToolTipText("Click here if organ verification process is failed");
        kButton4.setFont(new java.awt.Font("Cambria Math", 1, 26)); // NOI18N
        kButton4.setkEndColor(new java.awt.Color(255, 0, 255));
        kButton4.setkHoverEndColor(new java.awt.Color(2, 161, 203));
        kButton4.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton4.setkStartColor(new java.awt.Color(2, 161, 203));
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(kButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 250, 40));

        kButton5.setBorder(null);
        kButton5.setText("Accept");
        kButton5.setToolTipText("Click here if organ verification process is successful");
        kButton5.setFont(new java.awt.Font("Cambria Math", 1, 26)); // NOI18N
        kButton5.setkEndColor(new java.awt.Color(255, 0, 255));
        kButton5.setkHoverEndColor(new java.awt.Color(2, 161, 203));
        kButton5.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton5.setkStartColor(new java.awt.Color(2, 161, 203));
        kButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(kButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 250, 40));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_Verfied.png"))); // NOI18N
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 250, 100));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 890, 270));

        kButton1.setBorder(null);
        kButton1.setText("Get Member Detail");
        kButton1.setToolTipText("Get the details of member");
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
        jPanel2.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 360, 40));

        jLabel7.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel7.setText("Member ID");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 90, 30));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 220, 30));

        jLabel8.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel8.setText("Blood Group");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 100, 30));

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 170, 30));

        jLabel20.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel20.setText("Gender");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, 60, 30));

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField13.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, 190, 30));

        kButton6.setBorder(null);
        kButton6.setText("Refresh List ");
        kButton6.setToolTipText("Refresh the entire list or page");
        kButton6.setFont(new java.awt.Font("Californian FB", 1, 26)); // NOI18N
        kButton6.setkEndColor(new java.awt.Color(255, 0, 255));
        kButton6.setkHoverEndColor(new java.awt.Color(2, 161, 203));
        kButton6.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton6.setkStartColor(new java.awt.Color(2, 161, 203));
        kButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(kButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 360, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1280, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Global Variables Declared
    double BMI;
    ResultSet rs= null;
    Connection con= null;
    Statement stmt= null;
    ErrorReason ER= new ErrorReason();
    String Email, SQL, BGroup, Sex, BTestID, OTestID, Type;
    int mousepX, mousepY, Height, Weight, BVerify, Liver, Kidney, Heart, Lungs, Intestine, Cornea, Pancreas, OVerify, Verify;
    
    //Code for setting JFrame minimised in taskbar
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    //Code for exiting appliccation
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        int CO= JOptionPane.showConfirmDialog(this, "Are you sure to close the application.\nUnsaved process will be lost.", "Missing Information", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(CO==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    //Code for going back to organiaer page
    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        int OP= JOptionPane.showConfirmDialog(this, "Are you sure that you want to organization home page?\nIf Yes please choose Yes  ", "Are you sure to go back", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(OP==JOptionPane.YES_OPTION){
            new A15_Organizer_Page(Email).setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel4MousePressed

    //Code for dragging JFrame across screen
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int coordX= evt.getXOnScreen();
        int coordY= evt.getYOnScreen();
        this.setLocation(coordX-mousepX, coordY-mousepY);
    }//GEN-LAST:event_jPanel1MouseDragged

    //Code for gettiing current mouse position
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        mousepX= evt.getX();
        mousepY= evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    //Code for getting member verification by searching
    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        if(!(jTextField1.getText().equalsIgnoreCase(""))){
            int SID= Integer.parseInt(jTextField1.getText());
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con= (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
                stmt= (Statement)con.createStatement();
                SQL="SELECT * FROM member WHERE MemberID="+SID;
                rs= stmt.executeQuery(SQL);
                if(rs.next()){
                    BGroup= rs.getString("BloodGroup");
                    Sex= rs.getString("Gender");
                    Verify= rs.getInt("Verify");
                    jTextField2.setText(Integer.toString(SID));
                    jTextField3.setText(BGroup);
                    jTextField13.setText(Sex);
                    String SQL1="SELECT * FROM blood WHERE MemberID="+SID;
                    ResultSet rs1=stmt.executeQuery(SQL1);
                    if(rs1.next()){
                        Height= rs1.getInt("Height");
                        Weight= rs1.getInt("Weight");
                        BTestID= rs1.getString("TestID");
                        BMI= rs1.getDouble("BMI");
                        BVerify= rs1.getInt("Verify");
                        jTextField5.setText(Integer.toString(Height));
                        jTextField4.setText(Double.toString(BMI));
                        jTextField6.setText(Integer.toString(Weight));
                        jTextField7.setText(BTestID);
                        switch (BVerify) {
                            case 0:
                                kButton2.setVisible(false);
                                kButton3.setVisible(false);
                                jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_not_willing.png")));
                                jLabel25.setVisible(true);
                                break;
                            case 2:
                                kButton2.setVisible(false);
                                kButton3.setVisible(false);
                                jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_Rejected.png")));
                                jLabel25.setVisible(true);
                                break;
                            case 3:
                                kButton2.setVisible(false);
                                kButton3.setVisible(false);
                                jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_Verfied.png")));
                                jLabel25.setVisible(true);
                                break;
                            default:
                                break;
                        }
                    }
                    String SQL2="SELECT * FROM organs WHERE MemberID="+SID;
                    ResultSet rs2=stmt.executeQuery(SQL2);
                    if(rs2.next()){
                        OTestID= rs2.getString("TestID");
                        Liver= rs2.getInt("Liver");
                        Kidney= rs2.getInt("Kidney");
                        Heart= rs2.getInt("Heart");
                        Lungs= rs2.getInt("Lungs");
                        Intestine= rs2.getInt("Intestine");
                        Cornea= rs2.getInt("Cornea");
                        Pancreas= rs2.getInt("Pancreas");
                        Type= rs2.getString("Type");
                        OVerify= rs2.getInt("Verify");
                        jTextField8.setText(OTestID);
                        jTextField9.setText(Integer.toString(Liver));
                        jTextField10.setText(Integer.toString(Kidney));
                        jTextField15.setText(Integer.toString(Heart));
                        jTextField11.setText(Integer.toString(Lungs));
                        jTextField12.setText(Integer.toString(Intestine));
                        jTextField14.setText(Integer.toString(Cornea));
                        jTextField16.setText(Integer.toString(Pancreas));
                        jTextField17.setText(Type);
                        switch (OVerify) {
                            case 0:
                                kButton4.setVisible(false);
                                kButton5.setVisible(false);
                                jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_not_willing.png")));
                                jLabel26.setVisible(true);
                                break;
                            case 2:
                                kButton4.setVisible(false);
                                kButton5.setVisible(false);
                                jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_Rejected.png")));
                                jLabel26.setVisible(true);
                                break;
                            case 3:
                                kButton4.setVisible(false);
                                kButton5.setVisible(false);
                                jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_Verfied.png")));
                                jLabel26.setVisible(true);
                                break;
                            default:
                                break;
                        }
                    }
                }
                else
                    JOptionPane.showMessageDialog(this, "The requested ID doesn't found in our data base.", "Missing Information", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
            }
            catch(HeadlessException | ClassNotFoundException | SQLException e){
                ER.copyReason(e.toString());
                JOptionPane.showMessageDialog(this, "An error occured while pulling data from our servers.\nError have been copied into your clipboard.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
            }
        }
        else
            JOptionPane.showMessageDialog(this, "Please enter a valid Request ID in Text Field.", "Missing Information", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
    }//GEN-LAST:event_kButton1ActionPerformed

    //Code for getting detail while clicking JList
    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        String Select = jList1.getSelectedValue();
        String ID =Select.trim().substring(0);
        int SID= Integer.parseInt(ID);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt= con.createStatement();
            SQL="SELECT * FROM member WHERE MemberID="+SID;
            rs= stmt.executeQuery(SQL);
            if(rs.next()){
                BGroup= rs.getString("BloodGroup");
                Sex= rs.getString("Gender");
                Verify= rs.getInt("Verify");
                jTextField2.setText(Integer.toString(SID));
                jTextField3.setText(BGroup);
                jTextField13.setText(Sex);
                String SQL1="SELECT * FROM blood WHERE MemberID="+SID;
                ResultSet rs1=stmt.executeQuery(SQL1);
                if(rs1.next()){
                    Height= rs1.getInt("Height");
                    Weight= rs1.getInt("Weight");
                    BTestID= rs1.getString("TestID");
                    BMI= rs1.getDouble("BMI");
                    BVerify= rs1.getInt("Verify");
                    jTextField5.setText(Integer.toString(Height));
                    jTextField4.setText(Double.toString(BMI));
                    jTextField6.setText(Integer.toString(Weight));
                    jTextField7.setText(BTestID);
                    switch (BVerify) {
                        case 0:
                            kButton2.setVisible(false);
                            kButton3.setVisible(false);
                            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_not_willing.png")));
                            jLabel25.setVisible(true);
                            break;
                        case 2:
                            kButton2.setVisible(false);
                            kButton3.setVisible(false);
                            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_Rejected.png")));
                            jLabel25.setVisible(true);
                            break;
                        case 3:
                            kButton2.setVisible(false);
                            kButton3.setVisible(false);
                            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_Verfied.png")));
                            jLabel25.setVisible(true);
                            break;
                        default:
                            break;
                    }
                }
                String SQL2="SELECT * FROM organs WHERE MemberID="+SID;
                ResultSet rs2=stmt.executeQuery(SQL2);
                if(rs2.next()){
                    OTestID= rs2.getString("TestID");
                    Liver= rs2.getInt("Liver");
                    Kidney= rs2.getInt("Kidney");
                    Heart= rs2.getInt("Heart");
                    Lungs= rs2.getInt("Lungs");
                    Intestine= rs2.getInt("Intestine");
                    Cornea= rs2.getInt("Cornea");
                    Pancreas= rs2.getInt("Pancreas");
                    Type= rs2.getString("Type");
                    OVerify= rs2.getInt("Verify");
                    jTextField8.setText(OTestID);
                    jTextField9.setText(Integer.toString(Liver));
                    jTextField10.setText(Integer.toString(Kidney));
                    jTextField15.setText(Integer.toString(Heart));
                    jTextField11.setText(Integer.toString(Lungs));
                    jTextField12.setText(Integer.toString(Intestine));
                    jTextField14.setText(Integer.toString(Cornea));
                    jTextField16.setText(Integer.toString(Pancreas));
                    jTextField17.setText(Type);
                    switch (OVerify) {
                        case 0:
                            kButton4.setVisible(false);
                            kButton5.setVisible(false);
                            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_not_willing.png")));
                            jLabel26.setVisible(true);
                            break;
                        case 2:
                            kButton4.setVisible(false);
                            kButton5.setVisible(false);
                            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_Rejected.png")));
                            jLabel26.setVisible(true);
                            break;
                        case 3:
                            kButton4.setVisible(false);
                            kButton5.setVisible(false);
                            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_Verfied.png")));
                            jLabel26.setVisible(true);
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        catch(ClassNotFoundException | SQLException e){
            ER.copyReason(e.toString());
            JOptionPane.showMessageDialog(this, "An error occured while pulling data from our servers.\nError have been copied into your clipboard.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
    }//GEN-LAST:event_jList1MouseClicked

    //Code for updating the member bloood success status
    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        try{
            int SID= Integer.parseInt(jTextField2.getText());
            Class.forName("com.mysql.jdbc.Driver");
            con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt= con.createStatement();
            SQL="UPDATE blood SET Verify=3, Priority=0, LastBlood= '2020-01-01' WHERE MemberID="+SID;
            int ru= stmt.executeUpdate(SQL);
            if(ru==1){
                Verify= Verify-1;
                int r= stmt.executeUpdate("UPDATE member SET Verify="+Verify+" WHERE MemberID="+SID);
                JOptionPane.showMessageDialog(this, "The profile request has been successfully updateded.", "Updation sucess", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_ok.png")));
                kButton2.setVisible(false);
                kButton3.setVisible(false);
                jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_Verfied.png")));
                jLabel25.setVisible(true);
            }
        }
        catch(HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e){
            ER.copyReason(e.toString());
            JOptionPane.showMessageDialog(this, "An error occured while updating data into our servers.\nError have been copied into your clipboard.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
    }//GEN-LAST:event_kButton2ActionPerformed

    //Code for updating the member bloood rejected status
    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        try{
            int SID= Integer.parseInt(jTextField2.getText());
            Class.forName("com.mysql.jdbc.Driver");
            con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt= con.createStatement();
            SQL="UPDATE blood SET Verify=2 WHERE MemberID="+SID;
            int ru= stmt.executeUpdate(SQL);
            if(ru==1){
                Verify= Verify-1;
                int r= stmt.executeUpdate("UPDATE member SET Verify="+Verify+" WHERE MemberID="+SID);
                JOptionPane.showMessageDialog(this, "The profile request has been successfully updateded.", "Updation sucess", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_ok.png")));
                kButton2.setVisible(false);
                kButton3.setVisible(false);
                jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_Rejected.png")));
                jLabel25.setVisible(true);
            }
        }
        catch(HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e){
            ER.copyReason(e.toString());
            JOptionPane.showMessageDialog(this, "An error occured while updating data into our servers.\nError have been copied into your clipboard.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
    }//GEN-LAST:event_kButton3ActionPerformed

    //Code for refreshing list
    private void kButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton6ActionPerformed
        new A24_Member_Verification(Email).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kButton6ActionPerformed

    //Code for updating the member organ accept status
    private void kButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton5ActionPerformed
        try{
            int SID= Integer.parseInt(jTextField2.getText());
            Class.forName("com.mysql.jdbc.Driver");
            con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt= con.createStatement();
            SQL="UPDATE organs SET Verify=3 WHERE MemberID="+SID;
            int ru= stmt.executeUpdate(SQL);
            if(ru==1){
                Verify= Verify-1;
                int r= stmt.executeUpdate("UPDATE member SET Verify="+Verify+" WHERE MemberID="+SID);
                JOptionPane.showMessageDialog(this, "The profile request has been successfully updateded.", "Updation sucess", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_ok.png")));
                kButton5.setVisible(false);
                kButton4.setVisible(false);
                jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_Verfied.png")));
                jLabel26.setVisible(true);
            }
        }
        catch(HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e){
            ER.copyReason(e.toString());
            JOptionPane.showMessageDialog(this, "An error occured while updating data into our servers.\nError have been copied into your clipboard.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
    }//GEN-LAST:event_kButton5ActionPerformed

    //Code for updating the member organ reject status
    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        try{
            int SID= Integer.parseInt(jTextField2.getText());
            Class.forName("com.mysql.jdbc.Driver");
            con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt= con.createStatement();
            SQL="UPDATE organs SET Verify=2 WHERE MemberID="+SID;
            int ru= stmt.executeUpdate(SQL);
            if(ru==1){
                Verify= Verify-1;
                int r= stmt.executeUpdate("UPDATE member SET Verify="+Verify+" WHERE MemberID="+SID);
                JOptionPane.showMessageDialog(this, "The profile request has been successfully updateded.", "Updation sucess", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_ok.png")));
                kButton5.setVisible(false);
                kButton4.setVisible(false);
                jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/100px_Rejected.png")));
                jLabel26.setVisible(true);
            }
        }
        catch(HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e){
            ER.copyReason(e.toString());
            JOptionPane.showMessageDialog(this, "An error occured while updating data into our servers.\nError have been copied into your clipboard.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
    }//GEN-LAST:event_kButton4ActionPerformed

    //Code for trimming excess numbers
    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        if(jTextField1.getText().length()>9)
            evt.consume();
        if(!(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'))
            evt.consume();
    }//GEN-LAST:event_jTextField1KeyTyped

    //Code for setting Icon in taskbar 
    private void setIcon() {
        setShape(new RoundRectangle2D.Double(0,0,1280,640,25,25));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/32px_heart_with_pulse.png")));
    }
    
    //Code for populating JList
    private void getList(){
        DefaultListModel DM = (DefaultListModel) jList1.getModel();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String db_url="jdbc:mysql://localhost:3306/project";
            String pwd="root";
            String user="root";
            con=(Connection)DriverManager.getConnection(db_url,user,pwd);
            stmt=(Statement) con.createStatement();
            SQL="SELECT * FROM member WHERE Verify>= 1";
            rs=stmt.executeQuery(SQL);
            DM.removeAllElements();
            jList1.setModel(DM);
            while(rs.next()){
                String ID = rs.getString("MemberID");
                DM.addElement(ID);
            }
            jList1.setModel(DM);
            jLabel51.setVisible(false);
        }
        catch(ClassNotFoundException | SQLException e) {
            ER.copyReason(e.toString());
            jLabel51.setVisible(true);
        }   
    }    
    //Code for getting deatil of current user
    private void getDetail(String email) {
        Email= email;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String db_url="jdbc:mysql://localhost:3306/project";
            String pwd="root";
            String user="root";
            con=(Connection)DriverManager.getConnection(db_url,user,pwd);
            stmt=(Statement) con.createStatement();
            rs=stmt.executeQuery( "SELECT * FROM organization WHERE Email='"+Email+"'");
            if(rs.next()) {
                String OFN= rs.getString("FName");
                String OLN = rs.getString("Lname");
                jLabel14.setText(OFN+" "+OLN);
                jLabel15.setText(Email);
            }
            jLabel51.setVisible(false);
        }
        catch(ClassNotFoundException | SQLException e) {
            ER.copyReason(e.toString());
            jLabel14.setText("Organization");
            jLabel15.setText("");
            jLabel51.setVisible(true);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private keeptoo.KButton kButton3;
    private keeptoo.KButton kButton4;
    private keeptoo.KButton kButton5;
    private keeptoo.KButton kButton6;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}