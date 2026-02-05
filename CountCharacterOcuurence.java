package Coding;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterOcuurence {

	public static void main(String[] args) {
		
        String str = "java is object oriented programming language";

		// Convert string to char array
        char[] result = str.toCharArray();

        // Create a map to store character counts
        Map<Character, Integer> map = new HashMap<>();

        // Loop through each character
        for (char c : result) {
            if (c != ' ') { // ignore spaces
                if (map.containsKey(c)) {
                    int count = map.get(c);//map.get(c) gives the previous count of the character.
                    map.put(c, count + 1);  // increase count
                } else {
                    map.put(c, 1);          // first occurrence(first it will comes to the else)
                }
            }
        }

        // Print character counts
        System.out.println(map);

		
	}

}

//“Count occurrences of a specific character in a string” ✅
//String str = "java is object oriented programming language";
//
//int count = str.length() - str.replaceAll("a", "").length();
//
//System.out.println("Number of 'a': " + count);
















