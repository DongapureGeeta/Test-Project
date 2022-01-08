package project1;

public class StringReverse {

	public static void main(String[] args) {
		String s = "java";
		char[] a = s.toCharArray();
		for (int i = a.length - 1; i >= 0; i--) {

			System.out.print(a[i]);
		}

	}

}
