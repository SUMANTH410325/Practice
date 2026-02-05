package Coding;

public class HighestAndSecondHighest {

	public static void main(String[] args) {
		int[] a = {20, 39, 80, 150, 140};

		int h = a[0];
		int sh = a[0];

		for (int i = 1; i < a.length; i++) {
		    if (a[i] > h) {
		        sh = h;
		        h = a[i];
		    } else if (a[i] > sh) {
		        sh = a[i];
		    }
		}

		System.out.println(h);
		System.out.println(sh);
	}

}
