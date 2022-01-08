package project1;

public class App {
	
	public static boolean test(String s) {
		int n=s.length();
		String ss="";
		char[] a=s.toCharArray();
		for(int i=0;i<a.length;i++) {
		if(a[i]>='1' && a[i]<='9')	{
			
			ss=ss+a[i];
		}
			
		}
		if(ss.length()==n)
			return true;
		return false;
	}

	public static void main(String[] args) {
		
     String s="a2";
     
     System.out.println(test(s));
	}

}
