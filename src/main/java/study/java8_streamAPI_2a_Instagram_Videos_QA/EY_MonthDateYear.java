package study.java8_streamAPI_2a_Instagram_Videos_QA;

import java.time.LocalDate;
import java.time.Month;

public class EY_MonthDateYear {
    public static void main(String[] args) {

        String dayInput2 = "4th";
        String dayInput3 = "1st";
        String dayInput = "3rd";
        String monthInput = "September";
        int year = 2025;

        int day = Integer.parseInt(dayInput.replaceAll("\\D",""));
        // This will extract 1st

        Month month = Month.valueOf(monthInput.toUpperCase());

        LocalDate date = LocalDate.of(year,month,day);

        System.out.println(date);
    }
}