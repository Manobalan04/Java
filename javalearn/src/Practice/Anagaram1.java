package Practice;

public class Anagaram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String []str= {"eat","tea","tan","ate","nat","bat"};
		String frst=str[0];
		String grp= "";
		
		for (int i = 0; i < frst.length(); i++) {
//			boolean isvalid=true;
			for (int j = 0; j < str.length; j++) {
				if(frst.charAt(i)==str[j].charAt(i)) {
					grp+=frst.charAt(i);
				}
			}
//			if(isvalid) {
//				grp+=frst.charAt(i);
//			}
//			else {
//				break;
//			}
		}
		System.out.println(grp);
	}

}
