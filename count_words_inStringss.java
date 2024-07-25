package Strings;

public class count_words_inStringss {

	public static void main(String[] args) {
		
		
		String s = "mei   mahatma gandhi huu";
		
		int count =0;
		
		for(int i=0;i<s.length();i++)
		{
			if((i==0 || (s.charAt(i)!=' ' && s.charAt(i-1)==' ')))
					{
						count ++;
					}
		}
		System.out.println(count);
		
	}

}
