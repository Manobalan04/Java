package week2;

public class Circle {
protected int radius=30;
	
	public void setcir(int a) {
		radius=a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c=new Circle();
		System.out.println("area:"+ (3.14*(c.radius*c.radius)));
		System.out.println("circumference:"+ 2*(3.14*c.radius));
		
		System.out.println();
		
		c.setcir(45);
		System.out.println("area:"+ (3.14*(c.radius*c.radius)));
		System.out.println("circumference:"+ 2*(3.14*c.radius));
		
	}
}


