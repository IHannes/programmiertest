package blatt2;

import java.util.Scanner;


public class agb3 {
	public static void main(String[] args) {
		int kalB = kalorienbedarf();
		System.out.println(kalB);
	}
	
	static int kalorienbedarf() {
		System.out.println("Geben Sie ihr Gewicht ein");
		Scanner scanner = new Scanner(System.in);
		int gewicht = scanner.nextInt();
		System.out.println("Gewicht: " + gewicht);
		System.out.println("Geben Sie ihre Größe ein");
		int groesse = scanner.nextInt();
		System.out.println("Größe: " + groesse);
		System.out.println("Geben Sie ihr Alter ein");
		int alter = scanner.nextInt();
		System.out.println("alter: " + alter);
		//System.out.println("Geben Sie ihren AktivitätsfaktSystem.out.println(\"Gewicht:\" + or ein");
		//float aktivitaetsfaktor = scanner.nextFloat();
		//System.out.println("aktivitätsfaktor: " + aktivitaetsfaktor);
		
		System.out.println("Geben Sie ihren Beruf ein");
		String beruf = scanner.next();
		float aktivitaetsfaktor = 0;
		switch(beruf) {
		case "Büroangestellte" : aktivitaetsfaktor = 1.45f; break;
		case "Laborant", "Kraftfahrer" : aktivitaetsfaktor = 1.6f; break;
		case "Fließbandarbeiter" : aktivitaetsfaktor = 1.65f; break;
		case "Pflegepersonal", "Kellner", "Mechaniker", "Handwerker" : aktivitaetsfaktor=1.8f; break;
		case "Bauarbeiter", "Landwirte", "Waldarbeiter", "Bergarbeiter2" : aktivitaetsfaktor=2.0f; break;
		case "Leistungssportler" : aktivitaetsfaktor = 2.4f; break;
		}
		
		System.out.println("Geben Sie \"false\" für Frau und \"true\" für Mann ein");
		boolean geschlecht =(boolean) scanner.nextBoolean();
		System.out.println("geschlecht: " + geschlecht);
		scanner.close();
		if(geschlecht) {
			return (int) ((int) aktivitaetsfaktor*(10*gewicht+6.25*groesse+5*alter+5));
		}
		else {
			return (int) ((int)aktivitaetsfaktor*(10*gewicht+6.25*groesse+5*alter-161));
		}	
	}
}
