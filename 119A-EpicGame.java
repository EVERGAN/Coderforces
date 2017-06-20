

import java.util.Scanner;

public class EpicGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int n = scanner.nextInt();
		int count = 0;
		while(true) {
			int temp = gcd(a, n);
			if(temp > n) {
				break;
			} else {
				count++;
				n -= temp;
			}
			
			temp = gcd(b, n);
			if(temp > n) {
				break;
			} else {
				count++;
				n -= temp;
			}
		}
		if(count % 2 == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
	public static int gcd(int a,int b) {
		while(b > 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}
