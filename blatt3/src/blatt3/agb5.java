package blatt3;

import java.util.Scanner;

public class agb5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte gewünschten Ausgabebetrag auf 5 Euro genau angeben:");
		int betrag = scanner.nextInt();
		scanner.close();
		int fuenfhundert = 0;
		int zweihundert = 0;
		int hundert = 0;
		int fuenfzig = 0;
		int zwanzig = 0;
		int zehn = 0;
		int fuenf = 0;
		while(betrag>=500) {
			betrag-=500;
			fuenfhundert++;
		}
		while(betrag>=200) {
			betrag-=200;
			zweihundert++;
		}
		while(betrag>=100) {
			betrag-=100;
			hundert++;
		}
		while(betrag>=50) {
			betrag-=50;
			fuenfzig++;
		}
		while(betrag>=20) {
			betrag-=20;
			zwanzig++;
		}
		while(betrag>=10) {
			betrag-=10;
			zehn++;
		}
		while(betrag>=5) {
			betrag-=5;
			fuenf++;
		}
		System.out.println("500-Euro Scheine:" +  fuenfhundert + "\n200-Euro Scheine: " + zweihundert + "\n100-Euro Scheine: " + hundert + "\n50-Euro Scheine: " + fuenfzig + "\n20-Euro Scheine: " + zwanzig + "\n10-Euro Scheine: " + zehn + "\n5-Euro Scheine: " + fuenf);
	}
}
