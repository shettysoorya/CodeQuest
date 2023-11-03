import java.util.*;
import java.lang.*;
import java.io.*;

public class teaProb
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0){
		    int X, Y, Z;
		    X = sc.nextInt();
		    Y = sc.nextInt();
		    Z = sc.nextInt();
		    if(X > Y){
		        if(X%Y == 0)
		            System.out.println((X/Y)*Z);
		        else
		            System.out.println((X/Y+1)*Z);
		    }
		    else
		        System.out.println(Z);
		}
	}
}
