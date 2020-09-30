package programm;

import java.util.Scanner;

/** write a programm to findout leap year or not 
 * @author MD. AL AMIN
 *
 */
public class FindLeapyear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Year: ");
		int year = sc.nextInt();
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ) {
			System.out.println(year+" is Leap Year");
		}else {
			System.out.println(year+" is Not Leap Year");
		}
		
		//leapyear(); // this function used for print leap year seris

	}
	
	static void leapyear() {
		for(int i = 2000; i <= 2050; i++) {
			if((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
				System.out.println(i+" is Leap Year");
			}
		}
	}

}
