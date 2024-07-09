package Imp_programs1;

import java.util.ArrayList;
import java.util.List;

/*
 * input="Puneet is my panda"
 * ouput="Punet ismyad"
 */

public class RemoveDuplicates2_Type2 {
    public static void main(String[] args) {
        String input = "Puneet is my panda";
        String output="";
        for(int i=0;i<input.length();i++) {
        	char ch = input.charAt(i);
        	char ch1 = Character.toUpperCase(ch);
        	char ch2 = Character.toLowerCase(ch);
        	if(output.indexOf(ch1)==-1 && output.indexOf(ch2)==-1) {
        	output+=ch; 
        	}
        }
        System.out.println(output);
    }
}
        