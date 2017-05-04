package Homework;

public class Counter_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter myCounter1 = new Counter(); // Counter constructor
		Counter myCounter2 = new Counter(); // Counter constructor
		
		myCounter1.click();  // clicks myCounter1
		myCounter1.click();  // clicks myCounter1
		myCounter1.click();  // clicks myCounter1
		myCounter1.click();  // clicks myCounter1
		
		myCounter2.click();  // clicks myCounter2
		myCounter2.click();  // clicks myCounter2
		myCounter2.click();  // clicks myCounter2
		
		myCounter1.reset();  // resets myCounter1
		myCounter1.click();  // clicks myCounter1
		myCounter1.click();  // clicks myCounter1
		
		// Prints out the count of myCounter1 as an integer (getCount)
		System.out.println(myCounter1.getCount()); 
		// Prints out the count of myCounter2 as a string (toString)
		System.out.println(myCounter2);
	}
}