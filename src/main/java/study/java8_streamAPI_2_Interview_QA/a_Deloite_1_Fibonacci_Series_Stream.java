package study.java8_streamAPI_2_Interview_QA;


import java.util.stream.Stream;

// Wednesday, April 15, 2026 9:01:11 PM
// FibSeries by Stream
public class a_Deloite_1_Fibonacci_Series_Stream {

    public static void main(String[] args) {

        System.out.println("====== Past Interview ======\n");
        Stream.iterate(
                        new int[]{0, 1},
                        arr -> new int[]{arr[1], arr[0] + arr[1]} //<--
                ).limit(10)
                .map(arr -> arr[0])
                .forEach(System.out::println);

    }
}