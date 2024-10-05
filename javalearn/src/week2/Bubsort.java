package week2;

public class Bubsort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a1= {34,17,3,19,6};
		
//		Bubble sort ascending
		for(int i=0;i<a1.length;i++){
			for(int j=i+1;j<a1.length;j++) {
				if(a1[i]>a1[j]) {
					int temp =a1[j];
					a1[j]=a1[i];
					a1[i]=temp;
				}
			}
			System.out.print(a1[i]+" ");
		}
		System.out.println(a1[3]);	//to find second largest 
		System.out.println();
		
		//BUbble sort Descending
		for(int i=0;i<a1.length;i++){
			for(int j=i+1;j<a1.length;j++) {
				if(a1[i]<a1[j]) {
					int temp =a1[j];
					a1[j]=a1[i];
					a1[i]=temp;
				}
			}
			System.out.print(a1[i]+" ");
		}
	}
}
