package com.bl;

import java.util.Random;
public class EmpWage  {
	public static void main(String[] args) {
		Random rd = new Random();
		int empcheck = rd.nextInt(3);
		int totalWorkingDays = 20;
		int wagePerHr = 20;
		int fullTimeWorkHrs = 8;
		int partTimeWorkHrs = 4;
		switch (empcheck) {
		case 1:
			System.out.println("Month Salary of FullTime Employee");
			System.out.println((fullTimeWorkHrs  *  wagePerHr) * totalWorkingDays  );
			break;
		case 2:
			System.out.println("Month Salary of PartTime Employee");
			System.out.println( (partTimeWorkHrs  *  wagePerHr) * totalWorkingDays  );
			break;
		default:
			System.out.println("Salary=0");
		
		}
	}
}
