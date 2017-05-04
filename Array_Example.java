package In_Class;

public class Array_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] array = new double[10];
		
		for (int i = 0; i < array.length; i ++)
		{
			array[i] = Math.pow(2, i);
		}
		// Prints out in reverse order
		for (int i = array.length-1; i >= 0; i --)
		{
			System.out.print(array[i] + "  ");
		}
	}

}
