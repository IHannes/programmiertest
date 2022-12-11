package blatt2;

import java.util.Scanner;


public class agb4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Geben Sie drei Zahlen ein");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		int d = 0;
		if(a>b) {
			d = a;
			a = b;
			b = d;
		}
		if(b>c) {
			d=b;
			b=c;
			c=d;
		}
		if(a>b) {
			d = a;
			a = b;
			b = d;
		}
		System.out.format("a: %d, b: %d, c: %d", a, b, c);
	}
}
