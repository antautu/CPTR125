package In_Class;
import java.util.Random;
public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		
		double num1, num2, num3;
		double circle, square, triangle;
		double max1, min1, max2, min2, max3, min3, max4, min4, MAX, MIN;
		
		num1 = generator.nextFloat(); // Automatically between 0.0 and 1.0
		num2 = generator.nextFloat(); // Could have used Math.Random as well
		num3 = generator.nextFloat();
		
		circle = Math.PI * Math.pow(num1, 2);
		
		square = 4.0 * num2;
				
		triangle = 	0.5 * Math.pow(num3, 2);
		
		max1 = Math.max(circle, square);
		max2 = Math.max(circle, triangle);
		max3 = Math.max(square, triangle);
		max4 = Math.max(max1, max2);
		MAX = Math.max(max3, max4);
		
		min1 = Math.min(circle, square);
		min2 = Math.min(circle, triangle);
		min3 = Math.min(square, triangle);
		min4 = Math.min(min1, min2);
		MIN = Math.min(min3, min4);
		
		
		System.out.println(num1 + " " + num2 + " " + num3);
		System.out.println("Maximum area: " + MAX);
		System.out.println("Minimum area: " + MIN);
		
		
		
	}

}
