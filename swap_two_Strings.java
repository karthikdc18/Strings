package Strings;

public class swap_two_Strings {

	public static void main(String[] args) {
		
		String s1="hello";
		String s2 = "sanjana";
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		
		System.out.println("----------------");
		
		String s = s1+s2;
		
		s2 =s.substring(0,s.length()-s2.length());
		s1 = s.substring(s2.length());
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		
	}

}
