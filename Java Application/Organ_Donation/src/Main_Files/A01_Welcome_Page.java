//Main Package
package Main_Files;

//Imported class files
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JFrame;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.sql.Connection;
import java.util.Properties;
import java.sql.SQLException;
import javax.swing.UIManager;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import Class_Files.ErrorReason;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import com.jtattoo.plaf.aero.AeroLookAndFeel;
import java.awt.geom.RoundRectangle2D;
import javax.swing.UnsupportedLookAndFeelException;

//Function class
public class A01_Welcome_Page extends javax.swing.JFrame {
    public A01_Welcome_Page() {
        initComponents();
        setIcon();
        delDate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        kButton1 = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();

        jDialog1.setTitle("About");
        jDialog1.setMinimumSize(new java.awt.Dimension(700, 400));
        jDialog1.setUndecorated(true);
        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 161, 203));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(153, 153, 153)));
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

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_close_window.png"))); // NOI18N
        jLabel19.setToolTipText("Close");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 30, 30));

        jLabel21.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText(jDialog1.getTitle());
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 30));

        jDialog1.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 30));

        kGradientPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        kGradientPanel2.setkBorderRadius(0);
        kGradientPanel2.setkEndColor(new java.awt.Color(255, 0, 255));
        kGradientPanel2.setkGradientFocus(0);
        kGradientPanel2.setkStartColor(new java.awt.Color(2, 161, 203));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Manikandan Nair Sir");
        kGradientPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 160, -1));

        jLabel17.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Blood & Organ Donation System");
        kGradientPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 680, 40));

        jLabel20.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Jitha Tr.");
        kGradientPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 160, -1));

        jLabel28.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("(Teacher In-Charge)");
        kGradientPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 180, -1));

        jLabel29.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("(Head Of Insititution)");
        kGradientPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 180, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("~~ VOTE OF THANKS ~~");
        kGradientPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 310, -1));

        jLabel23.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("(Reg No: 32018950006)");
        kGradientPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 190, -1));

        jLabel24.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("(Reg No: 32018950016)");
        kGradientPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 190, -1));

        jLabel25.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("(Reg No: 32018950029)");
        kGradientPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 190, -1));

        jLabel26.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("(Reg No: 32018950039)");
        kGradientPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 190, -1));

        jLabel31.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Sreejith S. Nair");
        kGradientPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 110, -1));

        jLabel32.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("R. Subramony");
        kGradientPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 110, -1));

        jLabel33.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Deepak V");
        kGradientPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 110, -1));

        jLabel34.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Akil Sundhar");
        kGradientPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 110, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("~~ PROJECT DEVELOPERS ~~");
        kGradientPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 310, -1));

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("v 3.1 Build 200410");
        kGradientPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 700, 20));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        kGradientPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 10, 280));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/110px_Kerala_University.png"))); // NOI18N
        kGradientPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 110, 110));

        jLabel37.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 51));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("and organ donation under one roof.");
        kGradientPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 330, -1));

        jLabel38.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 51));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("The “Blood & Organ Donation System” maintains the");
        kGradientPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 330, -1));

        jLabel39.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 51));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("record of donors and act as a medium between donors,");
        kGradientPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 330, -1));

        jLabel40.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 51));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("requestors and respective authorities. The software is test");
        kGradientPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 330, -1));

        jLabel41.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 51));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("development project to improve the effectiveness of blood");
        kGradientPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 330, -1));

        jLabel42.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Kerala 695003");
        kGradientPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 200, -1));

        jLabel43.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 51));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("The project is the part of Kerala University");
        kGradientPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 330, -1));

        jLabel44.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 51));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Undergraduate (B.Sc. Computer Science - Semester IV)");
        kGradientPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 330, -1));

        jLabel45.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 51));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("program.");
        kGradientPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 330, -1));

        jLabel46.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("University Institute of Technology");
        kGradientPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 200, -1));

        jLabel47.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Pattom Kowdiar Rd,");
        kGradientPanel2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 200, -1));

        jLabel48.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Kuravankonam,");
        kGradientPanel2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 200, -1));

        jLabel49.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Thiruvananthapuram,");
        kGradientPanel2.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 200, -1));

        jLabel30.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("TellMe Tr.");
        kGradientPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 160, -1));

        jLabel50.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel50.setText("(Head Of Department)");
        kGradientPanel2.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 180, -1));

        jDialog1.getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 700, 370));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Punarjani Welcomes You ");
        setMaximumSize(new java.awt.Dimension(480, 600));
        setMinimumSize(new java.awt.Dimension(480, 600));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel3.setkBorderRadius(25);
        kGradientPanel3.setkEndColor(new java.awt.Color(102, 102, 102));
        kGradientPanel3.setkFillBackground(false);
        kGradientPanel3.setkStartColor(new java.awt.Color(102, 102, 102));
        kGradientPanel3.setOpaque(false);
        getContentPane().add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 600));

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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 40, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_close_window.png"))); // NOI18N
        jLabel2.setToolTipText("Close");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 30, 30));

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

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/150px_heart_with_pulse.png"))); // NOI18N
        kGradientPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 480, 130));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("\"Live life after death - pledge to donate your body.”");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kGradientPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 480, 30));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("~ Amit Abraham ~");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kGradientPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 480, 30));

        kButton1.setBorder(null);
        kButton1.setText("Sign In");
        kButton1.setToolTipText("Press here if you are already a member");
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
        kGradientPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 380, -1));

        kButton2.setBorder(null);
        kButton2.setText("Sign Up");
        kButton2.setToolTipText("Press here for joining us");
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
        kGradientPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 380, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("© 2020 DCompany");
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 320, -1));

        jLabel7.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ANDROID");
        jLabel7.setToolTipText("Coming Soon On Android");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 64, -1));

        jLabel8.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Website");
        jLabel8.setToolTipText("Coming Soon In WebPages");
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 64, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/64px_android_os.png"))); // NOI18N
        jLabel5.setToolTipText("Coming Soon On Android");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 60, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/64px_website.png"))); // NOI18N
        jLabel6.setToolTipText("Coming Soon In WebPages");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));

        jLabel13.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("More");
        kGradientPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 340, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/64px_share.png"))); // NOI18N
        jLabel9.setToolTipText("Link will be copied to your clipboard");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        kGradientPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, -1, -1));

        jLabel11.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Share");
        jLabel11.setToolTipText("Sharing Links Soon");
        kGradientPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 64, -1));

        jLabel12.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("About");
        jLabel12.setToolTipText("About the application");
        kGradientPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 64, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/64px_about.png"))); // NOI18N
        jLabel10.setToolTipText("About the application");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 60, -1));

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_caution.png"))); // NOI18N
        jLabel51.setToolTipText("Internal error");
        kGradientPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 30, 20));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 480, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Global variable declaration
    int mousepX,mousepY,mX,mY,m,n;
    ErrorReason ER= new ErrorReason();
    
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

    //Code for making JFrame minimized in taskbar
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

    //Code for close applaction
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        int CO= JOptionPane.showConfirmDialog(this, "Are you sure to close the application?", "Close Application", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(CO==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    //Code for showing about
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        jDialog1.pack();
        jDialog1.setLocationRelativeTo(null);
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    //Code for close about
    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jLabel19MouseClicked

    //Code for dragging the jDialog frame all across screen
    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        int cX= evt.getXOnScreen();
        int cY= evt.getYOnScreen();
        jDialog1.setLocation(cX-mX, cY-mY);
    }//GEN-LAST:event_jPanel4MouseDragged

    //Code for getting jDialog mouse pressed location
    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        mX= evt.getX();
        mY= evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

    //Code for passing control to signin page
    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        new A02_SignIn_Page().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kButton1ActionPerformed

    //Code for getting share link of desktop application
    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        String S= null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String db_url="jdbc:mysql://localhost:3306/project";
            String pwd="root";
            String user="root";
            Connection conn=(Connection)DriverManager.getConnection(db_url,user,pwd);
            Statement stmt=conn.createStatement();
            String SQL="SELECT * FROM links";
            ResultSet RS= stmt.executeQuery(SQL);
            while(RS.next()){
                S=RS.getString("Desktop");
            }
            StringSelection SS= new StringSelection(S);
            Clipboard C= Toolkit.getDefaultToolkit().getSystemClipboard();
            C.setContents(SS,null);
            jLabel51.setVisible(true);
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e){
            ER.copyReason(e.toString());
            jLabel51.setVisible(true);
        }
    }//GEN-LAST:event_jLabel9MousePressed

    //Code for passing control to signup page
    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        new A03_SignUp_Page().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kButton2ActionPerformed

    //Code for setting icon image in taskbar
    private void setIcon() {
        setShape(new RoundRectangle2D.Double(0,0,480,600,25,25));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/32px_heart_with_pulse.png")));
    }
    
    //Code for clearing old datas from database greater than 30 days
    private void delDate(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            Statement stmt= con.createStatement();
            SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Calendar Cal = Calendar.getInstance();
            Cal.add(Calendar.DATE, -30);
            String Date= DateFormat.format(Cal.getTime());
            String SQL1= "DELETE FROM request where Date < '"+Date+"'";
            String SQL2= "DELETE FROM notify where Date < '"+Date+"'";
            String SQL3= "DELETE FROM feeds where Date < '"+Date+"'";
            int S1= stmt.executeUpdate(SQL1);
            int S2= stmt.executeUpdate(SQL2);
            int S3= stmt.executeUpdate(SQL3);
            jLabel51.setVisible(false);
        }
        catch (ClassNotFoundException | SQLException e) {
            ER.copyReason(e.toString());
            jLabel51.setVisible(true);
        }
    }
    
    //Code for setting custom graphics work and program opening
    public static void main(String args[]) {
        UIManager.put("OptionPane.messageFont", new Font("Segoe UI Semilight", Font.BOLD, 14));
        UIManager.put("OptionPane.buttonFont", new Font("Constantia", Font.PLAIN, 14));
        try{
            Properties p = new Properties();
            p.put("windowDecoration", "off");
            AeroLookAndFeel.setCurrentTheme(p);
            UIManager.setLookAndFeel(new AeroLookAndFeel());            
        } 
        catch(UnsupportedLookAndFeelException ex){} 
        //Creates and display the form
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                setDefaultLookAndFeelDecorated(false);
                new A01_Welcome_Page().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    // End of variables declaration//GEN-END:variables
}
