import java.util.Scanner;

public class stringProb {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int index = sc.nextInt();
        char ch = getCharFromString(str, index);
        System.out.println("Character from " + str + " at index " + index + " is " + ch);
    }

    public static char getCharFromString(String str, int index) {
        return str.charAt(index);
    }
}
