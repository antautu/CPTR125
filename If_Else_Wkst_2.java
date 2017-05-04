package Homework;
import java.util.Scanner;
public class If_Else_Wkst_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3, num4;
		int max=0;
		
		System.out.println("Enter 4 different integers: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		num4 = scan.nextInt();
			
		if (num1 > num2)
		{
			if (num1 > num3)
			{
				if (num1 > num4)
					max = num1;
			}
				
		}
		
		if (num2 > num1)
		{
			if (num2 > num3)
			{
				if (num2 > num4)
					max = num2;
			}
		}
		
		if (num3 > num1)
		{
			if (num3 > num2)
			{
				if (num3 > num4)
					max = num3;
				else 
					max = num4;
			}
		}
	
		System.out.println("The max is: " + max);
	}

}
