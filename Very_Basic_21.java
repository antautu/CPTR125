package In_Class;
import java.util.Random;
public class Very_Basic_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random generator = new Random();
		
		int num1, num2, num3, num4;
		
		num1 = generator.nextInt(13)+2;
		num2 = generator.nextInt(13)+2;
		num3 = generator.nextInt(13)+2;
		num4 = generator.nextInt(13)+2;
		
		System.out.println("Computer's Cards: " + num1 + "   " + num2);
		System.out.println("Our Cards: " + num3 + "   " + num4);
		
	}

}
