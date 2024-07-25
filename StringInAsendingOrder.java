package Strings;

public class StringInAsendingOrder {

	public static void main(String[] args) {
		String s= "jspiders";
		
		char [] ch= s.toCharArray();
		
		for(int i=0;i<ch.length-1;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=' ';
					temp=ch[j];
					ch[j]=ch[i];
					ch[i]=temp;
				}
			}
		}
		System.out.println(ch);
	}

}
