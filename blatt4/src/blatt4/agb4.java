package blatt4;

import java.util.Scanner;

public class agb4 {

	public static void main(String[] args) {
		System.out.println("Von welcher zahl wollen Sie die Quersumme wissen?");
		Scanner scanner = new Scanner(System.in);
		int zah = scanner.nextInt();
		String zahl = new String("" + zah);
		scanner.close();
		int[] ar = new int[zahl.length()];
		for(int i = 0; i<zahl.length(); i++) {
			ar[i] = Character.getNumericValue(zahl.charAt(i));
		}
		int ergebnis = 0;
		for(int i : ar) {
			ergebnis+=i;
		}
		System.out.println(ergebnis);
	}
}
