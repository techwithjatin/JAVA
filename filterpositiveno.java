package abc;

import java.util.*;
import java.util.stream.*;

public class filterpositiveno {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-5, 10, -3, 7, 0, 15, -2);

        
        List<Integer> positiveNumbers = numbers.stream()
                                               .filter(n -> n > 0)
                                               .collect(Collectors.toList());

       
        System.out.println("Positive Numbers: " + positiveNumbers);
    }
}
