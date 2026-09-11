package java.java8_streamAPI_2_Interview_QA;

import java.util.stream.IntStream;

/**
 * Created : 2026-08-12 01:33:22
 */
public class a_Deloite_2_isPrime_2026 {
    public static void main(String[] args) {
        IntStream.rangeClosed(2, 10)
                .filter(n ->IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(i -> n % i == 0))
                .forEach(System.out::println);
    }
}

// Intstream WRONG
// IntStream // CORRECT
