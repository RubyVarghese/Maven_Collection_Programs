package listProgram;

import java.util.ArrayList;

public class ArrayListSize {

	public static void main(String[] args) {
		ArrayList<Integer > num=new ArrayList<Integer>();
		num.add(10);
		num.add(15);
		num.add(16);
		num.add(17);
		num.add(18);
		System.out.println(num);
		num.remove(4);
		System.out.println(num);
		System.out.println("Number of elements is arraylist " +num.size());
		
		


	}

}
