

import java.util.Scanner;

public class ILoveUsername {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n = scanner.nextInt();
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			min = max = scanner.nextInt();
			int count = 0;
			for(int i = 1; i < n; i++) {
				int temp = scanner.nextInt();
				if(temp < min) {
					min = temp;
					count++;
				}
				if(temp > max) {
					max = temp;
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
