//Main package
package Class_Files;

//Imported class files
import java.util.Arrays;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

//Function class
public class GetNotifyID {
    ErrorReason ER= new ErrorReason();
    public int getNID(){
        int i= 0, count= 0,FID = 0,max=0, NID=0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            Statement stmt=conn.createStatement();
            String sql1= "SELECT COUNT(NID) FROM notify";
            String sql2= "SELECT * FROM notify";
            String sql3= "SELECT MAX(NID) FROM notify";
            ResultSet R1= stmt.executeQuery(sql1);
            while(R1.next()){
                count= R1.getInt("COUNT(NID)");
            }
            int[] ids= new int[count];
            ResultSet R2= stmt.executeQuery(sql2);
            while(R2.next()){
                ids[i]= R2.getInt("NID");
                i++;
            }
            if(!(ids.length==0)){
                ResultSet R3= stmt.executeQuery(sql3);
                if(R3.next())
                    max= R3.getInt("MAX(NID)");
                Arrays.parallelSort(ids);
                int numberArrayIndex=0;
                for(i=0;i<ids[ids.length-1];i++) {
                    if(i==ids[numberArrayIndex]) {
                        numberArrayIndex++;
                    }
                    else{
                        if(i>1000000000){
                            NID=i;
                        }
                    }
                }
                if(NID==0){
                    NID= ++max;
                    FID= NID;
                }
                else{
                    FID= NID;
                }
            }
            else{
                FID= 1000000000;
            }
        }
        catch(ClassNotFoundException | SQLException e){
            ER.copyReason(e.toString());
        }
        return FID;
    }
}