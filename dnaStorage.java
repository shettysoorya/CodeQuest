import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n;
		    String s, ans = "";
		    n = sc.nextInt();
		    s = sc.next();
		    for(int i = 0; i < n-1; i+=2) {
		        if(s.charAt(i) == '0' && s.charAt(i+1) == '0')
		            ans = ans + 'A';
		        if(s.charAt(i) == '0' && s.charAt(i+1) == '1')
		            ans = ans + 'T';
		        if(s.charAt(i) == '1' && s.charAt(i+1) == '0')
		            ans = ans + 'C';
		        if(s.charAt(i) == '1' && s.charAt(i+1) == '1')
		            ans = ans + 'G';
		    
		    }
		    System.out.println(ans);
	    }
	}
}
