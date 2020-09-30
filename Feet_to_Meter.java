/**
 * 
 */
package programm;

import java.util.Scanner;

/**
 * @author MD. AL AMIN
 *
 */
public class Feet_to_Meter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Feet: ");
		double feet = sc.nextDouble();
		double meter = feet / 3.28;
		System.out.println("Meter = "+meter);

	}

}
