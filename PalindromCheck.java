package programm;
import java.util.Scanner;
/**
 * Write a programm to check a number palindrom or not
 * @author MD. AL AMIN
 *
 */
public class PalindromCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int number = sc.nextInt();
		int temp = number, reminder;
		String result = "";
		while(number != 0) {
			reminder = number % 10;
			result = result + reminder;
			number = number / 10;
		}
		
		if(temp == Integer.parseInt(result)) {
			System.out.println(temp+" is Palindrom Number");
		}else {
			System.out.println(temp+" is Not Palindrom Number");
		}
	}
}
