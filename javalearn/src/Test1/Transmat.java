package Test1;

public class Transmat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]m1= {{2,2},{3,1}};
		int [][]m2= {{4,1},{3,4}};
		
		int [][]e= new int[2][2];
		
		//2 2	4 1		14 10
		//3 1	3 4		15 7
		for (int i = 0; i < e.length; i++) {
			for (int j = 0; j < e.length; j++) {
				for (int x = 0; x < e.length; x++) {
					e[i][j]+=m1[i][x]*m2[x][j];
				}
			}
		}
		for (int i = 0; i < e.length; i++) {
			for (int j = 0; j < e.length; j++) {
				System.out.print(e[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < e.length; i++) {
			for (int j = 0; j < e.length; j++) {
				int temp=e[i][j];
				e[i][j]=e[j][i];
				e[j][i]=temp;
			}
		}
		for (int i = 0; i < e.length; i++) {
			for (int j = 0; j < e.length; j++) {
				System.out.print(e[j][i]+" ");
			}
			System.out.println();
		}
	}

}
