package java.java8_streamAPI_1_BlogDev_QA;

import java.util.Arrays;
import java.util.List;

/**
 * 14. Java 8 program to perform cube on list elements and filter numbers greater than 50.
 */
public class n_14_PerformCube {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(4, 5, 6, 7, 1, 2, 3);
        myList.stream()
                .map(n -> n * n * n)
                .filter(n -> n > 50)
                .forEach(e -> System.out.print(e + "\t"));
    }
}


