package Coding;

import java.util.StringTokenizer;

public class CountNumberOfWordsInString {

	public static void main(String[] args) {
		
//			String str="my home town is ongole";
//			String[] words=str.split(" ");
//			int count=words.length;
//			System.out.println(count);
		
		String str="my home town is ongole";
		
		StringTokenizer st=new StringTokenizer(str);
		int count=st.countTokens();
		System.out.println(count);
		
		
			
	}

}
