package week4;

//Second max 
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {2,7,4,8,1};
		int max=0;
		int max2=0;
		for (int i = 0; i < a.length; i++) {
			if(max<a[i]) {
				max2=max;
				max=a[i];
			}
			else if(max2<a[i]) {
				max2=a[i];
			}
		}
		System.out.println(max2);
	}

}
