package study.java8_streamAPI_1_BlogDev_QA;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Tuesday, May 27, 2025 6:09:54 PM 3. How to find duplicate elements in a given
 * integers list in java using Stream functions?
 */
public class c_3_2_DuplicateElements {

    public static void main(String[] args) {
        System.out.println("=== Hello World ===");
        List<Integer> myList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4);
        Set<Integer> seen = new HashSet<>();
        var res = myList.stream()
                .filter(n -> !seen.add(n))
                .findFirst();

        res.ifPresentOrElse(
                value -> System.out.println("Duplicate : " + value),
                () -> System.out.println("No Duplicate Found")
        );

        seen.clear();

        System.out.println("=== Duplicate Element List ===");

        var res1 = myList.stream()
                .filter(n -> !seen.add(n))
                .collect(Collectors.toList());

        res1.forEach(System.out::println);


        seen.clear();

        System.out.println("=== Duplicate Element List Latest ===");

        var res2 = myList.stream()
                .filter(n -> !seen.add(n))
                .toList();

        res2.forEach(System.out::println);
    }
}

