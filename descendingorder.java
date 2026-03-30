package abc;

import java.util.*;

public class descendingorder {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 2, 8, 1, 9);

        Collections.sort(list, (a, b) -> b - a);

        System.out.println("Descending order: " + list);
    }
}