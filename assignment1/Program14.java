package assignment1;
import java.util.Scanner;

public class Program14 {

		


		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        // 1D Array
		        System.out.print("Enter size of 1D array: ");
		        int size1D = sc.nextInt();
		        int[] arr1D = new int[size1D];

		        System.out.println("Enter elements of 1D array:");
		        for (int i = 0; i < size1D; i++) {
		            arr1D[i] = sc.nextInt();
		        }

		        System.out.println("1D Array Elements:");
		        for (int i = 0; i < size1D; i++) {
		            System.out.print(arr1D[i] + " ");
		        }
		        System.out.println("\n");

		        // 2D Array
		        System.out.print("Enter rows and columns of 2D array: ");
		        int rows2D = sc.nextInt();
		        int cols2D = sc.nextInt();
		        int[][] arr2D = new int[rows2D][cols2D];

		        System.out.println("Enter elements of 2D array:");
		        for (int i = 0; i < rows2D; i++) {
		            for (int j = 0; j < cols2D; j++) {
		                arr2D[i][j] = sc.nextInt();
		            }
		        }

		        System.out.println("2D Array Elements:");
		        for (int i = 0; i < rows2D; i++) {
		            for (int j = 0; j < cols2D; j++) {
		                System.out.print(arr2D[i][j] + " ");
		            }
		            System.out.println();
		        }
		        System.out.println();

		        // 3D Array
		        System.out.print("Enter depth, rows, and columns of 3D array: ");
		        int depth3D = sc.nextInt();
		        int rows3D = sc.nextInt();
		        int cols3D = sc.nextInt();
		        int[][][] arr3D = new int[depth3D][rows3D][cols3D];

		        System.out.println("Enter elements of 3D array:");
		        for (int i = 0; i < depth3D; i++) {
		            for (int j = 0; j < rows3D; j++) {
		                for (int k = 0; k < cols3D; k++) {
		                    arr3D[i][j][k] = sc.nextInt();
		                }
		            }
		        }

		        System.out.println("3D Array Elements:");
		        for (int i = 0; i < depth3D; i++) {
		            System.out.println("Depth " + (i + 1) + ":");
		            for (int j = 0; j < rows3D; j++) {
		                for (int k = 0; k < cols3D; k++) {
		                    System.out.print(arr3D[i][j][k] + " ");
		                }
		                System.out.println();
		            }
		            System.out.println();
		        }

		        sc.close();
		    }
		

}
