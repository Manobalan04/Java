package week2;

//Inheritance
//B->A Single inheritance
//B->A, C->B Multilevel inheritance
//B->A, C->A Hierarchical inheritance
//B->A,C Multiple inheritance its not supported in java
//B->A, C->A, D->C Hybrid inheritance
class parent{
	int a=3;
	
	public parent() {
		System.out.println("parent cons");
	}
	public parent(int a) {
		System.out.println("parent cons param");
	}
	
	public void p1() {
		System.out.println("from parent");
	}
}
public class Inher1 extends parent {
	protected int a=34;
	
	public Inher1() {
		super();
		System.out.println("child cons");
	}
	
	@Override
	public void p1() {
		super.p1();
		System.out.println(super.a);
		System.out.println("from child");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inher1 i =new Inher1();
		i.p1();
		System.out.println(i.a);
	}

}
