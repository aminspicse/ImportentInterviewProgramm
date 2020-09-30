/**
 * 
 */
package programm;

import java.util.Scanner;

/**
 * @author MD. AL AMIN
 * DUET 04-05, 12-13
 */
public class Circle_Area {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		final double PI = 3.1416;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius of a Circle: ");
		double radius = sc.nextDouble();
		double area = PI*radius*radius;
		System.out.println("Area of Circle is = "+area);
	}

}
