package week4;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {13,5,2,6,45};
		for (int i = 1; i < a.length; i++) {
			int key=a[i];
			int j=i-1;
			
		while(j>=0 && a[j]>key) {
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=key;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
