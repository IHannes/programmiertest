package blatt2;

import java.util.Scanner;

public class agb6 {
	public static void main(String[] args) {
		
		System.out.println("Geben Sie den Tag ein(1 bis 31)");
		Scanner scanner = new Scanner(System.in);
		int tag = scanner.nextInt();
		System.out.println("Geben Sie folgende Zahlen für den Monat ein: \n"
				+ "1 für März bis 12 für Februar");
		int monat = scanner.nextInt();
		System.out.println("Geben Sie die letzten beiden Stellen der Jahreszahl an, fuer Januar und Februar diejenigen des vorjahres");
		int y = scanner.nextInt();
		System.out.println("Geben Sie die beiden ersten Stellen der Jahreszahl ein");
		int c = scanner.nextInt();
		int w =(int) Math.abs((tag+(2.6*monat-0.2)+y+y/4+c/4-2*c)%7);
		String[] wochentage = {"Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"};
		System.out.println(wochentage[w]);
		scanner.close();
	}
}