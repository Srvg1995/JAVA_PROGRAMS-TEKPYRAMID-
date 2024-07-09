package Imp_programs1;

public class LongestWordInAString10 {

	public static void main(String[] args) {
		String s="I am a student";
		String arr[]=s.split(" ");
		String longWord="";

		for (int i = 0; i < arr.length; i++) {
				if (arr[i].length() >= longWord.length())
					longWord = arr[i];
		}
		System.out.println(longWord);	
	}
}



