package week2;

public class Person {
	String name;
	int age;
	
	Person(String a, int b){
		name =a;
		age =b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p=new Person("Arun",24);
		Person p1=new Person("Pokesh",23);
		System.out.println("name:"+p.name);
		System.out.println("age:"+p.age);
		System.out.println("name:"+p1.name);
		System.out.println("age:"+p1.age);
	}

}
