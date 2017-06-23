

import java.util.Scanner;

public class Hulk {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n = scanner.nextInt();
			String string1 = "I hate that ";
			String string2 = "I love that ";
			StringBuilder stringBuilder = new StringBuilder();
			for(int i = 1; i <= n; i++) {
				if(i % 2 == 0) {
					stringBuilder.append(string2);
				} else {
					stringBuilder.append(string1);
				}
			}
			stringBuilder.delete(stringBuilder.length()-5, stringBuilder.length());
			stringBuilder.append("it");
			System.out.println(stringBuilder.toString());
			
		}
	}
}
