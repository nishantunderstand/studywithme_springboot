package study.java8_streamAPI_1_BlogDev_QA;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 12. How will you get the current date and time using Java 8 Date and Time API?
 */
public class l_12_WorkWithDate {
    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
    }
}


