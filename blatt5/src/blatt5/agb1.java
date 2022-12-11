package blatt5;

import java.util.Scanner;

public class agb1 {
	public static void main(String[] args) {
		System.out.println("Geben Sie ein Wort ein");
		Scanner scanner = new Scanner(System.in);
		String wort = scanner.nextLine();
		char[] word = wort.toCharArray();
		char[] wor = tlc(word);
		isPalindrom(wor);
		
	}
	
	static char[] tlc(char[] ar) {
		char[] arr = new char[ar.length];
		for(int i = 0; i<ar.length; i++) {
			arr[i] = Character.toLowerCase(ar[i]);
		}
		return arr;
	}
	
	static void isPalindrom(char[] word) {
		boolean palindrom = true;
		if(word.length%2!=0) {
			palindrom = false;
		}
		else {
			char[] eins = new char[word.length/2];
			char[] zwei = new char[word.length/2];
			int counter = 0;
			int count = 0;
			
			for(int i = 0; i<(word.length/2); i++) {
				eins[i] = word[i];
			}
			for(int i = word.length/2; i<word.length; i++) {
				zwei[count] = word[i];
				count++;
			}
			int c = zwei.length-1;
			for(int i = 0; i<eins.length; i++) {
				System.out.println("Eins: " + eins[i]);
			}
			for(char i : zwei) {
				System.out.println("Zwei: " + i);
			}
			for(int i = 0; i<eins.length; i++) {
				if(eins[i]!=zwei[c]) palindrom=false;
				c--;
			}
		}
		System.out.println("It is a Palindrom: " + palindrom);
	}
}
