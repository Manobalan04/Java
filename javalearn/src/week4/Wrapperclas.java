package week4;

public class Wrapperclas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Auto boxing
		//Primitive -> wrapper class
		int a=355667889;
		Integer b=a;
		System.out.println(b.compareTo(19));	//if ryt val is higher outcome is -1
		System.out.println(b.compareTo(10));	//if left val is higher outcome is 1
		System.out.println(b.compareTo(15));	//if both are equal outcome is 0
		
		//here max,min is a inbuilt static method 
		System.out.println(Integer.max(15,30));	//compare max
		System.out.println(Integer.min(12, 10));	//compare min
		System.out.println(Integer.MAX_VALUE);	//max value of integer
		System.out.println(Integer.compareUnsigned(-10,-2));	//compare without sign
		System.out.println(Integer.valueOf("13")+4);	//convrt string into integer
		System.out.println(b.doubleValue());
		System.out.println(b.floatValue());
		System.out.println(Integer.divideUnsigned(10, 2));
		
		Character c='a';
		System.out.println(c.compareTo('d'));
		System.out.println(Character.isLetterOrDigit('a'));
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isUpperCase('a'));
		
		System.out.println(a);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		//UnBoxing
		//wrapper class -> Primitive
//		int c=b;
		
	}

}
