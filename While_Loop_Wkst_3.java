package Homework;

public class While_Loop_Wkst_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2, nums_between, num2, max = 1000000;
		int num_primes = 0;
		
		while (num <= max)
		{
			nums_between = 1;
			num2 = 0;
			while (nums_between <= num)
			{
				if (num % nums_between ==0)
				{
					num2 ++;
				}
				nums_between ++;
			}
			if (num2 == 2)
			{
				num_primes ++;
			}
			//System.out.println(num + "    " + num_primes);
			num++;	
		}
		System.out.println(num_primes);
	}

} 