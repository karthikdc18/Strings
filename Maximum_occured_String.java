package Strings;

public class Maximum_occured_String {

	public static void main(String[] args) {
		String s1 = "SANJANA";
		
		int max=0;
		char ch =' ';
		
		while(s1.length()>0)
		{
			char c = s1.charAt(0);
			String s2 = s1.replace(c+"","");
			int count= s1.length()-s2.length();
			if(count>max)
			{
				max=count;
				ch=c;
				
			}
			s1=s2;
		}
		System.out.println(ch+"="+max);
	}

}
