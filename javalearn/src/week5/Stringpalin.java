package week5;

public class Stringpalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="madam";
		char [] c=s.toCharArray();
		boolean flag = true;
		for (int i = 0; i < c.length; i++) {
			if(c[i]!=c[c.length-1-i]) {
				flag=false;
			}
		}
		System.out.println(flag?"palindrome":"not panlindrome");
	}

}