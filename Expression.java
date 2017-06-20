

import java.util.Scanner;

public class Expression {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int a1 = a + b * c;
		int a2 = a * (b + c);
		int a3 = a * b * c;
		int a4 = (a + b) * c;
		int a5 = a + b + c;
		int max = a1;
		if(max < a2) max = a2;
		if(max < a3) max = a3;
		if(max < a4) max = a4;
		if(max < a5) max = a5;
		System.out.println(max);
	}
}
