package week3;

public class prob1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sum of the digits
		int sum=543;
		int res=0;
		while(sum>0) {
			res+=sum%10;
			sum=sum/10;
		}
		System.out.println(res);
		
		int prime=43;
		boolean isprime=true;
		for(int i=2;i<prime;i++) {
			if(prime%i==0) {
				isprime=false;
//				System.out.println(" number");
//				break;
			}
		}
		System.out.println(isprime ? "prime":"not a prime");
	}

}
