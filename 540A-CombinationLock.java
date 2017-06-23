

import java.util.Scanner;

public class CombinationLock {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		char[] ch1 = scanner.next().toCharArray();
		char[] ch2 = scanner.next().toCharArray();
		int count = 0;
		for(int i = 0; i < n; i++) {
			int c1 = ch1[i] - '0';
			int c2 = ch2[i] - '0';
			if(c1 >= c2) {
				count += Math.min(9 - c1 + 1 + c2, c1 - c2);
			} else {
				count += Math.min(9 - c2 + 1 + c1, c2 - c1);
			}
		}
		System.out.println(count);
	}
}
