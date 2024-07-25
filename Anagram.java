package Strings;

public class Anagram {

	public static void main(String[] args) {
		
		String s1="care";
		String s2="race";
		
		if(isAnagram(s1,s2))
		{
			System.out.println("is Anagram");
			
		}
		else
		{
			System.out.println("is not anagram");
		}
		
		
}



public static  boolean isAnagram(String s1,String s2)
{
	while(true)
	{
		if(s1.length()!=s2.length())
			return false;
		if(s1.length()==0 && s1.length()==0)
			return true;
		
		char ch = s1.charAt(0);
				s1=s1.replace(ch+"","");
				s2=s2.replace(ch+"","");
				
	}
}
}


