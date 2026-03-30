package abc;

import java.util.*;
import java.util.stream.*;

public class divisibleby3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 9, 10, 12, 14, 18, 20);

       
        List<Integer> result = numbers.stream()
                                      .filter(n -> n % 3 == 0)
                                      .collect(Collectors.toList());

       
        System.out.println("Numbers divisible by 3: " + result);
    }
}
