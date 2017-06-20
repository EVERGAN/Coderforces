


import java.util.Scanner;

public class Double_Cola {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

        int r = 1;
        while (r * 5 < n)
        {
            n -= r * 5;
            r *= 2;
        }

    String names[] = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
    System.out.println(names[(n - 1) / r]);
	}
}
