

import java.util.Scanner;

public class Word {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		int n = string.length();
		double count = 0;
		for(int i = 0; i < n; i++) {
			char temp = string.charAt(i);
			if(Character.isLowerCase(temp)) {
				count++;
			}
		}
		if(count >= (double)n / 2) {
			System.out.println(string.toLowerCase());
		} else {
			System.out.println(string.toUpperCase());
		}
	}
}
