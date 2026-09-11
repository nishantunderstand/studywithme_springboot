package java.java8_streamAPI_1_BlogDev_QA;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 13. Write a Java 8 program to concatenate two Streams?
 */
public class m_13_StreamAdd {
    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("Java", "8");
        List<String> l2 = Arrays.asList("Explained", "Through", "Programs");

        Stream<String> concatedString = Stream.concat(l1.stream(), l2.stream());
        //concatedString.forEach(System.out::print);

        concatedString.forEach(e -> System.out.print(e + " "));

    }
}


