package assignment1;

public class program18 {

    	public program18() {
			System.out.println("I am in default constructor");
		}
		
		public program18(int a) {
			System.out.println("I am in parameterized constructor");
			System.out.println("Value of a is:"+a);
			
		}
		public program18(int a,int b) {
			System.out.println("Value of a is:"+a+" "+b);
			
		}
		public static void main(String[] args) {
			program18 a=new program18();
			program18 b=new program18(10);
			program18 c=new program18(11,12);
		}

	}