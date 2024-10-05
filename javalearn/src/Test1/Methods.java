package Test1;

class c1{
	void d1(int a) {
		System.out.println("d1 method");
	}
	//override
}
class e1 extends c1{
	void d1(int a) {
		super.d1(2);
		System.out.println("sub method");
	}
}
//overloading
class ol{
	void a1(){
		System.out.println("method ol");
	}
}
class ol1 extends ol{
	void a1(int a,int b){
		System.out.println("method ol");
	}
	
	int a1(int a) {
		System.out.println("return method");
		return 4;
	}
}
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		e1 e=new e1();
		e.d1(1);
		ol1 o=new ol1();
		o.a1();
		o.a1(2);
		o.a1(1, 2);
		
	}

}
