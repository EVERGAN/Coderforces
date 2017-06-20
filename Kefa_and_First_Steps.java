

import java.util.Scanner;



public class Kefa_and_First_Steps {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int max = 0;
		int start = 0;
		int end = 0;
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		for(int i = 1; i < n; i++) {
			if(a[i] >= a[i-1]) end++;
			else {
				int temp = end - start + 1;
				if(max < temp) max = temp;
				start = i;
				end = i;
			}
		}
		if(max < end - start + 1) max = end - start + 1;
		System.out.println(max);
	}
}
