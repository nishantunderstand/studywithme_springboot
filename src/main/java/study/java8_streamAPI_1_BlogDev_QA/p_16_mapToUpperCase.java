package study.java8_streamAPI_1_BlogDev_QA;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 16. How to use map to convert object into Uppercase in Java 8?
 */
public class p_16_mapToUpperCase {

    public static void main(String[] args) {

        String[] names1 = {"aa", "bb", "cdEF", "ffHH"};
        List<String> names = Arrays.asList("aa", "bb", "cc", "cdeF", "ffHH");

        List<String> namesList = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        namesList.forEach(System.out::println);

        System.out.println("======WORKING=======");
        Arrays.stream(names1).map(String::toUpperCase).forEach(System.out::println);
        // What went wrong with this approach.
    }
}

/**
 * boxed
 * <p>
 * *IntStream -> Stream<Integer>
 * LongStream -> Stream<Long>
 * DoubleStream -> Stream<Double>
 * <p>
 * ===========================================
 * <p>
 * *How to Convert to Stream ? List = List.stream Set = Map<K,V>
 * Arrays String
 * <p>
 * *List list.stream() → Stream<T>
 * Used to process List elements as a Stream List<String> list =
 * Arrays.asList("a", "b"); list.stream().forEach(System.out::println);
 * <p>
 * *Set set.stream() → Stream<T>
 * Works same as List, but order is not guaranteed Set<String> set = new
 * HashSet<>(list); set.stream().forEach(System.out::println);
 * <p>
 * *Map map.entrySet().stream() → Stream<Map.Entry<K,V>> For both key & value;
 * can also stream keys or values separately Map<Integer, String> map =
 * Map.of(1, "A", 2, "B"); map.entrySet().stream() .forEach(e ->
 * System.out.println(e.getKey() + "=" + e.getValue()));
 * <p>
 * *Array Arrays.stream(array) → Stream<T>
 * For Object arrays like String[], Integer[] String[] arr = {"a", "b"};
 * Arrays.stream(arr).forEach(System.out::println);
 * <p>
 * <p>
 * *String string.chars() → IntStream Returns Unicode code points of characters
 * Convert to characters using mapToObj(c -> (char)c)
 * <p>
 * *String input = "Java";
 * <p>
 * *IntStream of Unicode values input.chars().forEach(System.out::println);
 * <p>
 * *Convert IntStream → Stream<Character> and print characters input.chars()
 * .mapToObj(c -> (char)c) .forEach(System.out::println);
 *
 **/


