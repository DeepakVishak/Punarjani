//Main package
package Main_Files.member;

//Imported class files
import Class_Files.ErrorReason;
import Class_Files.GetImage;
import Main_Files.A04_Feedback;
import Class_Files.MemberNotificationCount;
import Main_Files.A02_SignIn_Page;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//Function class
public class A25_Member_Page extends javax.swing.JFrame {
    public A25_Member_Page(String email){
        initComponents();
        setIcon();
        getImage(email);
        Email= email; 
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
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();

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
        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 550));

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

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_minimize_window.png"))); // NOI18N
        jLabel1.setToolTipText("Minimize");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 20, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_close_window.png"))); // NOI18N
        jLabel2.setToolTipText("Close");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 30));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        kGradientPanel1.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 153, 0));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/160px_cover_member.png"))); // NOI18N
        kGradientPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 160));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/160px_member_cover.png"))); // NOI18N
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, 160));

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel6.setText("DCompany");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 610, 40));

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 0, 16)); // NOI18N
        jLabel7.setText("dcompany.uit@gmail.com");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 540, 20));

        jLabel14.setFont(new java.awt.Font("Book Antiqua", 0, 16)); // NOI18N
        jLabel14.setText("6162939");
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 520, 20));

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_caution.png"))); // NOI18N
        jLabel51.setToolTipText("Internal error");
        kGradientPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 20));

        jLabel20.setFont(new java.awt.Font("Book Antiqua", 0, 16)); // NOI18N
        jLabel20.setText("It's your 1st login.");
        kGradientPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 610, 20));

        jLabel34.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel34.setText("Email ID:");
        kGradientPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 70, 20));

        jLabel35.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel35.setText("Member ID:");
        kGradientPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 90, 20));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 190));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_members_update.png"))); // NOI18N
        jLabel8.setToolTipText("Update your profile");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 120));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_members_password.png"))); // NOI18N
        jLabel9.setToolTipText("Change your password");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 120, 120));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/30px_new.png"))); // NOI18N
        jLabel28.setToolTipText("New User. Fill out the form.");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 30, 30));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_members_organ.png"))); // NOI18N
        jLabel11.setToolTipText("Like to donate your organs");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 120, 120));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_members_delete.png"))); // NOI18N
        jLabel13.setToolTipText("Deleting your profile");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
        });
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 120, 120));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/30px_new.png"))); // NOI18N
        jLabel22.setToolTipText("New User. Fill out the form.");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 30, 30));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_members_blood.png"))); // NOI18N
        jLabel15.setToolTipText("Like to donate blood");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 120, 120));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_comments.png"))); // NOI18N
        jLabel16.setToolTipText("Provide feedback");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel16MousePressed(evt);
            }
        });
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 120, 120));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_logout_rounded_up.png"))); // NOI18N
        jLabel17.setToolTipText("Logout from your account");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel17MousePressed(evt);
            }
        });
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 110, 120));

        jLabel18.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Update Profile");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 120, -1));

        jLabel19.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Change Password");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 120, -1));

        jLabel21.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Donate Organs");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 120, -1));

        jLabel23.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Delete Profile");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 120, -1));

        jLabel25.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Donate Blood");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 120, -1));

        jLabel26.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Feedback");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 120, -1));

        jLabel27.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Logout");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 110, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 20, 310));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_members_blood_request.png"))); // NOI18N
        jLabel24.setToolTipText("Request for blood");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel24MousePressed(evt);
            }
        });
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 120, 120));

        jLabel31.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Request For Blood");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 120, -1));

        jLabel32.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Notifications");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 120, -1));

        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("985");
        jLabel10.setToolTipText("Notification count");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 30, 30));

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_members_notificaton.png"))); // NOI18N
        jLabel33.setToolTipText("Notifications for you");
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel33MousePressed(evt);
            }
        });
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 120, 120));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 800, 330));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Global variable declaration
    int mousepX, mousepY, ID;
    String Email, sql, FN, LN, Des;
    Statement stmt = null;
    ResultSet rs = null;
    GetImage Image= new GetImage();
    ErrorReason ER= new ErrorReason();
    MemberNotificationCount NC= new MemberNotificationCount();
    
    //Code for minimizing the frame
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        setState(JFrame.ICONIFIED);       
    }//GEN-LAST:event_jLabel1MouseClicked

    //Code for close applaction
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

    //Code for transfering the control to feedbacks page
    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MousePressed
        new A04_Feedback("Member",Email).setVisible(true);
        this.setVisible(false);       
    }//GEN-LAST:event_jLabel16MousePressed

    //Code for logout from Member page
    private void jLabel17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MousePressed
        int OP= JOptionPane.showConfirmDialog(this, "Are you sure that you want to logout from your profile?\nIf Yes please choose Yes  ", "Are you sure to logout", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(OP==JOptionPane.YES_OPTION){
            new A02_SignIn_Page().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel17MousePressed

    //Code for transfering the control to update member profile
    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        new A26_Update_Profile(Email).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel8MousePressed

    //Code for transfering control to change member password
    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        new A27_Member_Password(Email).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel9MousePressed

    //Code for transfering control to organ donation page
    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        new A29_Donate_Organ(Email).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel11MousePressed

    //Code for deleting member membership
    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed
        int DOP= JOptionPane.showConfirmDialog(this, "Are you sure to delete your profile?\nYour Designation: Member\nName: "+FN+" "+LN+"\nEmail ID: "+Email+"","Delete Profile",JOptionPane.YES_NO_OPTION,JOptionPane.DEFAULT_OPTION,new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_delete_bin.png")));
        if(DOP==JOptionPane.YES_OPTION){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = (Connection)
                DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
                stmt = con.createStatement();
                int r= stmt.executeUpdate("DELETE FROM member WHERE Email='"+Email+"'");
                if(r==1){
                    JOptionPane.showMessageDialog(this, "Your profile has been successfully deleted.\nThanks for using Punarjani.", "Deletion Success", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_ok.png")));
                    new A02_SignIn_Page().setVisible(true);
                    this.setVisible(false);
                }
            }
            catch(ClassNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(this, "An error occured while entering data into servers.\nError have been copied into your clipboard.\nPlease feedback it and try again later.", "Error Occured", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                ER.copyReason(e.toString());
            }
        }
    }//GEN-LAST:event_jLabel13MousePressed

    //Code for transfer control to blood donation page
    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
        new A28_Donate_Blood(Email).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel15MousePressed

    //Code for transfer control to Members Verification
    private void jLabel24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MousePressed
        new A31_Request_Blood(Email).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel24MousePressed

    //Code for transfer control to view notification
    private void jLabel33MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MousePressed
        new A30_Notification(Email).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel33MousePressed
    
    //Code for setting icon image in Taskbar
    private void setIcon() {
        setShape(new RoundRectangle2D.Double(0,0,800,550,25,25));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/32px_heart_with_pulse.png")));
    }
    
    //Code for setting profile image, Name, Email ID in JFrame
    private void getImage(String email) {
        int log=0;
        String ex, District;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM member WHERE Email='"+email+"'");
            if(rs.next()) {
                FN= rs.getString("FName");
                LN= rs.getString("LName");
                ID= rs.getInt("MemberID");
                log= rs.getInt("Login");
                District= rs.getString("District");
                ResultSet RS= stmt.executeQuery("SELECT * FROM blood WHERE MemberID="+ID);
                if(RS.next()){
                    int BVerify= RS.getInt("Verify");
                    switch(BVerify){
                        case 0: jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/30px_new.png")));
                                jLabel22.setToolTipText("New User. Fill out the form.");
                            break;
                        case 1: jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/30px_request.png")));
                                jLabel22.setToolTipText("Your request is being processed by our team.");
                            break;
                        case 2: jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/30px_cancel.png")));
                                jLabel22.setToolTipText("Please retry again. We found mismatches in your request.");
                            break;
                        case 3: jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/30px_approval.png")));
                                jLabel22.setToolTipText("Now you can donate blood.");
                        break;
                        default: 
                    }
                }
                ResultSet RS2= stmt.executeQuery("SELECT * FROM organs WHERE MemberID="+ID);
                if(RS2.next()){
                    int BVerify= RS2.getInt("Verify");
                    switch(BVerify){
                        case 0: jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/30px_new.png")));
                                jLabel28.setToolTipText("New User. Fill out the form.");
                            break;
                        case 1: jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/30px_request.png")));
                                jLabel28.setToolTipText("Your request is being processed by our team.");
                            break;
                        case 2: jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/30px_cancel.png")));
                                jLabel28.setToolTipText("Please retry again. We found mismatches in your request.");
                            break;
                        case 3: jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/30px_approval.png")));
                                jLabel28.setToolTipText("Now you can donate blood.");
                        break;
                        default: 
                    }
                }
                int Notify= NC.Notify(ID, District);
                jLabel10.setText(Integer.toString(Notify));
                jLabel10.setToolTipText("You have "+Integer.toString(Notify)+" notifications");
                jLabel5.setIcon(Image.getImage("member", ID, 140, 160));
                Email= email;
                jLabel6.setText(FN.concat(" "+LN));
                jLabel7.setText(Email);
                jLabel14.setText(Integer.toString(ID));
                switch(log){
                    case 1: ex="st";
                        break;
                    case 2: ex="nd";
                        break;
                    case 3: ex="rd";
                        break;
                    default: ex="th";
                }
                jLabel20.setText("It's your "+Integer.toString(log).concat(ex)+" login.");
                this.setTitle("Welcome: "+FN.concat(" "+LN));
                jLabel4.setText("Welcome: "+FN.concat(" "+LN));
                jLabel51.setVisible(false);
            }
        }
        catch(ClassNotFoundException | SQLException e){
            ER.copyReason(e.toString());
            jLabel6.setText("Member");
            jLabel7.setText("");
            this.setTitle("Member");
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
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
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
