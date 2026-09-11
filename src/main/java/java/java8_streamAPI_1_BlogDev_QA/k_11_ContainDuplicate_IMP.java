package java.java8_streamAPI_1_BlogDev_QA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 11. Given an integer array nums , return true if any value appears at least
 * twice in the array, and return false if every element is distinct.
 */
public class k_11_ContainDuplicate_IMP {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2};
        int[] arr = {1, 2, 3, 4, 2};
        /**
         * Without Java8
         * Iterate Over all the arrays.
         * Define HashSet
         * HashSet : If it already seen return otherwise return true.
         */

        System.out.println("======  APPOROACH 1 HashSet Approach   ======");
        HashSet<Integer> seen = new HashSet<>();

        Arrays.stream(nums)
                .boxed()
                .filter(c -> !seen.add(c))
                .findFirst()
                .ifPresent(e -> System.out.println(e));
        // I just to return true or false


        List<Integer> myList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        HashSet<Integer> hs = new HashSet<>(myList);
        if (hs.size() == myList.size()) {
            System.out.println("False");
        } else {
            System.out.println("Duplicate Present ");
            System.out.println("True");
        }




        System.out.println("======  APPOROACH 2   ======");
        seen.clear();
        boolean hasDuplicate = Arrays.stream(nums).boxed().anyMatch(n -> !seen.add(n));
        System.out.println("Duplicate Present ?? " + hasDuplicate);




        // Best Approach
        System.out.println("====== Approach 3 Length Approach ======\n");
        boolean hasDuplicate2026 =
                Arrays.stream(arr)
                        .distinct()
                        .count() != arr.length;

        System.out.println(hasDuplicate2026);
    }
}



