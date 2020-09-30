package programm;

import java.util.Scanner;

/**
 * write a programm to check triangle valid or invalid
 * DUET 17-18
 * @author MD. AL AMIN
 *
 */
public class Triangle_Check {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sid1, sid2, sid3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter side1 value: ");
		sid1 = sc.nextInt();
		System.out.print("Enter side2 value: ");
		sid2 = sc.nextInt();
		System.out.print("Enter side3 value: ");
		sid3 = sc.nextInt();
		
		if(sid1 + sid2 > sid3) {
			if(sid1 + sid3 > sid2) {
				if(sid2 + sid3 > sid1) {
					System.out.println("Tringle is Valid");
				}else {
					System.out.println("Invalid Triangle.");
				}
			}else {
				System.out.println("Invalid Triangle.");
			}
		}else {
			System.out.print("Invalid Triangle.");
		}
	}

}
