package assignment1;
import java.util.Scanner;
public class program37 {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the radius of the cylinder: ");
	        double radius = scanner.nextDouble();
	        System.out.print("Enter the height of the cylinder: ");
	        double height = scanner.nextDouble();
	        double surfaceArea = 2 * 3.14 * radius * (height + radius);
	        System.out.printf("Total Surface Area of the Cylinder: %.2f\n", surfaceArea);
	        
	    }
	}

