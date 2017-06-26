

import java.util.Scanner;

public class BusToUdayland {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] strings = new String[n];
		for(int i = 0; i < n; i++) {
			strings[i] = scanner.next();
		}
		
		boolean flag = true;
		for(int i = 0; i < n; i++) {
			char[] ch= strings[i].toCharArray();
			if(ch[0] == 'O' && ch[1] == 'O') {
				ch[0] = '+';
				ch[1] = '+';
				strings[i] = String.valueOf(ch);
				flag = false;
				break;
			} else if(ch[3] == 'O' && ch[4] == 'O') {
				ch[3] = '+';
				ch[4] = '+';
				strings[i] = String.valueOf(ch);
				flag = false;
				break;
			}
		}
		if(!flag) {
			System.out.println("YES");
			for(int i = 0; i < n; i++) {
				System.out.println(strings[i]);
			}
		} else {
			System.out.println("NO");
		}
	}
}
