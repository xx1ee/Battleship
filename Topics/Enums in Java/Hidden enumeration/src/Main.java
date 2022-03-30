public class Main {

    public static void main(String[] args) {
        int a = 0;
        for (Secret status : Secret.values()) {
            if (status.name().startsWith("STAR") == true)
            {
                ++a;
            }
        }
        System.out.println(a);
    }
}


