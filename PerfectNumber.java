package programm;

import java.util.Scanner;

/** 
 * Input a Number and check it Perfect or Not; Perfect Number seris
 * BOF 2018
 * @author MD. AL AMIN
 *
 */
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, num, sum=0;
		System.out.print("Enter a Number: ");
		num = sc.nextInt();
		for(i = 1; i < num; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		
		
		if(sum == num)
			System.out.println(num+" is Perfect Number.");
		else
			System.out.println(num+" Not Perfect Number.");
		
		
		perfectseris(); //perfectseris() function used for printing Perfect Number Seris From 2 to 10000
	}
	
	static void perfectseris() {
		int sum=0;
		System.out.println("Perfect Number Seris From 2 to 10000");
		for(int i = 2; i <= 10000; i++) {
			for(int j = 1; j < i; j++) {
				if(i % j == 0) {
					sum += j;
				}
			}
			
			if(i == sum) {
				System.out.println(i);
			}
			sum = 0;
		}
	}
}
