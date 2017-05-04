package Homework;

public class FEarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double h = 0.0001;
		int n = (int)(1 + (1/h));
		
		double[] y = new double[n];
		y[0] = 1.0;
		//System.out.print(y[0] + "  ");
		
		for (int i = 1; i < n; i ++)
		{
			y[i] = y[i -1] + h*y[i - 1];
			//System.out.print(y[i] + "  ");
		}
		System.out.println(y[n - 1]);
		System.out.println(Math.exp(1));
		
	}

}
