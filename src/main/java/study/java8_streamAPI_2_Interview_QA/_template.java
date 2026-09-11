package study.java8_streamAPI_2_Interview_QA;

import java.util.stream.IntStream;

/**
 * https://www.programiz.com/java-programming/online-compiler/
 */
public class _template {
    public static void main(String[] args) {
        IntStream.rangeClosed(2,10)
                .filter(n -> IntStream.rangeClosed(2,n/2).noneMatch(i->n%i==0))
                .forEach(System.out::println);


    }
}
