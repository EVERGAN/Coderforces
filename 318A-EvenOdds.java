

import java.util.Scanner;

public class EvenOdds {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Long n = scanner.nextLong();
		Long k = scanner.nextLong();
		Long number = (long) 0;
		if(n % 2 == 0) {
			if(k > n/2) {
				k -= n/2;
				number = 2 * k;
			} else {
				number = 2 * k -1;
			}
		}  else {
			if(k > n/2 + 1) {
				k -= (n/2 + 1);
				number = 2 * k;
			} else {
				number = 2 * k -1;
			}
		}
		System.out.println(number);
	}
}
