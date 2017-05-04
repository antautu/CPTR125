package Homework;
import java.util.Random;
public class MSRC_Wkst_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		
		int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
		
		num1 = generator.nextInt(6) + 1;
		num2 = generator.nextInt(7);
		num3 = generator.nextInt(7);
		
		num4 = generator.nextInt(10);
		num5 = generator.nextInt(10);
		num6 = generator.nextInt(10);
		
		num7 = generator.nextInt(9) + 1;
		num8 = generator.nextInt(8) + 2;
		num9 = generator.nextInt(7) + 3;
		num10 = generator.nextInt(6) + 4;
		
		System.out.println("Phone number: " + num1+num2+num3 + "-" + num4+num5+num6 + "-" + num7+num8+num9+num10);
		
	}

}
