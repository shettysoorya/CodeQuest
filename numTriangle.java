import java.util.*; 
  
public class numTriangle { 
    public static void printPattern(int n) 
    { 
        int i, j; 
        
        for (i = 1; i <= n; i++) { 
            
            for (j = 1; j <= n - i; j++) { 
                System.out.print(" "); 
            } 
            
            for (j = 1; j <= i; j++) { 
                System.out.print(i + " "); 
            } 
            
            System.out.println(); 
        } 
    } 
  
    public static void main(String args[]) 
    { 
        int n = 0;
        Scanner sc = new Scanner(System.in);
        printPattern(n = sc.nextInt()); 
    } 
}
