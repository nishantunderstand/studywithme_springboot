package study.java8_streamAPI_1_BlogDev_QA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Tuesday, May 27, 2025 6:09:54 PM 3. How to find duplicate elements in a given
 * integers list in java using Stream functions?
 */

public class c_3_3_DistinctElements {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662, 2582, 2, 2, 266, 666, 656);
        System.out.println("--- Method Reference ----");
        myList.stream().distinct().forEach(System.out::println);

        System.out.println("--- Lambda Operator ----");
        myList.stream().distinct().forEach(n -> System.out.println("Values :" + n));


        System.out.println("--- HashSet Property + Using Lambda Operator Convert to List ----");
        HashSet<Integer> seen = new HashSet<Integer>(myList);
        List<Integer> res = seen.stream().collect(Collectors.toList());
        System.out.println(res);

    }
}
