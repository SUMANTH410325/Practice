package Coding;

public class HighLow {

	public static void main(String[] args) {

		 int[] arr = {10, 5, 20, 3, 15};

	        int smallest = arr[0];
	        int highest = arr[0];

	        for (int num : arr) {
	        	
	        	 if (num > highest) 
	        	  {
		                highest = num;
		            }

	            if (num < smallest)
	            {
	                smallest = num;
	            }

	           
	        }

	        System.out.println("Smallest number: " + smallest);
	        System.out.println("Highest number: " + highest);
	}

}
