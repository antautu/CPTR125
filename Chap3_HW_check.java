package Homework;


public class Chap3_HW_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3.2
		String introduction = "introduction";
		
		System.out.println(introduction.charAt(7));
		
		
		// 3.4
		String original;
		original = "Weedle";
		
		String change = original.replace('e', 'j');
		
		System.out.println(change);
		
		
		// 3.5
		String m1, m2, m3;
		m1 = "Quest for the Holy Grail";
		m2 = m1.toLowerCase();
		m3 = m1 + " " + m2;
		System.out.println(m3.replace('g',  'z'));
		
		
		
		
		
	}

}
