//Main package
package Class_Files;

//Imported class files
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

//Function class
public class ErrorReason {
    public void copyReason(String reason){
        String S= reason;
        StringSelection SS= new StringSelection(S);
        Clipboard C= Toolkit.getDefaultToolkit().getSystemClipboard();
        C.setContents(SS,null);
    }
}