package Coding;

import java.util.LinkedHashSet;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str = "I am sumanth sumanth";
	        String[] words = str.split(" ");
	        LinkedHashSet<String> set = new LinkedHashSet<>();

	        for (String word : words) {
	            set.add(word); // duplicates ignored, order preserved
	        }

	        // Join words back into a string
	        String result = String.join(" ", set);
	        System.out.println(result);

	}

}
