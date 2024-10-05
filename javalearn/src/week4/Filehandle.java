package week4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filehandle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f=new File("text.CSV");
//		f.setReadOnly();	//one time dha write panalam
//		f.setWritable(true);
		System.out.println(f.getAbsolutePath());
		if(f.createNewFile()) {
			System.out.println("file created");
		}
		else {
			System.out.println("already existed");
		}
		
		FileWriter fw=new FileWriter(f);
		fw.append("name,timing,course\n");
		fw.append("gokul,8am-9am,java");
		fw.append("say my name\n");
		fw.append("heisnberg");
		fw.close();
	
		Scanner sc=new Scanner(f);
		System.out.println(sc.next()); 	//single word ah eduka
		
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
	}

}
