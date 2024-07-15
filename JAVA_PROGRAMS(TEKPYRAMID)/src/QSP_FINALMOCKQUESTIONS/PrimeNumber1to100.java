package QSP_FINALMOCKQUESTIONS;

import java.util.Scanner;

public class PrimeNumber1to100
{
	public static void main(String[] args) 
	{
		for(int j=1; j<=100; j++) {
			int n=j;
			int count=0;
			for(int i=2; i<=n/2; i++) {
				if(n%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0 && n!=1)
				System.out.println(n);
		}

	}

}
