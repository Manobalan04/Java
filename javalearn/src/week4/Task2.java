package week4;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= {2,3,4,5,6,7};
		int l=0,r=1;
		while(r<a.length) {
			if(l%2==0) {
				System.out.println(a[l]+1);
			}
			if(r%2!=0) {
				System.out.println(a[r]+2);
			}
			l=l+2;
			r=r+2;
		}
	}

}
