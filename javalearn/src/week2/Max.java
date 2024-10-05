package week2;

public class Max {
	static int [] a= {71,5,99,32,10};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Selection sort
		//maximum value
		for (int i = 0; i < a.length; i++) {
			int maxindex=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[maxindex]<a[j]) {
					maxindex=j;
				}
			}
				int temp=a[maxindex];
				a[maxindex]=a[i];
				a[i]=temp;
			System.out.println(a[i]);
		}
		
		System.out.println();
		
		//minimum value
		for (int i = 0; i < a.length; i++) {
			int maxindex=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[maxindex]>a[j]) {
					maxindex=j;
				}
			}
				int temp=a[maxindex];
				a[maxindex]=a[i];
				a[i]=temp;
			System.out.println(a[i]);
		}
	}
}


