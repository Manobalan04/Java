package week1;

public class Meth {
	//Method or Function
	//void and return
	//void
	public static void printA() {
		System.out.println("hello 1");
		System.out.println("hello 2");
		System.out.println("hello 3");
	}
	//return
	public static int getint() {
		System.out.println("hello world ");
		int b = 54;
		return 1;
	}
	public static int getint1() {
		System.out.println("hello world int1");
		return 'a';
	}
	//arguments/parameters
	//method overloading or compile time polymorphism
	public static int getint(int a,int b) {
		System.out.println("hello world a+b");
		return a+b;
	}
//	public static int getint(int a) {
//		System.out.println("hello world");
//		return 'k';
//	}
	//class and argument ona iruntha 'a' oda value update agathu 
	static int a=6;
	public static int getint(int a,char b) {
		a=10;
		System.out.println("hello world a+b");
		return 1;
	}
	public static double getint(char b,int a) {
		System.out.println("hello world b+a");
		return 15.11;
	}
//	call by reference
	public static int getint(Meth a) {
		a.a=16;
		System.out.println("hello world b+a");
		return 'd';
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printA();
		printA();
		Meth m = new Meth();
		getint();
		int rs=getint();
		System.out.println(rs);
		//to see return value
		int res=getint1();
		System.out.println(res);
		System.out.println();
		System.out.println(getint1());
		System.out.println(getint(2,'a'));
		System.out.println(a);
		System.out.println(getint(8,'c'));
//		getint1();
	}

}
