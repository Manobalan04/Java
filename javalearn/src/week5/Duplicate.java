package week5;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Hello world";
		String [] s1=s.split(" ");
		
		int count=0;
		for(String a1:s1) {
			for (int i = 0; i < a1.length(); i++) {
				if(s.indexOf(a1.charAt(i)) != s.lastIndexOf(a1.charAt(i))) {
					System.out.println("duplicated - "+a1.charAt(i));
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
