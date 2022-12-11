package blatt2;

import java.util.Scanner;

public class agb5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie eine Jahreszahl ein");
		int jahreszahl = scanner.nextInt();
		
		if(((jahreszahl%4==0)&& !(jahreszahl%100==0)) || ((jahreszahl%4==0)&&(jahreszahl%100==0)&&(jahreszahl%400==0))) {
			System.out.println("Es ist ein Schaltjahr");
		}
		else {
			System.out.println("Es ist kein Schaltjahr");
		}
		scanner.close();
	}
}
