import java.io.*;
import java.util.Scanner;
 
public class RevString {
    public static void main (String[] args) {
       
        Scanner sc = new Scanner(System.in);
        String str, nstr="";
        char ch;
        str = sc.next();
        
        for (int i=0; i<str.length(); i++)
        {
            ch = str.charAt(i); 
            nstr = ch + nstr; 
        }
        System.out.println("Reversed Word: "+ nstr);
    }
}
