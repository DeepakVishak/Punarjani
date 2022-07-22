//Main package
package Class_Files;

//Imported class files
import java.io.File;
import java.awt.Image;
import javax.swing.ImageIcon;

//Function class
public class GetImage {
    public ImageIcon getImage(String level,int ID,int X,int Y){
        File F= new File(System.getProperty("java.class.path"));
        File Dir= F.getAbsoluteFile().getParentFile();
        String S= Dir.toString().concat("\\images\\"+level+"\\"+ID+".jpg");
        ImageIcon myimage= new ImageIcon(S);
        Image img= myimage.getImage();
        Image newImage= img.getScaledInstance(X, Y, Image.SCALE_SMOOTH);
        ImageIcon image= new ImageIcon(newImage);
        return image;
    }
}
