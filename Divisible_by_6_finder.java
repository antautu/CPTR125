package In_Class;

public class Divisible_by_6_finder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, max = 10;
		for (x = 0 ; x <= max; x++)
		{
			for (y = 0; y <= max; y++)
			{
				if(x*y !=0 && (x*y) % 6 == 0)
				{
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
	}

}
