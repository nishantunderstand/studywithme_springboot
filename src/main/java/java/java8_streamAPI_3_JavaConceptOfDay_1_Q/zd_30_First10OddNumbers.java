package java.java8_streamAPI_3_JavaConceptOfDay_1_Q;

import java.util.stream.IntStream;

/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>
 */
public class zd_30_First10OddNumbers {

    public static void main(String[] args) {
        IntStream.rangeClosed(1,20)
                .filter(n->n%2==1)
                .forEach(n-> System.out.print(n+" "));

        System.out.println("====== Sunday, July 26, 2026 10:10:12 AM ======");
        IntStream.iterate(1,n -> n+2)
                .limit(10)
                .forEach(n -> System.out.print(n+" "));

        System.out.println("====== Sunday, July 26, 2026 10:11:48 AM ======");

        IntStream.range(0,10)
                .map(i-> 2*i+1)
                .forEach(n -> System.out.print(n+" "));



    }
}
