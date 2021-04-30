package com.te.factorymethod.assignment;


import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		 GetPlanFactory plan=new GetPlanFactory();
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the plan");
	     String planType=sc.nextLine();
	     System.out.println("Enter the units");
	     int units= sc.nextInt();

		Plan p=plan.getPlan(planType);
		System.out.println(p);
		System.out.println(planType+"amount is" + units);
		p.getRate();
		p.calculateBill(units);
			
				
	
	
	}

}