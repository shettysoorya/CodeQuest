import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        float X = sc.nextFloat();
        float Y = sc.nextFloat();
        if (X % 5 == 0 && X + 0.50 <= Y)
            System.out.println(String.format("%.2f",Y - X - 0.50));
        else
            System.out.println(String.format("%.2f",Y));
        
    }
}