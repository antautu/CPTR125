package In_Class;
import java.util.Scanner;
public class Sphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double radius, volume, surf_area;
		
		System.out.println("Enter the radius of the sphere: ");
		radius = scan.nextDouble();
		
		volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
		surf_area = 4.0 * Math.PI * Math.pow(radius, 2);
		
		System.out.println("Volume of the sphere: " + volume);
		System.out.println("Surface area of the sphere: " + surf_area);
		
	}

}
