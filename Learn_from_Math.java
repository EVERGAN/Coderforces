

import java.util.Scanner;

public class Learn_from_Math {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i = 3; i < n; i++) {
			if(!isPrime(i) && !isPrime(n-i)) {
				System.out.println(i+" "+(n-i));
				break;
			}
		}
		
	}
	public static boolean isPrime(int k ) {
		for(int i = 2; i * i <= k; i++) {
			if(k % i == 0) return false;
		}
		return true;
	}
}
