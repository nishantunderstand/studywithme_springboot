package study.java8_streamAPI_1_BlogDev_QA;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Nov 8, 2025,9:29:24 AM
 * 7. Given a String, find the first non-repeated character in it using Stream functions?
 *
 * First Non-Repeated Character : == 1L
 * First Repeated Character  :  >1L
 *
 */
public class g_7_FindNonRepeated_IMP {

    public static void main(String[] args) {
        String input = "Java articles are Awesome";
        System.out.println(input);


        System.out.println("====== 2026 Version Directly Answer======\n");
        System.out.println("====== Wednesday, August 12, 2026 12:51:51 AM ======\n");
        input.chars()
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream() //<--
                .filter(e -> e.getValue() == 1L) //<--
                .map(e -> e.getKey())
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("====== Monday, August 17, 2026 11:30:36 PM ======\n");


        Character result1 = input.chars()
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1L) //<--
                .map(e -> e.getKey())
                .findFirst()
                .orElse(null);

        System.out.println(result1);

        System.out.println("======  Approach 2 No Need to use value of   ======");
        Optional<Character> result2 =
                input.chars()
                        .mapToObj(s -> Character.toLowerCase((char) s))
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                LinkedHashMap::new,
                                Collectors.counting()
                        ))
                        .entrySet()
                        .stream()
                        .filter(e -> e.getValue() == 1) //<--
                        .map(e -> e.getKey())
                        .findFirst();


        result2.ifPresent(ch -> System.out.println(ch));





    }
}


