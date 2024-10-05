package week2;

public class Cons1 {
	static int a;
	static {
		a=22;		//static {} first preference
	}
	Cons1() {
		System.out.println("empty");
	}
	Cons1(int k) {
		a=k;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cons1 c=new Cons1();
		Cons1 c1=new Cons1(4);
////		System.out.println(c.a);
////		System.out.println(c1.a);
		System.out.println(a);
		
		Access1 a=new Access1();
		System.out.println(a.protected1);
		System.out.println(a.default1);
		
	}

}
