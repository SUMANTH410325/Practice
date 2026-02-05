package Coding;

public class LargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 5, 20, 2, 15};

        int smallest = arr[0];
        int largest = arr[0];

        for (int num : arr) {
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);


	}

}
