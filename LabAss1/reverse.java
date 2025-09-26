package LabAss1;

import java.util.Scanner;

public class reverse {

    public static void reverseSum(int n) {
        int sum = 0, rev = 0;

        while (n > 0) {
            int r = n % 10;
            sum += r;
            rev = rev * 10 + r;
            n = n / 10;
        }
        System.out.println("Reverse of number: " + rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        reverseSum(n);
   
    }
}