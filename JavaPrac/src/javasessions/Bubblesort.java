package javasessions;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input [] = {7,2,1,5};
		
		
		
		String str = Arrays.toString(bubble(input));
		
		System.out.println(str);
		
	}

	private static int[] bubble(int[] input) {
		// TODO Auto-generated method stub
		int temp;
		for (int i = 0;i<input.length-1;i++)
		{
			for(int j = 0;j<input.length-i-1;j++)
			{
				if(input[j] > input[j+1])
				{
					temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
				}
			}
		}
		return input;
	}

}
