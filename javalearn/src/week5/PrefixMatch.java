package week5;

public class PrefixMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String []s= {"Flower","Flow","Flood"};
		String firstword=s[0];
		String res="";
		
		for (int i = 0; i < firstword.length(); i++) {
			boolean isValid=true;
			for (int j = 1; j < s.length; j++) {
				if(firstword.charAt(i)!=s[j].charAt(i)) {
					isValid=false;
				}
			}
			if(isValid) {
				res+=firstword.charAt(i);
			}
			else {
				break;
			}
		}
		System.out.println(res);
		
	}

}
