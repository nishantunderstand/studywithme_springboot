package study.java8_streamAPI_1_BlogDev_QA;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Find Second Highest
 */
public class d_4a_FindSecondLargestElement {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("===== if Present ========");
        System.out.println("====== Monday, August 17, 2026 8:24:12 PM ======\n");
        myList.stream()
                .distinct()
                .sorted(Collections.reverseOrder()) // Approach 1
                //.sorted(Comparator.reverseOrder()) // Approach 2
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);
    }
}


