package week3;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] [] a= {{2,3},{3,4}};
		int [] [] b= {{3,5},{6,1}};
		int [] [] c= new int [2] [2];
		//2 3   3 5   24 13
		//3 4   6 1   33 19 
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				for (int k = 0; k < b.length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
 		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Transpose of matrix");
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				int temp=c[i][j];
				c[i][j]=c[j][i];
				c[j][i]=temp;
			}
		}
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[j][i]+" ");
			}
			System.out.println();
		}
	}
}
