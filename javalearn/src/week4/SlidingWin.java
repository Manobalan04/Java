package week4;

//Sliding window or 2 pointer

public class SlidingWin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]a= {1,3,4,6,8};
		int l=0,r=1;
		int target=7;
		while(r<a.length) {
			if(a[r]==target) {
				System.out.println(r);
				break;
			}
			else if(a[l]==target) {
				System.out.println(l);
				break;
			}
			else if(a[l]<target && a[r]>target) {
				System.out.println(l+1);
				break;
			}
			l++;
			r++;
		}
	}

}
