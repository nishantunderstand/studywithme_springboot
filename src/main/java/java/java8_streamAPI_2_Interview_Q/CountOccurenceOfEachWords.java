package java.java8_streamAPI_2_Interview_Q;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created : 2026-08-12 02:41:37
 */
// 5. Count occurrences of each word using Streams.
public class CountOccurenceOfEachWords {
    public static void main(String[] args) {
        String input = "Java is good Java is powerful";

        /** WRONG CODE
        input.chars()
                .mapToObj(ch -> Character.toLowerCase((char) ch))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )).forEach((k,v)-> System.out.println(k+"->"+v));
         */



        Arrays.stream(input.toLowerCase().split("\\s+"))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}

// You need to write System.out.println in the code.
