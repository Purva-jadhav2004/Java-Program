package assignment1;

public class Program13 {
 Program13() {
		System.out.println("I am in default constructor");
	}
	 Program13(int a) {
		System.out.println("I am in parameterized constructor");
		System.out.println("value of a is :"+a);
	}
	 Program13(int a,int b) {
		System.out.println("I am in parameterized constructor2");
		System.out.println("value of a and b is :"+a+" "+b);
	}


	public static void main(String[] args) {
		Program13 c1=new Program13();
		Program13 c2=new Program13(34);
		Program13 c3=new Program13(34,12);
	}

}
