

import java.util.Scanner;

public class VanyaAndCubes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		for(int i =1; ; i++) {
			int level = add(i);
			if(n >= level) {
				count++;
				n -= level;
			} else {
				break;
			}
		}
		System.out.println(count);
	}
	
	public static int add(int k) {
		int sum = 0;
		for(int i = 1; i <=k ;i++) {
			sum += i;
		}
		return sum;
	}
}
