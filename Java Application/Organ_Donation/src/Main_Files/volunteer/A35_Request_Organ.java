//Main package
package Main_Files.volunteer;

//Imported class files
import java.util.Date;
import java.awt.Toolkit;
import java.util.Arrays;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import Class_Files.ErrorReason;
import java.awt.HeadlessException;
import java.awt.geom.RoundRectangle2D;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;

//Function class
public class A35_Request_Organ extends javax.swing.JFrame {
    public A35_Request_Organ(String e) {
        initComponents();
        setIcon();
        getRID();
        getDetail(e);
        jLabel51.setVisible(false);
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
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        kButton1 = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Request For Organ");
        setMaximumSize(new java.awt.Dimension(800, 550));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkBorderRadius(25);
        kGradientPanel2.setkEndColor(new java.awt.Color(102, 102, 102));
        kGradientPanel2.setkFillBackground(false);
        kGradientPanel2.setkStartColor(new java.awt.Color(102, 102, 102));
        kGradientPanel2.setOpaque(false);
        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 550));

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
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
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 0, 0));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("DCompany");
        kGradientPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 40));

        jLabel14.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("dcompany.uit@gmail.com");
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 780, 20));

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_caution.png"))); // NOI18N
        jLabel51.setToolTipText("Internal error");
        kGradientPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 20));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel1.setText("Request ID");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 30));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField1.setToolTipText("Your Request ID");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 280, 30));

        jLabel3.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel3.setText("Blood Group");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 240, 20));

        jLabel4.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel4.setText("District");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 240, 20));

        jLabel5.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel5.setText("City");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 240, 20));

        jLabel2.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel2.setText("Volunteer ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 80, 30));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField2.setToolTipText("Your Volunteer ID");
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 280, 30));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField3.setToolTipText("Enter a valid Medical ID or any uniquie ID to recoganzie patient");
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 490, 30));

        jLabel6.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel6.setText("Medical ID / Casuality ID/ Emergency Ward ID ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 490, 20));

        jLabel7.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel7.setText("Type of Requirement");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 490, 20));

        jLabel8.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel8.setText("Details/Discription (Elaborate)");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 480, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setToolTipText("Enter the the details or discription");
        jTextArea1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 490, 160));

        kButton1.setBorder(null);
        kButton1.setText("Reset Fields");
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
        jPanel2.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 230, -1));

        kButton2.setBorder(null);
        kButton2.setText("Submit Request");
        kButton2.setToolTipText("Submit your request");
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
        jPanel2.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 230, 45));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)), "Note", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 0, 11), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel15.setText("Please verify that you have provided");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 220, -1));

        jLabel16.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel16.setText("the correcct and verified details and");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 220, -1));

        jLabel17.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel17.setText("the best of your knowledge. Incorrect");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 220, -1));

        jLabel18.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel18.setText("details may lead to rejection of the");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 220, -1));

        jLabel20.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel20.setText("organ delivery.");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 220, -1));

        jLabel21.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel21.setText("application which may lead to late");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 220, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 235, 240, 170));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a option", "Alappuzha", "Ernakulam", "Idukki", "Kannur", "Kasaragod", "Kollam", "Kottayam", "Kozhikode", "Lakshadweep", "Malappuram", "Palakkad", "Pathanamthitta", "Thiruvananthapuram", "Thrissur", "Wayanad" }));
        jComboBox1.setToolTipText("Choose the district");
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 240, 30));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox2.setModel(new DefaultComboBoxModel());
        jComboBox2.setToolTipText("Choose the city");
        jComboBox2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jComboBox2.setEnabled(false);
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 240, 30));

        jComboBox3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a Option", "Cornea", "Heart", "Intestine", "Kidney", "Liver", "Lungs", "Pancreas" }));
        jComboBox3.setToolTipText("Choose a option of requirement");
        jComboBox3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 490, 30));

        jComboBox6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a option", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        jComboBox6.setToolTipText("Choose the blood group");
        jComboBox6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 240, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 800, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Global Variables Declared
    Date rdate=null;
    Statement stmt= null;
    Connection conn= null;
    ErrorReason ER= new ErrorReason();
    int mousepX, mousepY, vid, rid, RID;
    String Email, SQL, mid, bg, tpe, Detail, District, City;
    
    //Code for setting JFrame minimised in taskbar
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel9MouseClicked

    //Code for closing application
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        int CO= JOptionPane.showConfirmDialog(this, "Are you sure to close the application?", "Close Application", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(CO==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jLabel10MouseClicked

    //Code for going back to volunteer home page
    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        int OP= JOptionPane.showConfirmDialog(this, "Are you sure that you want to go back to volunteer home page?\nIf Yes please choose Yes  ", "Are you sure to logout", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(OP==JOptionPane.YES_OPTION){
            new A32_Volunteer_Page(Email).setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel11MousePressed

    //Code for dragging JFrame across screen
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

    //Code for resetting fields
    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        new A35_Request_Organ(Email).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kButton1ActionPerformed

    //Code for requesting organ
    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        if(this.getChecked()==1){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                String db_url="jdbc:mysql://localhost:3306/project";
                String pwd="root";
                String user="root";
                conn= (Connection)DriverManager.getConnection(db_url,user,pwd);
                stmt= conn.createStatement();
                rid=Integer.parseInt(jTextField1.getText());
                vid=Integer.parseInt(jTextField2.getText());
                mid=jTextField3.getText();
                bg= (String) jComboBox6.getSelectedItem();
                tpe= (String) jComboBox3.getSelectedItem();
                Detail= jTextArea1.getText();
                District= (String) jComboBox1.getSelectedItem();
                City= (String) jComboBox2.getSelectedItem();
                SQL="INSERT INTO request values("+rid+",0,"+vid+",'"+mid+"','"+bg+"','"+tpe+"','"+Detail+"','"+District+"','"+City+"',curdate(),0)";
                int re=stmt.executeUpdate(SQL);
                if(re==1){
                    JOptionPane.showMessageDialog(this, "The request have successfully placed.", "Request placed", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_ok.png")));
                }
            }
            catch(HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e){
                ER.copyReason(e.toString());
                JOptionPane.showMessageDialog(this, "An error occured while updating data into servers.\nError have been copied into your clipboard.\nPlease try again later.", "Error Occured", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
            }
        }
    }//GEN-LAST:event_kButton2ActionPerformed

    //Code for generating city
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        switch (jComboBox1.getSelectedItem().toString()) {
            case "Choose a option":
            String[] Choose={"Choose a option"};
            DefaultComboBoxModel ComboBoxModel = new DefaultComboBoxModel(Choose);
            jComboBox2.setModel(ComboBoxModel);
            jComboBox2.setEnabled(false);
            break;
            case "Alappuzha":
            {
                String[] Alappuzha={"Ambalapuzha","Alappuzha","Chengannur","Cherthala",
                    "Haripad","Karthikappally","Kuttanad","Mankombu","Mavelikkara"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Alappuzha);
                jComboBox2.setModel(ComboBoxModelCity);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Ernakulam":
            {
                String[] Ernakulam={"Aluva","Ernakulam","Fort Kochi","Kanayannur","Kochi",
                    "Kothamangalam","Kunnathunad","Muvattupuzha","North Paravur","Perumbavoor"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Ernakulam);
                jComboBox2.setModel(ComboBoxModelCity);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Idukki":
            {
                String[] Idukki={"Devikulam","Idukki","Nedumkandam","Painavu","Peermade",
                    "Thodupuzha","Udumbanchola"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Idukki);
                jComboBox2.setModel(ComboBoxModelCity);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Kannur":
            {
                String[] Kannur={"Thalassery","Iritty","Kannur","Thalipparamba","Payyanur"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kannur);
                jComboBox2.setModel(ComboBoxModelCity);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Kasaragod":
            {
                String[] Kasaragod={"Hosdurg","Kasaragod","Manjeshwaram","Uppala","Vellarikundu"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kasaragod);
                jComboBox2.setModel(ComboBoxModelCity);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Kollam":
            {
                String[] Kollam={"Chathannoor","Karunagappally","Kollam","Kottarakkara",
                    "Kunnathur","Pathanapuram","Paravur","Punalur","Sasthamkotta"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kollam);
                jComboBox2.setModel(ComboBoxModelCity);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Kottayam":
            {
                String[] Kottayam={"Changanasserry","Kanjirappally","Kottayam","Meenachil",
                    "Palai","Vaikom"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kottayam);
                jComboBox2.setModel(ComboBoxModelCity);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Kozhikode":
            {
                String[] Kozhikode={"Koyilandy","Kozhikode","Thamarassery","Vatakara"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Kozhikode);
                jComboBox2.setModel(ComboBoxModelCity);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Malappuram":
            {
                String[] Malappuram={"Eranad","Kondotty","Manjeri","Nilambur",
                    "Perinthalmanna","Ponnani","Tirur","Tirurangadi"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Malappuram);
                jComboBox2.setModel(ComboBoxModelCity);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Palakkad":
            {
                String[] Palakkad={"Alathur","Chittur","Mannarkkad","Ottappalam",
                    "Palakkad","Pattambi"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Palakkad);
                jComboBox2.setModel(ComboBoxModelCity);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Pathanamthitta":
            {
                String[] Pathanamthitta={"Adoor","Konni","Kozhencherry","Mallappally",
                    "Pathanamthitta","Ranni","Thiruvalla"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Pathanamthitta);
                jComboBox2.setModel(ComboBoxModelCity);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Thiruvananthapuram":
            {
                String[] Thiruvananthapuram={"Attingal","Chirayinkeezhu","Kattakada","Nedumangad",
                    "Neyyattinkara","Thiruvananthapuram","Varkala"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Thiruvananthapuram);
                jComboBox2.setModel(ComboBoxModelCity);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Thrissur":
            {
                String[] Thrissur={"Chalakudy","Chavakkad","Irinjalakuda","Kodungallur",
                    "Kunnamkulam","Mukundapuram","Thalapilly","Thrissur","Wadakkancheri"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Thrissur);
                jComboBox2.setModel(ComboBoxModelCity);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Wayanad":
            {
                String[] Wayanad={"Kalpetta","Mananthavady","Sultan Battery","Vythiri"};
                DefaultComboBoxModel ComboBoxModelCity = new DefaultComboBoxModel(Wayanad);
                jComboBox2.setModel(ComboBoxModelCity);
                jComboBox2.setEnabled(true);
                break;
            }
            case "Lakshadweep":
            {
                String[] Kavaratti={"Kavaratti"};
                DefaultComboBoxModel ComboBoxModelDistrict = new DefaultComboBoxModel(Kavaratti);
                jComboBox2.setModel(ComboBoxModelDistrict);
                jComboBox2.setEnabled(true);
                break;
            }
            default:
            break;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
        }
        catch(ClassNotFoundException | SQLException e){
            ER.copyReason(e.toString());
            jLabel51.setVisible(true);
        }
    }
    
    //Code for getting current user information
    private void getDetail(String email) {
        Email= email;
        String FN, LN;
        int VID;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String db_url="jdbc:mysql://localhost:3306/project";
            String pwd="root";
            String user="root";
            conn= (Connection)DriverManager.getConnection(db_url,user,pwd);
            stmt= conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM volunteer WHERE Email='"+Email+"'");
            while (rs.next()) {
                FN= rs.getString("FName");
                LN= rs.getString("LName");
                VID= rs.getInt("VID");
                String name=FN+" "+LN;
                jLabel13.setText(name);
                jLabel14.setText(Email);
                jTextField2.setText(Integer.toString(VID));
            }
            
        }
        catch(ClassNotFoundException | SQLException e){
            ER.copyReason(e.toString());
            jLabel13.setText("Volunteer");
            jLabel14.setText("");
            jLabel51.setVisible(true);
        }
    }
    
    //Code for checking fields are empty or not
    private int getChecked() {
        int flag=0;
        if(!(jComboBox6.getSelectedItem().equals("Choose a option"))){
            if(!(jComboBox1.getSelectedItem().equals("Choose a option"))){
                if(!(jTextField3.getText().equalsIgnoreCase(""))){
                    if(!(jComboBox3.getSelectedItem().equals("Choose a option"))){
                        if(!(jTextArea1.getText().equalsIgnoreCase("")))
                            flag=1;
                        else
                            JOptionPane.showMessageDialog(this, "Please enter the sufficient details of organ reciever.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                    }
                    else
                        JOptionPane.showMessageDialog(this, "Please choose a type of requirement organ reciever need.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
                }
                else
                    JOptionPane.showMessageDialog(this, "Please enter the Medical ID of the organ reciever.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
            }
            else
                JOptionPane.showMessageDialog(this, "Please choose a District and City.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        }
        else
            JOptionPane.showMessageDialog(this, "Please choose a blood group for organ reciever.", "Missing Information", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_cancel.png")));
        return flag;
    }
    
    //Code for setting icon image in taskbar
    private void setIcon() {
        setShape(new RoundRectangle2D.Double(0,0,800,550,25,25));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/32px_heart_with_pulse.png")));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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