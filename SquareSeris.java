package programm;

import java.util.Scanner;
 
/** Write a programm to sum (1*1)+(2*2)+(3*3)+(4*4)+ ...................+(n*n) seris
 * DUET 07-08, 01-02
 * @author MD. AL AMIN
 *
 */
public class SquareSeris {

	public static void main(String[] args) {
		int from, to, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter From Number: ");
		from = sc.nextInt();
		System.out.print("Enter To Number: ");
		to = sc.nextInt();
		
		for(int i=from;i <= to; i++) {
			sum += (i*i);
		}
		//printseris(from, to); // print square seris
		System.out.println("Sum of Seris = "+sum);
	}
	
	static void printseris(int from, int to) {
		for(int i = from; i <= to; i++) {
			System.out.println(i*i);
		}
	}

}
