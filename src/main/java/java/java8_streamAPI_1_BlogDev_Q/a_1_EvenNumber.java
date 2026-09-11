package java.java8_streamAPI_1_BlogDev_Q;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Monday, May 26, 2025 10:57:39 PM
 * 1. Given a list of integers, find out all
 * the even numbers that exist in the list using Stream functions?
 */
public class a_1_EvenNumber {

    public static void main(String[] args) {
        // 1st Approach
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        //myList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        // 1st Approach
        List<Integer> myList1 = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        myList1.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + "\t"));
        System.out.println();

        System.out.println(" ============ ");

        // 2nd Approach
        int[] arr = {10, 15, 8, 49, 25, 98, 32};
        Map<Boolean, List<Integer>> partitionedMap = Arrays.stream(arr).boxed()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        System.out.println(" ============ PARTITIOON APPROACH ::: ");
        System.out.println(partitionedMap.get(true));

        System.out.println(" ============ ");
        // 3rd || Java 16 NON-LTS Support
        List<Integer> evenList = new ArrayList<>();
        evenList = myList.stream().filter(n -> n % 2 == 0).toList();
        System.out.println("evenList: " + evenList);


    }
}

/**
 * Sort Ascending : sorted()
 * Sort Descending : sorted(Comparator.reverseOrder())
 * Sort Descending : Collections.reverseOrder()
 * Limit Output : limit()
 * Skip Output : skip()
 */

