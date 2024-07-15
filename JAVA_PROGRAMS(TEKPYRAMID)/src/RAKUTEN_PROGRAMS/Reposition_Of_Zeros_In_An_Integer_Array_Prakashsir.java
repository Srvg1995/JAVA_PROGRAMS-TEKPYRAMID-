package RAKUTEN_PROGRAMS;

import java.util.Arrays;

public class Reposition_Of_Zeros_In_An_Integer_Array_Prakashsir {

public static void main(String[] args) {
 int a[]= {1,3,0,0,1,0};
int b[]=new int[a.length];
int m=0;
int n=a.length-1;

for (int i =0; i<a.length; i++)
{
	if(a[i]!=0)
	{
		b[n--]=a[i];
	}
	else
	{
		b[m++]=a[i];
	}
}
System.out.println(n);
}
}
