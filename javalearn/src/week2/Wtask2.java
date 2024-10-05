package week2;

public class Wtask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<6;i++) {
			for(int j=0;j<8;j++) {
				if(i==0 && j<8) {
					System.out.print("*");
				}
				else if (i==1 && j<1) {  		//2 row la 1st clm mattum "*" varum 
					System.out.print("*");		//so indha line 
				}
				else if (i==1 && j<2) {
					System.out.print(" ");		//methi ella clm empty ah varum 
				}								//so double cots kula empty space vitruken
				else if (i==1 && j<3) {
					System.out.print(" ");
				}
				else if (i==1 && j<4) {
					System.out.print(" ");
					}
				else if (i==1 && j<5) {
					System.out.print(" ");
				}
				else if (i==1 && j<6) {
					System.out.print(" ");
				}
				else if (i==1 && j<7) {
					System.out.print(" ");
				}
				else if (i==1 && j<8) {			//2 row last clm la "*" varum 
					System.out.print("*");		//so idhula "*" print panikuren
				}				
				else if (i==2 && j<1) {			
					System.out.print("*");
				}
				else if (i==2 && j<2) {
					System.out.print(" ");
				}
				else if (i==2 && j<3) {
					System.out.print(" ");
				}
				else if (i==2 && j<4) {
					System.out.print(" ");
					}
				else if (i==2 && j<5) {
					System.out.print(" ");
				}
				else if (i==2 && j<6) {
					System.out.print(" ");
				}
				else if (i==2 && j<7) {
					System.out.print(" ");
				}
				else if (i==2 && j<8) {
					System.out.print("*");
				}
				else if (i==3 && j<1) {
					System.out.print("*");
				}
				else if (i==3 && j<2) {
					System.out.print(" ");
				}
				else if (i==3 && j<3) {
					System.out.print(" ");
				}
				else if (i==3 && j<4) {
					System.out.print(" ");
					}
				else if (i==3 && j<5) {
					System.out.print(" ");
				}
				else if (i==3 && j<6) {
					System.out.print(" ");
				}
				else if (i==3 && j<7) {
					System.out.print(" ");
				}
				else if (i==3 && j<8) {
					System.out.print("*");
				}
				else if (i==4 && j<8) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
