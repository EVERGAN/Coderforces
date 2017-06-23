

import java.math.BigInteger;
import java.util.Scanner;

public class OlesyaAndRodion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//字符串转化为大数
		BigInteger k = new BigInteger(1+"");
		//设置为0
		BigInteger r = new BigInteger(0+"");
		
		BigInteger p = new BigInteger(10+"");
		
		int n = scanner.nextInt();
		int t = scanner.nextInt();
		
		if(n == 1 && t== 10) {
			System.out.println(-1);
		} else {
			n--;
			//求p的幂，p初始是10
			p = p.pow(n);
			for(int i = 1;; i++) {
				//求余，并和0比较
				if(p.mod(BigInteger.valueOf(t)).compareTo(r) == 0) {
					System.out.println(p);
					break;
				}
				//p+1
				p = p.add(k);
			}
		}
	}
}
