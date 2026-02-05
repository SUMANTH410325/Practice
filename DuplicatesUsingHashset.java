package Coding;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesUsingHashset {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 5, 1};
        Set<Integer> set = new HashSet<>();

        System.out.println("Duplicate elements are:");
        for (int num : arr) {

            if (!set.add(num)) {
               System.out.println(num); // Duplicate element first it will add the number if any duplicate print it
            }
        }
    }
}

//int[] a = {1,2,3,4,3,2,1};
//Set<Integer> set = new HashSet<>();
//
//for (int num : a) {
//    set.add(num);
//}
//
//System.out.println(set);

//Swappinglogic
//
//int a = 10, b = 20;
//
//a = a + b;
//b = a - b;
//a = a - b;
//
//System.out.println("a = " + a);
//System.out.println("b = " + b);
//
//
