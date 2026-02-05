package Coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class DupicateCharcaterInString {
	
	public static void main(String[] args)
	{
		
			String str="yarramsetty";
			char[] ch=str.toCharArray();
			Set<Character> set=new HashSet<>();
			StringBuilder result = new StringBuilder();

			for (char c : ch) {
			    if (set.add(c)) {   // adds only if not duplicate
			        result.append(c);
					
			    }
			}

			System.out.println(result);
			

				
		
				
		

	}

}
