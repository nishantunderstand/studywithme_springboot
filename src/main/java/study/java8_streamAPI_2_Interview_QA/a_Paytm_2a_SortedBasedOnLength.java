package study.java8_streamAPI_2_Interview_QA;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// You need to sort Based on length || This is not asked to me
// Wednesday, April 15, 2026 9:01:37 PM
public class a_Paytm_2a_SortedBasedOnLength {

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple","banana","kiwi","watermelon");

        // ASC
        myList.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);

        // DESC
        myList.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(System.out::println);
    }
}
