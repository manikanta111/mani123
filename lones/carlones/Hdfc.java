package com.hdfc.lones.carlones;

public class Hdfc implements Rbi{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
	System.out.println("iam overridden deposit method in hdfc");	
	}
	
	public static void main(String[] args) {
		Hdfc hd=new Hdfc();
		hd.deposit();
	}

}
