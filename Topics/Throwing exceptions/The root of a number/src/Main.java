import java.util.*;

public class Main {

    public static double sqrt(double x) {
        if (x < 0) {
            throw new java.lang.IllegalArgumentException(String.format("Expected non-negative number, got %s",x));
        } else return Math.sqrt(x);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        String value = new Scanner(System.in).nextLine();
        try {
            double res = sqrt(Double.parseDouble(value));
            System.out.println(res);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}