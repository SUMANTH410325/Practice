package Coding;

import java.util.HashMap;
import java.util.Map;

public class RepetedWordsInString {

	public static void main(String[] args) {
			String str="i am learning learning java java java programming";
			
	        String[] result = str.split(" ");	//split("regex")regex means Split whenever there are one or more spaces
        								//"," split whenever there is a comma

        Map<String, Integer> map = new HashMap<>();

        for (String word : result)
        {  
            if (map.containsKey(word))
            {
                int count = map.get(word);  
                count = count + 1;      
                map.put(word, count);      
            } 
            else 
            {
                map.put(word, 1); 
            }
        }
        System.out.println(map);

	}

}



//Step by Step with Words
//Iteration 1: w = "i"
//
//Map is empty {}
//
//map.containsKey("i") → false
//
//Go to else → map.put("i",1)
//
//Map becomes: {i=1}
//
//Iteration 2: w = "am"
//
//Map: {i=1}
//
//"am" not present → else → map.put("am",1)
//
//Map becomes: {i=1, am=1}
//
//Iteration 3: w = "learning"
//
//Map: {i=1, am=1}
//
//"learning" not present → else → map.put("learning",1)
//
//Map becomes: {i=1, am=1, learning=1}
//
//Iteration 4: w = "learning" (again)
//
//Map: {i=1, am=1, learning=1}
//
//"learning" exists → if block runs:
//
//count = map.get("learning") → count = 1
//
//count = count + 1 → count = 2
//
//map.put("learning", 2)
//
//Map becomes: {i=1, am=1, learning=2}
//
//Iteration 5: w = "java"
//
//"java" not in map → else → map.put("java",1)
//
//Map: {i=1, am=1, learning=2, java=1}
//
//Iteration 6: w = "java" (again)
//
//"java" exists → if block runs:
//
//count = map.get("java") → 1
//
//count = count + 1 → 2
//
//map.put("java",2)
//
//Map: {i=1, am=1, learning=2, java=2}
//
//Iteration 7: w = "java" (again)
//
//"java" exists → if block runs:
//
//count = 2 → +1 → 3
//
//Update map
//
//Map: {i=1, am=1, learning=2, java=3}
//
//Iteration 8: w = "language"
//
//Not in map → else → map.put("language",1)
//
//Final Map: {i=1, am=1, learning=2, java=3, language=1}










