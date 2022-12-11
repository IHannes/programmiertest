package blatt4;

public class agb7 {
	public static void main(String[] args) {
		int[] arr = {12, 38, 9289, 12, 82, 38};
		for(int i : arr) {
			System.out.println("Ein Eingabewert des arrays ist: " + i);
		}
		int counter = 0;
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					counter++;
				}
			}
		}
		int[] ergebnis = new int[arr.length-counter];
		int ar[] = new int[counter];
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					ar[count]=arr[i];
					count++;
				}
			}
		}
		/*for(int i : ar) {
			System.out.print(i);
		}*/
		boolean a = true;
		int c = 0;
		for(int i = 0; i<ar.length; i++) {
			ergebnis[i]=ar[i];
		}
		for(int i = ar.length; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					a = false;
				}
			}
			if(a==true) {
				ergebnis[c]=arr[i];
				c++;
			}
		}
		for(int i : ergebnis) {
			System.out.println("Ein Endwert des Arrays ist" + i);
		}
	}
}
