

import java.util.Scanner;

public class Spreadsheets {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i = 0; i < n; i++) {
			String string = scanner.next();
			char[] ch = string.toCharArray();
			int m = ch.length;
			boolean flag = true;
			if(ch[0] == 'R' && ch[1] - '0' >=1 && ch[1] - '0' <= 9) {
				for(int j = 2; j < m; j++) {
					if(ch[j] == 'C') {
						flag = false;
					}
				}
				if(!flag) {
					module1(string);
				} else {
					module2(string);
				}
			} else {
				module2(string);
			}
			
		}
	}
	public static void module1(String ch) {
		//检索c的位置
		int index = ch.indexOf('C');
		String left = ch.substring(1, index);
		String right = ch.substring(index+1);
		int k = Integer.valueOf(right);
//		System.out.println(k);
		change(k);
		System.out.println(str+left);
		str = "";
		
	}
	public static void module2(String ch) {
		int i = 0;
		for(i =0 ; i < ch.length(); i++) {
			if(ch.charAt(i) - '0' >=1 && ch.charAt(i) - '0' <= 9) {
				break;
			}
		}
		String left = ch.substring(0, i);
		String right = ch.substring(i);
		String ss = "R" + right + "C";
		int l = left.length();
		char[] cc = left.toCharArray();
		int sum = 0;
		for(int p = 0 ; p < l; p++) {
			int k = cc[p] - 'A' + 1;
			int temp = 1;
			for(int m = 0; m < l-p-1; m++) {
				temp *= 26;
			}
			sum += k * temp;
		}
		System.out.println(ss + String.valueOf(sum));
	}
	static String str = "";
	public static void change(int k) {
		if(k <= 26) {
			str = (char)('A' + k -1) + str ;
			return ;
		} 
		if(k % 26 == 0) {
			str = 'Z'+ str ;
			k = k /26 - 1;
		} else {
			str =(char)('A' + (k % 26) - 1) + str;
//			System.out.println(str);
			k = k / 26;
		}
		change(k);
	}
}
