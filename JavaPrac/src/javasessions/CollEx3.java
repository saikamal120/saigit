package com.java;

import java.util.HashSet;

public class CollEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> al = new HashSet<String>();
		
		al.add("mango");
		al.add("Apple");
		al.add("mango");
		al.add("grape");
		al.add("Apple");
		al.add("banana");
		
		for(String fruit:al)
		{
			System.out.println(fruit);
		}
	}

}
