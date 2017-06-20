

import java.util.Scanner;
import java.util.regex.Pattern;

public class Dubstep {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String string2 = Pattern.compile("WUB").matcher(scanner.next()).replaceAll(" ");
		System.out.println(string2.trim());
	}
}
