package com.java;

import java.util.HashMap;
import java.util.Map;

public class CollEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1,"mango");
		hm.put(3,"orange");
		hm.put(2,"grape");
		hm.put(4,"mango");
		hm.put(5,"banana");
		
		for(Map.Entry m: hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
