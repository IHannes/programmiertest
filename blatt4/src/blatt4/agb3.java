package blatt4;

import java.util.Scanner;

public class agb3 {
	public static void main(String[] args) {
		System.out.println("Wie hoch soll der Weihnachtsbaum sein?");
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		scanner.close();
		int c = h;
		int anzahl = 1;
		for(int i = 0; i<h; i++) {
			for(int a = 0; a<c-1; a++) {
				System.out.print(" ");
			}
			for(int b = 0; b<anzahl; b++) {
				System.out.print("*");
			}
			for(int a = 0; a<c-1; a++) {
				System.out.print(" ");
			}
			anzahl+=2;
			c--;
			System.out.print("\n");
		}
		for(int i = 0; i<=h/2+h/4; i++) {
			System.out.print(" ");
		}
		System.out.print("#");
	}
}
