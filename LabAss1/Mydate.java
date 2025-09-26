package LabAss1;

public class Mydate {
	private int dd;
	private int mm;
	private int yy;
	public Mydate()
	{
		this.dd=1;
		this.mm=2;
		this.yy=2004;
		
	}
	public Mydate(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		
	}
	 public void displayDate() {
		 System.out.println(this.dd + "-" + this.mm + "-" + this.yy);

	
	 }
	 
	public static void main(String[] args) {
		Mydate d1=new Mydate();
		System.out.println("default date is:");
		d1.displayDate();
		Mydate d2=new Mydate(12,05,2004);
		System.out.println("paramertized  date is:");
		d2.displayDate();
	}

}
