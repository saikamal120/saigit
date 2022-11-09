package javasessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CollEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<String> al = new ArrayList<String>();
		
		LinkedList<String> al = new LinkedList<String>();

		al.add("Mango");
		al.add("Grapes");
		al.add("Apples");
		al.add("Mango");
		
		//System.out.println(al);
		
		//Iterator itr = al.iterator();
		
		/*while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		for(String fruit:al)
		{
			System.out.println(fruit);
		}
	}

}
