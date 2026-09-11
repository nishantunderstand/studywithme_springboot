package study.java8_streamAPI_2a_Instagram_Videos_QA;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestSalary {
    public static void main(String[] args) {
        List<Integer> salaries = Arrays.asList(
                50000, 70000, 60000, 90000,
                70000, 90000, 80000
        );

        System.out.println(salaries);

        Integer res1 = salaries.stream().
                        sorted(Comparator.reverseOrder())
                        .skip(1)
                        .limit(1)
                        .findFirst()
                        .orElse(null);

        Integer res = salaries.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                        .skip(1)
                                .findFirst()
                                        .orElse(null);

        System.out.println(res);
    }
}
