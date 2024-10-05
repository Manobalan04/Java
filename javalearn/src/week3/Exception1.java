package week3;

import java.util.InputMismatchException;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(10/0);
		}catch(InputMismatchException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			System.out.println("finally");
		}
			
		System.out.println("hellooo");
	}

}
