package week2;

public class Operators2 {
//	int [] a= {2,3,45,6};
//	int [] a1= new int [4];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ternary operator
		int a= 10>2 ? 'a':11;
		System.out.println(a);
		
		//statements
		//conditional
		//iterative / looping
		//switch
		//jumping
		
		if(10>25) {
			System.out.println("if executed");
		}
		else {
			System.out.println("else executed");
		}
		
		//ladder if statement
		if(10>25) {
			System.out.println("if executed");
		}
		else if(11<2){
			System.out.println("else if1 executed");
		}
		else if(22>111) {
			System.out.println("else if2 executed");
		}
		else {
			System.out.println("else executed");
		}
		
		//nested if
		if(10>2) {
			if(10>4) {
				if(10>6) {
					System.out.println("your selected");
				}
			}
		}
		
	}

}
