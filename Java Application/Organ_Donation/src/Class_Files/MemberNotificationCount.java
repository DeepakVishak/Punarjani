//Main package
package Class_Files;

//Imported class files
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

//Function class
public class MemberNotificationCount {
    public int Notify(int ID, String District) throws SQLException{
        Connection con;
        Statement stmt;
        ResultSet R1, R2;
        int Notify=0, Verify=0, Priority=0, flag=0;
        String BGroup="", Query;
        ErrorReason ER= new ErrorReason();
        try {
            Query= "SELECT * FROM blood WHERE MemberID="+ID;
            Class.forName("com.mysql.jdbc.Driver");
            con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            stmt= con.createStatement();
            R1= stmt.executeQuery(Query);
            if(R1.next()) {
                Verify= R1.getInt("Verify");
                Priority= R1.getInt("Priority");
                BGroup= R1.getString("BloodGroup");
            }
            if(Verify==0 |Verify==2 |Priority==3 |Priority==2 |Priority==1)
                flag=0;
            else if(Verify==1 |Priority==0)
                flag=1;
        }
        catch (ClassNotFoundException | SQLException e) {
            ER.copyReason(e.toString());
        }
        if(flag==1){
            Query= "SELECT * FROM notify WHERE Accept = 0 AND BloodGroup='"+BGroup+"' AND District='"+District+"' OR ID="+ID;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
                stmt= con.createStatement();
                R2= stmt.executeQuery(Query);
                while(R2.next()) {
                    Notify++;
                }
            }
            catch (ClassNotFoundException | SQLException e) {
                ER.copyReason(e.toString());
            }
        }
        return Notify;
    }
}
