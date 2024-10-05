package Test1;

import java.util.Scanner;

enum Tokens{
	xcvb,
	wert,
	sdfg
}
public class Enum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.print("Enter a token: ");
            String user = sc.nextLine();
            try {
            	Tokens tk=Tokens.valueOf(user);
            	System.out.println(tk);
            	break;
            }catch(IllegalArgumentException e) {
//            	e.printStackTrace();
            	System.out.println("invalid token");
            	
            }
		}
		sc.next();
	}

}
