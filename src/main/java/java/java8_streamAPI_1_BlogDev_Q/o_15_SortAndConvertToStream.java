package java.java8_streamAPI_1_BlogDev_Q;

import java.util.Arrays;

/**
 * 15. Write a Java 8 program to sort an array and then convert the sorted array into Stream?
 */
public class o_15_SortAndConvertToStream {
    public static void main(String[] args) {
        int arr[] = {99, 55, 203, 99, 4, 91};
        //Arrays.sort(arr);
        Arrays.parallelSort(arr);
        // What is the Difference Between them ?
        // Which one is better
        Arrays.stream(arr).forEach(System.out::println);
    }
}


/**
 * Difference B/W sort vs parallelSort
 * <p>
 * | Aspect             | `Arrays.sort()`     | `Arrays.parallelSort()`         |
 * | ------------------ | ------------------- | ------------------------------- |
 * | Threading          | Single              | Multi-threaded (ForkJoinPool)   |
 * | Speed (small data) | Faster              | Slower (thread overhead)        |
 * | Speed (large data) | Slower              | Faster                          |
 * | Introduced         | Java 1.2            | Java 8                          |
 * | Use case           | Small/medium arrays | Large arrays on multi-core CPUs |
 */

