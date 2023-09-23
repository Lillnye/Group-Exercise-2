public class Swap {
    public static void main(String[] args) {
        String a = "I'm Lilly";
        String b = "Greetings";

        a = a + b;

        b = a.substring(0, a.length() - b.length());

        a = a.substring(b.length());

        System.out.println(a + " " + b);
    }

}
