package Coding;

public class ReverseEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "who are you";
	        String[] words = str.split(" ");
	        String result = "";

	        for (String word : words) {
	            StringBuffer sb = new StringBuffer(word);
	            result =result+ sb.reverse()+ " ";
	        }

	        System.out.println(result.trim());

	}

}
