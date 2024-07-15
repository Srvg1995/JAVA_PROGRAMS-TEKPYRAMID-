package QSP_FINALMOCKQUESTIONS;
import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Key element");
		int key=s.nextInt();
		int count=0;
		int[]a= {10,15,13,14,17,19,20,21,29,31};
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				count++;
				break;
			}
		}
		if(count==1)
			System.out.println("Key element is present");
		else
			System.out.println("Key element not present");
	}

}
