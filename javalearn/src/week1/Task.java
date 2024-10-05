package week1;
import week2.Access1;

public class Task {
		static long i = 12111111111L;
		static int x =  (int) 1211111111;		//task
		static long r = 12111111111L;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(x);
			System.out.println(r);

			Access1 a=new Access1();
			System.out.println(a.public1);
			System.out.println(a.getAcc());
			a.setAcc(44);
			System.out.println(a.getAcc());
	}

}
