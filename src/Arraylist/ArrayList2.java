package Arraylist;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<String> happy = new ArrayList<String> ();
    happy.add("java");
    happy.add("nice");
    happy.add("good");
    happy.add("java");
    happy.add("like");
    int a= happy.size();
    System.out.println(a);
    System.out.println(happy.get(2));
    
    for (int i = 0; i<happy.size();i++) {
    	System.out.println(happy.get(i));
   
    }
    
	}

}
