

import java.util.Scanner;

public class FoxAndSnake {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		String[][] strings = new String[n+1][m+1];
		for(int i = 1; i <=m; i++) {
			strings[1][i] = "#";
		}
			for(int i =2 ; i <= n; i++) {
				if(i % 2 == 0) {
					int k = i / 2;
					if(k % 2 != 0) {
						
						strings[i][m] = "#";
						strings[i][1] = ".";
					} else {
						strings[i][1] = "#";
						strings[i][m] = ".";
					}
				} else {
					strings[i][1] = "#";
					strings[i][m] = "#";
				}
				
				for(int j = 2; j < m; j++) {
					if(i % 2 == 0) {
						strings[i][j] = ".";
					} else {
						strings[i][j] = "#";
					}
				}
			}
		for(int i = 1; i <=n; i++) {
			for(int j = 1; j <= m; j++) {
				System.out.print(strings[i][j]);
			}
			System.out.println();
		}
	}
}
