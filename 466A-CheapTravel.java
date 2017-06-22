

import java.util.Scanner;

public class CheapTravel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int min =Integer.MAX_VALUE;
		int i = 0;
		for(i = 0; i <= n; i += m) {
			int temp = b * (i/m) + (n - i) * a;
			if(temp < min) {
				min = temp;
			}
		}
		int temp = 0;
		if(n % m == 0) {
			temp = n / m * b;
		} else {
			temp = (n / m + 1 ) * b;
		}
		if(temp < min) min = temp;
		System.out.println(min);
	}
}
