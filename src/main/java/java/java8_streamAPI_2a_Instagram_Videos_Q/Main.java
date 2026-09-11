package java.java8_streamAPI_2a_Instagram_Videos_Q;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
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
        List<String> res1  = people.stream().
                        filter(p->p.getAge()>=18)
                        .map(Person::getName)
                        .collect(Collectors.toList());

        // Converts names to uppercase
        List<String> res2 = people.stream().
                filter(p->p.getAge()>=18)
                .map(Person::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Sort it Lexiographically

        List<String> res  = people.stream().
                filter(p->p.getAge()>=18)
                .map(Person::getName)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());


        System.out.println(res);


    }
}