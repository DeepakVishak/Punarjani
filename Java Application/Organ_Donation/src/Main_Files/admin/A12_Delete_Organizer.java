//Main packages
package Main_Files.admin;

//Imported class files
import Class_Files.*;
import java.awt.Toolkit;
import javax.swing.JFrame;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.awt.HeadlessException;
import java.awt.geom.RoundRectangle2D;
import javax.swing.DefaultListModel;

//Function class
public class A12_Delete_Organizer extends javax.swing.JFrame {
    public A12_Delete_Organizer(String e){
        initComponents();
        setIcon();
        CAInfo(e);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        kButton1 = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delete Organization Profile");
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkBorderRadius(25);
        kGradientPanel2.setkEndColor(new java.awt.Color(102, 102, 102));
        kGradientPanel2.setkFillBackground(false);
        kGradientPanel2.setkStartColor(new java.awt.Color(102, 102, 102));
        kGradientPanel2.setkTransparentControls(false);
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

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_minimize_window.png"))); // NOI18N
        jLabel9.setToolTipText("Minimize");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 20, 30));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_close_window.png"))); // NOI18N
        jLabel10.setToolTipText("Close");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 30));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_prev.png"))); // NOI18N
        jLabel11.setToolTipText("Go Back");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText(getTitle());
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 153, 153));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("DCompany");
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 740, 40));

        jLabel15.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("dcompany.uit@gmail.com");
        kGradientPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 740, 20));

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_caution.png"))); // NOI18N
        jLabel51.setToolTipText("Internal error");
        kGradientPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 20));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 90));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel2.setText("Enter Organizer ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 220, 20));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField1.setToolTipText("Enter a valid Organization ID");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 230, 30));

        jLabel8.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel8.setText("Fetch Organizer ID");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 220, 20));

        jList1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jList1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jList1.setModel(new DefaultListModel());
        jList1.setToolTipText("Select one for deleting");
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 230, 300));

        jLabel3.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel3.setText("Adminstrator Refered");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 130, 30));

        jLabel4.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel4.setText("Organization ID");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 110, 30));

        jLabel5.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel5.setText("First Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 110, 30));

        jLabel6.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel6.setText("Last Name");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 110, 30));

        jLabel7.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel7.setText("Email ID");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 110, 30));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField2.setToolTipText("Administrator refered the organizer");
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 210, 30));

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField3.setToolTipText("Organization ID");
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 210, 30));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField4.setToolTipText("First Name of the organizer");
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 210, 30));

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField5.setToolTipText("Last Name of the organizer");
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 210, 30));

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField6.setToolTipText("Email ID of the organizer");
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 210, 30));

        kButton1.setBorder(null);
        kButton1.setText("Delete Profile");
        kButton1.setToolTipText("Click here to delete profile");
        kButton1.setFont(new java.awt.Font("Californian FB", 1, 26)); // NOI18N
        kButton1.setkEndColor(new java.awt.Color(255, 0, 255));
        kButton1.setkHoverEndColor(new java.awt.Color(2, 161, 203));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkSelectedColor(new java.awt.Color(255, 0, 0));
        kButton1.setkStartColor(new java.awt.Color(2, 161, 203));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 250, -1));

        kButton2.setBorder(null);
        kButton2.setText("Get Record");
        kButton2.setToolTipText("Click here for getting information of specific organizer");
        kButton2.setFont(new java.awt.Font("Californian FB", 1, 26)); // NOI18N
        kButton2.setkEndColor(new java.awt.Color(255, 0, 255));
        kButton2.setkHoverEndColor(new java.awt.Color(2, 161, 203));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkSelectedColor(new java.awt.Color(255, 0, 0));
        kButton2.setkStartColor(new java.awt.Color(2, 161, 203));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 240, -1));

        jLabel16.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel16.setText("Mobile Number");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 110, 30));

        jLabel17.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel17.setText("District");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 110, 30));

        jLabel18.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel18.setText("City");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 110, 30));

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField7.setToolTipText("Mobile number of the organizer");
        jTextField7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 380, 30));

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField8.setToolTipText("District of the organizer");
        jTextField8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 380, 30));

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField9.setToolTipText("City of the organizer");
        jTextField9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 380, 30));

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel1.setText("State");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 110, 30));

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField10.setToolTipText("State of the organizer");
        jTextField10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 380, 30));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/180px_new_organizer_cover.png"))); // NOI18N
        jLabel19.setToolTipText("Profile picture of organizer");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel19MousePressed(evt);
            }
        });
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 160, 180));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/180px_new_organizer.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel20MousePressed(evt);
            }
        });
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 160, 180));

        jLabel13.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Profile Picture");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 160, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 800, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Global variable declarations
    String Email;
    ResultSet rs= null;
    int mousepX, mousepY;
    Statement stmt= null;
    ErrorReason ER= new ErrorReason();
    GetImage Image= new GetImage();
    DeleteImage DelImg= new DeleteImage();
    String SQL= "SELECT * FROM organization";
    
    //Code for minimizing the JFrame to taskbar
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel9MouseClicked

    //Code for closing the application
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        int CO= JOptionPane.showConfirmDialog(this, "Are you sure to close the application.\nUnsaved process will be lost.", "Missing Information", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(CO==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jLabel10MouseClicked

    //Code for going back to administrator home page
    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        int OP= JOptionPane.showConfirmDialog(this, "Are you sure that you want to Administrator Home Page?\nIf Yes please choose Yes  ", "Are you sure to go back", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(OP==JOptionPane.YES_OPTION){
            new A05_Admin_Page(Email).setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel11MousePressed

    //Code for dragging the JFrame across screen
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

    //Code for getting data while clicking on jList
    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        String MPub = (String) jList1.getSelectedValue();
        String PubN =MPub.trim().substring(0, 4);
        String query = "SELECT * FROM organization WHERE OrgID="+ PubN;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt= con.createStatement();
            rs= stmt.executeQuery(query);
            if(rs.next()) {
                int AdminRef = rs.getInt("AdminRef");
                int OrgID = rs.getInt("OrgID");
                String FName = rs.getString("FName");
                String Lname = rs.getString("Lname");
                String email = rs.getString("Email");
                String mob= rs.getString("Mobile");
                String district= rs.getString("District");
                String city= rs.getString("City");
                String state= rs.getString("State");
                jTextField2.setText(""+AdminRef);
                jTextField3.setText(""+OrgID);
                jTextField4.setText(""+FName);
                jTextField5.setText(""+Lname);
                jTextField6.setText(""+email);
                jTextField7.setText(""+mob);
                jTextField8.setText(""+district);
                jTextField9.setText(""+city);
                jTextField10.setText(state);
                jLabel20.setIcon(Image.getImage("org", OrgID, 160, 180));
            }
        }
        catch(ClassNotFoundException | SQLException e) {
            ER.copyReason(e.toString());
            JOptionPane.showMessageDialog(this, "An error occured while getting data from servers.\nError have been copied into your clipboard.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
    }//GEN-LAST:event_jList1MouseClicked

    //Code for deleting data
    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        int OrgID=Integer.parseInt(jTextField3.getText());
        String name= jTextField4.getText().concat(" "+jTextField5.getText());
        String EID= jTextField6.getText();
        String NewID = JOptionPane.showInputDialog(this, "Please enter a existing Organization ID", "Enter Organization ID", JOptionPane.INFORMATION_MESSAGE);
        if(!(NewID.equalsIgnoreCase(""))){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
                stmt= con.createStatement();
                rs= stmt.executeQuery("SELECT * FROM organization WHERE OrgID="+NewID+"");
                if(rs.next()){
                    int DOP= JOptionPane.showConfirmDialog(this, "Organization ID: "+jTextField3.getText()+"\nName: "+name+"\nEmail ID: "+EID+"\nAre you sure to delete profile","Delete Profile",JOptionPane.YES_NO_OPTION,JOptionPane.DEFAULT_OPTION,new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_delete_bin.png")));
                    if(DOP==JOptionPane.YES_OPTION){
                        int r1= stmt.executeUpdate("UPDATE volunteer SET OrgRef="+NewID+" WHERE OrgRef="+OrgID);
                        int r= stmt.executeUpdate("DELETE FROM organization WHERE Email='"+EID+"'");
                        if(r==1){
                            JOptionPane.showMessageDialog(this, "Your profile has been successfully deleted.", "Deletion Success", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_ok.png")));
                            DelImg.ImageDelete("org",OrgID);
                            new A12_Delete_Organizer(Email).setVisible(true);
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
    }//GEN-LAST:event_kButton1ActionPerformed

    //Code for getting data from text field
    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        if(!(jTextField1.getText().equalsIgnoreCase(""))){
            String num=jTextField1.getText();
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String db_url="jdbc:mysql://localhost:3306/project";
                String pwd="root";
                String user="root";
                Connection conn=(Connection)DriverManager.getConnection(db_url,user,pwd);
                stmt=(Statement) conn.createStatement();
                rs=stmt.executeQuery( "SELECT * FROM organization WHERE OrgID="+num);
                if(rs.next()) {
                    int AdminRef = rs.getInt("AdminRef");
                    int OrgID = rs.getInt("OrgID");
                    String FName = rs.getString("FName");
                    String Lname = rs.getString("Lname");
                    String email = rs.getString("Email");
                    String mob= rs.getString("Mobile");
                    String district= rs.getString("District");
                    String city= rs.getString("City");
                    String state= rs.getString("State");
                    jTextField2.setText(""+AdminRef);
                    jTextField3.setText(""+OrgID);
                    jTextField4.setText(""+FName);
                    jTextField5.setText(""+Lname);
                    jTextField6.setText(""+email);
                    jTextField7.setText(""+mob);
                    jTextField8.setText(""+district);
                    jTextField9.setText(""+city);
                    jTextField10.setText(state);
                    jLabel20.setIcon(Image.getImage("org", OrgID, 160, 180));
                }
                else {
                    JOptionPane.showMessageDialog(this, "The requested record does not found in our database.\nPlease try again with different Organizer ID", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                }
            }
            catch(HeadlessException | ClassNotFoundException | SQLException e) {
                ER.copyReason(e.toString());
                JOptionPane.showMessageDialog(this, "An error occured while entering data into servers.\nError have been copied into your clipboard.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
            }
        }
        else
            JOptionPane.showMessageDialog(this, "Please enter a valid Organizer ID in the text field.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
    }//GEN-LAST:event_kButton2ActionPerformed

    //Code for getting data into JList
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        DefaultListModel DM = (DefaultListModel) jList1.getModel();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String db_url="jdbc:mysql://localhost:3306/project";
            String pwd="root";
            String user="root";
            Connection conn=(Connection)DriverManager.getConnection(db_url,user,pwd);
            stmt=(Statement) conn.createStatement();
            rs=stmt.executeQuery(SQL);
            DM.removeAllElements();
            jList1.setModel(DM);
            while(rs.next()){
                int OrgID = rs.getInt("OrgID");
                String FName = rs.getString("FName");
                String Lname = rs.getString("LName");
                DM.addElement(OrgID+" - "+FName.concat(" "+Lname));
            }
            jList1.setModel(DM);
        }
        catch(ClassNotFoundException | SQLException e) {
            ER.copyReason(e.toString());
            JOptionPane.showMessageDialog(this, "An error occured while entering data into servers.\nError have been copied into your clipboard.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
    }//GEN-LAST:event_formWindowGainedFocus

    //Code for trimming excess numbers
    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        if(jTextField1.getText().length()>3)
            evt.consume();
        if(!(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'))
            evt.consume();
    }//GEN-LAST:event_jTextField1KeyTyped

    //Code for setting icon image in taskbar
    private void setIcon() {
        setShape(new RoundRectangle2D.Double(0,0,800,550,25,25));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/32px_heart_with_pulse.png")));
    }
    
    //Code for administrator name & Email ID in JFrame
    private void CAInfo(String email) {
        String FN= null;
        String LN= null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM administrator WHERE Email='"+email+"'");
            while (rs.next()) {
                FN= rs.getString("FName");
                LN= rs.getString("LName");
            }
            Email= email;
            String name=FN+" "+LN;
            jLabel14.setText(name);
            jLabel15.setText(Email);
            jLabel51.setVisible(false);
        }
        catch(ClassNotFoundException | SQLException e){
            ER.copyReason(e.toString());
            jLabel51.setVisible(true);
            jLabel14.setText("Administrator: Develpoer");
            jLabel15.setText("");
        }
    }
    
    //Un-used action events
    private void jLabel19MousePressed(java.awt.event.MouseEvent evt) {}
    private void jLabel20MousePressed(java.awt.event.MouseEvent evt) {}
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {}
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {}
    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {}
    
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
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
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
