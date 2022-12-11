package blatt3;

import java.util.Scanner;

public class agb4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dieses Programm lößt quadratische Gleichungen: \n"
				+ "geben Sie erst die Quadratische zahl ax²\n dann die zahl x\n und dann die Zahl ohne x ein");
	
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	int c = scanner.nextInt();
	scanner.close();
	if(4*a*c>b*b) {
		System.out.println("Gleichung hat keine reelen Lösungen");
	}
	else {
	double x1 =(double) (-b + Math.sqrt(b*b-4*a*c)/2*a);
	double x2 =(double) (-b - Math.sqrt(b*b-4*a*c)/2*a);
	System.out.println("a = " + a + "b = " + b + "c = " + c + "-> " + a + "*x²+" + b + "*x + " + c + "=0");
	System.out.println("X1: " + x1 + "  X2: " + x2);
	}
	}
}
