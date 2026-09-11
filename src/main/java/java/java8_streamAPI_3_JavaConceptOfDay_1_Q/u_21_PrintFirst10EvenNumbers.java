package java.java8_streamAPI_3_JavaConceptOfDay_1_Q;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>
 */
public class u_21_PrintFirst10EvenNumbers {

    public static void main(String[] args) {
        Stream.iterate(2,n-> n+2)
                .limit(10)
                .forEach(System.out::println);
        System.out.println("====== Saturday, July 25, 2026 3:01:02 PM ======");

        IntStream.iterate(2,n->n+2)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("====== Saturday, July 25, 2026 3:01:56 PM ======");

        IntStream.rangeClosed(1,20)
                .filter(n->n%2==0)
                .forEach(System.out::println);

        System.out.println("====== Saturday, July 25, 2026 3:07:12 PM ======");
        IntStream.rangeClosed(1,10)
                .map(i -> i*2)
                .forEach(System.out::println);
    }
}
