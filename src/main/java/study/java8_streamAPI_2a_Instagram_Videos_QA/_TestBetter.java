package study.java8_streamAPI_2a_Instagram_Videos_QA;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _TestBetter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java","spring","java");

        Map<String,Long> fMap =
        words.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        System.out.println(fMap);
    }
}
