// Don't delete scanner import
import java.util.Scanner;

class Name {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String lastName = scanner.next();
        System.out.println(createFullName(firstName, lastName));
    }

    //implement your method here
    public static String createFullName(String firstName, String lastName) {
        String s = firstName + " " + lastName;
        return s;
    }
}