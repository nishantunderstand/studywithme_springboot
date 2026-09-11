package java.java8_streamAPI_3_JavaConceptOfDay_1_Q;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>
 */
public class i_9_MergeTwoUnsortedArraysIntoSorted {

    public static void main(String[] args) {
        int[] a = new int[] {4, 2, 7, 1};
        int[] b = new int[] {8, 3, 9, 5};

        IntStream.concat(Arrays.stream(a),Arrays.stream(b))
                .sorted()
                .forEach(System.out::println);

        System.out.println("======  Merge and Store to Array Print the Array ======\n");

        int[] res = IntStream.concat(Arrays.stream(a),Arrays.stream(b))
                .sorted().toArray();
        System.out.println(Arrays.toString(res));


    }
}
