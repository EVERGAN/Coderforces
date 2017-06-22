

import java.util.Scanner;

public class XeniaAndRingroad {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int start = 1;
		long count = 0;
		for(int i = 0 ; i < m; i++) {
			int temp = scanner.nextInt();
			if(temp >= start) {
				count += temp - start;
				start = temp;
			} else {
				count += (temp - 1) + (n - start + 1);
				start = temp;
			}
		}
		System.out.println(count);
	}
}
