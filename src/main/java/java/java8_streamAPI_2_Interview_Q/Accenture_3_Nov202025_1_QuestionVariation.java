package java.java8_streamAPI_2_Interview_Q;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created : 2026-08-12 01:53:44
 *
 * 1. Find the most repeated character in a String.
 * 2. Find the highest frequency character excluding spaces.
 * 3. Find the second highest occurring character.
 * 4. Count occurrences of each character using Streams.
 * 5. Count occurrences of each word using Streams.
 * 6. Find the top N frequent characters in a String.
 *
 */


// First Heighest
public class Accenture_3_Nov202025_1_QuestionVariation {
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
                .skip(1)
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .ifPresent(System.out::println);

    }
}
