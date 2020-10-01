package programm;

import java.util.Scanner;

/**
 * Input a number and check it armstrong or not
 * @author MD. AL AMIN
 *
 */
public class ArmstrongNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input, temp, sum=0;
		int reminder;
		System.out.println("Enter 3 Digit Number: ");
		input = sc.nextInt();
		temp = input;
		while(input != 0) {
			reminder = input % 10;
			sum = sum + (int) Math.pow(reminder, 3);
			input = input/10;
		}
		
		if(temp == sum) {
			System.out.println(temp+" is a Armstrong Number.");
		}else {
			System.out.println(temp+" is not Armstrong Number");
		}
		
		//armstrongseries(); // armstrongseries() this function used for printing armstrong number between two number
		//System.out.println(count(333));
	}
	
	static void armstrongseries() {
		int start = 1, end = 999;
		System.out.println("Armstrong Number series from "+start+" to "+end);
		for(int number = start; number <= end; ++number) {
			int digit = count(number);
			int result = 0;
			int orginalnumber = number;
			
			while(orginalnumber != 0) {
				int reminder = orginalnumber % 10;
				result += Math.pow(reminder, digit);
				orginalnumber /= 10;
			}
			
			if(result == number) {
				System.out.println(result);
			}
		}
		
	}
	
	static int count(int a) {
		int cnt=0, temp, reminder;
		while(a != 0) {
			a = a / 10;
			cnt++;
		}
		
		return cnt;
	}

}
