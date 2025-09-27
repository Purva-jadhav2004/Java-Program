package inheritance;
class Shape{
	 int a=10,b=20;
	}
	class Rectangle extends Shape{
	 public void rectArea(){
	 System.out.println("Rectangle Area:"+(a*b));
	 }
	
	
	
	public static void main(String[] args) {
	 Rectangle obj=new Rectangle();
			obj.rectArea();
	}
	}