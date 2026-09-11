package study.java8_streamAPI_1_BlogDev_QA;

import java.util.Collections;
import java.util.List;

public class j_10_SortDescending {

    public static void main(String[] args) {
        List<Integer> myList = List.of(10, 15, 8, 45, 25, 98, 32, 12, 15);

        myList.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);

        myList.stream().sorted((a, b) -> Integer.compare(b, a)).forEach(System.out::println);
        myList.stream().sorted((a, b) -> b.compareTo(a)).forEach(System.out::println);

    }
}

/**
 * IntelliJ Formatting : Ctrl+Alt+L IntelliJ Compile and Run : Ctrl+Shift+f10
 * When to use compare or compareTo ?
 *
 *
 */


