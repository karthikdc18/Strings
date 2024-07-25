package Strings;

public class Panagram {

	public static void main(String[] args) {
		
		String s= "qwertyuiopasdfghjklzxcvbnm";
		if(isPanagram(s))
		{
			System.out.println("is panagram");
		}
		else
		{
			System.out.println("is not panagram");
			
		
	}
}

public static boolean isPanagram(String s)
{
	s=s.toLowerCase();
	
			
	
	if(s.length()<26)
		return false;
	for(char ch='a';ch<'z';ch++)
	{
		if(s.indexOf(ch)==-1)
			return false;
	}
	return true;
		
}
}