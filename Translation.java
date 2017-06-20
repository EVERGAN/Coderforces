

import java.util.Scanner;

public class Translation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		StringBuilder stringBuilder = new StringBuilder(scanner.next());
		stringBuilder.reverse();
		if(stringBuilder.toString().equals(string)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
