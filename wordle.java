/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class wordle
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    String s, T, m = "";
		    s = sc.next();
		    T = sc.next();
		    for(int i = 0; i < s.length(); i++){
		        if(s.charAt(i) == T.charAt(i))
		            m = m + "G";
		        else 
		            m = m + "B";
		    }
		    System.out.println(m);
		}
	}
}
