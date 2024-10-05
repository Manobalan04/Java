package week5;

import java.util.ArrayList;
import java.util.HashSet;

public class Hashset01 {

	//In Hashset cannot add duplicates  
	//It automatically remove duplicates
	//In hashset there is no get method and set method
	//all other method are available like arraylist and linked list
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hs= new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(20);
		hs.add(40);
		System.out.println(hs);
		System.out.println(hs.size());
		
		//if we need use get and set then change it into arratlist or linklist
		
		ArrayList<Integer> al= new ArrayList<> (hs);
		al.set(2,12);
		System.out.println(al);
		System.out.println(al.get(1));
		
	}

}
