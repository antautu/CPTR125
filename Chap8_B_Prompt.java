package Homework;

public class Chap8_B_Prompt 
{
	
	public int sumArray(int[] array1)
	{
		int sum = 0;
		for (int i = 0; i < array1.length; i ++)
			sum = sum + array1[i]; 
		return sum;
	}
	
	public double[] Append(double[] a, double[] b)
	{
		int n = a.length;
		int m = b.length;
		double[] new_array = new double[n + m];
		for (int i = 0; i < n; i++)
		{
			new_array[i] = a[i]; 
		}
		for (int i = n; i < n + m; i ++)
		{
			new_array[i] = b[i - n];
		}
		return new_array;
	}
	
	public char[] Replace(char[] a, int b, char c)
	{
		 a[b] = c;
		 return a;
	}
}
