import java.util.Scanner;

public class Main {

    public static boolean isVowel(char letter) {
        boolean l = true;
        for (int i = 0; i <4;i++){
            if (letter != 'a' && letter != 'e' && letter != 'i' && letter != 'o' && letter != 'A' && letter != 'E' && letter != 'I' && letter != 'O' && letter != 'u' && letter != 'U'){
                l = false;
            }
        }
        return l;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}
