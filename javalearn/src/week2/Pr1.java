package week2;

class Oride {
//	@Override
	void d1(int a){

	}	
}
class Oride1 extends Oride {
	void d1(int a){
		
	}
}
class Oload{
//	@Overload
		void s1() {
			
		}
		void s1(int a,int b) {
			
		}
		int s1(int a) {
			return 0;
		}	
		
		//single ton class
		
		private Oload(){
			System.out.println("single ton class");
		}
}
public class Pr1 {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Pr1 p=new Pr1();			
	}

}
