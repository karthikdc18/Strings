package Strings;

public class ReversingTheSentence {

	public static void main(String[] args) {
		//Using Split Method....
		
		String s = "java is easy";
		
		String s1[] = s.split(" ");
		
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.println(s1[i]);
		}
		
	}

}
