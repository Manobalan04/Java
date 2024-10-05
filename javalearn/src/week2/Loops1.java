package week2;

public class Loops1 {
	static int [] a = {2,5,8,7,9};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For
		for(int i=0; i<a.length; i=i+2) {
			System.out.println(a[i]);
		}
		
		//While
		int i=0;
		while(i<5) {
//			System.out.println(a[i]);
			i++;
		}
		
		//Do While
		do{
			System.out.println(a[i]);
		}
		while(10<2);
	}

}
