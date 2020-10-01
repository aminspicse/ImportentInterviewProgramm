package programm;

import java.util.Scanner;

/**
 * write a programm to add digit of a number
 * IICT BUET 2017
 * @author MD. AL AMIN
 *
 */
public class AddDigitNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int number = sc.nextInt(), sum = 0;
		
		while(number != 0) {
			sum += number % 10;
			number /= 10;
		}
		System.out.println("The sum of digit: "+sum);
	}

}
