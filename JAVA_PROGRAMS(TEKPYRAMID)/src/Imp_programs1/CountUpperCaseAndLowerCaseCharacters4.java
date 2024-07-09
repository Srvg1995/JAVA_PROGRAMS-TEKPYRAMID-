package Imp_programs1;

import java.util.Scanner;

public class CountUpperCaseAndLowerCaseCharacters4 {
	public static void main(String[] args) {
		String s1="I am a traVeLLer";
		char[]ch=s1.toCharArray();
		System.out.println(ch);
		int upper=0;
		int lower=0;
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='A'&&ch[i]<='Z')
			{
				upper++;
			}
			else if(ch[i]>='a'&&ch[i]<='z')
			{
				lower++;
			}
		}

		System.out.println("uppercase:"+upper);
		System.out.println("lowercase:"+lower);
	}
}