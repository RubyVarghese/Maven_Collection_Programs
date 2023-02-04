package listProgram;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListSort {

	public static void main(String[] args) {
		ArrayList<String > name=new ArrayList<String>();
		name.add("Reshma");
		name.add("Keerthi");
		name.add("leeda");
		name.add("Rohit");
		name.add("rincy");
		name.add("Dhanya");
		System.out.println(name);
		Collections.sort(name);
		System.out.println(name);
		Collections.sort(name,Collections.reverseOrder());
		System.out.println(name);
	}

}
