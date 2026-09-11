package java.java8_streamAPI_2a_Instagram_Videos_Q;

import java.util.Arrays;
import java.util.List;


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

public class Main {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Aman", 25),
                new Person("Nishant", 25),
                new Person("Babitaa", 25),
                new Person("Zubeda", 25),
                new Person("Rahul", 16),
                new Person("Priya", 22),
                new Person("Amit", 17),
                new Person("Sneha", 30)
        );

        // 1. Filter out People Younger than 18
        // 2. Extract there Name
        // Converts names to uppercase
        // Sort it Lexiographically
    }
}
