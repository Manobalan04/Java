package week3;

import java.util.Scanner;

//Enumeration
enum Pr{
	Gokul,
	Arun,
	pokesh
}
public class Enum1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Pr view = Pr.Gokul;
		Pr view = Pr.valueOf("Arun");
		System.out.println(view);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.nextLine();				//new line la print agum
//		String n1=sc.next();		single word mattum dha edukum
		String n1=sc.nextLine();	//line la iruka ella word um edukum
		float f=sc.nextFloat();
		double d=sc.nextDouble();
		System.out.println(n);
		System.out.println(n1);
		System.out.println(f);
		System.out.println(d);
		
		int [] arr=new int[3];
		System.out.println("Enter the arr");
		for (int i = 0; i < arr.length; i++) {
			int num1=sc.nextInt();
			arr[i]=num1;
		}
		sc.close();
		for(int a:arr) {
			System.out.println(a);
		}
	}

}
