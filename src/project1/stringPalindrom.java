package project1;

public class stringPalindrom {

	public static String palind(String s) {
		String ss="";
		char[] a=s.toCharArray();
		for(int i=a.length-1;i>=0;i--) {
			ss=ss+a[i];
		}
		
		return ss;
	}
	public static void main(String[] args) {
		String s="madam1";
	if(s.equals(palind(s)))	{
		System.out.println("given string is palindrom");
	}else {
		System.out.println("not plaindrom");
	}

	}

}
