

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Dragons {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		int n = scanner.nextInt();
		TreeMap<Integer, Integer> map = new TreeMap<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		for(int i =0; i < n; i++) {
			int key = scanner.nextInt();
			int value = scanner.nextInt();
			map.put(key,map.getOrDefault(key, 0) + value);
		}
		for(Map.Entry<Integer, Integer> mm : map.entrySet()) {
			int key = mm.getKey();
			int value = mm.getValue();
			if(s > key) {
				s += value;
			} else {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
