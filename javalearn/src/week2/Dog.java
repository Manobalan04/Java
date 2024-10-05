package week2;

public class Dog {

	String name;
	String breed;
	Dog(String a, String b){
		name=a;
		breed=b;
	}
	
	public void setdog(String c, String d) {
		name=c;
		breed=d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d=new Dog("Tommy","Germanshepherd");
		Dog d1=new Dog("Clinton","Doberman");
		System.out.println("name:" + d.name);
		System.out.println("breed:" + d.breed);
		System.out.println("name:" + d1.name);
		System.out.println("breed:" + d1.breed);
		
		d.setdog("bran","pitbull");
		d1.setdog("jimmy","lab");
		System.out.println("name:" + d.name);
		System.out.println("breed:" + d.breed);
		System.out.println("name:" + d1.name);
		System.out.println("breed:" + d1.breed);
	}

}
