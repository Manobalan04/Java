package Practice;

class ManualError extends Exception {
	public ManualError(String msg) {
		super(msg);
	}
}
public class ManualException {

	public static void main(String[] args) throws ManualError{
		// TODO Auto-generated method stub

		int []arr= {1,2,3333,4,5,66666};
		
		for (int i = 0; i < arr.length; i++) {
		try {
			if(arr[i]<10) {
				System.out.println(arr[i]);
			}
			else if(arr[i]>10) {
			throw new ManualError("Throwed Manual error");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
}
