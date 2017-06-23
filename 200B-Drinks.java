

import java.text.DecimalFormat;
import java.util.Scanner;

public class Drinks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double sum = 0;
		for(int i = 0; i < n; i++) {
			double temp = scanner.nextInt();
			temp /= 100;
			sum += temp;
		}
		DecimalFormat decimalFormat = new DecimalFormat("0.000000000000");
		System.out.println(decimalFormat.format((sum / n) *100));
	}
}
