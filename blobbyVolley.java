/* package codechef; // don't place package name! */

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
		    int n, ali = 0, bob = 0;
		    String s;
		    char server = 'A';
		    n = sc.nextInt();
		    s = sc.next();
		    for(int i = 0; i < n; i++) {
		        if(server == 'A'){
		            if(s.charAt(i) == 'A')
		                ali++;
		            else
		                server = 'B';
		        }
		        else{
		           if(s.charAt(i) == 'B')
		               bob++;
		           else
		               server = 'A';
		            
		        }
		    }
		    System.out.println(ali+" "+bob);
		}
	}
}
