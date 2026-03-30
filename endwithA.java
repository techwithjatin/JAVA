package abc;

import java.util.*;
import java.util.stream.Collectors;

class endwithA{
    public static void main(String[] args){

List<String> list = Arrays.asList("Apple", "Banana", "Avocado", "Mango");

List<String> result = list.stream()
        .filter(s -> s.endsWith("a"))
        .collect(Collectors.toList());

System.out.println(result);
    }
}
