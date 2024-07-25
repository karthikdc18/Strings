package Strings;

public class smaller_to_UpperCase {

	public static void main(String[] args) {

		
		String s= "kArT hIk";
		
		
		for (int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if (ch==' ')
				continue;
			
			if(ch>='a' && ch<='z')
				ch-=32;
			else
				ch+=32;
			
			
			System.out.print(ch);
		}
	}

}
