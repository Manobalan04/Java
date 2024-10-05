package week1;

public class Task7 {
	int i= 12;
	char b= (char) i;
	int x= b;
	float f= x;
	double d= f;
	public static void main(String[] args) {
		Task7 t=new Task7();
		System.out.println(t.i);
		System.out.println(t.b);
		System.out.println(t.x);
		System.out.println(t.d);
		System.out.println(t.f);
	}
}
