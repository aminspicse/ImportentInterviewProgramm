package programm;

import java.util.Scanner;

/**
 * Find factorial value. and factorial series
 * ICT 2014
 * @author MD. AL AMIN
 *
 */
public class FactorialNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int i=1, num;
		long fact=1;
		num= sc.nextInt();
		while(i <= num) {
			fact = fact*i;
			i++;
		}
		System.out.println("Factorial value of "+num+" = "+fact);
		
		//factorialseris(); // factorialseris() use for print factorial series. 
	}
	
	static void factorialseris() {
		long fact=1;
		for(int i = 1; i <= 20; i++) {
			for(int j = 1; j <= i; j++) {
				fact = fact*j;
			}
			System.out.println(i+" = "+fact);
			fact = 1;
		}
	}

}
