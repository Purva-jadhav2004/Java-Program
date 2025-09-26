package Assignment2;

import java.util.Scanner;

class Employee {
int id;
String name;
double salary;
Employee() {
id = 0;
name = "";
salary = 0.0;
}

    void accept(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }
    
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    private double bonus;

    Manager() {
        super();
        bonus = 0.0;
    }
    
    void accept(Scanner sc) {
        super.accept(sc);
        System.out.print("Enter Bonus: ");
        bonus = sc.nextDouble();
    }

    void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + getTotalSalary());
    }


    double getTotalSalary() {
        return salary + bonus;
    }
}

public class Main {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter number of managers: ");
   int n = sc.nextInt();

   Manager[] managers = new Manager[n];

 for (int i = 0; i < n; i++) {
  System.out.println("\nEnter details for Manager " + (i + 1) + ":");
 managers[i] = new Manager();
 managers[i].accept(sc);
}

 Manager topManager = managers[0];
 for (int i = 1; i < n; i++) {
 if (managers[i].getTotalSalary() > topManager.getTotalSalary()) {
topManager = managers[i];
}
}

System.out.println("\nManager with highest total salary:");
topManager.display();

    }
}