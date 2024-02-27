import java.util.Scanner;

public class PalindromeFinder {
    public static void main(String[] args) {
        // Taking input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of words: ");
        int n = scanner.nextInt();
        
        String[] words = new String[n];
        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            words[i] = scanner.next();
        }
        
        // Creating an instance of the Solution class
        Solution solution = new Solution();
        
        // Finding the first palindromic string
        String result = solution.firstPalindrome(words);
        
        // Displaying the result
        System.out.println("The first palindromic string is: " + result);
    }
}

class Solution {
    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            if (sb.reverse().toString().equals(words[i])) {
                return words[i];
            }
        }
        return "";
    }
}
