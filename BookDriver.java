package Homework;

public class BookDriver {
	public static void main(String[] args) {
		
		Book book1 = new Book("Calculus", "Stewart", "Cengage", 2015);
		Book book2 = new Book("Java Software Solutions", "Lewis and Loftus", 
				"Pearson", 2012);
		Book book3 = new Book("The Hunt for Red October", "Tom Clancy", 
				"Naval Institute Press", 1984);
		
		System.out.println(book1.getTitleandAuthor());
		System.out.println();
		
		book1.Return();
		
		book2.Checkout();
		book2.Checkout();
		book2.Return();
		book2.Return();
		
		book3.Checkout();
		book3.Return();
		book3.Checkout();
		book3.Return();
		book3.Checkout();
		book3.Return();
		book3.Checkout();
		//book3.Rating(6); // checked my method
		System.out.println(book3.getTimesCO());
		System.out.println();
		
		System.out.println(book1);
		System.out.println();
		System.out.println(book2);
		System.out.println();
		System.out.println(book3);
		
	}
}
