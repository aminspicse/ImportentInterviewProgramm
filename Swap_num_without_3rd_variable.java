/**
 * 
 */
package programm;

/**
 * Write a programm to swap number without third variable
 * DUET 15-16, BUET IICT 17
 * @author MD. AL AMIN
 *
 */
public class Swap_num_without_3rd_variable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 10, b = 20;
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("Now a = "+a +" and b = "+b);
	}

}
