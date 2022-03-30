import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int[] a = new int[l];
        for (int i = 0; i < l ; i++) {
            a[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean t = true;
        for (int i = 0; i< a.length - 1 ; i++) {
            if (((a[i] == n) && (a [i + 1] == m)) || ((a[i] == m) && (a [i + 1] == n))) {
                t = false;
                break;
            }
        }
        System.out.println(t);
    }
}