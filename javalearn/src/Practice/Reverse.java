package Practice;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=103;
		int res=0;
		while(a!=0) {
			res=res*10+a%10;
			a=a/10;
		}
		System.out.println(res);
	}

}
