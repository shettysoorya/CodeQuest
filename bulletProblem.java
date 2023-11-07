import java.util.*;
import java.lang.*;
import java.io.*;

public class bulletProblem
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int x, y, z, g;
		    x = sc.nextInt();
		    y = sc.nextInt();
		    z = sc.nextInt();
		    g = z - (y/x);
		    if(g > 0)
		        System.out.println(g);
		    else
		        System.out.println("0");
		}
	}
}
