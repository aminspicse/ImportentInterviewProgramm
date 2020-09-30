/**
 * 
 */
package programm;

import java.util.Scanner;

/**
 * @author MD. AL AMIN
 *
 */
public class SquareRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive number: ");
		double num = sc.nextDouble();
		double ans = Math.sqrt(num);
		System.out.println(num+"'s Squer Root is = "+ans);

	}

}
