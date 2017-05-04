package Homework;
import java.util.Scanner;
public class DNA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String base1, base2="A";
		String bases1 = "", bases2 = "", connectors = "";
		do
		{
			System.out.println("Enter a base: ");
			base1 = scan.nextLine();
			bases1 = bases1 + base1;
			switch(base1)
			{
			case "C":
				base2 = "G";
				break;
			case "G":
				base2 = "C";
				break;
			case "A":
				base2 = "T";
				break;
			case "T":
				base2 = "A";
				break;
			case "E":
				base2 = "E";
				break;
			}
			bases2 = bases2 + base2;
			connectors = connectors + "|";
		}while(!base1.equals("E"));
		System.out.println(bases1);
		System.out.println(connectors);
		System.out.println(bases2);
	}

}
