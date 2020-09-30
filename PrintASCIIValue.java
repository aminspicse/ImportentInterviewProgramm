package programm;
/* Write a programm ascii value to charecter and char to ascii value;
 * 
 * @ MD. AL AMIN 
 * facebook.com/amin.spicse
 */ 

import java.util.Scanner;

public class PrintASCIIValue {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ASCII Value : ");
		int ascii = sc.nextInt(); // for ascii value input
		System.out.print("Enter Char Value : ");
		char ch = sc.next().charAt(0); // for char input
		
		Ascii_to_char(ascii); // convert ascii value to charecter
		Char_to_ascii(ch); // convert char to ascii value
		ascii_to_char_all(); // print all ascii value and its equvelent charecter
	}
	
	static void Ascii_to_char(int ascii) {
		char ch = (char)ascii;
		System.out.println("ASCII to Charecter "+ascii+" = "+ch);
	}
	
	static void Char_to_ascii(char ch) {
		int ascii = ch;
		System.out.println("Charecter to ASCII "+ch+" = "+ascii);
	}
	
	static void ascii_to_char_all() {
		System.out.println("ASCII to Charecter: ");
		for(int i=0; i<=255; i++) {
			char ch = (char)i;
			System.out.println(i+" = "+ch);
		}
	}

}
