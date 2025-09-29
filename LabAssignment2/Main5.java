package p;
 class Circle implements Operation1{
	 int r;
	 Circle(int r)
	 {
		 this.r=r;
	 }
	 public void area() {
		 double area;
		 area=pi*r*r;
		 System.out.println("The area of circle is:"+area);
	 }
	 public void volume() {
		 System.out.println("Cannot find the volume ");
	 }
 }
public class Main5 {

	public static void main(String[] args) {
		Circle c=new Circle(5);
		c.area();
		c.volume();

	}

}
