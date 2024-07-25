package Strings;

public class RemoveDuplicate {
	
	// similar to the occurance of each character in a String;

	public static void main(String[] args) {
		
		String s= "sanjana";
		
		char ch[]= s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int count =1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]='\u0000';
					count ++;
				}
				
				
			}
			if(count!=1)
			{
				ch[i]='\u0000';
			}
		}
		System.out.println(new String(ch));

		
	}
	}