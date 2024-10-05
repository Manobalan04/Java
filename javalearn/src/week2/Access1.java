package week2;

public class Access1 {
	// Access modifier idhu oru structure and its 4 tpyes of keyword
	// Access modifier nambaloda class edhu varaikum access panlam nu solldrathuku
	// private, public, protected, default 
	// these keyword only used for variables / methods
	
	//Private-> only accessed within the class
	private int private1=6;
	
	//Protected->accessed within the class and packages
	protected int protected1=20;
	
	//Public->accessed within the class, packages and over the packages
	public int public1=33;
	
	//Default->accessed within the class and packages
	int default1=66;
	
	//Encapsulation used for private variables / methods
	public int getAcc() {
		return private1;
	}
	public void setAcc(int a) {
		private1=a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access1 a=new Access1();
		a.setAcc(45);
		System.out.println(a.getAcc());
		
		
		
	}

}
