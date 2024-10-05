package week3;

public class Matric_prob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] a= {{2,3,4},{3,5,4},{1,2,4}};
		int [][] b= {{3,5,6},{2,6,1},{3,2,1}};
		int [][] c= new int [3] [3];
		//2 3 4  3 5 6   24 36 19
		//3 5 4  2 6 1   31 53 27
		//1 2 4  3 2 1   19 25 12 
		System.out.println("Original matrix");
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
