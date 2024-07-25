
package Strings;

public class countNoOfCap_Small_letters_numbers {
	
	//count number of capital & Small & numbers & dpecial characcters in String

	
	public static void main(String[] args) {
		
		String s = "KaRthiK@ 123 DC ";
		
		int uc=0;
		int sc=0;
		int nc=0;
		int special=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			
			if(ch>='A' && ch<='Z') uc++;
			
			else if(ch>='a' && ch<='z') sc++;
			
			else if(ch>='0' && ch<='9') nc++;
			
			else special ++;
		}
		System.out.println("upper case = "+uc);
		System.out.println("lower case = "+sc);
		System.out.println("number count = "+nc);
		System.out.println("special character count = "+special);

	}

}
