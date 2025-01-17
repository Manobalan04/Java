package week5;

//collection
//ArrayList
//LinkedList or List both do same work
		//*LinkedList is class and List is Interface these are difference
//HashSet or Set both do same work
		//*HashSet is class and Set is Interface these are difference
//HashMap

import java.util.ArrayList;
import java.util.Iterator;

public class Colleti {

	//Array
	//Dynamic
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Arraylist is inbuilt class
		ArrayList<Integer> a = new ArrayList<Integer>();
		//creating array values using add method
		a.add(17);
		a.add(34);
		a.add(0,9);
		a.add(1,13);
		 
		System.out.println(a);
		System.out.println(a.get(2)); //get the value using index
		a.set(1, 14);	//update the value using set method
		System.out.println(a);
		
//		a.remove(0);
//		a.clear();
		//(->) lamda function
		//here e will take each element in array to check with 15 if condi
//		a.removeIf(e -> e >= 15);
		System.out.println(a);
//		System.out.println(a.isEmpty());
		
		System.out.println(a.subList(0, 2));	//like substring cut index from 0 t0 2
		
		//print each element in the array 
		//here we use size 
		for (int i = 0; i < a.size(); i++) {
		System.out.println(a.get(i));
		}
		 
		//simplified for loop
		//print each element in the array
		System.out.println("--------------");
		a.forEach(e->System.out.println(e));
		
		//disadvantage of foreach
		//can't break the loop using break;
		//if a loop is running we can't remove the element it will occur
		//concurrent modification error
		
//		a.forEach(e->{
//			System.out.println(e);
//			if(e==9) {
//				a.remove(a.indexOf(e));
//		}
//			System.out.println("----");
//		});
		 
		//to avoid concurrent modification
		//Iterator is inbuilt class
		//iterator ah it ndra var la declare pandren then na iterate pana pora array a.iterator nu declare pandren
		Iterator<Integer> it= a.iterator();
		
//		System.out.println(it.next());
		
		//no concurrence and can stop the loop
		while(it.hasNext()) {
			if(it.next()==14) {
				it.remove();
				break;
			}
		}
		System.out.println(a);
		//here tostring is convert the array into string so able access string method
		System.out.println(a.toString().charAt(0));
		
		
	}

}
