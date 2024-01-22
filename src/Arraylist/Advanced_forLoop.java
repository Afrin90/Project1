package Arraylist;

import java.util.ArrayList;

public class Advanced_forLoop {

	public static void main(String[] args) {
		
		ArrayList< String> happy = new ArrayList< String> ();
		happy.add("java");
		happy.add("tina");
		happy.add("mina");
		happy.add("Aiza");
		happy.add("Cucumber");
		happy.add("java");
		
		for (String a: happy) {
		System.out.println(a);	
		}
		
		

	}

}
