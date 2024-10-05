package week2;

public class Rectangle {
	
	int width = 45;
	int height = 30;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r=new Rectangle();
		System.out.println("area:"+ r.width*r.height);
		System.out.println("perimeter:"+ 2*(r.width+r.height));
	}

}
