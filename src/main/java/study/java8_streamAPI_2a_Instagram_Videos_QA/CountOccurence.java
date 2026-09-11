package study.java8_streamAPI_2a_Instagram_Videos_QA;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// Count occurrences in a List — Java Streams way!
// https://www.instagram.com/reel/DXLcU9vjQoG/
public class CountOccurence {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "Java", "Python", "Java", "Spring",
                "Python", "Java", "SQL"
        );

        Map<String,Long> fMap = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<String,Integer> fMap2 = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.summingInt(e->1)));

        System.out.println(fMap);

        System.out.println(fMap2);

        for(Map.Entry<String,Long> entry : fMap.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
