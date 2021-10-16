package com.bl;

import java.util.Random;
public class EmpWage  {
	public static void main(String[] args) {
		Random rd = new Random();
		int empcheck = rd.nextInt(3);
		int wagePerHr = 20;
		int fullTimeWorkHrs = 8;
		int partTimeWorkHrs = 4;
		switch(empcheck) {
		case 1:
			System.out.println("Salary of Fulltime Employee");
			System.out.println( wagePerHr * fullTimeWorkHrs);
		break;
		case 2:
			System.out.println("Salary of Parttime Employee");
			System.out.println( wagePerHr * partTimeWorkHrs );
		break;
		default:
			System.out.println("Salary = 0");
		}
	}
}
