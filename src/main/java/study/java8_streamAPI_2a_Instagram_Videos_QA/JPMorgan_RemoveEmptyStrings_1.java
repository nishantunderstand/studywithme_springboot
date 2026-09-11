package study.java8_streamAPI_2a_Instagram_Videos_QA;
// https://www.youtube.com/shorts/KW-NOs2V2zA
// https://www.instagram.com/reels/DWWnq0cpaiD/

import java.util.Arrays;

public class JPMorgan_RemoveEmptyStrings_1 {

    public static void main(String[] args) {
        String[] input = {"Java", "", " ", "Streams", "are", "cool", "NULL", "null"};
        Arrays.stream(input).filter(s -> !s.isEmpty()).forEach(System.out::println);
    }
}
