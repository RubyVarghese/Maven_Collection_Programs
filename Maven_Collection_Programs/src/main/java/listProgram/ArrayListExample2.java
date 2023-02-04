package listProgram;

import java.util.ArrayList;

public class ArrayListExample2 {
	public static void main(String args[]) {
		ArrayList <String> name=new ArrayList<String>();  
		name.add("Dhanya");
		name.add("Keerthi");
		name.add("Leeda");
		name.add("Rohit");
		System.out.println(name);
		name.set(0,"Ruby");
		System.out.println(name);
		name.set(3,"Joe");
		System.out.println(name);
	}

}
