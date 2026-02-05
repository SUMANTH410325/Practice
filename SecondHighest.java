package Coding;

public class SecondHighest {

	public static void main(String[] args) {
		int[] arr = {10, 5, 20, 3, 15};

        int highest = arr[0];
        int secondHighest = arr[0];

        for (int num : arr) {

            if (num > highest) {
                secondHighest = highest;
                highest = num;
            }
            else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }

       // System.out.println("Highest number: " + highest);
        System.out.println("Second Highest number: " + secondHighest);
	}

}
