package java.java8_streamAPI_1_BlogDev_Q;

import java.util.Arrays;
import java.util.List;

/**
 * Tuesday, May 27, 2025 6:39:57 PM
 * 6. Given a list of integers, find the maximum value element present in it using Stream functions?
 * Refer {@link u_21_FindMaxInArray_IMP}
 */

public class f_6_FindMaxElement_IMP {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15, 99, 99);

        System.out.println("===== Stream Approach ====");
        Integer max = myList.stream().max(Integer::compare).get();
        System.out.println(max);




        System.out.println("===== Array Approach ====");
        int[] arr = {10, 15, 8, 49, 25, 98, 98, 32, 15, 9999999};
        Integer max1 = Arrays.stream(arr).boxed().max(Integer::compare).get();
        System.out.println(max1);

        System.out.println("===== Stream Approach -2 ====");
        Integer max2 = myList.stream().max(Integer::compare).orElse(-1);
        System.out.println(max2);

        System.out.println("===== Stream Approach -3 - For Interview One ====");
        myList.stream().max(Integer::compare).ifPresent(System.out::println);
        // TODO : I need to pass Compare or CompareTo ??
        // Comparable  :compareTo : Natural
        // Comparator : compare : Customized Sorting
        // TODO : Can we solve by compareTo as well ??

        System.out.println("===== Stream Approach -4  - Better One====");
        List<Integer> myList1 = Arrays.asList(); // Update it
        myList1.stream()
                .max(Integer::compare)
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("No Maximium Element Found ::")
                );

        System.out.println("====== Saturday, January 10, 2026 7:28:57 PM ======");
        int res = myList.stream()
                .max(Integer::compareTo)
                .orElseThrow();
        System.out.println(res);

        System.out.println("====== Saturday, January 10, 2026 7:29:00 PM ======");
        int res1 = myList.stream()
                .max(Integer::compare)
                .orElseThrow();
        System.out.println(res1);
    }
}


