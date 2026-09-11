package java.java8_streamAPI_2a_Instagram_Videos_Q;
// https://www.instagram.com/reels/DWWnq0cpaiD/

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


// 1. Remove Empty
// 2. Remove Blank
// What if null is added ???
public class JPMorgan_RemoveEmptyStrings_2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice","","Bob","Chaarlie","David",""," ",null);
        //List<String> result = names.stream().filter(s->!s.isEmpty()).collect(Collectors.toList());
        // List<String> result = names.stream().filter(s->!s.isBlank()).collect(Collectors.toList());

        List<String> result = names.stream()
                .filter(Objects::nonNull)
                .filter(s->!s.isBlank())
                .collect(Collectors.toList());
        System.out.println(result);

    }
}
