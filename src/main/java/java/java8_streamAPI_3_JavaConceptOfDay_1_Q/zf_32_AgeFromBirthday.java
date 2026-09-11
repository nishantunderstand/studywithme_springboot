package java.java8_streamAPI_3_JavaConceptOfDay_1_Q;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>
 */
public class zf_32_AgeFromBirthday {

    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(1985, 01, 23);
        LocalDate today = LocalDate.now();
        System.out.println(ChronoUnit.YEARS.between(birthDay,today));

    }
}
