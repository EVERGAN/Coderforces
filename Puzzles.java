

import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] a = new int[m];
		for(int i = 0; i < m; i++) {
			a[i] = scanner.nextInt();
		}
		Arrays.sort(a);
		int least = a[m-1] - a[0];
		for(int i = 0; i <= m-n; i++) {
			if(a[i+n-1] - a[i] < least) least = a[i+n-1] - a[i];
		}
		System.out.println(least);
	}
}
