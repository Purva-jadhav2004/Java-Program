package assignment1;
import java.util.Scanner;
 class Employee1 {

void displaydetails() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter employee Id:");
	int a=sc.nextInt();
	System.out.println("Enter employee name:");
	String s=sc.toString();
}

public void displaySal() {
	// TODO Auto-generated method stub
	
}
}
class FulltimeEmp extends Employee1{
	public void displaySal() {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter employee Id:");
	float b=s.nextFloat();
}
}
public class Employee{
	public static void main(String[] args) {
	Employee1 e; 
	e=new Employee1();
	e.displaydetails();
	e=new FulltimeEmp();
	e.displaySal();
}
}
