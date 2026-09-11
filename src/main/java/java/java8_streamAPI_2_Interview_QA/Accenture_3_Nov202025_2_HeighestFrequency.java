package java.java8_streamAPI_2_Interview_QA;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * see {@link Accenture_4_Nov202025_2ndHeighestFreq}
 */
public class Accenture_3_Nov202025_2_HeighestFrequency {
    public static void main(String[] args) {
        // Highest Word Frequency
        // Highest Word Frequency Excluding Space
        String input1 = "aa a a a a b b a a       a";
        String input = "aa a a a a b b a a c c c c c c c c c c      a";

        input.chars()
                .mapToObj(ch -> Character.toLowerCase((char)ch))
                .filter(ch -> ch != ' ')
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue()) //<--
                .map(Map.Entry::getKey) //<-- // Can we use findFirst here Why FindFirst is used here ???
                .ifPresent(System.out::println);

    }
}
