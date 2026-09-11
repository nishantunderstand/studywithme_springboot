package java.java8_streamAPI_1_BlogDev_QA;

import java.util.*;

/**
 * 20. How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?
 */
public class t_20_CheckEmptyByJava8_IMP {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list = new ArrayList<>();
        // Check size ??
        if (list.size() == 0) {
            System.out.println("Empty");
        } else {
            System.out.println("Not Empty");
        }

        System.out.println("======WORKING=======");
        Optional.ofNullable(list)
                .filter(l -> !l.isEmpty()) //<--
                .ifPresentOrElse(
                        l -> l.forEach(System.out::println),
                        () -> System.out.println("List is Empty or null")
                );





    }
}


// IfPresentorElse is used with Optional


/**
 * if (optional has value) {
 * // run first lambda
 * } else {
 * // run second lambda
 * }
 * <p>
 * <p>
 * <p>
 * Optional.ofNullable(list)
 * .map(List::size)
 * .ifPresentOrElse(
 * size -> {
 * if (size == 0)
 * System.out.println("Empty list");
 * else if (size < 5)
 * System.out.println("Small list");
 * else
 * System.out.println("Large list");
 * },
 * () -> System.out.println("List is null")
 * );
 */

