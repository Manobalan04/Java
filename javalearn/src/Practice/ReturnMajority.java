package Practice;

public class ReturnMajority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,2,1,1,1,2,2};
		int ele=0;
		int count=0;
//		int n=arr.length/2;
		for (int i = 0; i < arr.length; i++) {
			if(ele==0) {
				ele=arr[i];
			}else if(count <0){
				ele=arr[i];
			}
			if(ele==arr[i]) {
				count++;
			}else {
				count--;
			}
		}
		System.out.println(ele);
//		System.out.println(n);
	}
}
