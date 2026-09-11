package java.java8_streamAPI_1_BlogDev_Q;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 8. Given a String, find the first repeated character in it using Stream functions?
 *
 */
public class h_8_FirstRepeated {
    public static void main(String[] args) {
        String input = "Java Articles are Awesome";
        System.out.println("=== HASHMAP Approach-1 ====");
        Optional<Character> result1 =
                input.chars()
                        .mapToObj(c -> Character.toLowerCase((char) c))
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                LinkedHashMap::new,
                                Collectors.counting()
                        ))
                        .entrySet()
                        .stream()
                        .filter(e -> e.getValue() > 1L) //<--
                        .map(e -> e.getKey())
                        .findFirst();
        result1.ifPresent(ch -> System.out.println(ch));


        System.out.println("=== HASHMAP Approach-2 ====");
        input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        ch -> ch,
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1L)
                .map(e -> e.getKey()) //<--s
                .findFirst()
                .ifPresent(System.out::println);


        System.out.println("====== HASHSET APPROACH ============");
        HashSet<Character> seen = new HashSet<>();

        Optional<Character> result2 = input.chars()
                .mapToObj(c -> Character.toLowerCase((char) c))
                .filter(c -> !seen.add(c))
                .findFirst();
        result2.ifPresent(ch -> System.out.println(ch));

    }
}


