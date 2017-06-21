

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AntonAndLetters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] ch = scanner.nextLine().toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for(Character character : ch) {
			if (character != '{' && character != '}' && character != ',' && character != ' ') {
				map.put(character, 1);
			}
		}
		System.out.println(map.size());
	}
}
