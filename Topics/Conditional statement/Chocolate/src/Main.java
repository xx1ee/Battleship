import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        if (k % 2 !=0 && ((n * m - k) >= 0) && (k % n == 0 || k % m == 0)){
            System.out.println("YES");
        }
        else {
            if ((k % 2 == 0 && ((n * m - k) >= 0))){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}