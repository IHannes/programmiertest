package aufgabe1;

public class ag3b {
	public static void main(String[] args) {
	int x = 18101;
	int seconds = 18101%60;
	x-=seconds;
	int min = x/60;
	int minutes = min%60;
	int hours = (min-minutes)/60;
	if(hours >=10) {
		System.out.format("Aktuelle Uhrzeit: %d:0%d:0%d Uhr", hours, minutes, seconds);
		}
		else if(minutes>=10) {
		System.out.format("Aktuelle Uhrzeit: 0%d:%d:0%d Uhr", hours, minutes, seconds);
		}
		else if(seconds>=10) {
		System.out.format("Aktuelle Uhrzeit: 0%d:0%d:%d Uhr", hours, minutes, seconds);
		}
		else {
		System.out.format("Aktuelle Uhrzeit: 0%d:0%d:0%d Uhr", hours, minutes, seconds);
		}
	}
}
