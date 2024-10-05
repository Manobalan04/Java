package bank;

public class Company {

	protected String Name="Gokul";
	protected String Class="java";
	
	
	Company(){
		this(10);
		System.out.println("Empty Constructor 1");
	}
	
	Company(int a){
		System.out.println("parameter Constructor 2 ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company c=new Company();
	}

}
