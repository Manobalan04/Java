package week2;

public class Cons2 {
		String name;
		int age;
		String city;
		
	Cons2(String a, int b, String c){
		name=a;
		age=b;
		city=c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cons2 p= new Cons2("Arun", 24, "chennai");
		Cons2 p1= new Cons2("Gokul", 22, "chennai");
		Cons2 p2= new Cons2("Pokesh", 23, "chennai");
		System.out.println(p.name);
	    System.out.println(p1.name);
	    System.out.println(p2.name);
		
	  //optimize logic for right triangle *
	  		int rows=1;
	  		for(int i=0;i<3;i++) {
	  			for(int j=0;j<rows;j++) {
	  				System.out.print("*");
	  			}
	  			rows+=2;
	  			System.out.println();
	  		}
	}

}