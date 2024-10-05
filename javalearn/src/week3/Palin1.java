package week3;

public class Palin1 {

	private static boolean ispalindrome(char[] palin) {
		// TODO Auto-generated method stub
		for (int i = 0; i < palin.length; i++) {
			if(palin[i]!= palin[palin.length-1-i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] palin= {'r','o','t','a','t','o','r'};
		
		if(ispalindrome(palin)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

	

}
