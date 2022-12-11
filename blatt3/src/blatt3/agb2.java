package blatt3;

import static de.hsa.prog.tools.Input.*;

public class agb2 {
	public static void main(String[] args) {
	System.out.println("Geben Sie ein Wort ein");
	String word = readWord();
	if(word=="Programmieren") {
		System.out.println("1.Das wort ist Programmieren");
	}
	if(word.equals("Programmieren")) {
		System.out.println("2.Das Wort ist Programmieren");
	}
	}
}
