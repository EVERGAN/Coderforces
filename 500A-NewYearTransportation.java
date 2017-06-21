

import java.util.Scanner;

public class NewYearTransportation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int t = scanner.nextInt();
		int[] a = new int[n];
		for(int i = 1; i < n; i++) {
			a[i] = i + scanner.nextInt();
		}
		int j = 1;
		while(j < n) {
			if(a[j] == t) {
				System.out.println("YES");
				return ;
			}
			j = a[j];
		}
		System.out.println("NO");
	}
}
