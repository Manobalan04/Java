package Practice;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]a= {1,2,3,4,5};
		int temp=a[0];
		for(int i=0;i<a.length-1;i++) {
			int j=i+1;
			a[i]=a[j];
		}
		a[a.length-1]=temp;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
