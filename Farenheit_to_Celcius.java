/**
 * 
 */
package programm;

import java.util.Scanner;

/** write a programm to convert Farenheit to Celcius 
 * @author MD. AL AMIN
 *
 */
public class Farenheit_to_Celcius {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Farenheit Temperature: ");
		double f  = sc.nextDouble(); // input farenheit value
		double c = ((f-32)*5)/9;
		System.out.println("Celcius is = "+c);
	}

}
