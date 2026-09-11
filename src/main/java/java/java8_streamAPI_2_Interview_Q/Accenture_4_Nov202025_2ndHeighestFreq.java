package java.java8_streamAPI_2_Interview_Q;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * see {@link  Accenture_3_Nov202025_2_HeighestFrequency}
 */
public class Accenture_4_Nov202025_2ndHeighestFreq {
    public static void main(String[] args) {
        // 2nd Highest Word Frequency Excluding Space
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
                .sorted(Map.Entry.<Character,Long> comparingByValue().reversed()) //<--  Important Line
                .skip(1)
                .map(Map.Entry::getKey)
                .findFirst() //<-- // Why FindFirst is used here ???
                .ifPresent(System.out::println);

    }
}
