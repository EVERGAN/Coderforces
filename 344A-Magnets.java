

import java.util.Scanner;

public class Magnets {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int temp = scanner.nextInt();
		int count = 1;
		int left = temp / 10;
		int right = temp % 10;
		for(int i = 1; i < n; i++) {
			temp = scanner.nextInt();
			left = temp /10;
			if(left != right) {
				right = temp % 10;
				continue;
			} else {
				count++;
				right = temp % 10;
			}
		}
		System.out.println(count);
	}
}
