package com.java;

public class ErrorHan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
		int x = 100/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("execute rest of the code....");
	}
}
