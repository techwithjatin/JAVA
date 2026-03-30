package abc;

interface Greater {
    int compare(int a, int b);
}

public class lambdaexpression {
    public static void main(String[] args) {

        Greater g = (a, b) -> (a > b) ? a : b;

        int result = g.compare(10, 20);

        System.out.println("Greater number is: " + result);
    }
}
