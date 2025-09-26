package LabAss1;

public class Employee {
int salary;
String name;
Employee(int s, String n){
	this.salary=s;
	this.name=n;
}
public void display() {
	System.out.println("Employee name is:"+this.name);
	System.out.println("Employee salary is:"+this.salary);
}
	public static void main(String[] args) {
		Employee[] e=new Employee[5];
		e[0]=new Employee(30000,"shubhangi");
		e[1]=new Employee(40000,"shruti");
		e[2]=new Employee(20000,"purva");
		e[3]=new Employee(50000,"abc");
		e[4]=new Employee(10000,"def");
		for(int i=0;i<e.length;i++) {
			e[i].display();
		}

	}

}