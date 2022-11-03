package javasessions;
public class AdditionOfNum {

	public static int add(int a, int b)
	{
		int c = a + b;
		return c;
		
	}
	public static int add(int a, int b, int c)
	{
		int d = a + b + c;
		return d;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(AdditionOfNum.add(2,8));
		System.out.println(AdditionOfNum.add(2,8,10));
		
	}

}
