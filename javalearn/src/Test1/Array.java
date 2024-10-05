package Test1;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= {5,6,7,8,9,10};
		int []b= {8,5,4,3,2,1};
		boolean issame=false;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j]) {
					issame=true;
					System.out.print(a[i]+" ");
				}
			}
		}
		System.out.println();
		System.out.println(issame?"same numbers":"not same numbers");
	}

}
