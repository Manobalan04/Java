package week4;

public class Jump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a = {4,3,5,2,3,1};
		int idx=0;
		int limit=a.length;
		int remainingJump =a.length;
		
		while(idx<limit) {
			if(a[idx]>limit) {
				System.out.println("out of bound");
				break;
			}
			remainingJump-=a[idx];	//balance jump 
			idx+=a[idx]-1;			//no of jump to next target
			
			if(remainingJump==0) {
				System.out.println("proper jump");
				break;
			}
			else if(remainingJump<0) {
				System.out.println("invalid jump");
				break;
			}
		}
	}

}
