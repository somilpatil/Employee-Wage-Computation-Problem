package com.bl;

import java.util.Random;
public class EmpWage  {

	public static void main(String[] args) {
		Random rd = new Random();
		int empcheck = rd.nextInt(2);
		if(empcheck==1) {
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is Absent");
		}
	}
}
