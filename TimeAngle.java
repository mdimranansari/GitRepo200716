package com.qait.assignments;

import java.util.Scanner;

public class TimeAngle {
	public static void main(String args[])
	{
		int min = 0;
		System.out.println("Please enter the time in (12 Hrs) format <hh:mm> without 'AM/PM' value = ");
		Scanner reader = new Scanner(System.in);  // Taking entry from user 
		String time = reader.nextLine(); 
		System.out.println("The time entered is = "+time);
		String[] hhmm =time.split(":");
		int hh = Integer.parseInt(hhmm[0]);	//Typecasting the hour string to integer
		int mm = Integer.parseInt(hhmm[1]); //Typecasting the minute string to integer
		System.out.println("The time entered is : "+hh+ " hour(s) and "+mm+" minute(s)");

		if(mm>=60)
			System.out.println("The minute format is invalid.");

		if(hh>12)
			System.out.println("The hour format is invalid.");

		int wrtMin=mm*6;	
		double wrtHrs=0.5*(hh*60+mm);

		double angle1 = Math.abs(wrtHrs-wrtMin);
		double angle2 = 360-angle1;

		System.out.println("The minimum angle between Minute and Hour hand is : "+Math.min(angle1, angle2));
	}
}
