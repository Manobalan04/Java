package week2;

public class Wtask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//*
		//***
		//*****
		
		//here
		//i=no of row
		//j= no of column
		//right triangle * format
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				if(i==0 && j<1) {
					System.out.print("*");
				}
				else if(i==1 && j<3) {
					System.out.print("*");
				}
				else if(i==2) {
					System.out.print("*");
				}		
			}
			System.out.println();
		}
		
		System.out.println();
		
		//E format
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				
				if(i==0 && j<5) {
					System.out.print("*");
				}
				else if(i==1 && j<1) {
					System.out.print("*");
				}
				else if(i==2 && j<5) {
					System.out.print("*");
				}
				else if(i==3 && j<1) {
					System.out.print("*");
				}
				else if(i==4 && j<5) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
