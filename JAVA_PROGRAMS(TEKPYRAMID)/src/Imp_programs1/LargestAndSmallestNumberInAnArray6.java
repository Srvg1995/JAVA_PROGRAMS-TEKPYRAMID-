package Imp_programs1;

import java.util.Arrays;
import java.util.Scanner;

public class LargestAndSmallestNumberInAnArray6 {
	public static void main(String[] args) {
		int[]a= {1,3,5,6,2,7};
		Arrays.sort(a);
		System.out.println("largest="+a[a.length-1]);
		System.out.println("smallest="+a[0]);

	}}


