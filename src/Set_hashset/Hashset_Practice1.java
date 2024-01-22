package Set_hashset;

import java.util.HashSet;

public class Hashset_Practice1 {

	public static void main(String[] args) {
		//doesn't accept the duplicate value HashSet
		HashSet<String> dog = new HashSet <String>(); 
		dog.add("Mina");
		dog.add("Tina");
		dog.add("Lilly");
		dog.add("Mina");
		dog.add("Rina");
		
		System.out.println(dog);
		
		boolean a =dog.contains("Lilly");
		System.out.println(a);
		
		dog.remove("Lilly");
		System.out.println(dog);
	
		dog.clear();
		System.out.println(dog);
		
	
		
		
		
		

	}

}
