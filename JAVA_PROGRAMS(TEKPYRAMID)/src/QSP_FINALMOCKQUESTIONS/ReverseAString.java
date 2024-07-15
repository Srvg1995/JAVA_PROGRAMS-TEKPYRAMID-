package QSP_FINALMOCKQUESTIONS;

public class ReverseAString {
	public static void main(String[] args) {
		String s="one two three";
		String []arr=s.split(" ");
		String rev="";
		for (int i =arr.length-1; i>=0; i--) {
			rev=rev+arr[i]+" ";

		}
		System.out.println(rev);
	}

}
