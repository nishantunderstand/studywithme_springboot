package java.java8_streamAPI_1_BlogDev_Q;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Tuesday, May 27, 2025 6:09:54 PM
 * 3. How to find duplicate elements in a given
 * integers list in java using Stream functions?
 */
public class c_3_1_DuplicateElements {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        // HashSet Approach
        // TODO : How to explain to interviewer
        Set<Integer> seen = new HashSet<Integer>();
        myList.stream().filter(s -> !seen.add(s)).forEach(System.out::println);


        System.out.println("====== Saturday, January 10, 2026 6:36:14 PM ======");
        myList.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}

