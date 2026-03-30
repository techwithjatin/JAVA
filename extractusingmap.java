package abc;

import java.util.*;
import java.util.stream.*;

class Student2 {
    int id;
    String name;

    Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class extractusingmap {
    public static void main(String[] args) {
        List<Student2> list = Arrays.asList(
            new Student2(1, "Aman"),
            new Student2(2, "Riya"),
            new Student2(3, "Karan")
        );

        List<String> names = list.stream()
                .map(s -> s.name)
                .collect(Collectors.toList());

        System.out.println(names);
    }
}