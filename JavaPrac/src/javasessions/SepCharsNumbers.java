package javasessions;

public class SepCharsNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java123point456";  
	    int i;  
	    String str1="";  
	    String str2="";  
	    for(i=0;i<str.length();i++)
	    {
	    	char x = str.charAt(i);
	    	if('0' < x && '9' < x)
	    	{
	    		str1 = str1 + x;
	    	}
	    	else 
	    	{
	    		str2 = str2 + x;
	    	}
	    }
	    System.out.println(str1);  
	    System.out.println(str2);  
	}

}
