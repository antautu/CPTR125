package Homework;
import java.util.Scanner;
public class Chap5_HW_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =2,b,c,range; 
        //Scanner s=new Scanner(System.in); 
        //System.out.println("Enter The Range \n"); 
        //range=s.nextInt(); 
        while(num <=10) 
              { 
                  b=1; 
                  c=0; 
                  while(b<= num) 
                       { 
                         if((num%b)==0)
                         {
                           c=c+1; 
                         }
                           b++; 
                       } 
                          if(c==2) 
                          {
                        	  System.out.println(num +" is a prime number"); 
                          }
                           num ++; 
               } 

	
	}
}
