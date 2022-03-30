import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int b3 = scanner.nextInt();
        a1 = a1 * 60 * 60;
        a2 = a2 * 60;
        b1 = b1 * 60 * 60;
        b2 = b2 * 60;
        System.out.println(b2 + b1 + b3 - a1 - a2 - a3);
    }
}
