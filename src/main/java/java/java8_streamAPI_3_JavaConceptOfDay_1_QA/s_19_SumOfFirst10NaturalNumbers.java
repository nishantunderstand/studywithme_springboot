package java.java8_streamAPI_3_JavaConceptOfDay_1_QA;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>
 */
public class s_19_SumOfFirst10NaturalNumbers {

    public static void main(String[] args) {
        int sum = IntStream.range(1,11).sum();
        System.out.println("====== Saturday, July 25, 2026 2:50:02 PM ======");
        System.out.println(sum);

        System.out.println("====== Saturday, July 25, 2026 2:50:40 PM ======");
        int sum2 = IntStream.rangeClosed(1,10).sum();
        System.out.println(sum2);

        int sum3 = Stream.iterate(1, n-> n+1)
                .limit(10)
                .mapToInt(Integer::valueOf)
                .sum();
        System.out.println("====== Saturday, July 25, 2026 2:55:56 PM ======");
        System.out.println(sum3);





    }
}
