package java.java8_streamAPI_2_Interview_Q;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


class Accenture_2_Nov202025 {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("String: " + str);

        /*System.out.println("======  Frequency Map  ======");
        Map<Character,Long> namescnt =
                str.toLowerCase().chars().mapToObj(ch->(char)ch)
                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(namescnt);

        System.out.println("======  Frequency Map : IGNORING BLANK ======");
        Map<Character,Long> namescnt1 =
                str.toLowerCase().chars().mapToObj(ch->(char)ch)
                        .filter(ch->ch !=' ')
                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(namescnt1);

        System.out.println("====== ForEach   ======");
        namescnt1.forEach((k,v)->
                System.out.println(k + ":"+ v)
        );

        System.out.println("======  Map.Entries  ======");
        for(Map.Entry<Character,Long> entry : namescnt1.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }*/

        System.out.println("======  Find Highest Word Frequency   ======");
        Map<Character, Integer> namescnt2 =  str
                .toLowerCase()
                .chars()
                .mapToObj(ch->(char)ch)
                .filter(ch-> ch!=' ')
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        HashMap::new,
                        Collectors.summingInt(n->1)
                ));
        System.out.println(namescnt2.entrySet());
        Map.Entry<Character,Integer> maxEntry =
                namescnt2.entrySet().stream().max(Map.Entry.comparingByValue())
                        .orElse(null);

        System.out.println(maxEntry.getKey() + " : " + maxEntry.getValue());




    }
}