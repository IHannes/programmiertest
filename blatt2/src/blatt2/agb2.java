package blatt2;

public class agb2 {
	static int a = 4, b = 0, c = 0, d = 0;
	static float f1 = 0.0f;
	public static void main(String[] args) {
		teilaufgabeE();
	}
	static void teilaufgabeA() {
		a = b = c = 4*a;
		System.out.println("Erebnis der Teilaufgabe a:" + b);
	}
	
	static void teilaufgabeB() {
		a = 4;
		b = c = a+a+a+a;
		System.out.println("Ergebnis der Teilaufgabe b:" + b);
	}
	
	static void teilaufgabeC() {
		if(a%2==0) {
			b = 2*a;
		}
		else {
			b=4*a;
		}
		System.out.println("Ergebnis der Teilaufgabe c:" + b);
	}
	static void teilaufgabeD() {
		if(d>=1 && a+1==5) {
			System.out.println("Ergebnis der Teilaufgabe D: wahr");
		}
	}
	static void teilaufgabeE() {
		if(d!=0 && a+1==5) {
			System.out.println("Ergebnis der Teilaufgabe E: wahr");
		}
		else {
			System.out.println("Ergebnis der Teilaufgabe E: falsch");
		}
		a = (a+1)%5;
	}
	static void teilaufgabeF() {
		if(a%10==0 && b%10==0) {
		f1=(float) a/3;
		}
		else {
		f1=10*a;
		}
	}
}
