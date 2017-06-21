


import java.util.Scanner;

public class IQtest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		int evenIndex = 0;
		int oddIndex = 0;
        //奇数较多，就输出偶数的位置，偶数较多就输出奇数的位置
		for(int i =1 ;i <= n;i++) {
			int temp = scanner.nextInt();
			if(temp % 2 == 0) {
				count++;
				evenIndex = i;
			} else {
				count--;
				oddIndex = i;
			}
		}
		System.out.println(count > 0 ? oddIndex : evenIndex);
	}
}
