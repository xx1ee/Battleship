import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = 0;
        if (A>0) {
            D += 1;
        }
        if (B>0) {
            D += 1;
        }
        if (C>0) {
            D += 1;
        }
        if (D == 1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}