

import java.util.Scanner;

public class Elephant {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		while(n > 0) {
			for(int i = 5; i >0; i--) {
				if(n >= i) {
					n -=i;
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}
