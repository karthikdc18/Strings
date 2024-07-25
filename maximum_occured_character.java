package Strings;

public class maximum_occured_character {

	public static void main(String[] args) {
		

		String s = "sanjana";
		int max=0;
		char f =' ';
		
		
		char [] ch = s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]='\u0000';
					
				}
			}
			if(count>max) {
				max=count;
				f=s.charAt(i);
			}
			
		}
		System.out.println("max occured = "+max+" = "+f);
	}
}