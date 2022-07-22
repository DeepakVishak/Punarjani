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
import Class_Files.ErrorReason;
import Class_Files.GetNotifyID;
import java.awt.HeadlessException;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;

//Function class
public class A22_Service_Request extends javax.swing.JFrame {
    public A22_Service_Request(String e) {
        initComponents();
        setIcon();
        getDetail(e);
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
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        kButton1 = new keeptoo.KButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        kButton2 = new keeptoo.KButton();
        kButton3 = new keeptoo.KButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        kButton4 = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Request Verifications");
        setMaximumSize(new java.awt.Dimension(1280, 640));
        setMinimumSize(new java.awt.Dimension(1280, 640));
        setUndecorated(true);
        setResizable(false);
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
        kGradientPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 30, 20));

        jLabel14.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("DCompany");
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1260, 40));

        jLabel15.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("dcompany.uit@gmail.com");
        kGradientPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1260, 20));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1280, 90));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel1.setText("Refine list by type of user level");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Member", "Volunteer" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 310, 30));

        jLabel6.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel6.setText("Fetch Request");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, 240, 40));

        jList1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jList1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jList1.setModel(new DefaultListModel());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jList1MouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 490, 370));

        jLabel7.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel7.setText("Find a specified request");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 140, 30));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 330, 30));

        kButton1.setBorder(null);
        kButton1.setText("Get Request");
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
        jPanel2.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 20, 250, 50));

        jLabel8.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel8.setText("Request ID");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 80, 30));

        jLabel9.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel9.setText("Volunteer ID");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 80, 30));

        jLabel10.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel10.setText("Medical ID");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 80, 30));

        jLabel11.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel11.setText("District");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 80, 30));

        jLabel12.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel12.setText("City");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 80, 30));

        jLabel13.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel13.setText("Type");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 80, 30));

        jLabel16.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel16.setText("Details");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 80, 30));

        kButton2.setBorder(null);
        kButton2.setText("Confirm Request");
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
        jPanel2.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 80, 250, 50));

        kButton3.setBorder(null);
        kButton3.setText("Reject Request");
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
        jPanel2.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 150, 250, 50));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jScrollPane2.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 660, 190));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 390, 30));

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 390, 30));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 390, 30));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alappuzha", "Ernakulam", "Idukki", "Kannur", "Kasaragod", "Kollam", "Kottayam", "Kozhikode", "Lakshadweep", "Malappuram", "Palakkad", "Pathanamthitta", "Thiruvananthapuram", "Thrissur", "Wayanad" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 390, 30));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox1.setText("jCheckBox1");
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 130, -1));

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox2.setText("jCheckBox2");
        jPanel2.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 210, 130, -1));

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox3.setText("jCheckBox3");
        jPanel2.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 210, 130, -1));

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox4.setText("jCheckBox4");
        jPanel2.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 210, 130, -1));

        jCheckBox5.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox5.setText("jCheckBox5");
        jPanel2.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 210, 140, -1));

        jCheckBox6.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox6.setText("jCheckBox6");
        jPanel2.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 130, -1));

        jCheckBox7.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox7.setText("jCheckBox7");
        jPanel2.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, 130, -1));

        jCheckBox8.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox8.setText("jCheckBox8");
        jPanel2.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 240, 130, -1));

        jCheckBox9.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox9.setText("jCheckBox9");
        jPanel2.add(jCheckBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 240, 130, -1));

        jCheckBox10.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox10.setText("jCheckBox10");
        jPanel2.add(jCheckBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 240, 140, -1));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 450, 30));

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1139, 270, 130, 30));

        jLabel17.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel17.setText("Blood Group");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 270, -1, 30));

        kButton4.setBorder(null);
        kButton4.setText("Refresh List");
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
        jPanel2.add(kButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 490, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1280, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Global Variables Declared
    ResultSet rs= null;
    Statement stmt= null;
    Connection conn= null;
    int mousepX, mousepY, RID, MID, VID, RConf, NID, IDS, flag=0;
    String Email, SQL, MedID, City, Type, Detail, District, BGroup, VAddress, VContact, OCity;
    ErrorReason ER= new ErrorReason();
    GetNotifyID GNID= new GetNotifyID();
        
    //Code for setting JFrame minimized in taskbar
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    //Code for closing program
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        int CO= JOptionPane.showConfirmDialog(this, "Are you sure to close the application.\nUnsaved process will be lost.", "Missing Information", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(CO==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    //Code for gonig back to organization home page
    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        int OP= JOptionPane.showConfirmDialog(this, "Are you sure that you want to organization home page?\nIf Yes please choose Yes  ", "Are you sure to go back", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(OP==JOptionPane.YES_OPTION){
            new A15_Organizer_Page(Email).setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel4MousePressed

    //Code for moving JFrame across screen
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int coordX= evt.getXOnScreen();
        int coordY= evt.getYOnScreen();
        this.setLocation(coordX-mousepX, coordY-mousepY);
    }//GEN-LAST:event_jPanel1MouseDragged

    //Code for gettig current mouse position
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        mousepX= evt.getX();
        mousepY= evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    //Code for rejecting a request
    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn= (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
            stmt= (Statement)conn.createStatement();
            RID= Integer.parseInt(jTextField2.getText());
            Detail= jTextArea1.getText();
            int UP1= stmt.executeUpdate("UPDATE request SET"
                    + "ReqCon=2"
                    + "Detail='"+Detail+"'"
                    + "WHERE RequestID="+RID);
            if(UP1==1)
                JOptionPane.showMessageDialog(this, "The request has been successfully updated.", "Updation sucess", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_ok.png")));
        }
        catch(HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e){
            ER.copyReason(e.toString());
            JOptionPane.showMessageDialog(this, "An error occured while updating data into servers.\nError have been copied into your clipboard.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
        finally{
            this.setVisible(false);
            new A22_Service_Request(Email).setVisible(true);
        }
    }//GEN-LAST:event_kButton3ActionPerformed

    //Code for filter
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String Choose= (String)jComboBox1.getSelectedItem();
        if("Member".equals(Choose)){
            this.getList(0);
            jLabel9.setText("Member ID");
        }
        else if("Volunteer".equals(Choose)){
            this.getList(1);
            jLabel9.setText("Volunteer ID");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    //Code for getting details on requested Request ID
    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        if(!(jTextField1.getText().equalsIgnoreCase(""))){
            try {
                int ID= Integer.parseInt(jTextField1.getText());
                Class.forName("com.mysql.jdbc.Driver");
                String db_url="jdbc:mysql://localhost:3306/project";
                String pwd="root";
                String user="root";
                conn=(Connection)DriverManager.getConnection(db_url,user,pwd);
                stmt=(Statement) conn.createStatement();
                SQL="SELECT * FROM request WHERE RequestID="+ID+" AND ReqCon=0";
                rs=stmt.executeQuery(SQL);
                if(rs.next()){
                    RID= rs.getInt("RequestID");
                    MID= rs.getInt("MemberID");
                    VID= rs.getInt("VolunteerID");
                    MedID= rs.getString("MedicalID");
                    City= rs.getString("City");
                    District= rs.getString("District");
                    Type= rs.getString("Type");
                    Detail= rs.getString("Detail");
                    BGroup= rs.getString("BloodGroup");
                    jTextField2.setText(Integer.toString(RID));
                    if(MID==0){
                        jLabel9.setText("Volunteer ID");
                        jTextField3.setText(Integer.toString(VID));
                    }
                    else{
                        jLabel9.setText("Member ID");
                        jTextField3.setText(Integer.toString(MID));
                    }
                    jTextField4.setText(MedID);
                    jComboBox2.setSelectedItem(District);
                    this.setCity(District, City);
                    jTextField5.setText(Type);
                    jTextArea1.setText(Detail);
                    jTextField6.setText(BGroup);
                }
                else
                    JOptionPane.showMessageDialog(this, "The requested ID doesn't found in our data base.", "Missing Information", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
            }
            catch(HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e) {
                ER.copyReason(e.toString());
                JOptionPane.showMessageDialog(this, "An error occured while pulling data from our servers.\nError have been copied into your clipboard.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
            }
        }
        else
            JOptionPane.showMessageDialog(this, "Please enter a valid Request ID in Text Field.", "Missing Information", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
    }//GEN-LAST:event_kButton1ActionPerformed

    //Code for approving the request and adding new notify
    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        try{
            int UP1= 0, UP2=0;
            Class.forName("com.mysql.jdbc.Driver");
            conn= (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
            stmt= (Statement)conn.createStatement();
            RID= Integer.parseInt(jTextField2.getText());
            IDS= Integer.parseInt(jTextField3.getText());
            MedID= jTextField4.getText();
            District= (String)jComboBox2.getSelectedItem();
            Type= jTextField5.getText();
            Detail= jTextArea1.getText();
            BGroup= jTextField6.getText();
            if(jCheckBox1.isSelected()){
                City= jCheckBox1.getText();
                VAddress= this.getVAdd(City);
                NID= GNID.getNID();
                UP1= stmt.executeUpdate("INSERT INTO notify VALUES("+NID+","+RID+",'"+MID+"','"+BGroup+"',"
                        + "'"+Type+"','"+Detail+"','"+District+"','"+City+"',0,"+IDS+",'"+VAddress+"','"+VContact+"',curdate())");
            }
            if(jCheckBox2.isSelected()){
                City= jCheckBox2.getText();
                VAddress= this.getVAdd(City);
                NID= GNID.getNID();
                UP1= stmt.executeUpdate("INSERT INTO notify VALUES("+NID+","+RID+",'"+MID+"','"+BGroup+"',"
                        + "'"+Type+"','"+Detail+"','"+District+"','"+City+"',0,"+IDS+",'"+VAddress+"','"+VContact+"',curdate())");
            }
            if(jCheckBox3.isSelected()){
                City= jCheckBox3.getText();
                VAddress= this.getVAdd(City);
                NID= GNID.getNID();
                UP1= stmt.executeUpdate("INSERT INTO notify VALUES("+NID+","+RID+",'"+MID+"','"+BGroup+"',"
                        + "'"+Type+"','"+Detail+"','"+District+"','"+City+"',0,"+IDS+",'"+VAddress+"','"+VContact+"',curdate())");
            }
            if(jCheckBox4.isSelected()){
                City= jCheckBox4.getText();
                VAddress= this.getVAdd(City);
                NID= GNID.getNID();
                UP1= stmt.executeUpdate("INSERT INTO notify VALUES("+NID+","+RID+",'"+MID+"','"+BGroup+"',"
                        + "'"+Type+"','"+Detail+"','"+District+"','"+City+"',0,"+IDS+",'"+VAddress+"','"+VContact+"',curdate())");
            }
            if(jCheckBox5.isSelected()){
                City= jCheckBox5.getText();
                VAddress= this.getVAdd(City);
                NID= GNID.getNID();
                UP1= stmt.executeUpdate("INSERT INTO notify VALUES("+NID+","+RID+",'"+MID+"','"+BGroup+"',"
                        + "'"+Type+"','"+Detail+"','"+District+"','"+City+"',0,"+IDS+",'"+VAddress+"','"+VContact+"',curdate())");
            }
            if(jCheckBox6.isSelected()){
                City= jCheckBox6.getText();
                VAddress= this.getVAdd(City);
                NID= GNID.getNID();
                UP1= stmt.executeUpdate("INSERT INTO notify VALUES("+NID+","+RID+",'"+MID+"','"+BGroup+"',"
                        + "'"+Type+"','"+Detail+"','"+District+"','"+City+"',0,"+IDS+",'"+VAddress+"','"+VContact+"',curdate())");
            }
            if(jCheckBox7.isSelected()){
                City= jCheckBox7.getText();
                VAddress= this.getVAdd(City);
                NID= GNID.getNID();
                UP1= stmt.executeUpdate("INSERT INTO notify VALUES("+NID+","+RID+",'"+MID+"','"+BGroup+"',"
                        + "'"+Type+"','"+Detail+"','"+District+"','"+City+"',0,"+IDS+",'"+VAddress+"','"+VContact+"',curdate())");
            }
            if(jCheckBox8.isSelected()){
                City= jCheckBox8.getText();
                VAddress= this.getVAdd(City);
                NID= GNID.getNID();
                UP1= stmt.executeUpdate("INSERT INTO notify VALUES("+NID+","+RID+",'"+MID+"','"+BGroup+"',"
                        + "'"+Type+"','"+Detail+"','"+District+"','"+City+"',0,"+IDS+",'"+VAddress+"','"+VContact+"',curdate())");
            }
            if(jCheckBox9.isSelected()){
                City= jCheckBox9.getText();
                VAddress= this.getVAdd(City);
                NID= GNID.getNID();
                UP1= stmt.executeUpdate("INSERT INTO notify VALUES("+NID+","+RID+",'"+MID+"','"+BGroup+"',"
                        + "'"+Type+"','"+Detail+"','"+District+"','"+City+"',0,"+IDS+",'"+VAddress+"','"+VContact+"',curdate())");
            }
            if(jCheckBox10.isSelected()){
                City= jCheckBox10.getText();
                VAddress= this.getVAdd(City);
                NID= GNID.getNID();
                UP1= stmt.executeUpdate("INSERT INTO notify VALUES("+NID+","+RID+",'"+MID+"','"+BGroup+"',"
                        + "'"+Type+"','"+Detail+"','"+District+"','"+City+"',0,"+IDS+",'"+VAddress+"','"+VContact+"',curdate())");
            }
            if(UP1>=1){
                UP2= stmt.executeUpdate("UPDATE request SET ReqCon= 1, Date= curdate() WHERE RequestID="+RID);
            }
            if(UP1==0 | UP2==0)
                JOptionPane.showMessageDialog(this, "The requested updation has been failed.", "Updation Failed", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
            else{
                JOptionPane.showMessageDialog(this, "The requested updation has been sucessfully placed.", "Updation Sucess", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_ok.png")));
            }
        }
        catch(ClassNotFoundException | NumberFormatException | SQLException e){
            ER.copyReason(e.toString());
            JOptionPane.showMessageDialog(this, "An error occured while updating data into our servers.\nError have been copied into your clipboard.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
    }//GEN-LAST:event_kButton2ActionPerformed

    //Code for selecting values from JList
    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        String MPub = (String) jList1.getSelectedValue();
        String PubN =MPub.trim().substring(0, 9);
        String query = "SELECT * FROM request WHERE RequestID="+ PubN;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt= con.createStatement();
            rs= stmt.executeQuery(query);
            if(rs.next()){
                RID= rs.getInt("RequestID");
                MID= rs.getInt("MemberID");
                VID= rs.getInt("VolunteerID");
                MedID= rs.getString("MedicalID");
                City= rs.getString("City");
                District= rs.getString("District");
                Type= rs.getString("Type");
                Detail= rs.getString("Detail");
                BGroup= rs.getString("BloodGroup");
                jTextField2.setText(Integer.toString(RID));
                if(MID==0){
                    jLabel9.setText("Volunteer ID");
                    jTextField3.setText(Integer.toString(VID));
                }
                else{
                    jLabel9.setText("Member ID");
                    jTextField3.setText(Integer.toString(MID));
                }
                jTextField4.setText(MedID);
                jComboBox2.setSelectedItem(District);
                this.setCity(District, City);
                jTextField5.setText(Type);
                jTextArea1.setText(Detail);
                jTextField6.setText(BGroup);
            }
        }
        catch(ClassNotFoundException | SQLException e) {
            ER.copyReason(e.toString());
                JOptionPane.showMessageDialog(this, "An error occured while pulling data from our servers.\nError have been copied into your clipboard.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
    }//GEN-LAST:event_jList1MouseClicked

    //Code for refreshing JList
    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        if(jComboBox1.getSelectedItem().equals("Member"))
            getList(0);
        else if(jComboBox1.getSelectedItem().equals("Volunteer"))
            getList(1);
    }//GEN-LAST:event_kButton4ActionPerformed

    //Code for trimming excess numbers
    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        if(jTextField1.getText().length()>8)
            evt.consume();
        if(!(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'))
            evt.consume();
    }//GEN-LAST:event_jTextField1KeyTyped

    //Code for populating JList
    private void getList(int f) {
        flag= f;
        DefaultListModel DM = (DefaultListModel) jList1.getModel();
        if(flag==0){
            SQL="SELECT * FROM request WHERE MemberID<> 0 AND ReqCon= 0 AND City='"+OCity+"'";
        }
        else if(flag==1)
            SQL="SELECT * FROM request WHERE VolunteerID<> 0 AND ReqCon= 0 AND City='"+OCity+"'";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String db_url="jdbc:mysql://localhost:3306/project";
            String pwd="root";
            String user="root";
            conn=(Connection)DriverManager.getConnection(db_url,user,pwd);
            stmt=(Statement) conn.createStatement();
            rs=stmt.executeQuery(SQL);
            DM.removeAllElements();
            jList1.setModel(DM);
            while(rs.next()){
                RID = rs.getInt("RequestID");
                Type = rs.getString("Type");
                DM.addElement(RID+" - "+Type);
            }
            jList1.setModel(DM);
        }
        catch(ClassNotFoundException | SQLException e) {
            ER.copyReason(e.toString());
            JOptionPane.showMessageDialog(this, "An error occured while pulling data from our servers.\nError have been copied into your clipboard.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
    }
    
    //Code for setting district and city
    private void setCity(String D, String C){
        switch(D) {
            case "Alappuzha":
                {
                    jCheckBox1.setText("Ambalapuzha");
                    jCheckBox2.setText("Alappuzha");
                    jCheckBox3.setText("Chengannur");
                    jCheckBox4.setText("Cherthala");
                    jCheckBox5.setText("Haripad");
                    jCheckBox6.setText("Karthikappally");
                    jCheckBox7.setText("Kuttanad");
                    jCheckBox8.setText("Mankombu");
                    jCheckBox9.setText("Mavelikkara");
                    jCheckBox10.setVisible(false);
                    switch(C){
                        case "Ambalapuzha": jCheckBox1.setSelected(true);
                            break;
                        case "Alappuzha": jCheckBox2.setSelected(true);
                            break;
                        case "Chengannur": jCheckBox3.setSelected(true);
                            break;
                        case "Cherthala": jCheckBox4.setSelected(true);
                            break;
                        case "Haripad": jCheckBox5.setSelected(true);
                            break;
                        case "Karthikappally": jCheckBox6.setSelected(true);
                            break;
                        case "Kuttanad": jCheckBox7.setSelected(true);
                            break;
                        case "Mankombu": jCheckBox8.setSelected(true);
                            break;
                        case "Mavelikkara": jCheckBox9.setSelected(true);
                            break;
                        default:
                            break;
                    }
                    break;
                }
            case "Ernakulam":
                {
                    jCheckBox1.setText("Aluva");
                    jCheckBox2.setText("Ernakulam");
                    jCheckBox3.setText("Fort Kochi");
                    jCheckBox4.setText("Kanayannur");
                    jCheckBox5.setText("Kochi");
                    jCheckBox6.setText("Kothamangalam");
                    jCheckBox7.setText("Kunnathunad");
                    jCheckBox8.setText("Muvattupuzha");
                    jCheckBox9.setText("North Paravur");
                    jCheckBox10.setText("Perumbavoor");
                    switch(C){
                        case "Aluva": jCheckBox1.setSelected(true);
                            break;
                        case "Ernakulam": jCheckBox2.setSelected(true);
                            break;
                        case "Fort Kochi": jCheckBox3.setSelected(true);
                            break;
                        case "Kanayannur": jCheckBox4.setSelected(true);
                            break;
                        case "Kochi": jCheckBox5.setSelected(true);
                            break;
                        case "Kothamangalam": jCheckBox6.setSelected(true);
                            break;
                        case "Kunnathunad": jCheckBox7.setSelected(true);
                            break;
                        case "Muvattupuzha": jCheckBox8.setSelected(true);
                            break;
                        case "North Paravur": jCheckBox9.setSelected(true);
                            break;
                        case "Perumbavoor": jCheckBox10.setSelected(true);
                        default:
                            break;
                    }
                    break;
                }    
            case "Idukki":
                {
                    jCheckBox1.setText("Devikulam");
                    jCheckBox2.setText("Idukki");
                    jCheckBox3.setText("Nedumkandam");
                    jCheckBox4.setText("Painavu");
                    jCheckBox5.setText("Peermade");
                    jCheckBox6.setText("Thodupuzha");
                    jCheckBox7.setText("Udumbanchola");
                    jCheckBox8.setVisible(false);
                    jCheckBox9.setVisible(false);
                    jCheckBox10.setVisible(false);
                    switch(C){
                        case "Devikulam": jCheckBox1.setSelected(true);
                            break;
                        case "Idukki": jCheckBox2.setSelected(true);
                            break;
                        case "Nedumkandam": jCheckBox3.setSelected(true);
                            break;
                        case "Painavu": jCheckBox4.setSelected(true);
                            break;
                        case "Peermade": jCheckBox5.setSelected(true);
                            break;
                        case "Thodupuzha": jCheckBox6.setSelected(true);
                            break;
                        case "Udumbanchola": jCheckBox7.setSelected(true);
                            break;
                        default:
                            break;
                    }
                    break;
                }  
            case "Kannur":
                {
                    jCheckBox1.setText("Thalassery");
                    jCheckBox2.setText("Iritty");
                    jCheckBox3.setText("Kannur");
                    jCheckBox4.setText("Thalipparamba");
                    jCheckBox5.setText("Payyanur");
                    jCheckBox6.setVisible(false);
                    jCheckBox7.setVisible(false);
                    jCheckBox8.setVisible(false);
                    jCheckBox9.setVisible(false);
                    jCheckBox10.setVisible(false);
                    switch(C){
                        case "Thalassery": jCheckBox1.setSelected(true);
                            break;
                        case "Iritty": jCheckBox2.setSelected(true);
                            break;
                        case "Kannur": jCheckBox3.setSelected(true);
                            break;
                        case "Thalipparamba": jCheckBox4.setSelected(true);
                            break;
                        case "Payyanur": jCheckBox5.setSelected(true);
                            break;
                        default:
                            break;
                    }
                    break;
                }
            case "Kasaragod":
                {
                    jCheckBox1.setText("Hosdurg");
                    jCheckBox2.setText("Kasaragod");
                    jCheckBox3.setText("Manjeshwaram");
                    jCheckBox4.setText("Uppala");
                    jCheckBox5.setText("Vellarikundu");
                    jCheckBox6.setVisible(false);
                    jCheckBox7.setVisible(false);
                    jCheckBox8.setVisible(false);
                    jCheckBox9.setVisible(false);
                    jCheckBox10.setVisible(false);
                    switch(C){
                        case "Hosdurg": jCheckBox1.setSelected(true);
                            break;
                        case "Kasaragod": jCheckBox2.setSelected(true);
                            break;
                        case "Manjeshwaram": jCheckBox3.setSelected(true);
                            break;
                        case "Uppala": jCheckBox4.setSelected(true);
                            break;
                        case "Vellarikundu": jCheckBox5.setSelected(true);
                            break;
                        default:
                            break;
                    }
                    break;
                }
            case "Kollam":
                {
                    jCheckBox1.setText("Chathannoor");
                    jCheckBox2.setText("Karunagappally");
                    jCheckBox3.setText("Kollam");
                    jCheckBox4.setText("Kottarakkara");
                    jCheckBox5.setText("Kunnathur");
                    jCheckBox6.setText("Pathanapuram");
                    jCheckBox7.setText("Paravur");
                    jCheckBox8.setText("Punalur");
                    jCheckBox9.setText("Sasthamkotta");
                    jCheckBox10.setVisible(false);
                    switch(C){
                        case "Chathannoor": jCheckBox1.setSelected(true);
                            break;
                        case "Karunagappally": jCheckBox2.setSelected(true);
                            break;
                        case "Kollam": jCheckBox3.setSelected(true);
                            break;
                        case "Kottarakkara": jCheckBox4.setSelected(true);
                            break;
                        case "Kunnathur": jCheckBox5.setSelected(true);
                            break;
                        case "Pathanapuram": jCheckBox6.setSelected(true);
                            break;
                        case "Paravur": jCheckBox7.setSelected(true);
                            break;
                        case "Punalur": jCheckBox8.setSelected(true);
                            break;
                        case "Sasthamkotta": jCheckBox9.setSelected(true);
                            break;
                        default:
                            break;
                    }
                    break;
                }
            case "Kottayam":
                {
                    jCheckBox1.setText("Changanasserry");
                    jCheckBox2.setText("Kanjirappally");
                    jCheckBox3.setText("Kottayam");
                    jCheckBox4.setText("Meenachil");
                    jCheckBox5.setText("Palai");
                    jCheckBox6.setText("Vaikom");
                    jCheckBox7.setVisible(false);
                    jCheckBox8.setVisible(false);
                    jCheckBox9.setVisible(false);
                    jCheckBox10.setVisible(false);
                    switch(C){
                        case "Changanasserry": jCheckBox1.setSelected(true);
                            break;
                        case "Kanjirappally": jCheckBox2.setSelected(true);
                            break;
                        case "Kottayam": jCheckBox3.setSelected(true);
                            break;
                        case "Meenachil": jCheckBox4.setSelected(true);
                            break;
                        case "Palai": jCheckBox5.setSelected(true);
                            break;
                        case "Vaikom": jCheckBox6.setSelected(true);
                            break;
                        default:
                            break;
                    }
                    break;
                }
            case "Kozhikode":
                {
                    jCheckBox1.setText("Koyilandy");
                    jCheckBox2.setText("Kozhikode");
                    jCheckBox3.setText("Thamarassery");
                    jCheckBox4.setText("Vatakara");
                    jCheckBox5.setVisible(false);
                    jCheckBox6.setVisible(false);
                    jCheckBox7.setVisible(false);
                    jCheckBox8.setVisible(false);
                    jCheckBox9.setVisible(false);
                    jCheckBox10.setVisible(false);
                    switch(C){
                        case "Koyilandy": jCheckBox1.setSelected(true);
                            break;
                        case "Kozhikode": jCheckBox2.setSelected(true);
                            break;
                        case "Thamarassery": jCheckBox3.setSelected(true);
                            break;
                        case "Vatakara": jCheckBox4.setSelected(true);
                            break;
                        default:
                            break;
                    }
                    break;
                }
            case "Malappuram":
                {
                    jCheckBox1.setText("Eranad");
                    jCheckBox2.setText("Kondotty");
                    jCheckBox3.setText("Manjeri");
                    jCheckBox4.setText("Nilambur");
                    jCheckBox5.setText("Perinthalmanna");
                    jCheckBox6.setText("Ponnani");
                    jCheckBox7.setText("Tirur");
                    jCheckBox8.setText("Tirurangadi");
                    jCheckBox9.setVisible(false);
                    jCheckBox10.setVisible(false);
                    switch(C){
                        case "Eranad": jCheckBox1.setSelected(true);
                            break;
                        case "Kondotty": jCheckBox2.setSelected(true);
                            break;
                        case "Manjeri": jCheckBox3.setSelected(true);
                            break;
                        case "Nilambur": jCheckBox4.setSelected(true);
                            break;
                        case "Perinthalmanna": jCheckBox5.setSelected(true);
                            break;
                        case "Ponnani": jCheckBox6.setSelected(true);
                            break;
                        case "Tirur": jCheckBox7.setSelected(true);
                            break;
                        case "Tirurangadi": jCheckBox8.setSelected(true);
                            break;
                        default:
                            break;
                    }
                    break;
                }
            case "Palakkad":
                {
                    jCheckBox1.setText("Alathur");
                    jCheckBox2.setText("Chittur");
                    jCheckBox3.setText("Mannarkkad");
                    jCheckBox4.setText("Ottappalam");
                    jCheckBox5.setText("Palakkad");
                    jCheckBox6.setText("Pattambi");
                    jCheckBox7.setVisible(false);
                    jCheckBox8.setVisible(false);
                    jCheckBox9.setVisible(false);
                    jCheckBox10.setVisible(false);
                    switch(C){
                        case "Alathur": jCheckBox1.setSelected(true);
                            break;
                        case "Chittur": jCheckBox2.setSelected(true);
                            break;
                        case "Mannarkkad": jCheckBox3.setSelected(true);
                            break;
                        case "Ottappalam": jCheckBox4.setSelected(true);
                            break;
                        case "Palakkad": jCheckBox5.setSelected(true);
                            break;
                        case "Pattambi": jCheckBox6.setSelected(true);
                            break;
                        default:
                            break;
                    }
                    break;
                }
            case "Pathanamthitta":
                {
                    jCheckBox1.setText("Adoor");
                    jCheckBox2.setText("Konni");
                    jCheckBox3.setText("Kozhencherry");
                    jCheckBox4.setText("Mallappally");
                    jCheckBox5.setText("Pathanamthitta");
                    jCheckBox6.setText("Ranni");
                    jCheckBox7.setText("Thiruvalla");
                    jCheckBox8.setVisible(false);
                    jCheckBox9.setVisible(false);
                    jCheckBox10.setVisible(false);
                    switch(C){
                        case "Adoor": jCheckBox1.setSelected(true);
                            break;
                        case "Konni": jCheckBox2.setSelected(true);
                            break;
                        case "Kozhencherry": jCheckBox3.setSelected(true);
                            break;
                        case "Mallappally": jCheckBox4.setSelected(true);
                            break;
                        case "Pathanamthitta": jCheckBox5.setSelected(true);
                            break;
                        case "Ranni": jCheckBox6.setSelected(true);
                            break;
                        case "Thiruvalla": jCheckBox7.setSelected(true);
                            break;
                        default:
                            break;
                    }
                    break;
                }
            case "Thiruvananthapuram":
                {
                    jCheckBox1.setText("Attingal");
                    jCheckBox2.setText("Chirayinkeezhu");
                    jCheckBox3.setText("Kattakada");
                    jCheckBox4.setText("Nedumangad");
                    jCheckBox5.setText("Neyyattinkara");
                    jCheckBox6.setText("Thiruvananthapuram");
                    jCheckBox7.setText("Varkala");
                    jCheckBox8.setVisible(false);
                    jCheckBox9.setVisible(false);
                    jCheckBox10.setVisible(false);
                    switch(C){
                        case "Attingal": jCheckBox1.setSelected(true);
                            break;
                        case "Chirayinkeezhu": jCheckBox2.setSelected(true);
                            break;
                        case "Kattakada": jCheckBox3.setSelected(true);
                            break;
                        case "Nedumangad": jCheckBox4.setSelected(true);
                            break;
                        case "Neyyattinkara": jCheckBox5.setSelected(true);
                            break;
                        case "Thiruvananthapuram": jCheckBox6.setSelected(true);
                            break;
                        case "Varkala": jCheckBox7.setSelected(true);
                            break;
                        default:
                            break;
                    }
                    break;
                }
            case "Thrissur":
                {
                    jCheckBox1.setText("Chalakudy");
                    jCheckBox2.setText("Chavakkad");
                    jCheckBox3.setText("Irinjalakuda");
                    jCheckBox4.setText("Kodungallur");
                    jCheckBox5.setText("Kunnamkulam");
                    jCheckBox6.setText("Mukundapuram");
                    jCheckBox7.setText("Thalapilly");
                    jCheckBox8.setText("Thrissur");
                    jCheckBox9.setText("Wadakkancheri");
                    jCheckBox10.setVisible(false);
                    switch(C){
                        case "Chalakudy": jCheckBox1.setSelected(true);
                            break;
                        case "Chavakkad": jCheckBox2.setSelected(true);
                            break;
                        case "Irinjalakuda": jCheckBox3.setSelected(true);
                            break;
                        case "Kodungallur": jCheckBox4.setSelected(true);
                            break;
                        case "Kunnamkulam": jCheckBox5.setSelected(true);
                            break;
                        case "Mukundapuram": jCheckBox6.setSelected(true);
                            break;
                        case "Thalapilly": jCheckBox7.setSelected(true);
                            break;
                        case "Thrissur": jCheckBox8.setSelected(true);
                            break;
                        case "Wadakkancheri": jCheckBox9.setSelected(true);
                            break;
                        default:
                            break;
                    }
                    break;
                }  
            case "Wayanad":
                {
                    jCheckBox1.setText("Kalpetta");
                    jCheckBox2.setText("Mananthavady");
                    jCheckBox3.setText("Sultan Battery");
                    jCheckBox4.setText("Vythiri");
                    jCheckBox5.setVisible(false);
                    jCheckBox6.setVisible(false);
                    jCheckBox7.setVisible(false);
                    jCheckBox8.setVisible(false);
                    jCheckBox9.setVisible(false);
                    jCheckBox10.setVisible(false);
                    switch(C){
                        case "Kalpetta": jCheckBox1.setSelected(true);
                            break;
                        case "Mananthavady": jCheckBox2.setSelected(true);
                            break;
                        case "Sultan Battery": jCheckBox3.setSelected(true);
                            break;
                        case "Vythiri": jCheckBox4.setSelected(true);
                            break;
                        default:
                            break;
                    }
                    break;
                } 
            case "Lakshadweep":
                {
                    jCheckBox1.setText("Kavaratti");
                    jCheckBox2.setVisible(false);
                    jCheckBox3.setVisible(false);
                    jCheckBox4.setVisible(false);
                    jCheckBox5.setVisible(false);
                    jCheckBox6.setVisible(false);
                    jCheckBox7.setVisible(false);
                    jCheckBox8.setVisible(false);
                    jCheckBox9.setVisible(false);
                    jCheckBox10.setVisible(false);
                    switch(C){
                        case "Kavaratti": jCheckBox1.setSelected(true);
                            break;
                        default:
                            break;
                    }
                    break;
                }
            default:
                break;
        }
    }
    
    //Code for getting city and address of the volunteer
    private String getVAdd(String City){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String db_url="jdbc:mysql://localhost:3306/project";
            String pwd="root";
            String user="root";
            conn=(Connection)DriverManager.getConnection(db_url,user,pwd);
            stmt=(Statement) conn.createStatement();
            rs=stmt.executeQuery("SELECT * FROM volunteer WHERE City='"+City+"'");
            while(rs.next()){
                VAddress= rs.getString("VAddress");
                VContact= rs.getString("Contact");
            }
            jLabel51.setVisible(false);
        }
        catch(ClassNotFoundException | SQLException e){
            ER.copyReason(e.toString());
            jLabel51.setVisible(true);
        }
        return VAddress;
    }
    
    //Code for administrator Name & Email ID in JFrame
    private void getDetail(String email) {
        Email= email;
        String FN, LN;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM organization WHERE Email='"+Email+"'");
            while (rs.next()) {
                FN= rs.getString("FName");
                LN= rs.getString("LName");
                OCity= rs.getString("City");
                String name=FN+" "+LN;
                jLabel14.setText(name);
                jLabel15.setText(Email);
                this.getList(0);
            }
            
            jLabel51.setVisible(false);
        }
        catch(ClassNotFoundException | SQLException e){
            ER.copyReason(e.toString());
            jLabel14.setText("Organizer");
            jLabel15.setText("");
            jLabel51.setVisible(true);
        }
    }
    
    //Code for setting icon image in Taskbar
    private void setIcon() {
        setShape(new RoundRectangle2D.Double(0,0,1280,640,25,25));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/32px_heart_with_pulse.png")));
    }
    
    //Un-used action events
    private void jList1MouseEntered(java.awt.event.MouseEvent evt) {}
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
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
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private keeptoo.KButton kButton3;
    private keeptoo.KButton kButton4;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}