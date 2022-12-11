package blatt4;

public class aufgabe6 {
	public static void main(String[] args) {
		int[] arr = {100, 2024, 42, 492, 87 ,1 , -38, 9012};
		for(int i : arr) {
			System.out.println("Ein ArrayAnfangsWert ist: " + i);
		}
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
				}
			}
		}
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
				}
			}
		}
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
				}
			}
		}
		for(int i : arr) {
			System.out.println("Ein ArrayEndWert ist: " + i);
		}
	}
}
