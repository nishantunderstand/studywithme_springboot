package study.java8_streamAPI_2_Interview_QA;


import java.util.stream.IntStream;
// Wednesday, April 15, 2026 9:01:17 PM
public class a_Deloite_2_isPrime_Correct_ButNot_InterviewFriendly {

    // Prime Number
    public static void main(String[] args) {
        IntStream.rangeClosed(2,50)
                .filter(a_Deloite_2_isPrime_Correct_ButNot_InterviewFriendly::isPrime)
                .forEach(n-> System.out.print(n+ " \t "));
    }


    public static boolean isPrime(int num){
        return num>1 && IntStream.rangeClosed(2,(int)Math.sqrt(num))
                .noneMatch(i-> num%i==0);
    }
}