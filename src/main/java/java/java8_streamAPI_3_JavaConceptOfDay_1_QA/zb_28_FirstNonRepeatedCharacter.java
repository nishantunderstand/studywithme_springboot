package java.java8_streamAPI_3_JavaConceptOfDay_1_QA;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>
 */
public class zb_28_FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";

        inputString.chars()
                .mapToObj(ch -> Character.toLowerCase((char)ch))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue()==1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .ifPresent(System.out::println);
    }
}

/**
 * 27) Find first repeated character in a string? | That will have Occurence > 1L
 * 28) Find first non-repeated character in a string? | That will have Occurence 1L
 */