package Test1;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,3,4,5};
		
		int l=0;
		int r=a.length-1;
		int m=(l+r)/2;
		int t=2;
		while(l<r) {
			if(a[l]==t) {
				System.out.println(l);
				break;
			}
			else if(a[r]==t) {
				System.out.println(r);
				break;
			}
			else if(a[m]==t) {
				System.out.println(m);
				break;
			}
			else if(a[m]>t) {	//middle value target ah vida small iruntha r-> m assign
				r=m;
				m=l+r/2;
			}else if(a[m]<t) {	//middle value target ah vida large iruntha l-> m assign
				l=m;
				m=l+r/2;
			}
		}			
	}

}
