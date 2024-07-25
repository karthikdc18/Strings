package Strings;

public class Initcap {

	public static void main(String[] args) {
		
		String s = " animal animesh";
		
		s = s.toLowerCase();
		
		char [] ch =s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if((i==0 || (s.charAt(i)!=' '  && s.charAt(i-1)==' ')))
					{
						if(s.charAt(i)>='a'  && s.charAt(i)<='z' )
						{
							  ch[i]=(char) (ch[i]-32);
						}
					}
		}
		System.out.println(ch);
		
	
	
	
	
	}
}