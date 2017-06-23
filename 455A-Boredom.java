

import java.util.Scanner;

public class Boredom {

	static int N = 100010;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// while(scanner.hasNext()) {
			int n = scanner.nextInt();
			int[] a = new int[N];
			for(int i = 0; i < n; i++) {
				int temp = scanner.nextInt();
				a[temp]++;
			}
			long[] f = new long[N];
			f[0] = 0;
			for(int i = 1; i < N; i++) {
				f[i] = a[i] * (long)i;
				if(i - 2 >= 0) {
					f[i] += f[i-2];;
				} 
				if(f[i-1] > f[i]) {
					f[i] = f[i-1];
				}
			}
			System.out.println(f[N-1]);
			
		// }
	}
}
