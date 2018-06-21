package com.hdfc.lones.carlones;

public class Calculation {
	int c=0;
	 
	 public void addition(int a,int b)
	 {
		c=a+b;
		System.out.println("addition of a and b is :"+c);
	 }
	 
	 
	 public void subtraction(int a,int b)
	 {
		c=a-b;
		System.out.println("subtraction of a and b is:"+c);
	 }
	 
	 
	 
	   public static void main(String[] args) {
		Calculation obj=new Calculation();
		obj.addition(10,20);
		obj.subtraction(10,20);

		Calculation c1=new Calculation();
		c1.addition(23,34);
		c1.subtraction(23,21);
		
	
		
	}
}
