package listProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String args[]) {
		ArrayList <String> al=new ArrayList<String>();//<int> this type of datatype specification is called generics.it cannot change the data type
		al.add("Ruby");
		al.add("Leeda");
		al.add("Keerthi");
		al.add("Dhanya");
		al.add("Rohit");
		Iterator itr=al.iterator();//interface to travel between elements in an arraylist
		while(itr.hasNext()) {// hasnext() is a method to check nextelement in the itretor
			System.out.println(itr.next());
		}
	}
}
