package RAKUTEN_PROGRAMS;

import java.util.ArrayList;
import java.util.Iterator;

public class StringBalance_Prakashsir {

	public static void main(String[] args) {
		String s="{}[{(}])" ;
		//String s="[{()}]" ;//Balanced
		
		ArrayList<Character> list=new ArrayList<Character>();
		for(int i=0;i<s.length();i++) {
			if(list.size()!=0 && ((s.charAt(i)=='}' && list.get(list.size()-1)=='{')
			||(s.charAt(i)==']' && list.get(list.size()-1)=='[')
			||(s.charAt(i)==')' && list.get(list.size()-1)=='(')))
			{
				list.remove(list.size()-1);
			}
			else
			{
				list.add(s.charAt(i));
			}
		}
		if(list.size()==0)
		{
		System.out.println("Balanced");
		}
		else
		{
			System.out.println("Not Balanced");
		}
	}
}

		

