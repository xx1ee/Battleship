import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = 3;
        int[] a = new int[l];
        int[] b = new int[l];
        for (int i = 0; i < l ; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < l ; i++) {
            b[i] = scanner.nextInt();
        }
        int t = 0;
        for (int i = 0; i< a.length; i++) {
            for (int j = 0;j<a.length - 1; j++) {
                if (a[j] > a[j +1]) {
                    t = a[j + 1];
                    a[j +1] = a[j];
                    a[j] = t;
                }
                if (b[j] > b[j +1]) {
                    t = b[j + 1];
                    b[j +1] = b[j];
                    b[j] = t;
                }
            }
        }
        if (a[0] < b[0] && a[1] < b[1] && a[2] < b[2]) {
            System.out.println("Box 1 < Box 2");
        } else {
            if (a[0] > b[0] && a[1] > b[1] && a[2] > b[2]) {
                System.out.println("Box 1 > Box 2");
            } else {
                System.out.println("Incompatible");
            }
        }
    }
}