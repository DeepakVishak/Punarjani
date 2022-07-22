//Main package
package Class_Files;

//Function class
public class Encrypt {
    public String setMobile(String text){
        String star= "*";
    	StringBuilder B= new StringBuilder(text);
        int ST= 0;
        int ED= text.length()-4;
        for(int i=1;i<text.length()-2;i++) {
            star= star.concat("*");
        }
        B.replace(ST, ED, star);
        String FText= new String(B);        
        return FText; 
    }
    public String setEmail(String text){
        String star= "*";
    	StringBuilder B= new StringBuilder(text);
        String email = text;
        String[] SEmail = email.split("[@]");
        int ST= 2;
        int ED= SEmail[0].length();
        for(int i=1;i<text.length()-2;i++) {
            star= star.concat("*");
        }
        B.replace(ST, ED, star);
        String FText= new String(B);        
        return FText; 
    }   
}