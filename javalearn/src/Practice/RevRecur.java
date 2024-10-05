package Practice;

public class RevRecur {

	static void revrec(int n) {
		if(n<10) {
			System.out.println(n);
		}
		else {
			System.out.print(n%10);
			revrec(n=n/10);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =18298;
		revrec(a);
			
	}

}
