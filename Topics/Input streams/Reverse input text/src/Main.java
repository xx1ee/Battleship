import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String charAsNumber = reader.readLine();
        String str = "";
        for (int i = charAsNumber.length() - 1 ; i >= 0 ; i--) {
            str = str + charAsNumber.charAt(i);
        }
        System.out.println(str);
        reader.close();
    }
}