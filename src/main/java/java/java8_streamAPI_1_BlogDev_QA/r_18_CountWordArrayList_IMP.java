package java.java8_streamAPI_1_BlogDev_QA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 18. How to count each element/word from the String ArrayList in Java8?
 */
public class r_18_CountWordArrayList_IMP {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("AA", "BB", "AA", "AA");


        // For Count, I need HashMap
        System.out.println("======  Apprach 1 ======");
        /**
         HashMap<String, Long> namesCnt1 = names.stream()
         .collect(Collectors.groupingBy(
         Function.identity(),
         Collectors.counting()));
         System.out.println(namesCnt1);
         * Violated Principle: “Program to an Interface, Not to an Implementation”
         * Dependency Inversion Principle (DIP) and Interface Segregation concepts.
         */

        System.out.println("======  Apprach 2 ======");
        Map<String, Long> namesCnt2 = names.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        System.out.println("namesCnt2" + namesCnt2);

        System.out.println("======  Apprach 3 ======");
        HashMap<String, Long> namesCnt3 = names.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        HashMap::new,
                        Collectors.counting()));  //<-- Counting return Long
        System.out.println("namesCnt3" + namesCnt3);

        System.out.println("======  Apprach 4  ======");
        Map<String, Integer> namesCnt4 = names.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        HashMap::new,
                        Collectors.summingInt(e -> 1) // counts as Integer
                ));

        System.out.println("namesCnt4" + namesCnt4);


        System.out.println("======  Apprach 5  ======");
        HashMap<String, Long> namesCnt5 = names.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        HashMap::new,
                        Collectors.summingLong(e -> 1L)  //<-- // counts as Long
                ));

        System.out.println("namesCnt5" + namesCnt5);


        System.out.println("====== Approach 6 ======\n");
        System.out.println("====== Monday, August 17, 2026 11:38:34 PM ======\n");

        names.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )).forEach((k,v)-> System.out.println(k+"->"+v));

    }
}


/**
 * Demonstrates different approaches using Collectors:
 * - counting() → returns Long
 * - summingInt(e -> 1) → returns Integer
 * - summingLong(e -> 1L) → returns Long
 * - summingDouble(e -> 1.0) → returns Double
 */

