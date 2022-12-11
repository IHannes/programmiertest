package aufgabe1;

public class ag3 {

	public static void main(String[] args) {
		int hours=1, minutes=2, seconds=3;
		if(hours >=10) {
		System.out.format("Aktuelle Uhrzeit: %d:0%d:0%d Uhr", hours, minutes, seconds);
		}
		else if(minutes>=10) {
		System.out.format("Aktuelle Uhrzeit: 0%d:%d:0%d Uhr", hours, minutes, seconds);
		}
		else if(seconds>=10) {
		System.out.format("Aktuelle Uhrzeit: 0%d:%d:%d Uhr", hours, minutes, seconds);
		}
		else {
		System.out.format("Aktuelle Uhrzeit: 0%d:0%d:0%d Uhr", hours, minutes, seconds);
		}
	}
}
