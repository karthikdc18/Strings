package Strings;

public class Dypriction {
	public static void main(String[] args) {
	String s="abc";
	int key=3;
	char [] ch=s.toCharArray();
	for(int i=0;i<s.length();i++) {
		if(ch[i]>='a'&&ch[i]<='z') {
		ch[i]=(char)('a'+(26+(ch[i]-'a')-key)%26);
	}

}
	System.out.print(new String(ch));
	}
}
	
	