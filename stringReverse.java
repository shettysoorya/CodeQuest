import java.util.*;

public class stringReverse
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    String str = sc.next();
		char ch[] = str.toCharArray();
        char temp[] = new char[str.length()];
        int strSize = str.length();
        for(int i=0,j=strSize-1; i<strSize; i++,j--){
            temp[j] = ch[i];
        }
        String rtn = new String(temp);
        System.out.println(rtn);
	}
}
