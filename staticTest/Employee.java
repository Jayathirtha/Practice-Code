package staticTest;

public class Employee {
	
	private int id = 1;
	private String name = "Name 1";
	
	static int count;
	
	public Employee() {
		count++;
	}
	
	public void displayEmployee() {
		
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Count: " + count);
		
	}
}