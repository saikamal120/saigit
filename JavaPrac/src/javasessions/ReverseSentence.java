package javasessions;

import java.util.Scanner;

public class ReverseSentence {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputString = "This is java string";
        String outputString = revSentence(inputString);
        System.out.println(outputString);
	}

	private static String revSentence(String inputString) {
		// TODO Auto-generated method stub
		
		String [] words = inputString.split("\\s");
		String rev = "";
		for (int i = words.length-1;i>=0;i--)
		{
			StringBuilder sb = new StringBuilder(words[i]);
			rev = rev + sb.reverse() + " ";
		}
		
		return rev;
	}

}
