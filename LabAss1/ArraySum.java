package LabAss1;



 	import java.util.Arrays;
	import java.util.Scanner;
	public class ArraySum {

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        int sum = 0;

	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	            sum += arr[i];
	        }

	        Arrays.sort(arr);
	                                                                              
	        System.out.println("Sum of elements: " + sum);

	        System.out.print("Elements in ascending order: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }

	    }
	}