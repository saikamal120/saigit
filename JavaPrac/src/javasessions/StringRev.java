
public class StringRev {

	
	public static void main (String[] args)
	{
		String ab = "saikamal";
		String rev = "";
		//System.out.println(ab.length());
		
		for(int i=ab.length()-1;i>=0;i--)
		{
			rev = rev+(ab.charAt(i));
			System.out.println(rev);
		}
		
	}
	
}
