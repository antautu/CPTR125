package In_Class;

public class Compare_To {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phr_1, phr_2;
		phr_1 = "alpha";
		phr_2 = "omega";
		
		//phr_1 = "apply";
		//phr_2 = "apple";
		
		//phr_1 = "horseflies"; // will print out the difference in character #
		//phr_2 = "horse"; 
		
		//phr_1 = "cat";
		//phr_2 = "dog";
		
		int result = phr_1.compareTo(phr_2);
		System.out.println(result);
		if (result < 0)
			System.out.println(phr_1 + " comes before " + phr_2);
		else 
		{
			if (result == 0)
				System.out.println("The phrases are equal.");
			else
				System.out.println(phr_1 + " follows " + phr_2);
		}
	}

}
