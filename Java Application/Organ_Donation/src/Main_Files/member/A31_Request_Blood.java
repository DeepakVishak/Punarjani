//Main package
package Main_Files.member;

//Imported class files
import java.awt.Toolkit;
import java.util.Arrays;
import java.sql.Statement;
import javax.swing.JFrame;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import Class_Files.ErrorReason;
import java.awt.HeadlessException;
import java.awt.geom.RoundRectangle2D;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;

//Function class
public class A31_Request_Blood extends javax.swing.JFrame {
    public A31_Request_Blood(String e) {
        initComponents();
        getDetail(e); 
        getRID();
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kButton1 = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Request For Blood");
        setBackground(new java.awt.Color(240, 0, 240));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkBorderRadius(25);
        kGradientPanel2.setkEndColor(new java.awt.Color(102, 102, 102));
        kGradientPanel2.setkFillBackground(false);
        kGradientPanel2.setkStartColor(new java.awt.Color(102, 102, 102));
        kGradientPanel2.setOpaque(false);
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(800, 550));
        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 550));

        jPanel3.setBackground(new java.awt.Color(0, 153, 0));
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

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_close_window.png"))); // NOI18N
        jLabel17.setToolTipText("Close");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 30));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_minimize_window.png"))); // NOI18N
        jLabel16.setToolTipText("Minimize");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, -1, 30));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_prev.png"))); // NOI18N
        jLabel18.setToolTipText("Go Back");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel18MousePressed(evt);
            }
        });
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText(getTitle());
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel19MousePressed(evt);
            }
        });
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 153, 0));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("DCompany");
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 770, 40));

        jLabel11.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("dcompany.uit@gmail.com");
        kGradientPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 770, 20));

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_caution.png"))); // NOI18N
        jLabel51.setToolTipText("Internal error");
        kGradientPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 20));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 90));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel1.setText("Request ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 30));

        jLabel2.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel2.setText("Member ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 80, 30));

        kButton1.setBorder(null);
        kButton1.setText("Reset");
        kButton1.setToolTipText("Reset all fields");
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
        jPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 230, -1));

        kButton2.setBorder(null);
        kButton2.setText("Submit Request");
        kButton2.setToolTipText("Apply request for blood");
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
        jPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 230, -1));

        jLabel7.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel7.setText("Details");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 490, 20));

        jLabel10.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel10.setText("Blood Group");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 240, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setToolTipText("Enter more details for better verification");
        jTextArea1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 490, 160));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField1.setToolTipText("Your Request ID");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField1MousePressed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 270, 30));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField2.setToolTipText("Your Member ID");
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 290, 30));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField3.setToolTipText("Enter Medical ID or Casuality ID, etc.");
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 490, 30));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a Option", "Whole Blood", "Blood - Red Cells", "Blood - Platelets", "Blood - Plasma", "Blood - Cryo", "Blood - White Cells & Granulocytes" }));
        jComboBox2.setToolTipText("Choose the type of requirement");
        jComboBox2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 490, 30));

        jLabel4.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel4.setText("Medical ID / Casuality ID/ Emergency Ward ID ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 490, 20));

        jLabel5.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel5.setText("Type Of Requirement");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 490, 20));

        jLabel6.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel6.setText("District");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 240, 20));

        jLabel9.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel9.setText("City");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 240, 20));

        jComboBox5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a option", "Alappuzha", "Ernakulam", "Idukki", "Kannur", "Kasaragod", "Kollam", "Kottayam", "Kozhikode", "Lakshadweep", "Malappuram", "Palakkad", "Pathanamthitta", "Thiruvananthapuram", "Thrissur", "Wayanad" }));
        jComboBox5.setToolTipText("Choose the district the request is to be processed");
        jComboBox5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 240, 30));

        jComboBox4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox4.setModel(new DefaultComboBoxModel());
        jComboBox4.setToolTipText("Choose the city the request is to be processed");
        jComboBox4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jComboBox4.setEnabled(false);
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 240, 30));

        jComboBox6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a option", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        jComboBox6.setToolTipText("Choose one of the blood group");
        jComboBox6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel1.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 240, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)), "Note", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Constantia", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel12.setText("Please verify that you have provided");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 220, -1));

        jLabel13.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel13.setText("the correcct and verified details and");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 220, -1));

        jLabel14.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel14.setText("the best of your knowledge. Incorrect");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 220, -1));

        jLabel15.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel15.setText("details may lead to rejection of the");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 220, -1));

        jLabel20.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel20.setText("application which may lead to late");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 220, -1));

        jLabel3.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel3.setText("blood delivery.");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 220, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 235, 240, 180));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 800, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Global variables declared
    int mousepX,mousepY,RID;
    String Email=null, SQL=null;
    Connection conn= null;
    Statement stmt= null;
    ResultSet rs= null;
    ErrorReason ER= new ErrorReason();

    //Code for setting JFrame minimized in taskbar
    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel16MouseClicked

    //Code for closing application
    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        int CO= JOptionPane.showConfirmDialog(this, "Are you sure to close the application?", "Close Application", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(CO==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jLabel17MouseClicked

    //Code for going back to member's page
    private void jLabel18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MousePressed
        int OP= JOptionPane.showConfirmDialog(this, "Are you sure that you want to Members Home Page?\nIf Yes please choose Yes  ", "Are you sure to go back", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(OP==JOptionPane.YES_OPTION){
            new A25_Member_Page(Email).setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel18MousePressed

    //Code for dragging JFrame across screen
    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int coordX= evt.getXOnScreen();
        int coordY= evt.getYOnScreen();
        this.setLocation(coordX-mousepX, coordY-mousepY);
    }//GEN-LAST:event_jPanel3MouseDragged

    //Code for getting current mouse position
    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    //Code for resetting fields
    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        new A31_Request_Blood(Email).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kButton1ActionPerformed

    //Code for submitting request
    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        int flag=0;
        String MedID= jTextField3.getText();
        String Type= (String)jComboBox2.getSelectedItem();
        String Detail= jTextArea1.getText();
        String BGroup= (String)jComboBox6.getSelectedItem();
        String District= (String)jComboBox5.getSelectedItem();
        String City= (String)jComboBox4.getSelectedItem();
        if(!("".equalsIgnoreCase(MedID))){
            if(!("".equalsIgnoreCase(Detail))){
                if(!("Choose a Option".equals(Type))){
                    if(!("Choose a option".equals(BGroup))){
                        if(!("Choose a option".equals(District))){
                            flag=1;
                        }
                        else
                            JOptionPane.showMessageDialog(this, "Please choose the district and city.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                    }
                    else
                        JOptionPane.showMessageDialog(this, "Please choose required blood group.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                }
                else
                    JOptionPane.showMessageDialog(this, "Please choose a requirement type.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
            }
            else
                JOptionPane.showMessageDialog(this, "Please enter details of patient and other valid information.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
        else
            JOptionPane.showMessageDialog(this, "Please enter your Medical ID.\nIt is a mandatory field.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        if(flag==1){
            try
            {
               Class.forName("com.mysql.jdbc.Driver");
               conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
               stmt=conn.createStatement();
               RID=Integer.parseInt(jTextField1.getText());
               int MID=Integer.parseInt(jTextField2.getText());
               SQL = "INSERT INTO request VALUES("+RID+","+MID+",0,'"+MedID+"',"
                       + "'"+BGroup+"','"+Type+"','"+Detail+"','"+District+"',"
                       + "'"+City+"',curdate(),0)";
               int row = stmt.executeUpdate(SQL);
               if(row==1)
                   JOptionPane.showMessageDialog(this, "Your request has been sucessfully placed.\nIt will be processed in a week.", "Request Placed", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_update.png")));
            }
            catch(HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e){
                ER.copyReason(e.toString());
                JOptionPane.showMessageDialog(this, "An error occured while updating request into our servers.\nError have been copied into your clipboard.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
            }
        }
    }//GEN-LAST:event_kButton2ActionPerformed

    //Code for choosing District
    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        switch (jComboBox5.getSelectedItem().toString()) {
            case "Choose a option":
            String[] Choose={"Choose a option"};
            DefaultComboBoxModel ComboBoxModel = new DefaultComboBoxModel(Choose);
            jComboBox4.setModel(ComboBoxModel);
            jComboBox4.setEnabled(false);
            break;
            case "Alappuzha":
            {
                String[] Alappuzha={"Ambalapuzha","Alappuzha","Chengannur","Cherthala",
                    "Haripad","Karthikappally","Kuttanad","Mankombu","Mavelikkara"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Alappuzha);
                jComboBox4.setModel(ComboBoxModelCity);
                jComboBox4.setEnabled(true);
                break;
            }
            case "Ernakulam":
            {
                String[] Ernakulam={"Aluva","Ernakulam","Fort Kochi","Kanayannur","Kochi",
                    "Kothamangalam","Kunnathunad","Muvattupuzha","North Paravur","Perumbavoor"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Ernakulam);
                jComboBox4.setModel(ComboBoxModelCity);
                jComboBox4.setEnabled(true);
                break;
            }
            case "Idukki":
            {
                String[] Idukki={"Devikulam","Idukki","Nedumkandam","Painavu","Peermade",
                    "Thodupuzha","Udumbanchola"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Idukki);
                jComboBox4.setModel(ComboBoxModelCity);
                jComboBox4.setEnabled(true);
                break;
            }
            case "Kannur":
            {
                String[] Kannur={"Thalassery","Iritty","Kannur","Thalipparamba","Payyanur"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kannur);
                jComboBox4.setModel(ComboBoxModelCity);
                jComboBox4.setEnabled(true);
                break;
            }
            case "Kasaragod":
            {
                String[] Kasaragod={"Hosdurg","Kasaragod","Manjeshwaram","Uppala","Vellarikundu"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kasaragod);
                jComboBox4.setModel(ComboBoxModelCity);
                jComboBox4.setEnabled(true);
                break;
            }
            case "Kollam":
            {
                String[] Kollam={"Chathannoor","Karunagappally","Kollam","Kottarakkara",
                    "Kunnathur","Pathanapuram","Paravur","Punalur","Sasthamkotta"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kollam);
                jComboBox4.setModel(ComboBoxModelCity);
                jComboBox4.setEnabled(true);
                break;
            }
            case "Kottayam":
            {
                String[] Kottayam={"Changanasserry","Kanjirappally","Kottayam","Meenachil",
                    "Palai","Vaikom"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kottayam);
                jComboBox4.setModel(ComboBoxModelCity);
                jComboBox4.setEnabled(true);
                break;
            }
            case "Kozhikode":
            {
                String[] Kozhikode={"Koyilandy","Kozhikode","Thamarassery","Vatakara"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kozhikode);
                jComboBox4.setModel(ComboBoxModelCity);
                jComboBox4.setEnabled(true);
                break;
            }
            case "Malappuram":
            {
                String[] Malappuram={"Eranad","Kondotty","Manjeri","Nilambur",
                    "Perinthalmanna","Ponnani","Tirur","Tirurangadi"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Malappuram);
                jComboBox4.setModel(ComboBoxModelCity);
                jComboBox4.setEnabled(true);
                break;
            }
            case "Palakkad":
            {
                String[] Palakkad={"Alathur","Chittur","Mannarkkad","Ottappalam",
                    "Palakkad","Pattambi"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Palakkad);
                jComboBox4.setModel(ComboBoxModelCity);
                jComboBox4.setEnabled(true);
                break;
            }
            case "Pathanamthitta":
            {
                String[] Pathanamthitta={"Adoor","Konni","Kozhencherry","Mallappally",
                    "Pathanamthitta","Ranni","Thiruvalla"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Pathanamthitta);
                jComboBox4.setModel(ComboBoxModelCity);
                jComboBox4.setEnabled(true);
                break;
            }
            case "Thiruvananthapuram":
            {
                String[] Thiruvananthapuram={"Attingal","Chirayinkeezhu","Kattakada","Nedumangad",
                    "Neyyattinkara","Thiruvananthapuram","Varkala"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Thiruvananthapuram);
                jComboBox4.setModel(ComboBoxModelCity);
                jComboBox4.setEnabled(true);
                break;
            }
            case "Thrissur":
            {
                String[] Thrissur={"Chalakudy","Chavakkad","Irinjalakuda","Kodungallur",
                    "Kunnamkulam","Mukundapuram","Thalapilly","Thrissur","Wadakkancheri"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Thrissur);
                jComboBox4.setModel(ComboBoxModelCity);
                jComboBox4.setEnabled(true);
                break;
            }
            case "Wayanad":
            {
                String[] Wayanad={"Kalpetta","Mananthavady","Sultan Battery","Vythiri"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Wayanad);
                jComboBox4.setModel(ComboBoxModelCity);
                jComboBox4.setEnabled(true);
                break;
            }
            case "Lakshadweep":
            {
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

    //Code for getting new ID
    private void jTextField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MousePressed
        getRID();
    }//GEN-LAST:event_jTextField1MousePressed

    //Code for getting Request ID
    private void getRID() {
        int i= 0, count= 0,NID = 0, max=0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt= conn.createStatement();
            String sql1= "SELECT COUNT(RequestID) FROM request";
            String sql2= "SELECT * FROM request";
            String sql3= "SELECT MAX(RequestID) FROM request";
            ResultSet R1= stmt.executeQuery(sql1);
            while(R1.next()){
                count= R1.getInt("COUNT(RequestID)");
            }
            int[] ids= new int[count];
            ResultSet R2= stmt.executeQuery(sql2);
            while(R2.next()){
                ids[i]= R2.getInt("RequestID");
                i++;
            }
            if(!(ids.length==0)){
                ResultSet R3= stmt.executeQuery(sql3);
                if(R3.next())
                    max= R3.getInt("MAX(RequestID)");
                Arrays.sort(ids);
                int numberArrayIndex=0;
                for(i=0;i<ids[ids.length-1];i++) {
                    if(i==ids[numberArrayIndex]) {
                        numberArrayIndex++;
                    }
                    else{
                        if(i>=100000000){
                            NID=i;
                        }
                    }
                }
                if(NID==0){
                    NID= ++max;
                    jTextField1.setText(Integer.toString(NID));
                }
                else{
                    jTextField1.setText(Integer.toString(NID));
                }
            }
            else
                jTextField1.setText("100000000");
            jLabel51.setVisible(false);
        }
        catch(ClassNotFoundException | SQLException e){
            ER.copyReason(e.toString());
            jLabel51.setVisible(true);
        }
    }
    
    //Code for setting Icon
    private void setIcon() {
        setShape(new RoundRectangle2D.Double(0,0,800,550,25,25));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/32px_heart_with_pulse.png")));
    }
    
    //Code for setting profile image, name, Email ID in JFrame
    private void getDetail(String email) {
        Email= email;
        String FN= null,LN= null, ID= null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM member WHERE Email='"+Email+"'");
            while (rs.next()) {
                FN= rs.getString("FName");
                LN= rs.getString("LName");
                ID= rs.getString("MemberID");
            }
            jLabel8.setText(FN.concat(" "+LN));
            jLabel11.setText(Email);
            jLabel51.setVisible(false);
            jTextField2.setText(ID);
        }
        catch(ClassNotFoundException | SQLException e){
            ER.copyReason(e.toString());
            jLabel51.setVisible(true);
            jLabel6.setText("Member");
            jLabel11.setText("");
        }
    }
    
    //Un-used action events
    private void jLabel19MousePressed(java.awt.event.MouseEvent evt) {}
    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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