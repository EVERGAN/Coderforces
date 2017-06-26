

import java.util.Scanner;

public class Buttons {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n = scanner.nextInt();
			int sum = 0;
			int count = 0;
			for(int i = n; i >= 1; i--) {
					sum += (i -1) * (count + 1) + 1;
					count++;
			}
			System.out.println(sum);
		}
		
	}
}
