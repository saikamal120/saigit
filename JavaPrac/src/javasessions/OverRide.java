
class FourWheel
{
	void engine()
	{
		System.out.println("I use 4 stroke engine");
	}
	
}

class Car extends FourWheel
{
	void engine()
	{
		System.out.println("I use 8 stroke engine");
		
	}
}




public class OverRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car obj1 = new Car();
		obj1.engine();
		
	}

}
