
public class SwichCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 18;
		
		switch(age)
		{
		    case(16):
		    	System.out.println("your under age");
		    	break;
		    case(18):
		    	System.out.println("your are eligible for UG");
		    	break;
		    case(62):
		    	System.out.println("your are ready to retire");
		    	break;
		    default:
		    	System.out.println("provide valid age");
		    	break;
		}
	}

}
