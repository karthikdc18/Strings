package Strings;

public class Initcap1 {

	public static void main(String[] args) {
		
		
		String  s = " virat   Kohli";
		
		s= s.toLowerCase();
		
		char [] ch = s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if((i==0 || (s.charAt(i)!=' '  && s.charAt(i-1)==' ')))
					{
						ch[i] = (char) (ch[i]-32);
					}
		}
		System.out.println(ch);
		

	}

}
