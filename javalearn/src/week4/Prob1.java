package week4;

public class Prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] k= {4,0,1,2,0,6,0};
		
		int l=0;
//		int r=1;
		int index=0;
		
		for (int i = 0; i < k.length; i++) {
			if(k[i]!=0) {
				k[index++]=k[i];
//				index++;
			}
		}	
			while(index<k.length) {
				k[index++]=0;
//				index++;
//				System.out.println(k[i]);
		}
	}

}
