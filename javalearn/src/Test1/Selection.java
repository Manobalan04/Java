package Test1;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {40,20,30,10};
		
		for (int i = 0; i < a.length; i++) {
			int a1=i;
			for (int j = i+1; j < a.length; j++) {
				if(a[a1]>a[j]) {
					a1=j;
				}
			}
				int temp=a[a1];
				a[a1]=a[i];
				a[i]=temp;
				System.out.println(a[i]);
			}
		}
	}


