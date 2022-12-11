package aufgabe1;

public class agb3c {
	public static void main(String[] args) {
		int hoursA = 14 , minutesA = 20 , secondsA = 33;
		int hoursB = 18 , minutesB = 31 , secondsB = 43;
		
		int a = hoursA*3600+minutesA*60+secondsA;
		int b = hoursB*3600+minutesB*60+secondsB;
		if(a>b) {
			System.out.format("Zwischen %d:%d:%d Uhr und %d:%d:%d Uhr sind %d Sekunden vergangen", hoursA,minutesA,secondsA,hoursB,minutesB,secondsB,a-b);
		}
		else {
			System.out.format("Zwischen %d:%d:%d Uhr und %d:%d:%d Uhr sind %d Sekunden vergangen", hoursA,minutesA,secondsA,hoursB,minutesB,secondsB,b-a);
		}
	}
}
