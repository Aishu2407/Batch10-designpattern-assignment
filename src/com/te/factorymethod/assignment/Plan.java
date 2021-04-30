package com.te.factorymethod.assignment;

public  abstract class Plan {
	
	  double rate;
	  abstract void getRate();
	 
	 public void calculateBill(int units)
	 {
		 System.out.println(rate*units);
	 }
	}