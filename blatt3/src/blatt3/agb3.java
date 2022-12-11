package blatt3;

import static de.hsa.prog.tools.Input.*;

import java.util.Scanner;

public class agb3 {
	public static void main(String[] args) {
		String eingabe = readWord("Geben Sie ein, welche geographische Form Sie berechnen wollen");
		switch(eingabe) {
		case "Kreis" : kreisberechnung();
		case "Rechteck" : rechteckberechnung();
		case "Quadrat" : quadratberechnung();
		case "Dreieck" : dreieckberechnung();
		}
	}
	static void kreisberechnung() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie den Radius des Kreises an");
		int radius = scanner.nextInt();
		double erg = (2*Math.PI*radius);
		double ergebnis = java.lang.Math.round((erg)*100)/100.0;
		System.out.println("Der Flächeninhalt des Kreises ist: " + ergebnis);
		scanner.close();
	}
	static void rechteckberechnung() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie eine Seitenlänge des Rechtecks an");
		int seite1 = scanner.nextInt();
		System.out.println("Geben Sie die andere Seitenlänge des Rechtecks an");
		int seite2 = scanner.nextInt();
		double ergebnis = Math.round(seite1*seite2*100)/100;
		System.out.print("Das ergebnis ist: "+ ergebnis);
		scanner.close();
	}
	static void quadratberechnung() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie die Seitenlänge des Quadrats ein");
		int seitenlaenge = scanner.nextInt();
		int ergebnis= seitenlaenge*seitenlaenge;
		System.out.println("Das ergebnis ist: " + ergebnis);
		scanner.close();
	}
	static void dreieckberechnung() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie die Länge des Dreiecks ein");
		int laenge = scanner.nextInt();
		System.out.println(laenge);
		System.out.println("Geben Sie die Höhe des Dreiecks ein");
		int hoehe = scanner.nextInt();
		System.out.println(hoehe);
		double ergebnis =(double) 0.5*laenge*hoehe;
		System.out.println(ergebnis);
		scanner.close();
	}
}
