/**
 * 
 */
package programm;

import java.util.Scanner;

/** write a programm for seperate last two digit in any number
 * @author MD. AL AMIN
 *
 */
public class SeperateLast2Digit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int last2 = num%100;
		System.out.println("Last two digit is = "+last2);
	}

}
