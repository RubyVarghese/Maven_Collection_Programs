package listProgram;

import java.util.ArrayList;

public class ArrayListRemove {

	public static void main(String[] args) {
		ArrayList<String > name=new ArrayList<String>();
		name.add("Dhanya");
		name.add("Keerthi");
		name.add("Leeda");
		name.add("Rohit");
		name.add("Rincy");
		name.add("Reshma");
		System.out.println(name);
		name.remove("Leeda");
		System.out.println(name);
		name.remove(4);
		System.out.println(name);

	}

}
