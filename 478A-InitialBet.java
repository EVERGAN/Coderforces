

import java.util.Scanner;

public class InitialBet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int sum = 0;
			for(int i = 0; i < 5; i++) {
				sum += scanner.nextInt();
			}
			if(sum % 5 == 0) {
				System.out.println( sum / 5 > 0 ? sum / 5 : -1);
			} else {
				System.out.println(-1);
			}
		}
	}
}
