package programm;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		int p = 0, i;
		
		for(i = 2; i <= num /2 ;i++) {
			if(num % i == 0) {
				p = 1;
				break;
			}
		}
		
		if(p == 0) {
			System.out.println("Prime");
		}else {
			System.out.println("Not  Prime");
		}
	}

}
