package week1;

public class Day2 {
	//data types->primitive and non primitive
	//byte->short->char->int->long->float->double
	//boolean
	
	//ASCII value
	char c = 'A';
	
	int a = 5;
	long b = 9922;
	float e = 11;
	static double d1 = 11.12;
	boolean t = true;
	
	//non primitive
	static int [] arr = {13,24,44,557,87};
	static int [] arr1 = new int[6];
	String s="heisnberg";
	
	int chartoint = c;
	int longtoint =(int) b;
	long chartolong =(long) c;
	int doubletoint =(int) d1;
	public static void main(String[] args) {
		//object creation, class reference, instance creation
		Day2 d = new Day2 ();
		d.a=23;
		System.out.println(d.a);
//		System.out.println("Only a methods"+a);
		Day2 d1 = new Day2 ();
		System.out.println(d1.a);
		
		//long
		System.out.println(d.b);
		System.out.println(d.c);
		System.out.println(d.e);
		
		System.out.println(Day2.d1);
		
		System.out.println(arr);
		System.out.println(arr[3]);
		
		arr1[2]=33;
		System.out.println(arr[2]);
		
		arr1[0]=12;
		System.out.println(arr1[0]);
		
		System.out.println(d.s);
		
		
		System.out.println(d.chartoint);
		System.out.println(d.longtoint);
		System.out.println(d.chartolong);
		System.out.println(d.doubletoint);
		
//		System.out.printf("whats your age %d",d.a);
		
		System.out.println(arr1);
	}

}
