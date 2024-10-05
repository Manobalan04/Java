package week3;

class Manual extends Exception{
	public Manual(String msg) {
		super(msg);
	}
	
}
public class Manual_Exc {

	public static void main(String[] args) throws Manual {
		// TODO Auto-generated method stub

		try {
			if(10>4) {
				throw new Manual("error check");
			}
		}
//		catch(Exception e){			//catch method use panalana throws nu 
//			e.printStackTrace();	//main method la declare pananum
//		}
		finally {
			System.out.println("final throwing");
		}
		System.out.println("Manual error throwing");
	}
	
}
