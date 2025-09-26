package assignment1;
import java.util.Scanner;

public class Program12 {
	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a year: ");
		        int year = scanner.nextInt();
		        if(year%4==0) {
		        	System.out.println("leap year");
		        }
		        else {
		        	System.out.println("not leap year");
		        }
		   
	
	}

}
