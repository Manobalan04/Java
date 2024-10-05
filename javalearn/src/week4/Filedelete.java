package week4;

import java.io.File;

public class Filedelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f=new File("text.txt");
		
		if(f.delete()) {
			System.out.println("file delete");
		}
		else {
			System.out.println("already deleted");
		}
	}

}
