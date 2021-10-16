package com.bl;

import java.util.Random;
public class EmpWage  {
	public static void main(String[] args) {
		Random rd = new Random();
		int empcheck = rd.nextInt(2);
		int wagePerHour = 20;
		int workHrs = 8;
		if(empcheck==1) {
			System.out.println("Employee is Present");
			System.out.println(wagePerHour * workHrs);
		}
		else {
			System.out.println("Employee is Absent");
		}
	}
}
