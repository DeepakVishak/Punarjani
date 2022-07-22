//Main Package
package Main_Files.admin;

//Imported class files
import java.awt.Toolkit;
import Class_Files.Links;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import java.sql.Connection;
import Class_Files.GetImage;
import java.sql.SQLException;
import java.sql.DriverManager;
import Class_Files.ErrorReason;
import javax.swing.JOptionPane;
import Class_Files.DeleteImage;
import Main_Files.A02_SignIn_Page;
import java.awt.HeadlessException;
import java.awt.geom.RoundRectangle2D;

//Function class
public class A05_Admin_Page extends javax.swing.JFrame {
    public A05_Admin_Page(String email){
        initComponents();
        setIcon();
        CAInfo(email);
        EnableDisable(email);
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
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
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrator");
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

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
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
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 153, 153));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel6.setText("DCompany");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 610, 40));

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 0, 16)); // NOI18N
        jLabel7.setText("dcompany.uit@gmail.com");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 550, 20));

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_caution.png"))); // NOI18N
        jLabel51.setToolTipText("Internal error");
        kGradientPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 20));

        jLabel14.setFont(new java.awt.Font("Book Antiqua", 0, 16)); // NOI18N
        jLabel14.setText("6162939");
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 490, 20));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/160px_cover_admin.png"))); // NOI18N
        kGradientPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 160));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/160px_admin_cover.png"))); // NOI18N
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, 160));

        jLabel29.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel29.setText("Administrator Type:");
        kGradientPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 140, 20));

        jLabel31.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel31.setText("Email ID:");
        kGradientPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 70, 20));

        jLabel33.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel33.setText("Administrator ID:");
        kGradientPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 120, 20));

        jLabel34.setFont(new java.awt.Font("Book Antiqua", 0, 16)); // NOI18N
        jLabel34.setText("Developer");
        kGradientPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 340, 20));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_add_links.png"))); // NOI18N
        jLabel35.setToolTipText("Add application links");
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel35MousePressed(evt);
            }
        });
        kGradientPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 120, 20));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 190));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_new_admin.png"))); // NOI18N
        jLabel8.setToolTipText("Create new administrator");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 120));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setToolTipText("For updating your profile");
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 20, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_admin_update.png"))); // NOI18N
        jLabel9.setToolTipText("Update administrator profile");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 120, 120));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_admin_delete.png"))); // NOI18N
        jLabel10.setToolTipText("Delete administrator profile");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 120, 120));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_new_organizer_gradient.png"))); // NOI18N
        jLabel11.setToolTipText("Create new organization member");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 120, 120));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_organizer_delete_gradient.png"))); // NOI18N
        jLabel13.setToolTipText("Delete an organization member");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
        });
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 120, 120));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_organizer_list_gradient.png"))); // NOI18N
        jLabel15.setToolTipText("View organizaion members");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 120, 120));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_comments.png"))); // NOI18N
        jLabel16.setToolTipText("View Feedbacks");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel16MousePressed(evt);
            }
        });
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 120, 120));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_logout_rounded_up.png"))); // NOI18N
        jLabel17.setToolTipText("Logout from profile");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel17MousePressed(evt);
            }
        });
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 120, 120));

        jLabel18.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("New Administrator");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 120, -1));

        jLabel19.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Update Administrator");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 140, -1));

        jLabel20.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Delete Administrator");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 120, -1));

        jLabel21.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("New Organizer");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 120, -1));

        jLabel23.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Delete Organizer");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 120, -1));

        jLabel25.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Organization List");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 120, -1));

        jLabel26.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Feedbacks Page");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 120, -1));

        jLabel27.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Logout");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 120, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_new_organizer.png"))); // NOI18N
        jLabel28.setToolTipText("Feature not available for developers");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 120, 120));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_organizer_delete.png"))); // NOI18N
        jLabel30.setToolTipText("Feature not available for developers");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 120, 120));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_organizer_list.png"))); // NOI18N
        jLabel32.setToolTipText("Feature not available for developers");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 120, 120));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/120px_admin_password.png"))); // NOI18N
        jLabel22.setToolTipText("Change administrator password");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel22MousePressed(evt);
            }
        });
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 120, 120));

        jLabel12.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Change Password");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 120, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 800, 330));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Global variable declaration
    ResultSet rs = null;
    Statement stmt = null;
    int ID, mousepX, mousepY;
    String FN, LN, Des, Email, sql;
    GetImage Image= new GetImage();
    ErrorReason ER= new ErrorReason();
    DeleteImage DelImg= new DeleteImage(); 
    
    //Code for making JFrame minimized in taskbar
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        setState(JFrame.ICONIFIED);       
    }//GEN-LAST:event_jLabel1MouseClicked

    //Code for closeing the application
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        int CO= JOptionPane.showConfirmDialog(this, "Are you sure to close the application?", "Close Application", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(CO==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    //Code for logout from main page
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

    //Code for transfer control to delete page or to directly delete according to designation
    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        if("Developer".equals(Des)){
            new A09_Admin_Delete(Email).setVisible(true);
            this.setVisible(false);
        }
        else if("Board Member".equals(Des)){
            String NewID = JOptionPane.showInputDialog(this, "Please enter a existing Administrator Email ID", "Enter Administrator Email ID", JOptionPane.INFORMATION_MESSAGE);
            if(!(NewID.equalsIgnoreCase(""))){
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
                    stmt= con.createStatement();
                    rs= stmt.executeQuery("SELECT * FROM administrator WHERE Email='"+NewID+"'");
                    if(rs.next()){
                        int AID= rs.getInt("AdminID");
                        int DOP= JOptionPane.showConfirmDialog(this, "Are you sure to delete your profile?\nYour Designation: "+Des+"\nName: "+FN+" "+LN+"\nEmail ID: "+Email+"","Delete Profile",JOptionPane.YES_NO_OPTION,JOptionPane.DEFAULT_OPTION,new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_delete_bin.png")));
                        if(DOP==JOptionPane.YES_OPTION){
                            int r1= stmt.executeUpdate("UPDATE organization SET AdminRef="+AID+" WHERE AdminRef="+ID);
                            int r= stmt.executeUpdate("DELETE FROM administrator WHERE Email='"+Email+"'");
                            if(r==1){
                                JOptionPane.showMessageDialog(this, "Your profile has been successfully deleted.\nThanks for using Punarjani.", "Deletion Success", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_ok.png")));
                                DelImg.ImageDelete("admin",ID);
                                new A02_SignIn_Page().setVisible(true);
                                this.setVisible(false);
                            }
                        }
                    }
                    else
                        JOptionPane.showMessageDialog(this, "Sorry. The requested administrator Email ID not found on our servers.\nPlease try again.", "Data not found", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                }
                catch(HeadlessException | ClassNotFoundException | SQLException e){
                    JOptionPane.showMessageDialog(this, "An error occured while entering data into servers.\nError have been copied into your clipboard.\nPlease feedback it and try again later.", "Error Occured", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                    ER.copyReason(e.toString());
                }
            }
            else
                JOptionPane.showMessageDialog(this, "Please enter a valid administrator Email ID", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
    }//GEN-LAST:event_jLabel10MousePressed

    //Code for transfering the control to change password page
    private void jLabel22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MousePressed
        new A10_Admin_Password(Email).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel22MousePressed

    //Code for transfering the control to feedbacks page
    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MousePressed
        new A14_Feedbacks_Page(Email).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel16MousePressed

    //Code for logout from Administrator page
    private void jLabel17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MousePressed
        int OP= JOptionPane.showConfirmDialog(this, "Are you sure that you want to logout from your profile?\nIf Yes please choose Yes  ", "Are you sure to logout", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(OP==JOptionPane.YES_OPTION){
            new A02_SignIn_Page().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel17MousePressed

    //Code for transfering the control to new administrator page
    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        new A06_New_Admin(Email).setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_jLabel8MousePressed

    //Code for transfering control to update administrator
    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        if("Developer".equals(Des)){
            if(jCheckBox1.isSelected()){
                new A07_Admin_Update(Email).setVisible(true);
                this.setVisible(false);
            }
            else{
                new A08_Admin_Update_Developer(Email).setVisible(true);
                this.setVisible(false);
            }
        }
        else if("Board Member".equals(Des)){
            new A07_Admin_Update(Email).setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel9MousePressed

    //Code for transfering control to new organization member
    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        new A11_New_Organizer(Email).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel11MousePressed

    //Code for transfering control to delete organization member
    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed
        new A12_Delete_Organizer(Email).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel13MousePressed

    //Code for opening links page 
    private void jLabel35MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MousePressed
        new Links().setVisible(true);
    }//GEN-LAST:event_jLabel35MousePressed

    //Code for transfering control to organization member's list
    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
        new A13_Organisation_List(Email).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel15MousePressed
    
    //Code for setting icon image in Taskbar
    private void setIcon() {
        setShape(new RoundRectangle2D.Double(0,0,800,550,25,25));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/32px_heart_with_pulse.png")));
    }
    
    //Code for setting profile image, Name, Email ID in JFrame
    private void CAInfo(String email) {
        Email= email;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM administrator WHERE Email='"+Email+"'");
            if(rs.next()) {
                FN= rs.getString("FName");
                LN= rs.getString("LName");
                ID= rs.getInt("AdminID");
                jLabel6.setText(FN.concat(" "+LN));
                jLabel7.setText(Email);
                jLabel14.setText(Integer.toString(ID));
                jLabel51.setVisible(false);
                switch(ID){
                    case 1:
                    case 2:
                    case 3:
                    case 4: jLabel35.setVisible(true);
                            break;
                    default: jLabel35.setVisible(false);
                }
                jLabel5.setIcon(Image.getImage("admin", ID, 140, 160));
                jLabel4.setText("Administrator: "+FN+" "+LN);
                this.setTitle("Administrator: "+FN+" "+LN);
            }
            jLabel51.setVisible(false);
        }
        catch(ClassNotFoundException | SQLException e){
            jLabel6.setText("Administrator");
            jLabel7.setText("");
            jLabel14.setText("");
            ER.copyReason(e.toString());
            jLabel51.setVisible(true);
        }
    }
    
    //Code for disabling functions for developer administrator
    private void EnableDisable(String email) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM administrator WHERE Email='"+email+"'");
            if(rs.next()) {
                Des= rs.getString("Designation");
            }
            if("Developer".equals(Des)){
                jLabel11.setVisible(false);
                jLabel13.setVisible(false);
                jLabel15.setVisible(false);
                jLabel35.setVisible(true);
                jCheckBox1.setVisible(true);
            }
            else if("Board Member".equals(Des)){
                jLabel28.setVisible(false);
                jLabel30.setVisible(false);
                jLabel32.setVisible(false);
                jLabel35.setVisible(false);
                jCheckBox1.setVisible(false);
            }
            jLabel34.setText(Des);
            jLabel51.setVisible(false);
        }
        catch(ClassNotFoundException | SQLException e){
            ER.copyReason(e.toString());
            jLabel51.setVisible(true);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
