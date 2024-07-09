package Rakuten_Programs;

import java.util.Iterator;

public class ReverseAString {

	public static void main(String[] args) {
String s1="APPLE";
char[]ch=s1.toCharArray();
String rev="";
for (int i =ch.length-1; i >=0; i--) {
	rev=rev+ch[i];
	
}
System.out.println(rev);
	}

}
