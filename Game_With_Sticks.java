

import java.util.Scanner;

public class Game_With_Sticks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		//奇数次Akshat赢，偶数次Malvika
		int temp = Math.min(n, m);
		if(temp % 2== 0) {
			System.out.println("Malvika");
		} else {
			System.out.println("Akshat");
		}
	}
}
