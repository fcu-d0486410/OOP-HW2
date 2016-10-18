package fcu.iecs.oop;
import java.util.Scanner;
public class CheckOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter a integer:");
		int integer=keyboard.nextInt();
		int check=integer%2;
		
		if(check==1){
			
			System.out.printf("%d is Odd Number",integer);
			
		}
		else{
			System.out.printf("%d is  Even Number",integer);
		}
		keyboard.close();
	}

}
