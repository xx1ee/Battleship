import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int[] a = new int[l];
        for (int i = 0; i < l ; i++) {
            a[i] = scanner.nextInt();
        }
        int t = 0;
        for (int i = 0; i< a.length ; i++) {
            t+=a[i];
        }
        System.out.println(t);
    }
}