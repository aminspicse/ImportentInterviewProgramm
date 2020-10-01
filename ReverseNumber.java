package programm;
import java.util.Scanner;

/**
 * write a programm to reverse a number
 * IICT BUET 2017
 * @author MD. AL AMIN
 */
public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int number = sc.nextInt();
		String rev = "";
		int rem;
		while(number != 0) {
			rem = number % 10;
			rev = rev + rem;
			number /= 10;
		}
		System.out.println("After Reverse: "+rev);
	}
}
