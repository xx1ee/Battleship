import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] twoDimArray = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                twoDimArray[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int z = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (k == j) {
                    z = twoDimArray[i][j];
                    twoDimArray[i][j] = twoDimArray[i][l];
                    twoDimArray[i][l] = z;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}