package Arraylist;

import java.util.ArrayList;

public class ArrayList_generic {

	public static void main(String[] args) {
	
     ArrayList <String> flower = new ArrayList <String>();
     flower.add("rose");
     flower.add("Lilly");
     flower.add("rose");
     flower.add("merigold");
     flower.add("sunflower");
     System.out.println(flower);
     System.out.println(flower.get(0));
     int a=flower.size();
     System.out.println(a);
     for (int i=0;i<flower.size(); i++) {
    	 System.out.println(flower.get(i));
     }
     
	}

}
