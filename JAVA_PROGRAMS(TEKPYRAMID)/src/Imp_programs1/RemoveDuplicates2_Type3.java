package Imp_programs1;

import java.util.ArrayList;
import java.util.List;
/*
 * input="Puneet is my panda"
 * ouput="Punet ismyad"
 */

public class RemoveDuplicates2_Type3 {
	public static void main(String[] args) {
		String input = "Puneet is my panda0011";
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			char ch1 = '\u0000';
			char ch2 = '\u0000';
			// implementation for toUpperCase()method.
			if (ch >= 'a' && ch <= 'z') {
				ch1 = (char) (ch - 32);
			} else
				ch1 = ch;

			// implementation for toLowerCase()method.
			if (ch >= 'A' && ch <= 'Z') {
				ch1 = (char) (ch + 32);
			} else
				ch2 = ch;

			if (output.indexOf(ch1) == -1 && output.indexOf(ch2) == -1) {
				output += ch;
			}
		}
		System.out.println(output);
	}
}
