package javasessions;
public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = " This is JAVA ";
		
		String str2 = "class";
		
		System.out.println(str.length());
		System.out.println(str.charAt(1));
		System.out.println(str.concat(str2));
		
		System.out.println(str.trim());
		
		System.out.println(str.contains("This"));
		System.out.println(str.contains("this"));
		
		System.out.println(str.equalsIgnoreCase("this"));
		
		String str3 = "Welcome to java";
		
		System.out.println(str3.replace("java", "selenium"));
		
		String str4 = "welcome";
		
		System.out.println(str4.substring(0, 3));
		
	     	
	}

}
