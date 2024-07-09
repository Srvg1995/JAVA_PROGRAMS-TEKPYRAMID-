package Imp_programs1;

public class ReverseAString1 {

	public static void main(String[] args) {

		String s1="Hello";
		char[]ch=s1.toCharArray();
		String rev="";
		for (int i =ch.length-1; i >=0; i--) {
			rev=rev+ch[i];
			
		//for (int i=0;i<ch.length;i++) {
		//rev=ch[i]+rev;
		}
		System.out.println(rev);
	}
}


