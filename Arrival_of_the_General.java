

import java.util.Scanner;

public class Arrival_of_the_General {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int maxValue = Integer.MIN_VALUE;
		int minValue = Integer.MAX_VALUE;
		int max = 0;
		int min = 0;
		for(int i = 0; i < n; i++) {
			int temp = scanner.nextInt();
			if(temp <= minValue) {
				min = i;
				minValue = temp;
			}
			if(temp > maxValue) {
				max = i;
				maxValue = temp;
			}
		}
		//判断最大值和最小值的相对位置
		int count = 0;
		if(max > min) {
			count = (n-1) - min + (max - 1);
		} else if(max < min){
			count = (n-1) - min + (max);
		} else {
			count = 0;
		}
		System.out.println(count);
	}
}
