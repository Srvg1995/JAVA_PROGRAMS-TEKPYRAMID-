package RAKUTEN_PROGRAMS;

public class ReverseAStringWordByWord_Prakashsir {

	public static void main(String[] args) {
String s="My Name is raj";
String []arr=s.split(" ");
String rev="";
for (int i =arr.length-1; i>=0; i--) {
	rev=rev+arr[i]+" ";
}
System.out.println(rev);
	}
}
