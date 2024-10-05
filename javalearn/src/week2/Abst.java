package week2;

//Abstraction
//Cannot instantiate class it mean new class reference kudaka mudiyathu
//Must implement abstract class methods in sub class
//Abstract method can be used only on abstract class
abstract class A{
	public void d1(){
		System.out.println("hello");
	}
	public abstract int d3(int a, int b);
	
	public abstract void d2();
}

public class Abst extends A{
	@Override
	public int d3(int a, int b) {
		System.out.println(a+b);		
		return 4;
	}
	
	@Override
	public void d2() {
		// TODO Auto-generated method stub
		System.out.println("hello 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abst a=new Abst();
		a.d1();
		a.d3(6, 7);
		System.out.println(a.d3(9, 7)); //return pakalam ipdi use pana
		a.d2();
		
		//OOPS Concept
		
		//Class, Constructor
		//Access Modifier
		//Encapsulation
		//Inheritance
		//Polymorphism
		//Abstraction
		//Interface
	}

}
