package Strings;
import java.util.regex.*;

public class sum_of_continuous_number {

	public static void main(String[] args) {
		
		
		
String s = "132abc10ck20";
		
		String exp ="[0-9]+";
		
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		int sum = 0;
		
		while(m.find())
		{
			sum+=Integer.parseInt(m.group());
			
		}
		System.out.println(sum);
		

	}

}
