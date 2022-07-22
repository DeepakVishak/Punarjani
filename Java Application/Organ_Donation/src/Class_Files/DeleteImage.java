//Main package
package Class_Files;

//Imported class files
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

//Function class
public class DeleteImage {
    public void ImageDelete(String level,int ID){
        File F= new File(System.getProperty("java.class.path"));
        File Dir= F.getAbsoluteFile().getParentFile();
        String S= Dir.toString().concat("\\images\\"+level+"\\"+ID+".jpg");
        Path P= Paths.get(S);
        File temp= new File(S);
        if(temp.exists())
            temp.delete();
    }
}