package com.java;


interface Fistinter
{
 public void myMethod();

}
interface Secondinter
{
 public void myOtherMethod();	
}

class DemoCls implements  Fistinter, Secondinter 
{
	public void myMethod() {
		System.out.println("i'm your first interface");
	}
	
	
	 public void myOtherMethod() {
		 System.out.println("i'm your second interface");
	}
	 
}
