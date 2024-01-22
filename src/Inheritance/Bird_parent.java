package Inheritance;

public class Bird_parent {

	public static void main(String[] args) {
		 Bird_parent hh = new  Bird_parent();
		 hh.cat();
hh.cat(10, 20, 10);
	}
public void cat () {
	int a = 100;
	System.out.println(a);
}
public void cat (int a, int b, int c) {
	int d = a+b+c;
	System.out.println(d);
}
}

