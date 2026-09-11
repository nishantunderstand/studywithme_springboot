package study.java8_streamAPI_2_Interview_QA;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

// Find the First Non-Repeated Character in a String Using Java 8 Streams
// Wednesday, April 15, 2026 9:01:31 PM
public class a_Paytm_1_FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String str = "aabbcdeff";

        Character res =  str.chars()
                .mapToObj(x->(char)x)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue()==1L)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();

        System.out.println("res : "+res);

    }
}