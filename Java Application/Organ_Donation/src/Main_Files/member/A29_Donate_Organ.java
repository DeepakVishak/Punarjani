// Main package
package Main_Files.member;

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

//Function class
public class A29_Donate_Organ extends javax.swing.JFrame {
    public A29_Donate_Organ(String e) {
        initComponents();
        setIcon();
        getDetail(e);
        kButton2.setVisible(false);
        jCheckBox1.setSelected(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        kButton1 = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        kButton3 = new keeptoo.KButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Oragn Donation Form");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkBorderRadius(25);
        kGradientPanel2.setkEndColor(new java.awt.Color(102, 102, 102));
        kGradientPanel2.setkFillBackground(false);
        kGradientPanel2.setkStartColor(new java.awt.Color(102, 102, 102));
        kGradientPanel2.setOpaque(false);
        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 650));

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
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

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_minimize_window.png"))); // NOI18N
        jLabel16.setToolTipText("Minimize");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 20, 30));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_close_window.png"))); // NOI18N
        jLabel17.setToolTipText("Close");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 30, 30));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_prev.png"))); // NOI18N
        jLabel14.setToolTipText("Go Back");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText(getTitle());
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)), "Disclaimer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel3.setToolTipText("Please read disclaimer carefully");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("By registering as an organ donor I understand and agree with the following: I’m registering, as an organ donor, is completely free of charge.");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 790, -1));

        jLabel2.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("I agree that my personal information may be stored on the database of the Punarjani Society and be only used for the advancement of organ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 790, -1));

        jLabel3.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("my next of kin of my wish to be an organ donor. I agree that medical professional may have access to my personal information and the");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 790, -1));

        jLabel4.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("donor awareness in general. I accept that the Organ Donor Foundation will secure and safeguard my personal information. I agree to inform");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 790, -1));

        jLabel8.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("information of my next of kin and that this information will only be used, if relevant for the purpose of my intention to be an organ donor.");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 790, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 810, 130));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField1.setToolTipText("Your Member ID");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 250, 30));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField2.setToolTipText("Your blood group");
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 260, 30));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField3.setToolTipText("Please enter your Test ID");
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 260, 30));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal Organ Harvest", "Organ Harvest After Death" }));
        jComboBox1.setToolTipText("Choose a method of organ harvest");
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 260, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setToolTipText("Please enter the details of lab where the test conducted");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 530, 80));

        jLabel9.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel9.setText("Member ID");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 250, -1));

        jLabel10.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel10.setText("Blood Group");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 260, -1));

        jLabel11.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel11.setText("Test ID");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 260, -1));

        jLabel12.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel12.setText("Provide Test Lab Details (Address/ Email ID)");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 530, -1));

        jLabel13.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel13.setText("would like to harvest organ.");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 260, 20));

        jLabel15.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel15.setText("Please choose one of option");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 260, 30));

        jLabel18.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel18.setText("Choose an option from below when you");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 260, 20));

        kButton1.setBorder(null);
        kButton1.setText("Reset");
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
        jPanel2.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 220, -1));

        kButton2.setBorder(null);
        kButton2.setText("Submit");
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
        jPanel2.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, 240, -1));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jLabel20.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel20.setText("I hereby confirm the Disclaimer and read the notes");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 290, 20));

        jLabel23.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel23.setText("and I accept that all information is true.");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 290, 20));

        jLabel24.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 0)));
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 330, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 0)), "Organs Like To Donate", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 153, 0))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jCheckBox2.setText("Cornea");
        jCheckBox2.setToolTipText("Check here to donate Cornea (Eye)");
        jPanel4.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, -1));

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jCheckBox3.setText("Heart");
        jCheckBox3.setToolTipText("Check here to donate Heart");
        jPanel4.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 110, -1));

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jCheckBox4.setText("Intestine");
        jCheckBox4.setToolTipText("Check here to donate Intestine");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 110, -1));

        jCheckBox5.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jCheckBox5.setText("Kidney");
        jCheckBox5.setToolTipText("Check here to donate Kidney");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 110, -1));

        jCheckBox6.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jCheckBox6.setText("Liver");
        jCheckBox6.setToolTipText("Check here to donate your liver");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 110, -1));

        jCheckBox7.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jCheckBox7.setText("Lungs");
        jCheckBox7.setToolTipText("Check here to donate Lungs");
        jPanel4.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 110, -1));

        jCheckBox8.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jCheckBox8.setText("Pancreas");
        jCheckBox8.setToolTipText("Check here to donate Pancreas");
        jPanel4.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 100, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)), "Note", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel5.setToolTipText("Please read before you apply");
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Make sure that the details provided by you is correct. Misleading or mistakes on details can lead to rejection of the application and may");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 770, -1));

        jLabel27.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("lead to temporary account deactivation.");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 770, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 790, 70));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 810, 140));

        kButton3.setBorder(null);
        kButton3.setText("Submit");
        kButton3.setFont(new java.awt.Font("Cambria Math", 1, 26)); // NOI18N
        kButton3.setkEndColor(new java.awt.Color(204, 204, 204));
        kButton3.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        kButton3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton3.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        kButton3.setkSelectedColor(new java.awt.Color(204, 204, 204));
        kButton3.setkStartColor(new java.awt.Color(204, 204, 204));
        jPanel2.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, 240, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 850, 520));

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 153, 0));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("DCompany");
        kGradientPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 790, 40));

        jLabel22.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("dcompany.uit@gmail.com");
        kGradientPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 790, 20));

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_caution.png"))); // NOI18N
        jLabel51.setToolTipText("Internal error");
        kGradientPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 30, 20));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 850, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Global variables declared
    int mousepX, mousepY, VER;
    ErrorReason ER= new ErrorReason();
    Connection con= null;
    Statement stmt= null;
    ResultSet rs1= null, rs2= null;
    String Email, ID, TID, TA, Liver, Kidney, Heart, Lungs, Intestine, Cornea, Pancreas, Type;
  
    //Code for making JFrame minimized in taskbar
    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel16MouseClicked

    //Code for closing application
    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        int CO= JOptionPane.showConfirmDialog(this, "Are you sure to close the application?", "Close Application", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(CO==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jLabel17MouseClicked

    //Code for going back to member's home page
    private void jLabel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MousePressed
        int OP= JOptionPane.showConfirmDialog(this, "Are you sure that you want to Members Home Page?\nIf Yes please choose Yes  ", "Are you sure to go back", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(OP==JOptionPane.YES_OPTION){
            new A25_Member_Page(Email).setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel14MousePressed

    //Code for moving JFrame across screen
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int coordX= evt.getXOnScreen();
        int coordY= evt.getYOnScreen();
        this.setLocation(coordX-mousepX, coordY-mousepY);
    }//GEN-LAST:event_jPanel1MouseDragged

    //Code for getting mouse pressed location
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    //Code for agreeing terms & Condition
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(this.getChecked()==1){
            if(jCheckBox1.isSelected()==true){
                kButton2.setVisible(true);
                kButton2.setEnabled(true);
                kButton3.setVisible(false);
                kButton3.setEnabled(false);
            }
            else if(jCheckBox1.isSelected()==false){
                kButton3.setEnabled(false);
                kButton3.setVisible(true);
                kButton2.setVisible(false);
            }
        }
        else
            jCheckBox1.setSelected(false);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    //Code for resetting all fields
    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        new A29_Donate_Organ(Email).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kButton1ActionPerformed

    //Code for applying as organ donor 
    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        if(getChecked()==1){
            ID= jTextField1.getText();
            TID= jTextField3.getText();
            TA= jTextArea1.getText();
            Type= (String)jComboBox1.getSelectedItem();
            if(jCheckBox2.isSelected()==true)
                Cornea="1";
            else
                Cornea="0";
            if(jCheckBox3.isSelected()==true)
                Heart="1";
            else
                Heart="0";
            if(jCheckBox4.isSelected()==true)
                Intestine="1";
            else
                Intestine="0";
            if(jCheckBox5.isSelected()==true)
                Kidney="1";
            else
                Kidney="0";
            if(jCheckBox6.isSelected()==true)
                Liver="1";
            else
                Liver="0";
            if(jCheckBox7.isSelected()==true)
                Lungs="1";
            else
                Lungs="0";
            if(jCheckBox8.isSelected()==true)
                Pancreas="1";
            else
                Pancreas="0";
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con= (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
                stmt = con.createStatement();
                String SQL= "UPDATE organs SET TestID='"+TID+"',"
                        + "Liver="+Liver+","
                        + "Kidney="+Kidney+","
                        + "Heart="+Heart+","
                        + "Lungs="+Lungs+","
                        + "Intestine="+Intestine+","
                        + "Cornea="+Cornea+","
                        + "Pancreas="+Pancreas+","
                        + "Type='"+Type+"',"
                        + "TestAddress='"+TA+"',"
                        + "Verify=1 WHERE MemberID="+ID;
                int row= stmt.executeUpdate(SQL);
                if(row==1){
                    int row2= stmt.executeUpdate("UPDATE member SET Verify= "+(VER+1)+" WHERE MemberID="+ID);
                    JOptionPane.showMessageDialog(this, "Your request has been sucessfully placed.\nIt will be processed in a week.", "Request Placed", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_update.png")));
                }
            }
            catch(HeadlessException | ClassNotFoundException | SQLException e){
                ER.copyReason(e.toString());
                JOptionPane.showMessageDialog(this, "An error occured while updating request into our servers.\nError have been copied into your clipboard.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
            }
        }
    }//GEN-LAST:event_kButton2ActionPerformed

    //Code for setting icon image in taskbar
    private void setIcon() {
        setShape(new RoundRectangle2D.Double(0,0,850,650,25,25));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/32px_heart_with_pulse.png")));
    } 

    //Code for getting current user information
    private void getDetail(String email){
        Email= email;
        String FN, LN, BG; 
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt = con.createStatement();
            rs1 = stmt.executeQuery("SELECT * FROM member WHERE Email='"+Email+"'");
            if(rs1.next()){
                FN= rs1.getString("FName");
                LN= rs1.getString("LName");
                BG= rs1.getString("BloodGroup");
                ID= rs1.getString("MemberID");
                VER= rs1.getInt("Verify");
                rs2= stmt.executeQuery("SELECT * FROM organs WHERE MemberID="+ID);
                if(rs2.next()){
                    TID= rs2.getString("TestID");
                    TA= rs2.getString("TestAddress");
                    Liver= rs2.getString("Liver");
                    Kidney= rs2.getString("Kidney");
                    Heart= rs2.getString("Heart");
                    Lungs= rs2.getString("Lungs");
                    Intestine= rs2.getString("Intestine");
                    Cornea= rs2.getString("Cornea");
                    Pancreas= rs2.getString("Pancreas");
                    Type= rs2.getString("Type");
                    if(Type==null){
                        jTextField3.setText("");
                        jTextArea1.setText("");
                        jComboBox1.setSelectedIndex(0);
                        jCheckBox1.setSelected(false);
                        jCheckBox2.setSelected(false);
                        jCheckBox3.setSelected(false);
                        jCheckBox4.setSelected(false);
                        jCheckBox5.setSelected(false);
                        jCheckBox6.setSelected(false);
                        jCheckBox7.setSelected(false);
                        jCheckBox8.setSelected(false);
                    }
                    else{
                        jTextField3.setText(TID);
                        jTextArea1.setText(TA);
                        jComboBox1.setSelectedItem(Type);
                        jCheckBox1.setSelected(true);
                        if("1".equals(Cornea))
                            jCheckBox2.setSelected(true);
                        else
                            jCheckBox2.setSelected(false);
                        if("1".equals(Heart))
                            jCheckBox3.setSelected(true);
                        else
                            jCheckBox3.setSelected(false);
                        if("1".equals(Intestine))
                            jCheckBox4.setSelected(true);
                        else
                            jCheckBox4.setSelected(false);
                        if("1".equals(Kidney))
                            jCheckBox5.setSelected(true);
                        else
                            jCheckBox5.setSelected(false);
                        if("1".equals(Liver))
                            jCheckBox6.setSelected(true);
                        else
                            jCheckBox6.setSelected(false);
                        if("1".equals(Lungs))
                            jCheckBox7.setSelected(true);
                        else
                            jCheckBox7.setSelected(false);
                        if("1".equals(Pancreas))
                            jCheckBox8.setSelected(true);
                        else
                            jCheckBox8.setSelected(false);
                    }
                }
                jTextField1.setText(ID);
                jTextField2.setText(BG);
                jLabel21.setText(FN+" "+LN);
                jLabel22.setText(Email);
            }
            jLabel51.setVisible(false);
        }
        catch(ClassNotFoundException | SQLException e){
            jLabel51.setVisible(true);
            ER.copyReason(e.toString());
            jLabel21.setText("Member");
            jLabel22.setText("");
        }
    }
    
    //Code for checking fields are empty or not
    private int getChecked(){
        int flag=0;
        if(!(jTextField3.getText().equalsIgnoreCase(""))){
            if(!(jTextArea1.getText().equalsIgnoreCase(""))){
                int CO= JOptionPane.showConfirmDialog(this, "You are going to apply for oragan donation.\nMake sure that you read and aware of all information in disclaimer.", "Applying for Organ Donation", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
                if(CO==JOptionPane.YES_OPTION)
                    flag=1;
            }
            else
                JOptionPane.showMessageDialog(this, "Please enter your height.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
        else
            JOptionPane.showMessageDialog(this, "Please enter Test Lab Details.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        return flag;
    }
    
    //Un-used action events
    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {}
    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {}
    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private keeptoo.KButton kButton3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}