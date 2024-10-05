package Practice;

class a{
	void diplay() {
		System.out.println("Displayed from class a");
	}
}

class b extends a{
	void diplay() {
		super.diplay();
		System.out.println("Displayed from class b");
	}
}

class c extends b{
	void diplay() {
		super.diplay();
		System.out.println("Displayed from class c");
	}
}

class d extends c{
	void diplay() {
		super.diplay();
		System.out.println("Displayed from class d");
	}
}
public class Task1Inhert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		d d1=new d();
		d1.diplay();
	}

}
