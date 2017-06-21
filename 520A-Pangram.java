

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String string = scanner.next();
		if(n < 26) {
			System.out.println("NO");
		} else {
			Map<Character, Integer> map = new HashMap<>();
			for(int i = 0; i < n; i++) {
				char ch = string.charAt(i);
				if(!map.isEmpty() && (map.containsKey(Character.toUpperCase(ch)) || map.containsKey(Character.toLowerCase(ch)))) continue;
				map.put(ch, 1);
			}
			if(map.size()>= 26) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
