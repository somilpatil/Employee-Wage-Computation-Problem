package com.bl;

import java.util.Random;
public class EmpWage  {
	public static void main(String[] args) {
		public static final int isPresent=1;
		public static final int isAbsent=0;
		public static final int isFullTime=8;
		public static final int isPartTime=4;
		public static final int wagePerHour=20;
		public static final int numberOfWorkingDays=20;
		public static int dailyWage=0;
		public static int monthlyWage=0;
		public static int totalHours=0;
		public static int hours=0;
		public static void main(String[] args) {
			System.out.println("Welcome to Employee Wage Computation program");
			for( int i=0; i<numberOfWorkingDays
					
					&& totalHours<100; i++) {
				Random random = new Random();
				int Emp_check = random.nextInt(3);
				switch (Emp_check) {
				case isPresent: {
					System.out.println("Employee is present");
					dailyWage = isFullTime * wagePerHour; hours=isFullTime;
					break;
				} 
				case isAbsent: {
					System.out.println("Employee is Absent");
					break;
				} 
				default: {
					System.out.println("Employee is part time ");
					dailyWage = isPartTime * wagePerHour;
					hours=isPartTime; break;
				} 
		       } 
				monthlyWage = dailyWage + monthlyWage;
				totalHours = hours + totalHours;
		  } System.out.println("Daily wage : " + dailyWage);
			System.out.println("Monthly wage : " +monthlyWage);
		}
	}
}
