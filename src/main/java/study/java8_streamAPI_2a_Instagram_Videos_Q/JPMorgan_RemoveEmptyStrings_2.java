package study.java8_streamAPI_2a_Instagram_Videos_Q;
// https://www.instagram.com/reels/DWWnq0cpaiD/

import java.util.Arrays;
import java.util.List;


// 1. Remove Empty
// 2. Remove Blank
// What if null is added ???
public class JPMorgan_RemoveEmptyStrings_2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice","","Bob","Chaarlie","David",""," ",null);
    }
}
