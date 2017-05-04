package Labs;
import java.util.Random;
public class Random_Cylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		
		float radius, height;
		double volume, surf_area;
		
		radius = generator.nextFloat()*9 + 1;
		height = generator.nextFloat()*20 + 10;
		
		volume = Math.PI*Math.pow(radius, 2)*height;
		surf_area = 2.0*Math.PI*radius*height + 2.0*Math.PI*Math.pow(radius, 2);
		
		System.out.println("Radius of the cylinder: " + radius);
		System.out.println("Height of the cylinder: " + height);
		System.out.println("Volume of the cylinder: " + volume);
		System.out.println("Surface area of the cylinder: " + surf_area);
		
		
	}

}
