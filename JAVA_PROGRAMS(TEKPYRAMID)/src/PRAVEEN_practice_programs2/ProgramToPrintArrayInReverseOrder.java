package PRAVEEN_practice_programs2;

public class ProgramToPrintArrayInReverseOrder {

	public static void main(String[] args) {

		int [] a = {1,2,3,4,-5};
		
		for(int i=a.length-1  ; i>=0 ; i--) {
			
			System.out.println(a[i]);
			
		}
			
	}

}
