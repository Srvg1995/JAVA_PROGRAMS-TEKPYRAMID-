package RAKUTEN_PROGRAMS;


import java.util.HashMap;
import java.util.Map.Entry;


public class PrintUniqueCharacterString_HashMap_Prakashsir {

	public static void main(String[] args) {
		String s="indiaayi";
		HashMap<Character, Integer> map=new HashMap<>();
		for(int i=0;i< s.length();i++) {
			if(map.containsKey(s.charAt(i))) 
			{
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else
			{
				map.put(s.charAt(i), 1);
			}
		}
		for(Entry<Character, Integer> ch : map.entrySet()) {
			
				System.out.println(ch.getKey());
			}

		}
	}

