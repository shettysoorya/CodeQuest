import java.util.*;
import java.lang.*;
import java.io.*;

public class netflixSub
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
		  int T = 0, A, B, C, X;
		  T = sc.nextInt();
		  while(T-- > 0) {
  		    A = sc.nextInt();
  		    B = sc.nextInt();
  		    C = sc.nextInt();
  		    X = sc.nextInt();
  		    if( A+B >= X || B+C >= X || A+C >= X)
  		        System.out.println("YES");
  		    else
  		        System.out.println("NO");
		}
	}
}
