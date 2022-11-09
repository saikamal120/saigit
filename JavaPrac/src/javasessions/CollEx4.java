package javasessions;

import java.util.TreeSet;

public class CollEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> al = new TreeSet<String>();
		
		al.add("Mango");
		al.add("Grapes");
		al.add("Apples");
		al.add("Mango");
		al.add("Yam");
		al.add("Banana");
		al.add("Avacado");
		for(String fruit:al)
		{
			System.out.println(fruit);
		}
		
	}

}
