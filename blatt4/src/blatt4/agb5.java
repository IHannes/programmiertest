package blatt4;

public class agb5 {
	public static void main(String[] args) {
		int[] arr = {1,2, 3, 10};
		int sum = 0;
		for(int i : arr) {
			System.out.println("Ein ArrayWert ist: " + i);
			sum+=i;
		}
		System.out.println("Das Ergebnis ist: " + sum);
	} 
}
