import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] a = new int[n][m];
        int[][] b = new int[m][n];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        int h = 0;
        int l = 0;
        for (int j = 0 ; j < m ; j++) {
            for (int i = n-1 ; i >= 0 ; i--) {
                b[h][l] = a[i][j];
                ++l;
            }
            l = 0;
            ++h;
        }
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < n ; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}