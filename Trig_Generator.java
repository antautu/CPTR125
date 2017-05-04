package Labs;
import java.util.Random;
public class Trig_Generator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random(); 
		
		int num;
		double sin, cos, tan;
		
		num = generator.nextInt(19)+20;
		
		sin = Math.sin(num);
		cos = Math.cos(num);
		tan = Math.tan(num);
		
		System.out.println("Random number: " + num);
		System.out.println("Sin of random number: " + sin);
		System.out.println("Cos of random number: " + cos);
		System.out.println("Tan of random number: " + tan);

	}

}
