package week1;

import week2.Inher1;

public class Inher2 extends Inher1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a=new int[7];
		
		a[0]=21;
		a[5]=34;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		Inher2 i=new Inher2();
		System.out.println(i.a);
	}

}
