public class Reverse {
    public static void main(String[] args) {
        String r = "Lilly";
        char[] re = r.toCharArray();
        for (int i = re.length - 1; i >= 0; i--)
        {
                System.out.print(re[i]);
        }
    }
}
