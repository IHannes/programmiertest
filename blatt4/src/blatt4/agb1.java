package blatt4;

import java.util.Scanner;

public class agb1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie eine Zahl ein, von der Sie die Fakultät wissen wollen");
		int zahl = scanner.nextInt();
		System.out.println(whileschleife(zahl));
		System.out.println(dowhileschleife(zahl));
		System.out.println(forschleife(zahl));
		scanner.close();
	}
	static int whileschleife(int zahl) {
		int ergebnis = 1;
		if(zahl!=0) {
		while(zahl>0) {
			ergebnis*=zahl;
			zahl--;
		}
		return ergebnis;
		}
		else return 1;
	}
	static int dowhileschleife(int zahl) {
		if(zahl!=0) {
		int ergebnis = 1;
		do {
			ergebnis*=zahl;
			zahl--;
		}while(zahl>0);
		return ergebnis;}
		return 1;
	}
	static int forschleife(int zahl) {
		int ergebnis = 1;
		if(zahl!=0) {
		for(int i = zahl; i>0; i--) {
			ergebnis*=i;
		}
		return ergebnis;
		}
		else return 1;
	}
}
