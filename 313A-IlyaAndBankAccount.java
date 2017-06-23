

import java.util.Scanner;

public class IlyaAndBankAccount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n = scanner.nextInt();
			if(n >= 0) {
				System.out.println(n);
			} else {
				n = Math.abs(n);
				int temp = n % 10;
				int tempValue = n / 10 % 10;
				n /= 100;
				if(temp <= tempValue) {
					n = n * 10 + temp;
				} else {
					n = n * 10 + tempValue;
				}
				System.out.println(-n);
			}
		}
	}
}
