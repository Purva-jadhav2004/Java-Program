package Assignment2;


class Employee1 {
 String name;
 double salary;

 
 public void Employee(String name, double salary) {
     this.name = name;
     this.salary = salary;
 }


 public void displayDetails() {
     System.out.println("Name: " + name);
     System.out.println("Salary: ₹" + salary);
 }
}


class Developer extends Employee1 {
 String projectName;


 public Developer(String name, double salary, String projectName) {
     super(); 
     this.projectName = projectName;
 }


 @Override
 public void displayDetails() {
     super.displayDetails(); 
     System.out.println("Project Name: " + projectName);
 }
}


class Programmer extends Developer {
 String progLanguage;


 public Programmer(String name, double salary, String projectName, String progLanguage) {
     super(name, salary, projectName); 
     this.progLanguage = progLanguage;
 }


 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Programming Language: " + progLanguage);
 }
}


public class InheritanceDemo {
 public static void main(String[] args) {
   
     Developer dev = new Developer("Amit Sharma", 85000.0, "SmartCity App");

   
     System.out.println("Developer Details:");
     dev.displayDetails();
 }
}