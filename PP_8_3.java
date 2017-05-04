package Homework;

public class PP_8_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[51];
		int group1 = 0, group2 = 0, group3 = 0, group4 = 0, group5 = 0;
		int group6 = 0, group7 = 0, group8 = 0, group9 = 0, group10 = 0;
		String count1 = "", count2 = "", count3 = "", count4 = "", count5 = "";
		String count6 = "", count7 = "", count8 = "", count9 = "", count10 ="";
		for (int i = 0; i < 50; i ++)
		{
			array[i] = (int)(Math.random() * 99 + 1);
			if (array[i] >= 1 && array[i] <= 10)
			{
				group1 ++; 
				count1 = count1 + "*";
			}
			if (array[i] >= 11 && array[i] <= 20)
			{
				group2 ++;
				count2 = count2 + "*";
			}
			if (array[i] >= 21 && array[i] <= 30)
			{
				group3 ++; 
				count3 = count3 + "*";
			}
			if (array[i] >= 31 && array[i] <= 40)
			{
				group4 ++;
				count4 = count4 + "*";
			}
			if (array[i] >= 41 && array[i] <= 50)
			{
				group5 ++; 
				count5 = count5 + "*";
			}
			if (array[i] >= 51 && array[i] <= 60)
			{
				group6 ++;
				count6 = count6 + "*";
			}
			if (array[i] >= 61 && array[i] <= 70)
			{
				group7 ++; 
				count7 = count7 + "*";
			}
			if (array[i] >= 71 && array[i] <= 80)
			{
				group8 ++;
				count8 = count8 + "*";
			}
			if (array[i] >= 81 && array[i] <= 90)
			{
				group9 ++; 
				count9 = count9 + "*";
			}
			if (array[i] >= 91 && array[i] <= 100)
			{
				group10 ++;
				count10 = count10 + "*";
			}
		}
		System.out.println("1  - 10  | " + count1);
		System.out.println("11 - 20  | " + count2);
		System.out.println("21 - 30  | " + count3);
		System.out.println("31 - 40  | " + count4);
		System.out.println("41 - 50  | " + count5);
		System.out.println("51 - 60  | " + count6);
		System.out.println("61 - 70  | " + count7);
		System.out.println("71 - 80  | " + count8);
		System.out.println("81 - 90  | " + count9);
		System.out.println("91 - 100 | " + count10);
	}

}

