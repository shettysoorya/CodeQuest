import java.util.*;

public class digitSum {
	public static void main(String[] args) {
	    int n = 0, sum = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while(n != 0) {
		    sum = sum + n % 10;
		    n = n / 10;
		}
		System.out.println(sum);
	}
}
