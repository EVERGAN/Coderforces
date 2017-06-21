

import java.util.Scanner;

public class Games {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			b[i] = scanner.nextInt();
		}
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i != j && a[i] == b[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
