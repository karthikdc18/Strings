package Strings;

public class vowels_missing_print {

	public static void main(String[] args) {
		
		String s = "sanjana";
		
		
		
		String vowels = "aeiou";
		
		for(int i=0;i<vowels.length();i++)
		{
			int flag = 0;
		
			for(int j=0;j<s.length();j++)
			{
				if(vowels.charAt(i)==s.charAt(j))
				{
					flag=1;
				}
			}
			if (flag==0)
			{
				System.out.println(vowels.charAt(i));
			}
		}
	}

}
