

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class I_Wanna_Be_the_Guy {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		
		int p = scanner.nextInt();
		for(int i = 0; i < p; i++) {
			map.put(scanner.nextInt(), 1);
		}
		
		int q = scanner.nextInt();
		for(int i = 0; i< q; i++) {
			map.put(scanner.nextInt(), 1);
		}
		int size = map.size();
		if(size >= n) {
			System.out.println("I become the guy.");
		} else {
			System.out.println("Oh, my keyboard!");
		}
	}
}
