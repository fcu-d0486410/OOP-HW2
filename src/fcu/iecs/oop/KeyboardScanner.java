
package fcu.iecs.oop;
import java.util.Scanner;
public class KeyboardScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter a integer:");
		int integer=keyboard.nextInt();
		System.out.println("Enter a float point number::");
		float floatnum=keyboard.nextFloat();
		System.out.println("Enter a you name:");
		
		
		String name=keyboard.next();
		
		System.out.printf("Hi %s,the multiplication of %d and %f is %.2e",name,integer,floatnum,integer*floatnum);

	}

}
