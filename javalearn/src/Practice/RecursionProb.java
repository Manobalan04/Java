package Practice;

public class RecursionProb {
	static String Name(String name, int index) {
		if(index==name.length()) {
			return "";
		}
		if(name.charAt(index)== ' ') {
			System.out.print(" ");
		}else if (name!=" ") {
			System.out.print("0");
		}
		return Name(name,index+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="hello world";
		Name(name,0);
	}

}
