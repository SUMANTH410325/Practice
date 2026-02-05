package Coding;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1="Listen";
		String str2="silent";
		
		char[] ch1=str1.toLowerCase().toCharArray();
		char[] ch2=str2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2))
		
			System.out.println("anagram");
		
			else
			
				System.out.println("not anagram");	

				

	}

}
