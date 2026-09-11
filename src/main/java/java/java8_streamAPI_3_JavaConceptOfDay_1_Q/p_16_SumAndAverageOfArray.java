package java.java8_streamAPI_3_JavaConceptOfDay_1_Q;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>
 */
public class p_16_SumAndAverageOfArray {

    public static void main(String[] args) {

        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        System.out.println("====== SUM  ======\n");
        int sum = Arrays.stream(a).sum();
        System.out.println("SUM : "+sum);
        System.out.println("====== Average ======\n");
        //double avg = Arrays.stream(a).average() => Return Type Optional<Double>
        //double avg = Arrays.stream(a).average().getAsDouble(); => Return Type  double
        double avg = Arrays.stream(a).average().getAsDouble();

        System.out.println("Average : "+avg);

        System.out.println("====== Different Approach ======\n");

        IntSummaryStatistics stats = Arrays.stream(a).summaryStatistics();
        System.out.println("Max : " + stats.getMax());
        System.out.println("Min : " + stats.getMin());
        System.out.println("Average : " + stats.getAverage());
        System.out.println("Size/Count  : " + stats.getCount());
        System.out.println("Sum : " + stats.getSum());

        List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        // IntSummaryStatistics stats1 = list.stream().summaryStatistics(); // NOT DEFINED FOR THIS
        // IntSummaryStatistics DEFINED FOR
        // IntStream
        // LongStream
        // DoubleStream

        IntSummaryStatistics stats1 =  list.stream().mapToInt(Integer::intValue).summaryStatistics();





    }
}
