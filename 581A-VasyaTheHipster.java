

import java.util.Scanner;

public class VasyaTheHipster {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if(a >= b) {
				System.out.println(b+" "+(a-b)/2);
			} else {
				System.out.println(a+" "+(b-a)/2);
			}
		}
	}
}
