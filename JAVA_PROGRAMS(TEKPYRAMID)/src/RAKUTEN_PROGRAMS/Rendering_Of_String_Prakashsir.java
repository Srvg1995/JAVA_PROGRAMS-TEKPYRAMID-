package RAKUTEN_PROGRAMS;

import java.util.Arrays;

public class Rendering_Of_String_Prakashsir {

public static void main(String[] args) {
String s="My Name is raj";
String []str=s.split(" ");

for (int i =0; i<str.length; i++)
{
	String temp = str[0];
	
	for (int j = 1; j < str.length; j++)
	{
		str[j-1]=str[j];
	}
	str[str.length-1]=temp;
	System.out.println(Arrays.toString(str));
}
}
}
