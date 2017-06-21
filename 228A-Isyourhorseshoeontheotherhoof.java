

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Isyourhorseshoeontheotherhoof {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < 4; i++) {
			map.put(scanner.nextInt(), 1);
		}
		System.out.println(4-map.size());
	}
}
