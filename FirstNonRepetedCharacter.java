package Coding;

public class FirstNonRepetedCharacter {

	public static void main(String[] args) {
		
		String str = "swiss";
		char[] ch=str.toCharArray();

		for (char c : ch) {

		    if (str.indexOf(c) == str.lastIndexOf(c))
		    {
		        System.out.println("First non-repeated character: " + c);
		        break;
		    }
		}


		

	}

}
