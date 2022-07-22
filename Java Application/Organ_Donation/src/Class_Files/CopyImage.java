//Main package
package Class_Files;

//Imported class files
import java.io.File;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

//Function class
public class CopyImage {
    public void Copy(String level, int ID){
        File F= new File(System.getProperty("java.class.path"));
        File Dir= F.getAbsoluteFile().getParentFile();
        String D= Dir.toString().concat("\\images\\"+level+"\\"+ID+".jpg");
        String S= Dir.toString().concat("\\images\\"+level+"\\01.jpg");
        Path DPath= Paths.get(D);
        Path SPath= Paths.get(S);
        File temp= new File(D);
        if(!(temp.exists())){
            switch(level){
                case "admin":
                    try{
                        Files.copy(SPath, DPath);
                    }
                    catch(IOException e){}
                    break;
                case "org":
                    try{
                        Files.copy(SPath, DPath);
                    }
                    catch(IOException e){}
                    break;
                case "member":
                    try{
                        Files.copy(SPath, DPath);
                    }
                    catch(IOException e){}
                    break;
                case "volunteer":
                    try{
                        Files.copy(SPath, DPath);
                    }
                    catch(IOException e){}
                    break;  
                default:    
            }
        }
    }
}