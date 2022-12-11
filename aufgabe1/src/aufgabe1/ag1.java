package aufgabe1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ag1 {
	private static float getPrice() {
		float ret;
		System.out.print("Bitte Netto-Betrag in Euro und Cent als Kommazahl eingeben:  ");
		Scanner scanner = new Scanner(System.in);
		try {
			ret = scanner.nextFloat();
		} catch (InputMismatchException e) {
			System.out.println("Bitte nur Kommazahlen eingeben");
			return Float.NaN;
		} finally {
			scanner.close();
		}
		return ret;
	}
	
	public static void main(String[] args) {
		
		float price = getPrice(); 
		System.out.println("Der eingegebene Wert ist: " + price);
		float szp =Float.valueOf(Double.toString(Math.round((price+price*0.19) * 100.0) / 100.0));
		System.out.println(szp);
		float sp = Float.valueOf(Double.toString(Math.round((price+price*0.07) * 100.0) / 100.0));
		System.out.println(sp);
	}
}
