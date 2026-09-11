package study.java8_streamAPI_2_Interview_QA;

import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created : 2026-08-12 01:23:32
 */

// Count occurrences of each character using Streams.
public class CountOccurenceOfEachCharacter {
    public static void main(String[] args) {

        String input = "Java is good Java is powerful";

        input.chars()
                .mapToObj(ch -> Character.toLowerCase((char) ch))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )).forEach((k,v)-> System.out.println(k+"->"+v));
    }
}
