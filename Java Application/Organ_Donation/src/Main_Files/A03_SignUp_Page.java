//Main Package
package Main_Files;

//Imported class files
import java.io.File;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.Arrays;
import java.nio.file.Path;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import Class_Files.GetImage;
import Class_Files.CopyImage;
import java.sql.SQLException;
import java.sql.DriverManager;
import Class_Files.ErrorReason;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.filechooser.FileNameExtensionFilter;

//Function class
public class A03_SignUp_Page extends javax.swing.JFrame {
    public A03_SignUp_Page() {
        initComponents();
        setIcon();
        getID();
        kButton1.setVisible(false);
        kButton3.setEnabled(false);
        jLabel25.setVisible(false);
        jLabel26.setVisible(false);
        jLabel51.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        kButton1 = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        kButton3 = new keeptoo.KButton();
        jComboBox6 = new javax.swing.JComboBox<>();

        jDialog1.setMinimumSize(new java.awt.Dimension(660, 500));
        jDialog1.setUndecorated(true);
        jDialog1.setResizable(false);
        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 153, 153)));
        kGradientPanel2.setkBorderRadius(0);
        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkGradientFocus(0);
        kGradientPanel2.setkStartColor(new java.awt.Color(2, 161, 203));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 161, 203));
        jPanel4.setOpaque(false);
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_close_window.png"))); // NOI18N
        jLabel33.setToolTipText("Close");
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 40, 30));

        jLabel36.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Terms and Conditions");
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel36MousePressed(evt);
            }
        });
        jPanel4.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 30));

        kGradientPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 30));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("                           ~~~ Terms & Conditions ~~~\n\nWelcome to Punarjani,\n\n  These terms and conditions outline the rules and regulations for the use of\nD Company's Website, Software Applications and Services located at \nUniversity Institute of Technology, Kowdiar, Thiruvananthapuram, Kerala, \nIndia.\n\n  By accessing this software, we assume you accept these terms and conditions.\nDo not continue to use Punarjani software if you do not agree to take all of \nthe terms and conditions stated on this page. Our Terms and Conditions were \ncreated with the help of the Terms and Conditions Generator.\n\n  The following terminology applies to these Terms and Conditions, Privacy \nStatement and Disclaimer Notice and all Agreements: \"Client\", \"You\" and \n\"Your\" refers to you, the person log on this application and compliant to \nthe Company’s terms and conditions. \"The Company\", \"Ourselves\", \"We\", \"Our\" \nand \"Us\", refers to our Company. \"Party\", \"Parties\", or \"Us\", refers to both \nthe Client and ourselves. All terms refer to the offer, acceptance and \nconsideration of payment necessary to undertake the process of our \nassistance to the Client in the most appropriate manner for the express \npurpose of meeting the Client’s needs in respect of provision of the \nCompany’s stated services, in accordance with and subject to, prevailing law\nof India. Any use of the above terminology or other words in the singular, \nplural, capitalization and/or he/she or they, are taken as interchangeable \nand therefore as referring to same.\n\n• Temporary Files\n  ===============\n  We employ the use of temporary files. By accessing Punarjani application,\nyou agreed to use temporary files in agreement with the D Company's Privacy \nPolicy.\n  Most interactive software applications use temporary files to let us \nretrieve the user’s details and to enable the functionality of certain areas \nto make it easier for people visiting our application. \n\n• License\n  =======\n  Unless otherwise stated, D Company and/or its licensors own the \nintellectual property rights for all material on Punarjani Website, Software \nApplications and Services. All intellectual property rights are reserved. \nYou may access this from Windows operating system for your own personal use \nsubjected to restrictions set in these terms and conditions.\n  You must not:\n  ►  Republish material from Punarjani Software\n  ►  Sell, rent or sub-license material from Punarjani Software\n  ►  Reproduce, duplicate or copy material from Punarjani Software\n  ►  Redistribute content from Punarjani Software from illegal source\n\n• This Agreement shall begin on the date hereof\n  =============================================\n  Parts of this software offer an opportunity for users to post and exchange \nopinions and information in certain areas of the software. D Company does not\nfilter, edit, publish or review Comments prior to their presence on the \nsoftware. Comments do not reflect the views and opinions of D Company, its \nagents and/or affiliates. Comments reflect the views and opinions of the \nperson who post their views and opinions. To the extent permitted by \napplicable laws, D Company shall not be liable for the Comments or for any \nliability, damages or expenses caused and/or suffered as a result of any use \nof and/or posting of and/or appearance of the Comments on this application.\nD Company reserves the right to monitor all Feedback & Request and to remove \nany Comments which can be considered inappropriate, offensive or causes \nbreach of these Terms and Conditions.\n  You warrant and represent that:\n  ►  You are entitled to post the Comments on our software and have all \n     necessary licenses and consents to do so.\n  ►  The Comments do not invade any intellectual property right, including \n     without limitation copyright, patent or trademark of any third party.\n  ►  The Comments do not contain any defamatory, libelous, offensive, \n     indecent or otherwise unlawful material which is an invasion of privacy.\n  ►  The Comments will not be used to solicit or promote business or custom \n     or present commercial activities or unlawful activity.\n\n  You hereby grant D Company a non-exclusive license to use, reproduce, edit \nand authorize others to use, reproduce and edit any of your Comments in any \nand all forms, formats or media.\n\n• Frames\n  ======\n  Without prior approval and written permission, you may not create frames \naround our software that alter in any way the visual presentation or \nappearance of our Website.\n\n• Content Liability\n  =================\n  We shall not be hold responsible for any content that appears on your \nsoftware. You agree to protect and defend us against all claims that is \nrising on your software. No link(s), button(s) should appear on any software \nthat may be interpreted as libelous, obscene or criminal, or which infringes,\notherwise violates, or advocates the infringement or other violation of, any \nthird party rights.\n\n                            ~~~ Privacy Policy ~~~                         \n\n• Reservation of Rights\n  ===================== \n  We reserve the right to request that you remove all links or any particular\nlink to our Website. You approve to immediately remove all links to our \nWebsite upon request. We also reserve the right to amen these terms and \nconditions and it’s linking policy at any time. By continuously linking to \nour Website, you agree to be bound to and follow these linking terms and \nconditions.\n\n• Removal of Comments from our software\n  =====================================\n  If you find any Comment on our software that is offensive for any reason, \nyou are free to contact and inform us any moment. We will consider requests \nto remove comment but we are not obligated to or so or to respond to you \ndirectly.\n  We do not ensure that the information on this software is correct, we do \nnot warrant its completeness or accuracy; nor do we promise to ensure that \nthe software remains available or that the material on the software is kept \nup to date.\n\n• Disclaimer\n  ==========\n  To the maximum extent permitted by applicable law, we exclude all \nrepresentations, warranties and conditions relating to our application and \nthe use of this application. Nothing in this disclaimer will:\n  ►  limit or exclude our or your liability for death or personal injury;\n  ►  limit or exclude our or your liability for fraud or fraudulent \n       misrepresentation;\n  ►  limit any of our or your liabilities in any way that is not permitted \n       under applicable law; or\n  ►  exclude any of our or your liabilities that may not be excluded under \n       applicable law.\n\n  The limitations and prohibitions of liability set in this Section and \nelsewhere in this disclaimer: (a) are subject to the preceding paragraph; \nand (b) govern all liabilities arising under the disclaimer, including \nliabilities arising in contract, in tort and for breach of statutory duty.\n  As long as the software and the information and services on the application\nare provided free of charge, we will not be liable for any loss or damage of \nany nature.");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        kGradientPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 640, 450));

        jDialog1.getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 500));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");
        setMinimumSize(new java.awt.Dimension(800, 550));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel3.setkBorderRadius(25);
        kGradientPanel3.setkEndColor(new java.awt.Color(102, 102, 102));
        kGradientPanel3.setkFillBackground(false);
        kGradientPanel3.setkStartColor(new java.awt.Color(102, 102, 102));
        kGradientPanel3.setOpaque(false);
        getContentPane().add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 550));

        jPanel3.setBackground(new java.awt.Color(2, 161, 203));
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

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_minimize_window.png"))); // NOI18N
        jLabel16.setToolTipText("Minimize");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 20, 30));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_close_window.png"))); // NOI18N
        jLabel17.setToolTipText("Close");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 30));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_prev.png"))); // NOI18N
        jLabel18.setToolTipText("Go Back");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel18MousePressed(evt);
            }
        });
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_comments.png"))); // NOI18N
        jLabel28.setToolTipText("Go to feedback page");
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel28MouseEntered(evt);
            }
        });
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 30, 30));

        jLabel32.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText(getTitle());
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(2, 161, 203));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jLabel20.setText("Sign Up");
        kGradientPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 760, 30));

        jLabel21.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jLabel21.setText("Welcome! New User. You can create new account here...");
        kGradientPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 580, 20));

        jLabel22.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jLabel22.setText("Please read and agree our terms and condition policy before you submit your profile");
        kGradientPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 64, 460, 20));

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_caution.png"))); // NOI18N
        jLabel51.setToolTipText("Internal error");
        kGradientPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 20));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 100));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel1.setText("Member ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 30));

        jLabel2.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel2.setText("First Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 110, 30));

        jLabel3.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 110, 30));

        jLabel4.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel4.setText("Email ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, 30));

        jLabel5.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel5.setText("New Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 110, 30));

        jLabel6.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel6.setText("Mobile Number");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 110, 30));

        jLabel7.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel7.setText("Age");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 110, 30));

        jLabel8.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel8.setText("Gender");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 110, 30));

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPasswordField1.setToolTipText("Enter your password");
        jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 200, 30));

        jPasswordField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPasswordField2.setToolTipText("Confirm your password");
        jPasswordField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPasswordField2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jPasswordField2CaretUpdate(evt);
            }
        });
        jPanel1.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 200, 30));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField1.setToolTipText("Please press this field before submiting your profile");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField1MousePressed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 240, 30));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField2.setToolTipText("Enter your first name");
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jTextField2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField2CaretUpdate(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 240, 30));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField3.setToolTipText("Enter your last name");
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 240, 30));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField4.setToolTipText("Enter your Email ID");
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jTextField4.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField4CaretUpdate(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 240, 30));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField5.setToolTipText("Enter your mobile number");
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jTextField5.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField5CaretUpdate(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 170, 30));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/160px_new_members_cover.png"))); // NOI18N
        jLabel19.setToolTipText("Click here to upload profile picture");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel19MousePressed(evt);
            }
        });
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 140, 160));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/160px_new_members.png"))); // NOI18N
        jLabel13.setOpaque(true);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 140, 160));

        jLabel9.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel9.setText("Blood Group");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 110, 30));

        jLabel10.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel10.setText("City");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 60, 30));

        jLabel11.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel11.setText("District");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 60, 30));

        jLabel12.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel12.setText("State");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 60, 30));

        kButton1.setBorder(null);
        kButton1.setText("Submit");
        kButton1.setToolTipText("Submit! If you all done");
        kButton1.setEnabled(false);
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
        jPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 190, 40));

        kButton2.setBorder(null);
        kButton2.setText("Reset");
        kButton2.setToolTipText("Reset all fields and values");
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
        jPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 160, 40));

        jLabel14.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel14.setText("Confirm Password");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 110, 30));

        jLabel15.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Upload Your Profile Picture");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 190, 20));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a option", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90" }));
        jComboBox1.setToolTipText("Choose your age");
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 240, 30));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jRadioButton1.setText("Male");
        jRadioButton1.setToolTipText("Choose one of the gender");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 80, 30));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jRadioButton2.setText("Female");
        jRadioButton2.setToolTipText("Choose one of the gender");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 80, 30));

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jRadioButton3.setText("Other");
        jRadioButton3.setToolTipText("Choose one of the gender");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 80, 30));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a option", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        jComboBox2.setToolTipText("Choose your blood group");
        jComboBox2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 240, 30));

        jComboBox3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a option", "Kerala", "Lakshadweep" }));
        jComboBox3.setToolTipText("Choose your state");
        jComboBox3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 300, 30));

        jComboBox4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox4.setModel(new DefaultComboBoxModel());
        jComboBox4.setToolTipText("Choose your city");
        jComboBox4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jComboBox4.setEnabled(false);
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 300, 30));

        jComboBox5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox5.setModel(new DefaultComboBoxModel());
        jComboBox5.setToolTipText("Choose your district");
        jComboBox5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jComboBox5.setEnabled(false);
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 300, 30));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setToolTipText("Choose if you agree our terms and condition");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Agree our terms and condition policy");
        jLabel23.setToolTipText("Choose if you agree our terms and condition");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 210, 20));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Read terms and condition policy");
        jLabel24.setToolTipText("Read our terms and condition policy");
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
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 370, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/30px_checkmark.png"))); // NOI18N
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 30, 30));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/30px_delete.png"))); // NOI18N
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 30, 30));

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
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, 30));

        jLabel29.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 51, 51));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Profile picture must be less than");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 210, -1));

        jLabel30.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 51, 51));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("1 MB and picture resoulution can");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 210, -1));

        jLabel31.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 51, 51));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("be up to 4 : 3 ratio");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 210, -1));

        kButton3.setBorder(null);
        kButton3.setText("Submit");
        kButton3.setFont(new java.awt.Font("Cambria Math", 1, 26)); // NOI18N
        kButton3.setkBackGroundColor(new java.awt.Color(204, 204, 204));
        kButton3.setkEndColor(new java.awt.Color(204, 204, 204));
        kButton3.setkHoverColor(new java.awt.Color(204, 204, 204));
        kButton3.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        kButton3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton3.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        kButton3.setkSelectedColor(new java.awt.Color(204, 204, 204));
        kButton3.setkStartColor(new java.awt.Color(204, 204, 204));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 190, 40));

        jComboBox6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+91" }));
        jComboBox6.setToolTipText("");
        jComboBox6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel1.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 60, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 800, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Global variables declared
    Connection con= null;
    Statement stmt= null;
    String sex, City, State, District;
    int MID=0, flag=0, mousepX, mousepY, mX, mY, E;
    CopyImage CI= new CopyImage();
    GetImage Image= new GetImage();
    ErrorReason ER= new ErrorReason();

    
    //Code for making JFrame minimized in taskbar
    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel16MouseClicked
    
    //Code for closing the program
    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        int CO= JOptionPane.showConfirmDialog(this, "Are you sure to close the application.\nUnsaved process will be lost.", "Missing Information", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(CO==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jLabel17MouseClicked

    //Code for going back to welcome page
    private void jLabel18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MousePressed
        int OP= JOptionPane.showConfirmDialog(this, "Are you sure that you want to leave to Welcome Page?\nIf Yes please choose Yes  ", "Are you sure to go back", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(OP==JOptionPane.YES_OPTION){
            new A01_Welcome_Page().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel18MousePressed

    //Code for moving JFrame across screen
    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int coordX= evt.getXOnScreen();
        int coordY= evt.getYOnScreen();
        this.setLocation(coordX-mousepX, coordY-mousepY);
    }//GEN-LAST:event_jPanel3MouseDragged

    //Code for getting pressed positon of mouse
    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    //Code for reseting values and fields
    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        this.getID();
        jTextField2.setText(""); 
        jTextField3.setText(""); 
        jTextField4.setText(""); 
        jTextField5.setText("");
        jPasswordField1.setText("");
        jPasswordField2.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jComboBox4.setSelectedIndex(0);
        jComboBox5.setSelectedIndex(0);
    }//GEN-LAST:event_kButton2ActionPerformed

    //Code for adding new member
    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        if(this.Check()){
            String Query;
            int CR;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
                stmt= con.createStatement();
                int ID= Integer.parseInt(jTextField1.getText());
                String FN=jTextField2.getText();
                String LN= jTextField3.getText();           
                String email = jTextField4.getText();            
                String pass = new String(jPasswordField1.getPassword());
                String mob= "+91".concat(jTextField5.getText());
                String age= (String) jComboBox1.getSelectedItem();
                String blood= (String) jComboBox2.getSelectedItem();
                City= (String) jComboBox4.getSelectedItem();
                District=(String) jComboBox5.getSelectedItem();
                Query = "INSERT INTO member VALUES("+ID+",'"+FN+"','"+LN+"','"+email+"','"+pass+"','"+mob+"',"
                        + "'"+age+"','"+sex+"','"+blood+"','"+City+"','"+District+"','"+State+"',0,0)";
                int row = stmt.executeUpdate(Query);
                if(row==1){
                    int row2= stmt.executeUpdate("INSERT INTO blood VALUES("+ID+", '"+blood+"', NULL, NULL, NULL, NULL, NULL, 0, NULL, NULL)");
                    int row3= stmt.executeUpdate("INSERT INTO organs VALUES("+ID+", '"+blood+"', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL)");
                    CR= JOptionPane.showConfirmDialog(this, "Your profile have been successfully created.\nMember ID: "+ID+"\nName: "+FN+" "+LN+"\nEmail ID: "+email+"\nMobile: "+mob+"", "Profile Created", JOptionPane.OK_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_ok.png")));
                    if(CR==JOptionPane.OK_OPTION){
                        CI.Copy("member", ID);
                        new A02_SignIn_Page().setVisible(true);
                        this.setVisible(false);
                    }
                }
            }
            catch(ClassNotFoundException | NumberFormatException | SQLException e){
                JOptionPane.showMessageDialog(this, "An error occured while entering data into servers.\nError have been copied into your clipboard.\nPlease feedback it and try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                ER.copyReason(e.toString());
            } 
        }
    }//GEN-LAST:event_kButton1ActionPerformed

    //Code for checking both passwords are same
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

    //Code for setting password visible
    private void jLabel27MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MousePressed
        jPasswordField1.setEchoChar((char)0);
    }//GEN-LAST:event_jLabel27MousePressed

    //Code for setting password hidden
    private void jLabel27MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseReleased
        jPasswordField1.setEchoChar('*');
    }//GEN-LAST:event_jLabel27MouseReleased

    //Code for setting gender male
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if(jRadioButton1.isSelected()==true){
            sex="Male";
            jRadioButton2.setEnabled(false);
            jRadioButton3.setEnabled(false);
        }
        else if(jRadioButton1.isSelected()==false){
            jRadioButton2.setEnabled(true);
            jRadioButton3.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    //Code for setting gender female
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if(jRadioButton2.isSelected()==true){
            sex="Female";
            jRadioButton1.setEnabled(false);
            jRadioButton3.setEnabled(false);
        }
        else if(jRadioButton2.isSelected()==false){
            jRadioButton1.setEnabled(true);
            jRadioButton3.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    //Code for setting gender other
    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        if(jRadioButton3.isSelected()==true){
            sex="Other";
            jRadioButton2.setEnabled(false);
            jRadioButton1.setEnabled(false);
        }
        else if(jRadioButton3.isSelected()==false){
            jRadioButton2.setEnabled(true);
            jRadioButton1.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    //Code for agreeing terms & policy
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()==true){
            kButton1.setVisible(true);
            kButton1.setEnabled(true);
            kButton3.setVisible(false);
            kButton3.setEnabled(false);
        }
        else if(jCheckBox1.isSelected()==false){
            kButton3.setEnabled(false);
            kButton3.setVisible(true);
            kButton1.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    //Code for choosing state
    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        if(jComboBox3.getSelectedItem().equals("Choose a option"))
            jComboBox3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        else
            jComboBox3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        switch (jComboBox3.getSelectedItem().toString()) {
            case "Choose a option":
                String[] Choose={""};
                DefaultComboBoxModel ComboBoxModel = new DefaultComboBoxModel(Choose);
                jComboBox4.setModel(ComboBoxModel);
                jComboBox5.setModel(ComboBoxModel);
                jComboBox4.setEnabled(false);
                jComboBox5.setEnabled(false);
                break;
            case "Kerala":
                {
                    State="Kerala";
                    String[] Kerala={"Choose a option","Alappuzha","Ernakulam","Idukki","Kannur","Kasaragod","Kollam",
                        "Kottayam","Kozhikode","Malappuram","Palakkad","Pathanamthitta",
                        "Thiruvananthapuram","Thrissur","Wayanad"};
                    DefaultComboBoxModel ComboBoxModelDistrict = new DefaultComboBoxModel(Kerala);
                    jComboBox5.setModel(ComboBoxModelDistrict);
                    jComboBox5.setEnabled(true);
                    break;
                }
            case "Lakshadweep":
                {
                    State="Lakshadweep";
                    String[] Lakshadweep={"Choose a option","Lakshadweep"};
                    DefaultComboBoxModel ComboBoxModelDistrict = new DefaultComboBoxModel(Lakshadweep);
                    jComboBox5.setModel(ComboBoxModelDistrict);
                    jComboBox5.setEnabled(true);
                    break;
                }
            default:
                break;
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    //Code for choosing district
    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        if(jComboBox5.getSelectedItem().equals("Choose a option"))
            jComboBox5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        else
            jComboBox5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        switch (jComboBox5.getSelectedItem().toString()) {
            case "Choose a option":
                String[] Choose={""};
                DefaultComboBoxModel ComboBoxModel = new DefaultComboBoxModel(Choose);
                jComboBox4.setModel(ComboBoxModel);
                jComboBox4.setEnabled(false);
                break;
            case "Alappuzha":
                {
                    District="Alappuzha";
                    String[] Alappuzha={"Ambalapuzha","Alappuzha","Chengannur","Cherthala",
                        "Haripad","Karthikappally","Kuttanad","Mankombu","Mavelikkara"};
                    DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Alappuzha);
                    jComboBox4.setModel(ComboBoxModelCity);
                    jComboBox4.setEnabled(true);
                    break;
                }
            case "Ernakulam":
                {
                    District="Ernakulam";
                    String[] Ernakulam={"Aluva","Ernakulam","Fort Kochi","Kanayannur","Kochi",
                        "Kothamangalam","Kunnathunad","Muvattupuzha","North Paravur","Perumbavoor"};
                    DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Ernakulam);
                    jComboBox4.setModel(ComboBoxModelCity);
                    jComboBox4.setEnabled(true);
                    break;
                }    
            case "Idukki":
                {
                    District="Idukki";
                    String[] Idukki={"Devikulam","Idukki","Nedumkandam","Painavu","Peermade",
                        "Thodupuzha","Udumbanchola"};
                    DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Idukki);
                    jComboBox4.setModel(ComboBoxModelCity);
                    jComboBox4.setEnabled(true);
                    break;
                }  
            case "Kannur":
                {
                    District="Kannur";
                    String[] Kannur={"Thalassery","Iritty","Kannur","Thalipparamba","Payyanur"};
                    DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kannur);
                    jComboBox4.setModel(ComboBoxModelCity);
                    jComboBox4.setEnabled(true);
                    break;
                }
            case "Kasaragod":
                {
                    District="Kasaragod";
                    String[] Kasaragod={"Hosdurg","Kasaragod","Manjeshwaram","Uppala","Vellarikundu"};
                    DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kasaragod);
                    jComboBox4.setModel(ComboBoxModelCity);
                    jComboBox4.setEnabled(true);
                    break;
                }
            case "Kollam":
                {
                    District="Kollam";
                    String[] Kollam={"Chathannoor","Karunagappally","Kollam","Kottarakkara",
                        "Kunnathur","Pathanapuram","Paravur","Punalur","Sasthamkotta"};
                    DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kollam);
                    jComboBox4.setModel(ComboBoxModelCity);
                    jComboBox4.setEnabled(true);
                    break;
                }
            case "Kottayam":
                {
                    District="Kottayam";
                    String[] Kottayam={"Changanasserry","Kanjirappally","Kottayam","Meenachil",
                        "Palai","Vaikom"};
                    DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kottayam);
                    jComboBox4.setModel(ComboBoxModelCity);
                    jComboBox4.setEnabled(true);
                    break;
                }
            case "Kozhikode":
                {
                    District="Kozhikode";
                    String[] Kozhikode={"Koyilandy","Kozhikode","Thamarassery","Vatakara"};
                    DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kozhikode);
                    jComboBox4.setModel(ComboBoxModelCity);
                    jComboBox4.setEnabled(true);
                    break;
                }
            case "Malappuram":
                {
                    District="Malappuram";
                    String[] Malappuram={"Eranad","Kondotty","Manjeri","Nilambur",
                        "Perinthalmanna","Ponnani","Tirur","Tirurangadi"};
                    DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Malappuram);
                    jComboBox4.setModel(ComboBoxModelCity);
                    jComboBox4.setEnabled(true);
                    break;
                }
            case "Palakkad":
                {
                    District="Palakkad";
                    String[] Palakkad={"Alathur","Chittur","Mannarkkad","Ottappalam",
                        "Palakkad","Pattambi"};
                    DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Palakkad);
                    jComboBox4.setModel(ComboBoxModelCity);
                    jComboBox4.setEnabled(true);
                    break;
                }
            case "Pathanamthitta":
                {
                    District="Pathanamthitta";
                    String[] Pathanamthitta={"Adoor","Konni","Kozhencherry","Mallappally",
                        "Pathanamthitta","Ranni","Thiruvalla"};
                    DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Pathanamthitta);
                    jComboBox4.setModel(ComboBoxModelCity);
                    jComboBox4.setEnabled(true);
                    break;
                }
            case "Thiruvananthapuram":
                {
                    District="Thiruvananthapuram";
                    String[] Thiruvananthapuram={"Attingal","Chirayinkeezhu","Kattakada","Nedumangad",
                        "Neyyattinkara","Thiruvananthapuram","Varkala"};
                    DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Thiruvananthapuram);
                    jComboBox4.setModel(ComboBoxModelCity);
                    jComboBox4.setEnabled(true);
                    break;
                }
            case "Thrissur":
                {
                    District="Thrissur";
                    String[] Thrissur={"Chalakudy","Chavakkad","Irinjalakuda","Kodungallur",
                        "Kunnamkulam","Mukundapuram","Thalapilly","Thrissur","Wadakkancheri"};
                    DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Thrissur);
                    jComboBox4.setModel(ComboBoxModelCity);
                    jComboBox4.setEnabled(true);
                    break;
                }  
            case "Wayanad":
                {
                    District="Wayanad";
                    String[] Wayanad={"Kalpetta","Mananthavady","Sultan Battery","Vythiri"};
                    DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Wayanad);
                    jComboBox4.setModel(ComboBoxModelCity);
                    jComboBox4.setEnabled(true);
                    break;
                } 
            case "Lakshadweep":
                {
                    District="Kavaratti";
                    String[] Kavaratti={"Kavaratti"};
                    DefaultComboBoxModel ComboBoxModelDistrict = new DefaultComboBoxModel(Kavaratti);
                    jComboBox4.setModel(ComboBoxModelDistrict);
                    jComboBox4.setEnabled(true);
                    break;
                }
            default:
                break;
        }
    }//GEN-LAST:event_jComboBox5ActionPerformed

    //Code for choosing city
    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        City= (String) jComboBox4.getSelectedItem();
    }//GEN-LAST:event_jComboBox4ActionPerformed

    //Code for refreshing Member ID
    private void jTextField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MousePressed
        this.getID();
    }//GEN-LAST:event_jTextField1MousePressed

    //Code for providing feedback page
    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        new A04_Feedback("SignUp").setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel28MouseClicked

    //Code for terms and policy highlight effect
    private void jLabel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseEntered
        jLabel24.setForeground(new Color(204,0,204));
    }//GEN-LAST:event_jLabel24MouseEntered

    //Code for terms and policy highlight effect
    private void jLabel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseExited
        jLabel24.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel24MouseExited

    //Code for showing terms and policy
    private void jLabel24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MousePressed
        jDialog1.pack();
        jDialog1.setLocationRelativeTo(null);
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jLabel24MousePressed

    //Code for closing the JDialog Box
    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jLabel33MouseClicked
    
    //Code for gragging JDialog across the screen
    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        int cX= evt.getXOnScreen();
        int cY= evt.getYOnScreen();
        jDialog1.setLocation(cX-mX, cY-mY);
    }//GEN-LAST:event_jPanel4MouseDragged

    //Code for getting mouse pressed position
    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        mX= evt.getX();
        mY= evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

    //Code for GUI effects
    private void jTextField2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField2CaretUpdate
        if(jTextField2.getText().equalsIgnoreCase(""))
            jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        else
            jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
    }//GEN-LAST:event_jTextField2CaretUpdate

    //Code for GUI effects
    private void jTextField4CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField4CaretUpdate
        if(jTextField4.getText().equalsIgnoreCase(""))
            jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        else
            jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
    }//GEN-LAST:event_jTextField4CaretUpdate

    //Code for GUI effects
    private void jTextField5CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField5CaretUpdate
        if(jTextField5.getText().equalsIgnoreCase(""))
            jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        else
            jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
    }//GEN-LAST:event_jTextField5CaretUpdate

    //Code for GUI effects
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if(jComboBox2.getSelectedItem().equals("Choose a option"))
            jComboBox2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        else
            jComboBox2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jComboBox2ActionPerformed

    //Code for trimming excess numbers entered
    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        if(jTextField5.getText().length()>9)
            evt.consume();
        if(!(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'))
            evt.consume();
    }//GEN-LAST:event_jTextField5KeyTyped

    //Code for uploading images
    private void jLabel19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MousePressed
        MID= Integer.parseInt(jTextField1.getText());
        String SelectPath;
        JFileChooser FileChoose= new JFileChooser();
        FileChoose.resetChoosableFileFilters();
        FileChoose.setFileFilter(new FileNameExtensionFilter("JPEG(*.jpg,*.jpeg)","jpg","jpeg"));
        int status= FileChoose.showOpenDialog(A03_SignUp_Page.this);
        if(status==JFileChooser.APPROVE_OPTION){
            SelectPath= FileChoose.getSelectedFile().getAbsolutePath();
            File source= new File(SelectPath);
            File F= new File(System.getProperty("java.class.path"));
            File Dir= F.getAbsoluteFile().getParentFile();
            String S= Dir.toString().concat("\\images\\member\\"+MID+".jpg");
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
            jLabel13.setIcon(Image.getImage("member", MID, 140, 160));
        }
    }//GEN-LAST:event_jLabel19MousePressed

    //Code for GUI effects
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jComboBox1.getSelectedItem().equals("Choose a option"))
            jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        else
            jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
    }
        
    //Code for getting new Member ID
    private void getID() {
        int i= 0, count= 0,NID = 0, max=0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt=con.createStatement();
            String sql1= "SELECT COUNT(MemberID) FROM member";
            String sql2= "SELECT * FROM member";
            String sql3= "SELECT MAX(MemberID) FROM member";
            ResultSet R1= stmt.executeQuery(sql1);
            while(R1.next()){
                count= R1.getInt("COUNT(MemberID)");
            }
            int[] ids= new int[count];
            ResultSet R2= stmt.executeQuery(sql2);
            while(R2.next()){
                ids[i]= R2.getInt("MemberID");
                i++;
            }
            if(!(ids.length==0)){
                ResultSet R3= stmt.executeQuery(sql3);
                if(R3.next())
                    max= R3.getInt("MAX(MemberID)");
                Arrays.sort(ids);
                int numberArrayIndex=0;
                for(i=0;i<ids[ids.length-1];i++) {
                    if(i==ids[numberArrayIndex]) {
                        numberArrayIndex++;
                    }
                    else{
                        if(i>1000000000){
                            NID=i;
                        }
                    }
                }
                if(NID==0){
                    NID= ++max;
                    jTextField1.setText(Integer.toString(NID));
                }
                else
                    jTextField1.setText(Integer.toString(NID));
                if(NID<1000000000)
                    jTextField1.setText("1000000000");
            }
            else{
                jTextField1.setText("1000000000");
            }
        }
        catch(ClassNotFoundException | SQLException e){
            jTextField1.setText("Error");
            ER.copyReason(e.toString());
            jLabel51.setVisible(true);
        }
    }
    
    //Code for setting icon image in taskbar
    private void setIcon() {
        setShape(new RoundRectangle2D.Double(0,0,800,550,25,25));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/32px_heart_with_pulse.png")));
    }

    //Code for checking fields are empty or not
    public boolean Check(){
        boolean temp= false;
        if(!("".equalsIgnoreCase(jTextField2.getText()))){
            if(!("".equalsIgnoreCase(jTextField4.getText()))){
                if(!("".equalsIgnoreCase(Arrays.toString(jPasswordField1.getPassword())))){
                    if(Arrays.equals(jPasswordField1.getPassword(), jPasswordField2.getPassword())){
                        if(!("".equalsIgnoreCase(jTextField5.getText()))){
                            if(!("Choose a option".equals(jComboBox1.getSelectedItem()))){
                                if(jRadioButton1.isSelected()|jRadioButton2.isSelected()|jRadioButton3.isSelected()){
                                    if(!("Choose a option".equals(jComboBox2.getSelectedItem()))){
                                        if(!(State==null|District==null|City==null))
                                            temp= true;
                                        else
                                            JOptionPane.showMessageDialog(this, "Please choose your State, District, City.\nThese fields are mandatory.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                                    }
                                    else
                                        JOptionPane.showMessageDialog(this, "Please choose your Blood Group.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));                                
                                }
                                else
                                    JOptionPane.showMessageDialog(this, "Please choose your Gender.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                            }
                            else
                                JOptionPane.showMessageDialog(this, "Please choose your Age.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                        }
                        else
                            JOptionPane.showMessageDialog(this, "Please enter your Mobile Number.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                    }
                    else
                        JOptionPane.showMessageDialog(this, "Please check wether the passwords are same.\nIt is not possible to continue with different passwords.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                }
                else
                    JOptionPane.showMessageDialog(this, "Please enter your passwords.\nWe need to make sure that your info must be safe and secure.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
            }
            else
                JOptionPane.showMessageDialog(this, "Please enter your Email ID.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
        else
            JOptionPane.showMessageDialog(this, "Please enter your First Name.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        return temp;
    } 
    
    //Un-used action events
    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {}
    private void jLabel36MousePressed(java.awt.event.MouseEvent evt) {}
    private void jLabel28MouseEntered(java.awt.event.MouseEvent evt) {}
    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JDialog jDialog1;
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
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private keeptoo.KButton kButton3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    // End of variables declaration//GEN-END:variables
}
