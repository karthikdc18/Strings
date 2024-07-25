package Strings;

public class count_words_inStrings {

	public static void main(String[] args) {
		String s = "mei mahatma gandhi huu";
		
		System.out.println(countWord(s));
	}
	
		
		
		static int countWord(String s)
		{
			char[]ch=s.toCharArray();
			int count=1;
			for(int i = 0;i<ch.length;i++)
			{
				if(ch[i]==' ')
				{
					count++;
					
				}
			}
			return count;
		}
		
	}