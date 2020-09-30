/**
 * 
 */
package programm;

import java.util.Scanner;

/**
 *  Find Largest Number from 3 number using conditional operator.
 *  DESCO 2016
 * @author MD. AL AMIN
 *
 */
public class LargestNumber3_Conditional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, max;
		System.out.print("Enter Number 1: ");
		num1 = sc.nextInt();
		System.out.print("Enter Number 2: ");
		num2 = sc.nextInt();
		System.out.print("Enter Number 3: ");
		num3 = sc.nextInt();
		
		max = (num1 > num2 && num1 > num3) ? num1 : (num2 > num1 && num2 > num3) ? num2 : num3;
		
		System.out.println("The Largest Number is "+max);
	}

}
