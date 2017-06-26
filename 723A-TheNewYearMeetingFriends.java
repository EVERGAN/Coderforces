

import java.util.Arrays;
import java.util.Scanner;

public class TheNewYearMeetingFriends {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[3];
		while(scanner.hasNext()) {
			for(int i = 0; i < 3; i++) {
				a[i] = scanner.nextInt();
			}
			Arrays.sort(a);
			System.out.println(a[1] - a[0] + a[2] - a[1]);
		}
	}
}
