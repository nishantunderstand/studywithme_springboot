package java.java8_streamAPI_2a_Instagram_Videos_QA;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MaxAndMin {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,2,3,4,6,7,9,11,0,-1,-5,-1,2,2,Integer.MAX_VALUE,Integer.MIN_VALUE,null);
        List<String> input = Arrays.asList("Alice","Bob",""," ","   ",null,"Alice","alice","ALICE"," Bob ","निशांत","José","123","@#$%");

        Integer max = myList.stream().filter(Objects::nonNull)
                .max(Integer::compare)
                .get();

        Integer min = myList.stream().filter(Objects::nonNull)
                .min(Integer::compare)
                .get();

        System.out.println(max);
        System.out.println(min);

        // Why Compare and compareTo

        String  maxstr = input.stream().filter(Objects::nonNull)
                .max(String::compareTo)
                .get();

        String minstr = input.stream().filter(Objects::nonNull)
                .min(String::compareTo)
                .get();

        System.out.println(maxstr);
        System.out.println(minstr);

    }
}
