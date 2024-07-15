package RAKUTEN_PROGRAMS;

import java.util.Iterator;

public class ReverseStringByWordAndCharacters_Prakashsir {

	public static void main(String[] args) {

		String s = "welcome to tyss";
		String str[] = s.split(" ");  //step1

		for (int i = 0; i < str.length; i++) //step2-outer loop
		{
			String s2 = str[i];

			for(int j=s2.length()-1;j>=0;j--)  //step3-inner loop
			{
				System.out.print(s2.charAt(j));
			}
			System.out.print(" ");
		}
	}
}


