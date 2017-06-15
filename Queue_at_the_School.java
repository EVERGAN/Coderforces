

import java.util.Scanner;

public class Queue_at_the_School {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int t = scanner.nextInt();
		char[] ch = scanner.next().toCharArray();
		boolean[] a = new boolean[ch.length];
		initial(a);
		//控制秒数
		for(int i = 0; i < t; i++) {
			//遍历一遍
			for(int j = 1; j < ch.length; j++) {
				if(ch[j] == 'G' && ch[j-1] == 'B' && a[j] && a[j-1]) {
					swap(ch, j, j-1);
					a[j] = false;
					a[j-1] = false;
				}
			}
			initial(a);
		}
		System.out.println(String.valueOf(ch));
	}
	public static void swap(char[] ch, int a, int b) {
		char temp = ch[a];
		ch[a] = ch[b];
		ch[b] = temp;
	}
	public static void initial(boolean[] a) {
		int n = a.length;
		for(int i = 0; i < n; i++ ) {
			a[i] = true;
		}
		
	}
}
