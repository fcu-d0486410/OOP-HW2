package fcu.iecs.oop;
import java.util.Scanner;
public class StringComparator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		int check=1;
		do{
		System.out.println("Enter a string1:");
		String str1=keyboard.next();
		System.out.println("Enter a string2:");
		String str2=keyboard.next();
		check=str1.compareTo(str2);
		if(check==0){
			
			System.out.println("The two string are the same");
			
		}
		else{
			System.out.println("The two string are not the same");
		}
		
		}while(check!=0);
		keyboard.close();
	}



}
