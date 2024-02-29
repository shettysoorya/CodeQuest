import java.util.Scanner;

public class SearchInsert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();

        int result = searchInsert(nums, target);
        System.out.println("Output: " + result);
    }

    public static int searchInsert(int[] nums, int target) {
        int out = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i])
                out = i;
            else if (target > nums[i])
                out = i + 1;
        }
        return out;
    }
}
