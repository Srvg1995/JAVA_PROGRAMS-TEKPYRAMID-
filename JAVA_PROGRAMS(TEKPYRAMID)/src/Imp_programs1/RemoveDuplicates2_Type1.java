package Imp_programs1;

import java.util.ArrayList;
import java.util.List;
/*
 * input="Puneet"
 * ouput="Punet"
 */

public class RemoveDuplicates2_Type1 {
    public static void main(String[] args) {
        String input = "Puneet";
        String output="";
        for(int i=0;i<input.length();i++) {
        	char ch = input.charAt(i);
        	if(output.indexOf(ch)==-1) {
      		output+=ch;  //ie,output=output+ch;
        	}
        }
        System.out.println(output);
    }
}
        