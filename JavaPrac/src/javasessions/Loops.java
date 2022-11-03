
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 33;
		
		if (age > 50) // false
		{
			System.out.println("age critirea accepted");
		}
		else if (age > 18 && age <60 ) // true 
		{	
			System.out.println("perfect age critirea");
		}
		else if (age < 18 && age >60 ) // false 
		{	
			System.out.println("not an age critirea");
		}
	}

}
