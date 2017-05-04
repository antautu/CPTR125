package Homework;

public class Chap8_B_Prompt_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chap8_B_Prompt test1 = new Chap8_B_Prompt();
		Chap8_B_Prompt test2 = new Chap8_B_Prompt();
		Chap8_B_Prompt test3 = new Chap8_B_Prompt();
		
		int[] a = {1, 2, 3, 4};
		int b = test1.sumArray(a);
		System.out.println(b);
		
		double[] c = {1.1, 2.2, 3.3, 4.4};
		double[] d = {5.5, 6.6};
		double[] e = test2.Append(c, d);
		for (int i = 0; i < e.length; i ++)
			System.out.print(e[i] + "  ");
		
		System.out.println(" ");
		char[] f = {'a', 'b', 'c', 'd'};
		int g = 2;
		char h = 'e';
		char[] j = test3.Replace(f, g, h);
		for (int i = 0; i < j.length; i ++)
			System.out.print(j[i] + "  ");
		
		
	}

}
