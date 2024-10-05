package week2;
//Search Algorithm are 2 types
//Linear Search
//Binary Search
public class Search {

	static int [] a= {4,2,6,9,5};	//Linear Search
	static int [] b= {2,5,8,11,14,16,19,22};	//Binary Search
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//If array index there->Value can be find in constant time 
		//O(1)
		
		//Linear Search
//O(n) -> Array oda value increase ana adhoda time also increase to find the index
//array iruka value oda index ah identify pandrathu
		int t=9;
		for(int i=0;i<a.length;i++) {
			if(a[i]==t) {
				System.out.println(i);
				break;	//value achieve panita again loop agama break aga
			}
		}
		//Binary Search
//Only works Sorted array	
//O(logn) -> Array oda value increase ana adhoda time increase gradually
		int left=0;
		int right=b.length-1;
		int mid=(left+right)/2;
		int target=16;
		while(left<right) {
			if(b[left]==target) {
				System.out.println(left);
				break;
			}
			else if(b[right]==target) {
				System.out.println(right);
				break;
			}
			else if(b[mid]==target) {
				System.out.println(mid);
				break;
			}
			else if (b[mid]>target) {
				right=mid;
				mid=(left+right)/2;
			}
			else if (b[mid]<target) {
				left=mid;
				mid=(left+right)/2;
			}
		}
		
	}

}
