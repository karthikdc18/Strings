package Strings;

public class ReversingTheStrings {

	public static void main(String[] args) {
		// Without Split Method...

		
		String s= "java is easy";
		
		String s1 = " ";
		
		int i=0;
		int j=0;
		
		while(j<s.length())
		{
			while(j<s.length() && s.charAt(j)!=' ')j++;
			
				int k=i;
				String temp = " ";
				for(k=i;k<j;k++)
				{
					temp = temp+s.charAt(k);
					
				}
				s1 = temp+s1;
				
			
			if(j<s.length())
			{
				s1 = s1+" ";
				j++;
				i=j;
			}
			
			
		}
		System.out.println(s1);
		
		
	}
	
}
