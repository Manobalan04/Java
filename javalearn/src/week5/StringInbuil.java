package week5;

public class StringInbuil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=" hello world ";
		String [] s2=s.split(" ");
		
		for(String a1:s2) {
			System.out.println(a1+" - "+a1.length());
		}

		
		String [] s1=s.split(" ");	//we can split the word
		//only able to see the value by debugging
		System.out.println(s1);
		
		System.out.println(s.charAt(4));
		System.out.println(s.indexOf("o",5));	//2nd param is leave 1st 5 index and then start to find
		System.out.println(s.indexOf("o"));
		System.out.println(s.lastIndexOf("o"));
		
		System.out.println(s.concat(" new"));	//it will not affect the real value
//		s=s.concat(" new");	//assigning like this it will affect the real value
		System.out.println(s);
		
		System.out.println(s.contains("wor"));	
		System.out.println(s.contentEquals("Hello world"));	//only accept the exact value
		System.out.println(s.equalsIgnoreCase("HELLO WORLD"));	//don't check the case 
		System.out.println(s.substring(5));	//cut the values of 1st 5 index
		System.out.println(s.substring(0,7));	//cut & print the values from 0to7 
		
		System.out.println(s.startsWith("hel"));
		System.out.println(s.endsWith("rld"));
		
		System.out.println(s.indent(1)); //add space in front of the string
		System.out.println(s.length());	//check overall length of the string also include space
		System.out.println(s.trim().length());	//trim remove the unwanted space from starting & ending
		
		String k=" ";
		System.out.println(k.isBlank());	//only include words
		System.out.println(k.isEmpty());	//include space and words
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		char [] c=s.toCharArray();	//convert string to char array
		char [] d= {'l','a','p','t','o','p'};	//convert char array to string
		System.out.println(String.copyValueOf(d));
		
		
	}

}
