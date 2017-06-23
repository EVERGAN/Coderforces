

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class VanyaAndLanterns {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int l = scanner.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		Arrays.sort(a);
		//求直径
		int r = Math.max(a[0], l- a[n-1]) * 2;
		for (int i = 0; i < n-1; i++) {
			r = Math.max(r, a[i+1] - a[i]);
		}
		DecimalFormat decimalFormat = new DecimalFormat("0.0000000000");
		System.out.println(decimalFormat.format(r / 2.0));
	}
}
