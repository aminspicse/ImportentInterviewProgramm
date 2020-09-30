/**
 * 
 */
package programm;

import java.util.Scanner;

/** Find Largest Number From three Number
 * NTRCA 2014, DU 2018, BKB 2018
 * @author MD. AL AMIN
 *
 */
public class LargestNumber3 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter The value of a: ");
		a = sc.nextInt();
		System.out.print("Enter the value of b: ");
		b = sc.nextInt();
		System.out.print("Enter The Value of c: ");
		c = sc.nextInt();
		if(a > b && a > c) {
			System.out.println("Largest Number is A value = "+a);
		}else if(b > a && b > c) {
			System.out.println("Largest Number is B value = "+b);
		}else {
			System.out.println("Largest Number is C value = "+c);
		}
	}

}
