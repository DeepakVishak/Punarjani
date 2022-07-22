//Main Package
package Main_Files;

//Imported class files
import java.util.Arrays;
import java.awt.Toolkit;
import javax.swing.JFrame;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import Class_Files.ErrorReason;
import javax.swing.JOptionPane;
import java.awt.HeadlessException;
import Main_Files.member.A25_Member_Page;
import Main_Files.organizer.A15_Organizer_Page;
import Main_Files.volunteer.A32_Volunteer_Page;
import java.awt.geom.RoundRectangle2D;

//Function class
public class A04_Feedback extends javax.swing.JFrame {
    public A04_Feedback(String Page) {
        initComponents();
        BPage= Page;
        Email= "Unknown Member";
        getID();
        CStar1.setVisible(false);
        CStar2.setVisible(false);
        CStar3.setVisible(false);
        CStar4.setVisible(false);
        CStar5.setVisible(false);
        jTextField2.setText(Email);
        jLabel51.setVisible(false);
        setIcon();
    }
    public A04_Feedback(String level, String Email) {
        initComponents();
        BPage= level;
        this.Email= Email;
        getID();
        CStar1.setVisible(false);
        CStar2.setVisible(false);
        CStar3.setVisible(false);
        CStar4.setVisible(false);
        CStar5.setVisible(false);
        jTextField2.setText(Email);
        jLabel51.setVisible(false);
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        kButton1 = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CStar1 = new javax.swing.JLabel();
        CStar2 = new javax.swing.JLabel();
        CStar3 = new javax.swing.JLabel();
        CStar4 = new javax.swing.JLabel();
        CStar5 = new javax.swing.JLabel();
        SStar1 = new javax.swing.JLabel();
        SStar2 = new javax.swing.JLabel();
        SStar3 = new javax.swing.JLabel();
        SStar4 = new javax.swing.JLabel();
        SStar5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel51 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ORG LIST");
        setMaximumSize(new java.awt.Dimension(570, 520));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkBorderRadius(25);
        kGradientPanel1.setkEndColor(new java.awt.Color(102, 102, 102));
        kGradientPanel1.setkFillBackground(false);
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 102, 102));
        kGradientPanel1.setOpaque(false);
        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 520));

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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 20, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_close_window.png"))); // NOI18N
        jLabel2.setToolTipText("Close");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 30, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_prev.png"))); // NOI18N
        jLabel3.setToolTipText("Go Back");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Feedback Page");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 30));

        kGradientPanel2.setkBorderRadius(0);
        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkGradientFocus(0);
        kGradientPanel2.setkStartColor(new java.awt.Color(2, 161, 203));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel5.setText("Your Feedback ID");
        kGradientPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 100, 30));

        jLabel8.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel8.setText("Email ID");
        kGradientPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, 30));

        jLabel9.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel9.setText("Title");
        kGradientPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 100, 30));

        jLabel10.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel10.setText("Content");
        kGradientPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 100, 30));

        jLabel11.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel11.setText("Rating");
        kGradientPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 100, 30));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField1.setToolTipText("Please press this field before submiting your feedback");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField1MousePressed(evt);
            }
        });
        kGradientPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 410, 30));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField2.setToolTipText("");
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 410, 30));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField3.setToolTipText("Enter the title or reason for feedback");
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        kGradientPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 410, 30));

        kButton1.setBorder(null);
        kButton1.setText("Provide Feedback");
        kButton1.setToolTipText("Ready to submit your feedback");
        kButton1.setFont(new java.awt.Font("Cambria Math", 1, 26)); // NOI18N
        kButton1.setkEndColor(new java.awt.Color(255, 0, 255));
        kButton1.setkHoverEndColor(new java.awt.Color(2, 161, 203));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkStartColor(new java.awt.Color(2, 161, 203));
        kButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton1MouseClicked(evt);
            }
        });
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 290, -1));

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
        kGradientPanel2.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 210, -1));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Your Feedbacks and Ratings are valuable to us to improve software quality");
        kGradientPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 550, -1));

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Feedback Page");
        kGradientPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 550, 40));

        CStar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/50px_star.png"))); // NOI18N
        CStar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CStar1MousePressed(evt);
            }
        });
        kGradientPanel2.add(CStar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 50, 60));

        CStar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/50px_star.png"))); // NOI18N
        CStar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CStar2MousePressed(evt);
            }
        });
        kGradientPanel2.add(CStar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 50, 60));

        CStar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/50px_star.png"))); // NOI18N
        CStar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CStar3MousePressed(evt);
            }
        });
        kGradientPanel2.add(CStar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 50, 60));

        CStar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/50px_star.png"))); // NOI18N
        CStar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CStar4MousePressed(evt);
            }
        });
        kGradientPanel2.add(CStar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 50, 60));

        CStar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/50px_star.png"))); // NOI18N
        CStar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CStar5MousePressed(evt);
            }
        });
        kGradientPanel2.add(CStar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 50, 60));

        SStar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/50px_grey_star.png"))); // NOI18N
        SStar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SStar1MousePressed(evt);
            }
        });
        kGradientPanel2.add(SStar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 50, 60));

        SStar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/50px_grey_star.png"))); // NOI18N
        SStar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SStar2MousePressed(evt);
            }
        });
        kGradientPanel2.add(SStar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 50, 60));

        SStar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/50px_grey_star.png"))); // NOI18N
        SStar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SStar3MousePressed(evt);
            }
        });
        kGradientPanel2.add(SStar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 50, 60));

        SStar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/50px_grey_star.png"))); // NOI18N
        SStar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SStar4MousePressed(evt);
            }
        });
        kGradientPanel2.add(SStar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 50, 60));

        SStar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/50px_grey_star.png"))); // NOI18N
        SStar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SStar5MousePressed(evt);
            }
        });
        kGradientPanel2.add(SStar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 50, 60));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setToolTipText("Enter your feedback content here");
        jTextArea1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jScrollPane1.setViewportView(jTextArea1);

        kGradientPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 410, 130));

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_caution.png"))); // NOI18N
        jLabel51.setToolTipText("Internal error");
        kGradientPanel2.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 30, 20));

        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 570, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Global variables declared
    ResultSet rs= null;
    Connection con= null;
    Statement stmt= null;
    int mousepX,mousepY, Rate=0;
    ErrorReason ER= new ErrorReason();
    String BPage= null, Email= null, SQL= null;
    
    //Code for minimizing JFrame in taskbar
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

    //Code for closing the application
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        int CO= JOptionPane.showConfirmDialog(this, "Are you sure to close the application.\nUnsaved process will be lost.", "Missing Information", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(CO==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    //Code for going back to respective pages
    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        int E;
        if(null != BPage)switch (BPage) {
            case "SignIn":
                E= JOptionPane.showConfirmDialog(this, "Are you sure to go back to Sign In Page.\nYour unsaved process will be lost.", "Are you sure to go back", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
                if(E==JOptionPane.YES_OPTION){
                    new A02_SignIn_Page().setVisible(true);
                    this.setVisible(false);
                }   break;
            case "SignUp":
                E= JOptionPane.showConfirmDialog(this, "Are you sure to go back to Sign Up Page.\nYour unsaved process will be lost.", "Are you sure to go back", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
                if(E==JOptionPane.YES_OPTION){
                    new A03_SignUp_Page().setVisible(true);
                    this.setVisible(false);
                }   break;
            case "Member":
                E= JOptionPane.showConfirmDialog(this, "Are you sure to go back to Member's Page.\nYour unsaved process will be lost.", "Are you sure to go back", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
                if(E==JOptionPane.YES_OPTION){
                    new A25_Member_Page(Email).setVisible(true);
                    this.setVisible(false);
                }   break;
            case "Organizer":
                E= JOptionPane.showConfirmDialog(this, "Are you sure to go back to Organizer's In Page.\nYour unsaved process will be lost.", "Are you sure to go back", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
                if(E==JOptionPane.YES_OPTION){
                    new A15_Organizer_Page(Email).setVisible(true);
                    this.setVisible(false);
                }   break;
            case "Volunteer":
                E= JOptionPane.showConfirmDialog(this, "Are you sure to go back to Volunteer's Page.\nYour unsaved process will be lost.", "Are you sure to go back", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
                if(E==JOptionPane.YES_OPTION){
                    new A32_Volunteer_Page(Email).setVisible(true);
                    this.setVisible(false);
                }   break;
            default:
                break;
        }
    }//GEN-LAST:event_jLabel3MousePressed

    //Code for dragging the JFrame across screen
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int coordX= evt.getXOnScreen();
        int coordY= evt.getYOnScreen();
        this.setLocation(coordX-mousepX, coordY-mousepY);
    }//GEN-LAST:event_jPanel1MouseDragged

    //Code for getting mouse pressed position
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        mousepX= evt.getX();
        mousepY= evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    //Code for Grey Star 01
    private void SStar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SStar1MousePressed
        Rate=1;
        CStar1.setVisible(true);
        SStar2.setVisible(true);
        SStar3.setVisible(true);
        SStar4.setVisible(true);
        SStar5.setVisible(true);
        SStar1.setVisible(false);
        CStar2.setVisible(false);
        CStar3.setVisible(false);
        CStar4.setVisible(false);
        CStar5.setVisible(false);
    }//GEN-LAST:event_SStar1MousePressed

    //Code for Colour Star 01
    private void CStar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CStar1MousePressed
        Rate=0;
        SStar1.setVisible(true);
        SStar2.setVisible(true);
        SStar3.setVisible(true);
        SStar4.setVisible(true);
        SStar5.setVisible(true);
        CStar1.setVisible(false);
        CStar2.setVisible(false);
        CStar3.setVisible(false);
        CStar4.setVisible(false);
        CStar5.setVisible(false);
    }//GEN-LAST:event_CStar1MousePressed

    //Code for Grey Star 02
    private void SStar2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SStar2MousePressed
        Rate=2;
        CStar1.setVisible(true);
        CStar2.setVisible(true);
        SStar3.setVisible(true);
        SStar4.setVisible(true);
        SStar5.setVisible(true);
        SStar1.setVisible(false);
        SStar2.setVisible(false);
        CStar3.setVisible(false);
        CStar4.setVisible(false);
        CStar5.setVisible(false);
    }//GEN-LAST:event_SStar2MousePressed

    //Code for Colour Star 02
    private void CStar2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CStar2MousePressed
        Rate=2;
        CStar1.setVisible(true);
        CStar2.setVisible(true);
        SStar3.setVisible(true);
        SStar4.setVisible(true);
        SStar5.setVisible(true);
        SStar1.setVisible(false);
        SStar2.setVisible(false);
        CStar3.setVisible(false);
        CStar4.setVisible(false);
        CStar5.setVisible(false);
    }//GEN-LAST:event_CStar2MousePressed

    //Code for Grey Star 03
    private void SStar3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SStar3MousePressed
        Rate=3;
        CStar1.setVisible(true);
        CStar2.setVisible(true);
        CStar3.setVisible(true);
        SStar4.setVisible(true);
        SStar5.setVisible(true);
        SStar1.setVisible(false);
        SStar2.setVisible(false);
        SStar3.setVisible(false);
        CStar4.setVisible(false);
        CStar5.setVisible(false);
    }//GEN-LAST:event_SStar3MousePressed

    //Code for Colour Star 03
    private void CStar3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CStar3MousePressed
        Rate=3;
        CStar1.setVisible(true);
        CStar2.setVisible(true);
        CStar3.setVisible(true);
        SStar4.setVisible(true);
        SStar5.setVisible(true);
        SStar1.setVisible(false);
        SStar2.setVisible(false);
        SStar3.setVisible(false);
        CStar4.setVisible(false);
        CStar5.setVisible(false);
    }//GEN-LAST:event_CStar3MousePressed

    //Code for Grey Star 04
    private void SStar4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SStar4MousePressed
        Rate=4;
        CStar1.setVisible(true);
        CStar2.setVisible(true);
        CStar3.setVisible(true);
        CStar4.setVisible(true);
        SStar5.setVisible(true);
        SStar1.setVisible(false);
        SStar2.setVisible(false);
        SStar3.setVisible(false);
        SStar4.setVisible(false);
        CStar5.setVisible(false);
    }//GEN-LAST:event_SStar4MousePressed

    //Code for Colour Star 04
    private void CStar4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CStar4MousePressed
        Rate=4;
        CStar1.setVisible(true);
        CStar2.setVisible(true);
        CStar3.setVisible(true);
        CStar4.setVisible(true);
        SStar5.setVisible(true);
        SStar1.setVisible(false);
        SStar2.setVisible(false);
        SStar3.setVisible(false);
        SStar4.setVisible(false);
        CStar5.setVisible(false);
    }//GEN-LAST:event_CStar4MousePressed

    //Code for Grey Star 05
    private void SStar5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SStar5MousePressed
        Rate=5;
        CStar1.setVisible(true);
        CStar2.setVisible(true);
        CStar3.setVisible(true);
        CStar4.setVisible(true);
        CStar5.setVisible(true);
        SStar1.setVisible(false);
        SStar2.setVisible(false);
        SStar3.setVisible(false);
        SStar4.setVisible(false);
        SStar5.setVisible(false);
    }//GEN-LAST:event_SStar5MousePressed

    //Code for Colour Star 05
    private void CStar5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CStar5MousePressed
        Rate=5;
        CStar1.setVisible(true);
        CStar2.setVisible(true);
        CStar3.setVisible(true);
        CStar4.setVisible(true);
        CStar5.setVisible(true);
        SStar1.setVisible(false);
        SStar2.setVisible(false);
        SStar3.setVisible(false);
        SStar4.setVisible(false);
        SStar5.setVisible(false);
    }//GEN-LAST:event_CStar5MousePressed

    //Code for reseting
    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        getID();
        Rate=0;
        jTextField3.setText("");
        jTextArea1.setText("");
        CStar1.setVisible(false);
        CStar2.setVisible(false);
        CStar3.setVisible(false);
        CStar4.setVisible(false);
        CStar5.setVisible(false);
        SStar1.setVisible(true);
        SStar2.setVisible(true);
        SStar3.setVisible(true);
        SStar4.setVisible(true);
        SStar5.setVisible(true);
    }//GEN-LAST:event_kButton2ActionPerformed

    //Code for providing feedback
    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        String FID= jTextField1.getText();
        String EID= jTextField2.getText();
        String Title= jTextField3.getText();
        String Content= jTextArea1.getText();
        if(!(EID.equalsIgnoreCase(""))){
            if(!(Title.equalsIgnoreCase(""))){
                if(!(Content.equalsIgnoreCase(""))){
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
                        stmt= con.createStatement();
                        SQL= "INSERT INTO feeds VALUES("+FID+",'"+EID+"','"+Title+"','"+Content+"',"+Rate+",curdate())";
                        int ru= stmt.executeUpdate(SQL);
                        if(ru==1){
                            JOptionPane.showMessageDialog(this, "Your feedback have been successfully placed.\nYour Feedback ID: "+FID+"", "Feedback placed", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_note.png")));
                        }
                    }
                    catch(HeadlessException | ClassNotFoundException | SQLException e){
                        JOptionPane.showMessageDialog(this, "An error occured while entering feeds into servers.\nError have been copied into your clipboard.\nPlease feedback it and try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                        ER.copyReason(e.toString());
                    }
                }
                else
                    JOptionPane.showMessageDialog(this, "Please enter your feeback, tips or error in the text area.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
            }
            else
                JOptionPane.showMessageDialog(this, "Please enter a suitable title.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
        else
            JOptionPane.showMessageDialog(this, "Please enter your Email ID.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
    }//GEN-LAST:event_kButton1ActionPerformed

    //Code for getting new FeedID
    private void jTextField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MousePressed
        getID();
    }//GEN-LAST:event_jTextField1MousePressed
     
    //Code for getting new Feedback ID
    private void getID() {
        int i= 0, count= 0,NID = 0, max=0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt=con.createStatement();
            String sql1= "SELECT COUNT(FeedID) FROM feeds";
            String sql2= "SELECT * FROM feeds";
            String sql3= "SELECT MAX(FeedID) FROM feeds";
            ResultSet R1= stmt.executeQuery(sql1);
            while(R1.next()){
                count= R1.getInt("COUNT(FeedID)");
            }
            int[] ids= new int[count];
            ResultSet R2= stmt.executeQuery(sql2);
            while(R2.next()){
                ids[i]= R2.getInt("FeedID");
                i++;
            }
            if(!(ids.length==0)){
                ResultSet R3= stmt.executeQuery(sql3);
                if(R3.next())
                    max= R3.getInt("MAX(FeedID)");
                Arrays.parallelSort(ids);
                int numberArrayIndex=0;
                for(i=0;i<ids[ids.length-1];i++) {
                    if(i==ids[numberArrayIndex]) {
                        numberArrayIndex++;
                    }
                    else{
                        if(i>1000000000)
                            NID=i;
                    }
                }
                if(NID==0){
                    NID= ++max;
                    jTextField1.setText(Integer.toString(NID));
                }
                else
                    jTextField1.setText(Integer.toString(NID));
            }
            else
                jTextField1.setText("1000000000");
        }
        catch(ClassNotFoundException | SQLException e){
            ER.copyReason(e.toString());
            jLabel51.setVisible(true);
        }
    }
    //Code for setting icon image in taskbar
    private void setIcon() {
        setShape(new RoundRectangle2D.Double(0,0,570,520,25,25));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/32px_heart_with_pulse.png")));
    }
    
    //Un-used action events
    private void kButton1MouseClicked(java.awt.event.MouseEvent evt) {}
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CStar1;
    private javax.swing.JLabel CStar2;
    private javax.swing.JLabel CStar3;
    private javax.swing.JLabel CStar4;
    private javax.swing.JLabel CStar5;
    private javax.swing.JLabel SStar1;
    private javax.swing.JLabel SStar2;
    private javax.swing.JLabel SStar3;
    private javax.swing.JLabel SStar4;
    private javax.swing.JLabel SStar5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
