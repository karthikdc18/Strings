package Strings;

public class Palindrome {

	public static void main(String[] args) {
		
String s = "malayalam";
		
		
		
		int len= s.length();
		
		String rev = "";
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println("Before reversing the string = "+rev);
		System.out.println("After reversing the String = "+s);
		if(s.equals(rev))
			System.out.println(rev+" is palindrome");
		else
			System.out.println(rev+" not palindrome");
	}
}