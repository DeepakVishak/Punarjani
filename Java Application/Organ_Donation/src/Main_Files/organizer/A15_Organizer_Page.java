//Main package
package Main_Files.organizer;

//Imported class files
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import java.sql.Connection;
import Class_Files.GetImage;
import java.sql.SQLException;
import java.sql.DriverManager;
import Class_Files.ErrorReason;
import Main_Files.A04_Feedback;
import javax.swing.JOptionPane;
import Main_Files.A02_SignIn_Page;
import java.awt.geom.RoundRectangle2D;

//Function class
public class A15_Organizer_Page extends javax.swing.JFrame {
    public A15_Organizer_Page(String email){
        initComponents();
        setIcon();
        getImage(email);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 550));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkBorderRadius(25);
        kGradientPanel2.setkEndColor(new java.awt.Color(102, 102, 102));
        kGradientPanel2.setkFillBackground(false);
        kGradientPanel2.setkStartColor(new java.awt.Color(102, 102, 102));
        kGradientPanel2.setOpaque(false);
        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 550));

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

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_minimize_window.png"))); // NOI18N
        jLabel1.setToolTipText("Minimize");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 20, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_close_window.png"))); // NOI18N
        jLabel2.setToolTipText("Close");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 30, 30));

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
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 30));

        kGradientPanel1.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 81, 47));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/160px_cover_organizer.png"))); // NOI18N
        kGradientPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 160));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/160px_organizer_cover.png"))); // NOI18N
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, 160));

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel6.setText("DCompany");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 610, 40));

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 0, 16)); // NOI18N
        jLabel7.setText("6162939");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 490, 20));

        jLabel33.setFont(new java.awt.Font("Book Antiqua", 0, 16)); // NOI18N
        jLabel33.setText("dcompany.uit@gmail.com");
        kGradientPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 540, 20));

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_caution.png"))); // NOI18N
        kGradientPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 30, 20));

        jLabel34.setFont(new java.awt.Font("Book Antiqua", 0, 16)); // NOI18N
        jLabel34.setText("It's your 1st login.");
        kGradientPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 610, 20));

        jLabel35.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel35.setText("Email ID:");
        kGradientPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 80, 20));

        jLabel36.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel36.setText("Organization ID:");
        kGradientPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 130, 20));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 810, 190));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_organizer_update_gradient_01.png"))); // NOI18N
        jLabel8.setToolTipText("Update your profile");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 120));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_organizer_password.png"))); // NOI18N
        jLabel9.setToolTipText("Update your profile password");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 120, 120));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_new_volunteer.png"))); // NOI18N
        jLabel10.setToolTipText("Create new volunteer here");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 120, 120));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_volunteer_delete.png"))); // NOI18N
        jLabel11.setToolTipText("Delete volunteer profile");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 120, 120));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_organizer_delete_gradient_01.png"))); // NOI18N
        jLabel13.setToolTipText("Delete your profile");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
        });
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 120, 120));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_volunteer_list.png"))); // NOI18N
        jLabel15.setToolTipText("Generate volunteer list");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 120, 120));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_comments.png"))); // NOI18N
        jLabel16.setToolTipText("Give your feedback here");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel16MousePressed(evt);
            }
        });
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 120, 120));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_logout_rounded_up.png"))); // NOI18N
        jLabel17.setToolTipText("Logout from application");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel17MousePressed(evt);
            }
        });
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 120, 120));

        jLabel18.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Update Profile");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, -1));

        jLabel19.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Change Password");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 120, -1));

        jLabel20.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("New Volunteer");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 120, -1));

        jLabel21.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Delete Volunteer");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 120, -1));

        jLabel23.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Delete Profile");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 120, -1));

        jLabel25.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Volunteer List");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 120, -1));

        jLabel26.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Feedback");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 120, -1));

        jLabel27.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Logout");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, 120, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_volunteer_update.png"))); // NOI18N
        jLabel22.setToolTipText("Update volunteer profile here");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel22MousePressed(evt);
            }
        });
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 120, 120));

        jLabel12.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Update Volunteer");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 120, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 10, 290));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 10, 290));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_members_request.png"))); // NOI18N
        jLabel14.setToolTipText("Request from your location");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
        });
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 120, 120));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_members_list.png"))); // NOI18N
        jLabel28.setToolTipText("List out members");
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel28MousePressed(evt);
            }
        });
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 120, 120));

        jLabel29.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Service Requests");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 120, -1));

        jLabel30.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("List Members");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 120, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_members_verfication.png"))); // NOI18N
        jLabel24.setToolTipText("Verify member details");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel24MousePressed(evt);
            }
        });
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 120, 120));

        jLabel31.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Member Verfication");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 120, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 810, 330));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Global variable declaration
    int mousepX, mousepY, ID, log;;
    String Email, FN, LN, Des;
    Statement stmt = null;
    ResultSet rs = null;
    String sql = null;
    ErrorReason ER= new ErrorReason();
    GetImage Image= new GetImage();
    
    //Code for minimizing the frame in taskbar
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        setState(JFrame.ICONIFIED);       
    }//GEN-LAST:event_jLabel1MouseClicked

    //Code for closing applaction
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        int CO= JOptionPane.showConfirmDialog(this, "Are you sure to close the application?", "Close Application", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(CO==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    //Code for logout
    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        int OP= JOptionPane.showConfirmDialog(this, "Are you sure that you want to logout from your profile?\nIf Yes please choose Yes  ", "Are you sure to logout", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(OP==JOptionPane.YES_OPTION){
            new A02_SignIn_Page().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel3MousePressed

    //Code for dragging the JFrame all across screen
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

    //Code for transfer control to new voluteer creation page
    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        new A18_New_Volunteer(Email).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel10MousePressed

    //Code for transfering the control to volunteer profile update
    private void jLabel22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MousePressed
        new A19_Update_Volunteer(Email).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel22MousePressed

    //Code for transfering the control to feedbacks page
    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MousePressed
        new A04_Feedback("Organizer",Email).setVisible(true);
        this.setVisible(false);       
    }//GEN-LAST:event_jLabel16MousePressed

    //Code for logout from Organization page
    private void jLabel17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MousePressed
        int OP= JOptionPane.showConfirmDialog(this, "Are you sure that you want to logout from your profile?\nIf Yes please choose Yes  ", "Are you sure to logout", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(OP==JOptionPane.YES_OPTION){
            new A02_SignIn_Page().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel17MousePressed

    //Code for transfering the control to update organizer profile
    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        new A16_Organizer_Update(Email).setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_jLabel8MousePressed

    //Code for transfering control to change organizer password
    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        new A17_Organizer_Password(Email).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel9MousePressed

    //Code for transfering control to delete volunteer profile
    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        new A21_Delete_Volunteer(Email).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel11MousePressed

    //Code for deleting organization membership
    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed
        String NewID = JOptionPane.showInputDialog(this, "Please enter a existing Organizer Email ID", "Enter Organizer Email ID", JOptionPane.INFORMATION_MESSAGE);
        if(!(NewID.equalsIgnoreCase(""))){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = (Connection)
                DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
                stmt = con.createStatement();
                rs= stmt.executeQuery("SELECT * FROM organization WHERE Email='"+NewID+"'");
                if(rs.next()){
                    int NID= rs.getInt("OrgID");
                    int OP= JOptionPane.showConfirmDialog(this, "Are you sure that you want to delete your profile?\nYou cant retrive your profile after deletion.\nName: "+FN+" "+LN+"\nEmail ID: "+Email+"\nOrganizer ID: "+ID+"", "Profile Deletion", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
                    if(OP==JOptionPane.YES_OPTION){
                        int r1= stmt.executeUpdate("UPDATE volunteer SET OrgRef="+NID+""
                                + "WHERE OrgRef="+ID);
                        if(r1==1){
                            int r2= stmt.executeUpdate("DELETE FROM organization WHERE Email='"+Email+"'");
                            if(r2==1){
                                JOptionPane.showMessageDialog(this, "Your profile has been successfully deleted.\nThanks for being part of Punarjani.\nWishing you luck from our team.", "Deletion Success", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_ok.png")));
                                new A02_SignIn_Page().setVisible(true);
                                this.setVisible(false);
                            }
                        }
                    }
                }
                else
                    JOptionPane.showMessageDialog(this, "Sorry the entered Email ID is not found in our servers.\nPlease try again later.", "Error Occured", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
            }
            catch(ClassNotFoundException | SQLException e){
                    ER.copyReason(e.toString());
                    JOptionPane.showMessageDialog(this, "An error occured while entering data into servers.\nError have been copied into your clipboard.\nPlease feedback it and try again later.", "Error Occured", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
            }
        }
        else
            JOptionPane.showMessageDialog(this, "Please enter a valid Email ID", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
    }//GEN-LAST:event_jLabel13MousePressed

    //Code for transfer control to Volunteer list
    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
        new A20_Volunteer_List(Email).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel15MousePressed

    //Code for transfer control to members request
    private void jLabel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MousePressed
        new A22_Service_Request(Email).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel14MousePressed

    //Code for transfer control to list Members
    private void jLabel28MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MousePressed
        new A23_Members_list(Email).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel28MousePressed

    //Code for transfer control to Members Verification
    private void jLabel24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MousePressed
        new A24_Member_Verification(Email).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel24MousePressed
    
    //Code for setting icon image in Taskbar
    private void setIcon() {
        setShape(new RoundRectangle2D.Double(0,0,810,550,25,25));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/32px_heart_with_pulse.png")));
    }
    
    //Code for setting profile image, Name, Email ID in JFrame
    private void getImage(String email) {
        Email= email;
        String ex;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM organization WHERE Email='"+Email+"'");
            if(rs.next()) {
                FN= rs.getString("FName");
                LN= rs.getString("LName");
                ID= rs.getInt("OrgID");
                log= rs.getInt("Login");
                jLabel5.setIcon(Image.getImage("org", ID, 140, 160));
                jLabel6.setText(FN.concat(" "+LN));
                jLabel33.setText(Email);
                jLabel7.setText(Integer.toString(ID));
                switch(log){
                    case 1: ex="st";
                        break;
                    case 2: ex="nd";
                        break;
                    case 3: ex="rd";
                        break;
                    default: ex="th";
                }
                jLabel34.setText("It's your "+Integer.toString(log).concat(ex)+" login.");
                jLabel4.setText("Organizer: "+FN+" "+LN);
                this.setTitle("Organizer: "+FN+" "+LN);
            }
            jLabel51.setVisible(false);
        }
        catch(ClassNotFoundException | SQLException e){
            ER.copyReason(e.toString());
            jLabel6.setText("Organization");
            jLabel33.setText("");
            jLabel7.setText("");
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}