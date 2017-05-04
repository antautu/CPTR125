package Homework;
import java.text.DecimalFormat;
public class MSRC_Wkst_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 2.0;
		double f_x, f_x1, f_x2, f_x3, f_x4;
		double h1, h2, h3, h4;
		double eq1, eq2, eq3, eq4;
		
		f_x = Math.pow(x, 3) + Math.cos(x);
		h1 = 0.1;
		h2 = 0.01;
		h3 = 0.001;
		h4 = 0.0001;
		
		f_x1 = Math.pow((x+h1), 3) + Math.cos(x+h1);
		f_x2 = Math.pow((x+h2), 3) + Math.cos(x+h2);
		f_x3 = Math.pow((x+h3), 3) + Math.cos(x+h3);
		f_x4 = Math.pow((x+h4), 3) + Math.cos(x+h4);
		
		eq1 = (f_x1 + f_x) / h1;
		eq2 = (f_x2 + f_x) / h2;
		eq3 = (f_x3 + f_x) / h3;
		eq4 = (f_x4 + f_x) / h4;
		
		
		DecimalFormat fmt = new DecimalFormat("0.######");
		
		
		System.out.println(fmt.format(eq1));
		System.out.println(fmt.format(eq2));
		System.out.println(fmt.format(eq3));
		System.out.println(fmt.format(eq4));
		
	}

}
