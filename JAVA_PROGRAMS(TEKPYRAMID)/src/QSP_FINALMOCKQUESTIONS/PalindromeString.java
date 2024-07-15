package QSP_FINALMOCKQUESTIONS;

import java.util.Iterator;
import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=s.nextLine();
		String rev="";
		for (int i = s1.length()-1; i >=0; i--) {
			rev=rev+s1.charAt(i);

		}
		if(rev.equalsIgnoreCase(s1))
			System.out.println("palindrome string");
		else
			System.out.println("Not a palindrome string");
	}

}
