

import java.util.Scanner;

public class Beautiful_Year {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int y = scanner.nextInt();
		while(true) {
			int temp = ++y;
			if(check(temp)) {
				System.out.println(temp);
				break;
			}
		}
	}
	
	public static boolean check(int y ) {
		int[] a = new int[4];
		int i = 0;
		while(y > 0) {
			a[i++] = y % 10;
			y = y /10;
		}
		for(int k = 0; k < i; k++) {
			for(int p = k+1; p < i; p++) {
				if(a[k] == a[p]) {
					return false;
				}
			}
		}
		return true;
	}
}
