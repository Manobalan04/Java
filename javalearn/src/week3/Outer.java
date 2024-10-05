package week3;
//main class la only public and default access modifier
//mattum dha kuduka mudiyum 
public class Outer {	
	int n=22;
	//inner class la 4 types access modifier um use panalam
	static class Inner{	
		int n=11;
		String city;
		String state;
		String country;
		
		Inner(){
			this.city="chennai";
			this.state="Tamilnadu";
			this.country="India";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o=new Outer();
		Inner a=new Inner();
		System.out.println(a.city);
//		Outer.Inner in=o.new Inner();
//		Outer.Inner in=new Outer().new Inner();
//		Outer.Inner in=new Outer.Inner();	static use pana 
	}

}
