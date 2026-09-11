package java.java8_streamAPI_3_JavaConceptOfDay_1_Q;

import java.util.stream.Stream;

/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>
 */
public class zc_29_FibonacciSeries {

    public static void main(String[] args) {
        // 0 1 1 2

    }
}


/**

| Iteration | `t` (pair) | `t[0]` printed | Next pair |
| --------- | ---------- | -------------- | --------- |
| 1         | `[0,1]`    | 0              | `[1,1]`   |
| 2         | `[1,1]`    | 1              | `[1,2]`   |
| 3         | `[1,2]`    | 1              | `[2,3]`   |
| 4         | `[2,3]`    | 2              | `[3,5]`   |
| 5         | `[3,5]`    | 3              | `[5,8]`   |
| 6         | `[5,8]`    | 5              | `[8,13]`  |
| 7         | `[8,13]`   | 8              | `[13,21]` |
| 8         | `[13,21]`  | 13             | `[21,34]` |


 */
