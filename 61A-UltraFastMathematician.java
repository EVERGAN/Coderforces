

import java.util.Scanner;

public class UltraFastMathematician {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		String string2 = scanner.next();
		StringBuilder stringBuilder = new StringBuilder();
		for(int i = 0; i < string.length(); i++) {
			if(string.charAt(i) == string2.charAt(i)) {
				stringBuilder.append(0);
			} else {
				stringBuilder.append(1);
			}
		}
		System.out.println(stringBuilder.toString());
	}
}
