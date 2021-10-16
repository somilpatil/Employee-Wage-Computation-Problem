package com.bl;

import java.util.Random;
public class EmpWage  {
	public static void main(String[] args) {
		Random rd = new Random();
		int empcheck = rd.nextInt(3);
		int wagePerHr= 20;
		int fullTimeWorkHrs= 8;
		int partTimeWorkHrs= 4;
		if(empcheck==1) {
			System.out.println("FullTime Wage");
			System.out.println( wagePerHr * fullTimeWorkHrs );
		}
		else if(empcheck==2) {
			System.out.println("PartTime Wage");
			System.out.println( wagePerHr * partTimeWorkHrs);
		}
		else {
			System.out.println("Salary = 0");
		}
	}
}
