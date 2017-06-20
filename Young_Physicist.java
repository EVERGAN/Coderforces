

import java.util.Scanner;


public class Young_Physicist {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Nodes[] Nodess = new Nodes[n];
		for(int i = 0; i < n; i++) {
			Nodess[i] = new Nodes(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
		}
		int x = 0;
		int y = 0;
		int z = 0;
		for(int i = 0; i < n; i++) {
			x += Nodess[i].getX();
			y += Nodess[i].getY();
			z += Nodess[i].getZ();
		}
		if(x == 0 && y == 0 && z == 0) System.out.println("YES");
		else System.out.println("NO");
	}
}
class Nodes {
	private int x;
	private int y;
	private int z;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public Nodes(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
}