import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int flag = 1;
        while (flag != 0) {
            String X = scanner.nextLine();
            if (X.equals("0")) {
                flag = 0;
            } else {
                try {
                    System.out.println(Integer.parseInt(X) * 10);
                } catch (Exception e) {
                    System.out.println(String.format("Invalid user input: %s", X));
                }
            }
        }
    }
}