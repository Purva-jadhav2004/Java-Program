package assignment1;

public class Program41 {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;

        System.out.println("Series in ascending order:");
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Series in descending order:");
        for (int i = end; i >= start; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
