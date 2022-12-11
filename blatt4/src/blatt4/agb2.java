package blatt4;

public class agb2 {
	public static void main(String[] args) {
		long ergebnis = 1;
		while(fak(ergebnis)<=Integer.MAX_VALUE) {
			ergebnis++;
		}
		System.out.println(ergebnis);
		System.out.println(Integer.MAX_VALUE);
	}
	static long fak(long zahl) {
		long ergebnis = 1;
		if(zahl!=0) {
		for(long i = zahl; i>0; i--) {
			ergebnis*=i;
		}
		return ergebnis;
		}
		else return 1;
	}
}
