package LabAss1;

public class MyNumber {
    
    private int number;
    public MyNumber() {
        this.number = 0;
    }
    public MyNumber(int value) {
        this.number = value;
    }

    public void isNegative() {
        if (number < 0) {
            System.out.println(number + " is Negative");
        } else {
            System.out.println(number + " is Not Negative");
        }
    }

    public void isPositive() {
        if (number > 0) {
            System.out.println(number + " is Positive");
        } else {
            System.out.println(number + " is Not Positive");
        }
    }

   
    public void isOdd() {
        if (number % 2 != 0 ) {
            System.out.println(number + " is Odd");
        } else {
            System.out.println(number + " is Not Odd");
        }
    }

    public void isEven() {
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Not Even");
        }
    }
    public int getNumber() {
        return number;
    }
    public static void main(String[] args) {
        MyNumber n1 = new MyNumber();     
        MyNumber n2 = new MyNumber(8);    

        System.out.println("Testing n1:");
        n1.isPositive();
        n1.isNegative();
        n1.isOdd();
        n1.isEven();

        System.out.println("\nTesting n2:");
        n2.isPositive();
        n2.isNegative();
        n2.isOdd();
        n2.isEven();
    }
}