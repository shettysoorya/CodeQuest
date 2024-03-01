import java.util.Scanner;

public class PlusOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of digits in the array: ");
        int n = scanner.nextInt();

        int[] digits = new int[n];
        System.out.println("Enter the digits in the array (from most significant to least significant):");
        for (int i = 0; i < n; i++) {
            digits[i] = scanner.nextInt();
        }

        int carry = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            int currentSum = digits[i] + carry;
            digits[i] = currentSum % 10;
            carry = currentSum / 10;
        }

        if (carry > 0) {
            int[] result = new int[digits.length + 1];
            result[0] = carry;
            System.arraycopy(digits, 0, result, 1, digits.length);
            digits = result;
        }

        System.out.print("Result after incrementing by one: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }

        scanner.close();
    }
}
