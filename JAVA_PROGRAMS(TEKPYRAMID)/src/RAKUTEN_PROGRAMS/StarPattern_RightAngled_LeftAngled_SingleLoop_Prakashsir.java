package RAKUTEN_PROGRAMS;

import java.util.Iterator;
import java.util.Scanner;

public class StarPattern_RightAngled_LeftAngled_SingleLoop_Prakashsir {

	public static void main(String[] args) {

		//		Scanner sc=new Scanner(System.in); //IF THEY ASKED US TO DO WITH DYNAMIC INPUT
		//		System.out.println("enter rows");

		int row=5;
		for (int i=0,col=0;  i<row;)  // int i=0,col=0;==>INITIALIZATION //i<row;==>CONDITION
		{    

			if(col<=i)      //right angle triangle==>col<=i    //left angle triangle==>col+i>=row-1   //equlateral triangle==>col+i>=row-1 && col <=i
			{      
				System.out.print("*");	
			}
			else 
			{
				System.out.print(" ");
			}
			col++;
			if (col==row) 
			{
				System.out.println(); //To jump to next line
				i++;                 //UPDATION 
				col=0;              //Reinitialized to '0'
			}
			else 
			{
				continue;
			}

		}
		 
   //Another way of Printing Right Angled Triangle(done by VIJAY)
//		int num = 4;
//		for(int i=1,j=1;j<=num;i++ ) {
//			
//			System.out.print("*");
//			if(i==j) {
//				j++;
//				System.out.println(" ");
//				i=0;
//			}	
//		}
	}

}


