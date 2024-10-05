package week2;

public class Loops2 {
	static int [] arr= {3,5,7,6};
	static int a=34;
	static int b=39;
	static String d;
	static String v="add";
	
//	Loops2(String d){
//		 v=d;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Loops2 l=new Loops2("sub");
		switch (v){ 
		case "add":
			System.out.println(a+b);//task
			break;
		case "sub":
			System.out.println(a-b);
			break;
		default:
			System.out.println("err");
			break;
		}
		
		//Continue
		System.out.println("contiune start");
		int i=0;
		while(i<5) {
			if(i==3) {
				i++;		 //output pathutu break agama next loop ku contiune agum
				continue;
			}
			System.out.println(i);
			i++;
			}
		
		for(int c:Loops2.arr) {
			System.out.println(c);
		}
	}

}
