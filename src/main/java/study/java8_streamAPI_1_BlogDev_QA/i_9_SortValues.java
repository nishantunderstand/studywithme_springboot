package study.java8_streamAPI_1_BlogDev_QA;

import java.util.Arrays;
import java.util.List;

/**
 * 9. Given a list of integers, sort all the values present in it using Stream
 * functions?
 */
public class i_9_SortValues {
    public static void main(String[] args) {
        // List
        List<Integer> myList = Arrays.asList(10, 15, 18, 8, 49, 25, 98, 32, 15);
        //myList.stream().sorted().forEach(System.out::println);
        myList.stream()
                .sorted()
                .forEach(e -> System.out.println(e));


        // Arrays
        //int[] arr = new int[10,15,18,8,49,25,98,32,15];
        int[] arr = {10, 15, 18, 8, 49, 25, 98, 32, 15};
        Arrays.stream(arr).boxed().sorted().forEach(System.out::println);

    }
}


