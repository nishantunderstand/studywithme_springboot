package study.java8_streamAPI_2a_Instagram_Videos_QA;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CombineRoles {
    public static void main(String[] args) {
        List<String> roles = Arrays.asList("ADMIN","MANAGER","USER");
        String res = roles.stream().collect(Collectors.joining("|"));
        System.out.println(res);
    }
}