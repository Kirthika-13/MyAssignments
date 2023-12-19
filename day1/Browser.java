package week1.day1;

public class Browser {

	public static void main(String[] args) {
	System.out.println("This is my Browser");
	
	//Call a method from another class
	Chrome obj = new Chrome();
	obj.getName();
	obj.printName();
	
	}

}
