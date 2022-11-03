
class Adder
{
	static int add(int a,int b)
	{
		return a+b;
	}
	static int add(int a,int b, int c)
	{
		return a+b+c;
	}
	static int add(int a,int b, int c, int d)
	{
		return a+b+c+d;
	}

}



public class OverLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Adder.add(2,3));
		System.out.println(Adder.add(2,3,4));
		System.out.println(Adder.add(2,3,4,5));
	}

}
