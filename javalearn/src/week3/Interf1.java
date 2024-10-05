package week3;

interface A2{
	public void b5();
	
}
//In-In ->possible 	interface and interface ah join pana extends use pananum
//Cl-In ->possible  class and interface ah join pana implements use pananum
//In-Cl ->not possible
//Cl-Cl ->possible
interface A1 extends A2{
	public int n=22;
	public void b1();
	
	public abstract void b2();
	
	static void b3() {
		System.out.println("static");
	}
	default void b4() {
		System.out.println("default");
	}
}
class Parent{
	
}
public class Interf1 extends Parent implements A1,A2{
//	int n=6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interf1 i=new Interf1();
		A1.b3(); 	//static ah interface name vechi dha call panamudiyum
		i.b4();
		i.b3();
		i.b4();
		i.b1();
		
	}
	//static method la @override annotation irundha override panamudiyathu
	//@override annotation ilana override panalam
	public void b3() {
		// TODO Auto-generated method stub
		System.out.println("override static");
	}

	@Override
	public void b5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void b1() {
		// TODO Auto-generated method stub
		System.out.println(n);
	}

	@Override
	public void b2() {
		// TODO Auto-generated method stub
		
	}
}
