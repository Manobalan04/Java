package week1;

public class Operators1 {

	public static void main(String[] args) {
		//unary oper
		int k=4;
		int y=++k;
		System.out.println(y);
		System.out.println(k);	//clarification kaga k va print panikurom

		//Binary oper
		//arithmetic op		BODMAS
		//+,-,*,%,/
		System.out.println(5+5);
		System.out.println("hello"+ (5-9));
		System.out.println("hello"+ 5*8);
		System.out.println(10+(5-9));
		System.out.println(10+7*5);
		System.out.println(10/2);
		System.out.println(10%2);
		System.out.println('a'+5);
		
		//Relational oper
		// >, <, >=, <=, ==, !=
		System.out.println(10>5);
		System.out.println("Hello"=="hello");
		
		//logical oper
		// &&  ||
		System.out.println(10>2 && 10<2);//oru false irnthalum false print agum
		System.out.println(10>2 || 10<2);//oru true irnthalum true print agum
		
		System.out.println(10>2 || 10<2 && 9>2);//frst preference for && then only ||
		System.out.println(10<2 && 9>2 || 10>2);
	}
	
}
