package inheritance;

class BaseClass{
	 int a=10,b=20;
	 public void add()
	 {
	 System.out.println("Sum:"+(a+b));
	 }
	 }
	 
	 public class Main extends BaseClass
	 {
	  public void sub(){
	  System.out.println("Difference:"+(a-b));
	  }
	 public static void main(String[] args) {
	  Main obj=new Main();
	 
	  obj.add();
	  obj.sub();
	 }
	 }