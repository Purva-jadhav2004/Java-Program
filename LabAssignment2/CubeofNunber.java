package Assignment2;

import java.util.Scanner;

public class CubeofNunber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int cube = number * number * number;
        System.out.println("Cube of " + number + " is: " + cube);

    }
}