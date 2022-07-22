//Main package
package Class_Files;

//Imported class files
import Main_Files.*;
import java.awt.Font;
import Main_Files.admin.*;
import Main_Files.member.*;
import java.util.Properties;
import javax.swing.UIManager;
import Main_Files.organizer.*;
import Main_Files.volunteer.*;
import com.jtattoo.plaf.aero.AeroLookAndFeel;
import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;

//Function class
public class Test {
    public static void main(String args[]) {
        UIManager.put("OptionPane.messageFont", new Font("Segoe UI Semilight", Font.BOLD, 14));
        UIManager.put("OptionPane.buttonFont", new Font("Constantia", Font.PLAIN, 14));
        try {
            Properties p = new Properties();
            p.put("windowDecoration", "off");
            AeroLookAndFeel.setCurrentTheme(p);
            UIManager.setLookAndFeel(new AeroLookAndFeel());            
        } catch (Exception ex) {
            ex.printStackTrace();
        } 

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                setDefaultLookAndFeelDecorated(false);
                //new A05_Admin_Page("deepakvishal016@gmail.com").setVisible(true);
                //new A25_Member_Page("akilsundhar324@gmail.com").setVisible(true);
                //new A15_Organizer_Page("akilsundhar324@gmail.com").setVisible(true);
                new A32_Volunteer_Page("akilsundhar324@gmail.com").setVisible(true);
                //new A03_SignUp_Page().setVisible(true);
                //new A02_SignIn_Page().setVisible(true);
            }
        });
    }    
}