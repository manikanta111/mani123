package com.hdfc.lones.carlones;

public class ChildClass extends FristAbstract
{
	
	
	
	@Override
	public void subtraction() {
		// TODO Auto-generated method stub
		System.out.println("hi iam overridden");
	}
	
	

	public static void main(String[] args) 
	
	{
		ChildClass c=new ChildClass();
		c.addition();
		c.subtraction();
	}


}
