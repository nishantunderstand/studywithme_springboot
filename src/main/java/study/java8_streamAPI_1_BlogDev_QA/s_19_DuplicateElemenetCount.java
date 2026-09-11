package study.java8_streamAPI_1_BlogDev_QA;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 19. How to find only duplicate elements with its count from the String ArrayList in Java8?
 */
public class s_19_DuplicateElemenetCount {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");

        Map<String, Integer> namesCount = names.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        HashMap::new,
                        Collectors.summingInt(e -> 1)
                ));


        // iterate over namesCount , Return the item whose values is greater than 1
        namesCount.entrySet()
                .stream()
                .filter(e -> e.getValue() > 1l) //<--
                .forEach(e ->
                        System.out.println("Duplicate " + e.getKey() + " Count :" + e.getValue())
                );

        System.out.println("======WORKING=======");
        System.out.println("====== Monday, August 17, 2026 11:41:14 PM ======\n");
        names.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1L) //<--
                .forEach(e ->
                        System.out.println("Duplicate : " + e.getKey() + " \t Count " + e.getValue())
                );
    }
}


