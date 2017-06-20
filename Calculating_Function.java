

import java.util.Scanner;

public class Calculating_Function {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		if(n % 2 == 0) {
			System.out.println(n / 2);
		} else {
			System.out.println(-(Math.abs(n)+1)/2);
		}
	}
}
