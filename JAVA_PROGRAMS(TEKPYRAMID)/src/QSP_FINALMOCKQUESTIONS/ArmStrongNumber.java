package QSP_FINALMOCKQUESTIONS;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an integer number");
		int n=s.nextInt();
		int count=0;
		int temp=n;
		int temp1=n;

		while(n>0)
		{
			n=n/10;
			count++;
		}
		int sum=0;
		while(temp>0)
		{
			int x=temp%10;
			int prod=1;
			for(int i=1;i<=count;i++)
			{
				prod=prod*x;
			}
			sum=sum+prod;
			temp=temp/10;
		}

		if(sum==temp1)
			System.out.println(temp1+" is an Arm Strong Number");
		else
			System.out.println(temp1+" is not an Arm Strong Number");
	}
}
