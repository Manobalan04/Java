package Test1;

interface B1{
	void a();
	void ab();
}
interface B2 extends B1{
	static void a1() {
		System.out.println("static method");
	}
	default void ab1() {
		System.out.println("default method");
	}
}
class inter implements B2{
	
	void a1() {
		System.out.println("static 1 method");
	}
	

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("void method 1");
	}

	@Override
	public void ab() {
		// TODO Auto-generated method stub
		System.out.println("void method 2");
	}
	
}
public class Interface extends inter{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		inter i=new inter();
		i.a1(); 	//
		B2.a1();	//static method only accessed by interface name 
		i.ab();
		i.ab();
		
	}

}
