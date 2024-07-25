package Strings;

public class VowelCount {

	public static void main(String[] args) {
		
		
		String s = "sanjana";
		
		int count = 0;
		int cou=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(( ch=='a')|| ( ch=='e') || ( ch=='i') || ( ch=='o') || ( ch=='u'))
				
				count++;
			else
				cou++;
		}
		System.out.println("vowels= "+count);
		System.out.println("consonents = "+cou);
		
	}
}






























