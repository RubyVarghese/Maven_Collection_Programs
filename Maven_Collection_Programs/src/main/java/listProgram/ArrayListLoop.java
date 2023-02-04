package listProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListLoop {

	public static void main(String[] args) {
		ArrayList<Integer> arl=new ArrayList<Integer>();
		arl.add(15);
		arl.add(16);
		arl.add(20);
		arl.add(22);
		System.out.println(arl.size());
		
		System.out.println("For Loop");
		for(int counter=0;counter<arl.size();counter++) {
			System.out.println(arl.get(counter));
		}
		System.out.println("WhileLoop");
		int count=0;
		while(arl.size()>count) {
			System.out.println(arl.get(count));
			count++;
		}
		System.out.println("For eachLoop(Advanced forloop)");
		for(Integer num:arl) {
			System.out.println(num);
		}
		System.out.println("Iterator");
		Iterator itr= arl.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
