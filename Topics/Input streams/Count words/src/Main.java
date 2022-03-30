import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String charAsNumber = reader.readLine();
        try {
            charAsNumber = charAsNumber.trim();
            String [] words = charAsNumber.split("\\s+");
            if (words.length != 1) {
                System.out.println(words.length);
            } else System.out.println(0);
        } catch (Exception e) {
            System.out.println(0);
        }
    }
}