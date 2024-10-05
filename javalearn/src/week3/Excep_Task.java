package week3;

public class Excep_Task{
	
	static void error1() {
		System.out.println("error1 start");
		error2();
		try {
			System.out.println(10/0);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally error1");
		}
	}
	static void error2() {
		System.out.println("error2 start");
		error3();
		try {
			System.out.println(10/0);
		}catch(Exception e) {
				e.printStackTrace();
		}finally {
				System.out.println("finally error2");
		}	
	}
	static void error3() {
		System.out.println("error3 start");
		try {
			System.out.println(10/0);
		}catch(Exception e) {
				e.printStackTrace();
		}finally {
				System.out.println("finally error3");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		error1();
	}
}
