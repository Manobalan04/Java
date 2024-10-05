package Practice;

public class Countno {
	public static void main(String[] args) {
	int num=100010902;
	int count=0;
	while(num!=0) {
		if(num%10==0) {
			count++;
		}
		num=num/10;
		}
	System.out.println("No of zero: "+count);
	}
}

