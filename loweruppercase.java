package abc;

import java.util.Arrays;
import java.util.List;

public class loweruppercase {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("java", "python", "c++", "html");
        list.forEach(s -> System.out.println(s.toLowerCase()));
        System.out.println("  ");
        list.forEach(s -> System.out.println(s.toUpperCase()));
    }
}
