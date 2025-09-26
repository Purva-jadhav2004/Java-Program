package LabAss1;

import java.util.Scanner;

public class Person {
    static int count = 0;  
    int id;
    String name;
    Mydate dateofbirth;

    public Person() {
        this.id = ++count;
        this.name = "Unknown";
        this.dateofbirth = new Mydate();
    }

    public Person(String name, Mydate dob) {
        this.id = ++count;
        this.name = name;
        this.dateofbirth = dob;
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        this.dateofbirth = new Mydate();
        System.out.println("Enter date of birth:");
        this.dateofbirth.displayDate();
    }

    public void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        this.dateofbirth.displayDate();
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        sc.nextLine();

        Person[] persons = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");
            persons[i] = new Person();
            persons[i].accept();
        }

        System.out.println("\n--- Displaying Person Details ---");
        for (Person p : persons) {
            p.display();
        }
    }
}