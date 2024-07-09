package Imp_programs1;

public class ConvertAlternateUpperCaseAndLowerCase5 {
	public static void main(String[] args) {
		String s = "Listen";
		s = s.toLowerCase();
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i = i + 2) {
			ch[i] = Character.toUpperCase(ch[i]);    //here Character is a class.
		}
		System.out.println(ch);
	}
}