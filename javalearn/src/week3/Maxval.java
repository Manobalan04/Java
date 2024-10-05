package week3;

public class Maxval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] v= {30,33,41,56,62,74};
		int max=0;
		
		for(int i =0;i<v.length;i++) {
			if(max<v[i]) {
				max=v[i];
			}
		}
		System.out.println(max); 
	}

}
