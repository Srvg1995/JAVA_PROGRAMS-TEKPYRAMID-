package Rakuten_Programs;

import java.util.Iterator;

public class Occurence_program {

	public static void main(String[] args) {
		String s1="Welcome";
		String s2=s1.toLowerCase();
		System.out.println(s2);
		char[]ch=s2.toCharArray();
		boolean[]b=new boolean[ch.length];
		for (int i = 0; i < ch.length; i++) {
			if(b[i]==false)
			{
				int count=1;
				for (int j = i+1; j < b.length; j++) {
					if(ch[i]==ch[j])
					{
						count++;
						b[j]=true;

					}
				}
				System.out.println(ch[i]+"====="+count);
			}
		}
	}
}


