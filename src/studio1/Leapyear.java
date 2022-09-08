package studio1;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = in.nextInt();
		
		boolean b1= year%4==0;
		boolean b2= year%100==0;
		boolean b3= year%400==0;
		
		boolean leapyear1= b1==true && b2==false;
		boolean leapyear2= b1==true && b3==true;
		boolean leapyear= leapyear1==true || leapyear2==true;
		
		System.out.println(leapyear);
		
	}

}
