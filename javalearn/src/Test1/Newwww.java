package Test1;

public class Newwww {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] array = new int[3][3]; // Creates a 3x3 array with default values (0 for int)

		// Assigning values individually
		array[0][0] = 1;
		array[0][1] = 2;
		array[0][2] = 3;
		array[1][0] = 4;
		array[1][1] = 5;
		array[1][2] = 6;
		array[2][0] = 7;
		array[2][1] = 8;
		array[2][2] = 9;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]+" ");
			}
		}
	}

}
