package week2;

class Car{
	//@overridde
	public void Start() {
	System.out.println("Car class");
	}
}
class Honda extends Car{
	//@overridde
	public void Start() {
		System.out.println("Honda car");
		}
}
class Audi extends Car{
	//@overridde
	public void Start() {
		System.out.println("Audi car");
		}
}
class Bens extends Car{
	//@overridde
	public void Start() {
		System.out.println("Bens car");
		}
}

public class Polym {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c=new Audi();
		Car c1=new Bens();
		c.Start();
		c1.Start();
	}

}
