package Labs;
import java.util.Scanner;
public class Disappearing_Pencils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double radius, height_tip, height_cyl;
		double volume, lifetime;
		
		System.out.println("Enter the radius of your pencil: ");
		radius = scan.nextDouble();
		System.out.println("Enter the height of the tip of your pencil: ");
		height_tip = scan.nextDouble();
		System.out.println("Enter the height of the cylindrical part of your pencil: ");
		height_cyl = scan.nextDouble();
		
		volume = (Math.PI*Math.pow(radius, 2)*height_cyl) + (Math.PI*Math.pow(radius, 2)*height_tip/3.0);
		lifetime = volume / 25.0 * 7;
		
		System.out.println("Volume of the pencil: " + volume);
		System.out.println("The pencil will likely last " + lifetime + " days");
		
		
		
	}

}
