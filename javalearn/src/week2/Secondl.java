package week2;

public class Secondl {

	static int [] arr= {71,5,99,32,10,1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	for (int i = 0; i < arr.length; i++) {
        int maxIndex = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[maxIndex] > arr[j]) {
                maxIndex = j;
            }
        }
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[i];
        arr[i] = temp;
//        System.out.println(arr[i]);
    }
//    System.out.println(arr[4]);
	}
}