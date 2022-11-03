package com.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CollEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("mango");
		al.add("apple");
		al.add("mango");
		al.add("grape");
		al.add("mango");
		al.add("banana");
		
		//System.out.println(al);
		/*Iterator itr =  al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		
		for(String fruit:al)
		{
			System.out.println(fruit);
		}
		
		
		
		
	}

}
