

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AmusingJoke {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.next();
		String str2 = scanner.next();
		String string = scanner.next();
		if(str1.length() + str2.length() == string.length()) {
			str1 = str1 + str2;
			char[] ch = str1.toCharArray();
			int n = ch.length;
			Map<Character, Integer> map = new HashMap<>();
			for(int i = 0; i < n; i++) {
				char temp = string.charAt(i);
				map.put(temp, map.getOrDefault(temp, 0)+1);
			}
			boolean flag = true;
			for(int i = 0; i < n; i++) {
				if(map.containsKey(ch[i]) && map.get(ch[i]) > 0) {
					map.put(ch[i], map.getOrDefault(ch[i], 0)-1);
				} else {
					flag = false;
				}
			}
			if(flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} else {
			System.out.println("NO");
		}
	}
}
