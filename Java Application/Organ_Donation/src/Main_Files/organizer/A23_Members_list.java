//Main package
package Main_Files.organizer;

//Imported class files
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import Class_Files.Encrypt;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import Class_Files.ErrorReason;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//Function class
public class A23_Members_list extends javax.swing.JFrame {
    public A23_Members_list(String e) {
        initComponents();
        setIcon();
        getRecord();
        getDetail(e);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Member List");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkBorderRadius(25);
        kGradientPanel2.setkEndColor(new java.awt.Color(102, 102, 102));
        kGradientPanel2.setkFillBackground(false);
        kGradientPanel2.setkStartColor(new java.awt.Color(102, 102, 102));
        kGradientPanel2.setOpaque(false);
        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 550));

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

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_minimize_window.png"))); // NOI18N
        jLabel2.setToolTipText("Minimize");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 20, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_close_window.png"))); // NOI18N
        jLabel3.setToolTipText("Close");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_prev.png"))); // NOI18N
        jLabel4.setToolTipText("Go Back");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(getTitle());
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 81, 47));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/20px_caution.png"))); // NOI18N
        jLabel51.setToolTipText("Internal error");
        kGradientPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 20));

        jLabel14.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("DCompany");
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 40));

        jLabel15.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("akilsundhar324@gmail.com");
        kGradientPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 780, 20));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel1.setText("Sort By");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 30));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a option", "First Name Ascending", "First Name Descending", "Blood Group Ascending", "Blood Group Descending", "City Ascending", "City Descending", "District Ascending", "District Descending", "State Ascending", "State Descending" }));
        jComboBox1.setToolTipText("Choose a option for sorting");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 250, 30));

        jTable1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Member ID", "First Name", "Last Name", "Email ID", "Mobile", "Age", "Gender", "Blood Group", "City", "District", "State"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable1FocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 780, 360));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 800, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Declared global variable
    ResultSet rs= null;
    Statement stmt= null;
    Connection con= null;
    Encrypt Enc= new Encrypt();
    int mousepX, mousepY, MID;
    ErrorReason ER= new ErrorReason();
    String FN, LN, EID, MO, District, Age, Gen, BG, City, State, EEID, EMO, Query, Email;
    
    //Code for setting JFrame minimised in taskbar
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    //Code for closing application
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        int CO= JOptionPane.showConfirmDialog(this, "Are you sure to close the application.\nUnsaved process will be lost.", "Missing Information", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(CO==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    //Code for going back to organization home page
    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        int OP= JOptionPane.showConfirmDialog(this, "Are you sure that you want to organization home page?\nIf Yes please choose Yes  ", "Are you sure to go back", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, new javax.swing.ImageIcon(getClass().getResource("/Icons/75px_puzzled.png")));
        if(OP==JOptionPane.YES_OPTION){
            new A15_Organizer_Page(Email).setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel4MousePressed

    //Code for dragging JFrame across screen
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int coordX= evt.getXOnScreen();
        int coordY= evt.getYOnScreen();
        this.setLocation(coordX-mousepX, coordY-mousepY);
    }//GEN-LAST:event_jPanel1MouseDragged

    //Code for getting current mouse position
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        mousepX= evt.getX();
        mousepY= evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    //Code for filtering records
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String Option= (String) jComboBox1.getSelectedItem();
        if(null != Option)switch (Option) {
            case "Choose a option":
                this.getRecord();
                break;
            case "First Name Ascending":
                this.getRecordFilter("FName", "ASC");
                break;
            case "First Name Descending":
                this.getRecordFilter("FName", "DESC");
                break;
            case "Blood Group Ascending":
                this.getRecordFilter("BloodGroup", "ASC");
                break;
            case "Blood Group Descending":
                this.getRecordFilter("BloodGroup", "DESC");
                break;
            case "City Ascending":
                this.getRecordFilter("City", "ASC");
                break;
            case "City Descending":
                this.getRecordFilter("City", "DESC");
                break;
            case "District Ascending":
                this.getRecordFilter("District", "ASC");
                break;
            case "District Descending":
                this.getRecordFilter("District", "DESC");
                break;
            case "State Ascending":
                this.getRecordFilter("State", "ASC");
                break;
            case "State Descending":
                this.getRecordFilter("State", "DESC");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    //Code for setting Icon in taskbar 
    private void setIcon() {
        setShape(new RoundRectangle2D.Double(0,0,800,550,25,25));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/32px_heart_with_pulse.png")));
    }
    
    //Code for getting record
    private void getRecord(){
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
	int rows= model.getRowCount();
	if(rows>0) {
            for(int i=0;i<rows;i++) {
                model.removeRow(0);
            }
        }
        Query= "SELECT * FROM member";
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt = con.createStatement();
            rs = stmt.executeQuery(Query);
            while (rs.next()) {
                MID= rs.getInt("MemberID");
                FN= rs.getString("FName");
                LN= rs.getString("Lname");
                EID= rs.getString("Email");
                MO= rs.getString("Mobile");
                Age=rs.getString("Age");
                Gen= rs.getString("Gender");
                BG= rs.getString("BloodGroup");
                City= rs.getString("City");
                District= rs.getString("District");
                State= rs.getString("State");
                EEID= Enc.setEmail(EID);
                EMO= Enc.setMobile(MO);
                model.addRow(new Object[] {MID, FN, LN, EEID, EMO, Age, Gen, BG, City, District, State});
            }
            jLabel51.setVisible(false);
        }
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            ER.copyReason(e.toString());
            jLabel51.setVisible(true);
        }
    }

    //Code for getting record
    public void getRecordFilter(String column, String ordertype){
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
	int rows= model.getRowCount();
	if(rows>0) {
            for(int i=0;i<rows;i++) {
                model.removeRow(0);
            }
        }
        Query= "SELECT * FROM member ORDER BY "+column+" "+ordertype;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt = con.createStatement();
            rs = stmt.executeQuery(Query);
            while (rs.next()) {
                MID= rs.getInt("MemberID");
                FN= rs.getString("FName");
                LN= rs.getString("Lname");
                EID= rs.getString("Email");
                MO= rs.getString("Mobile");
                Age=rs.getString("Age");
                Gen= rs.getString("Gender");
                BG= rs.getString("BloodGroup");
                City= rs.getString("City");
                District= rs.getString("District");
                State= rs.getString("State");
                EEID= Enc.setEmail(EID);
                EMO= Enc.setMobile(MO);
                model.addRow(new Object[] {MID, FN, LN, EEID, EMO, Age, Gen, BG, City, District, State});
            }
            jLabel51.setVisible(false);
        }
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            ER.copyReason(e.toString());
            jLabel51.setVisible(true);
        }
    }
    
    //Code for getting deatil of current user
    private void getDetail(String email) {
        Email= email;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String db_url="jdbc:mysql://localhost:3306/project";
            String pwd="root";
            String user="root";
            Connection conn=(Connection)DriverManager.getConnection(db_url,user,pwd);
            stmt=(Statement) conn.createStatement();
            rs=stmt.executeQuery( "SELECT * FROM organization WHERE Email='"+Email+"'");
            if(rs.next()) {
                String OFN= rs.getString("FName");
                String OLN = rs.getString("Lname");
                jLabel14.setText(OFN+" "+OLN);
                jLabel15.setText(Email);
            }
            jLabel51.setVisible(false);
        }
        catch(ClassNotFoundException | SQLException e) {
            ER.copyReason(e.toString());
            jLabel14.setText("Organization");
            jLabel15.setText("");
            jLabel51.setVisible(true);
        }
    }

    //Un-used action events
    private void jTable1FocusGained(java.awt.event.FocusEvent evt) {}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}