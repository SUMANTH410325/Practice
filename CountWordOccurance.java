package Coding;

import java.util.*;

public class CountWordOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "i am learning learning java java java programming";

		String[] result = str.split(" ");

		Map<String, Integer> map = new HashMap<>();

		for (String w : result) {
			if (map.containsKey(w)) {
			    int count = map.get(w);     // map.get(c) gives the previous count of the character.
			    map.put(w, count + 1);      // increase the count by 1
			

		    } else {
		        map.put(w, 1);
		    }
		}

		System.out.println(map);


	}

}
