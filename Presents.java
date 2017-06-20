

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Presents {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 1; i <= n; i++) {
			int temp = scanner.nextInt();
			map.put(temp, i);
		}
		for(int i = 1; i < n; i++) {
			int temp = map.get(i);
			System.out.print(temp+" ");
		}
		System.out.println(map.get(n));
	}
}
