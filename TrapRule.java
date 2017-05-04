package Homework;

public class TrapRule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3; // needed about 100000000 to get close to actual result
		double a = 1, b = 10, h, area = 0, totalArea = 0;
		h = (b -a) / n;
		
		// Trapezoid Rule
		for (double count = a; count < b; count = count + h)
		{
			area = h*(0.5*Math.log(count) + 0.5*Math.log(count + h));
			totalArea = totalArea + area;
		}
		System.out.println("Total area: " + totalArea);
		
		// Midpoint Rule
		area = 0;
		totalArea = 0;
		for (double count = a; count < b; count = count + h)
		{
			area = h*(Math.log((count + count + h) / 2));
			totalArea = totalArea + area;
		}
		System.out.println("Total area: " + totalArea);
		
		// Simpson's Rule
		area = 0;
		totalArea = 0;
		//for (double count = a; count < b; count = count + h)
		//{
		double count = a;
			area = (h/3)*(Math.log(count) + 4*Math.log(count + h) + 2*Math.log(count + 2*h) + Math.log(count + 3*h));
			totalArea = totalArea + area;
		//}
		System.out.println("Total area: " + totalArea);
	}

}
