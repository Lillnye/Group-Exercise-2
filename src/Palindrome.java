import java.util.Scanner;
public class Palindrome {
    public static boolean p (String s)
    {
        String r = "";
        boolean palindrome = false;

        for (int i = s.length() - 1; i >= 0; i--)
        {
            r = r + s.charAt(i);
        }

        if (s.equals(r))
        {
            palindrome = true;
        }
        return palindrome;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String example = sc.nextLine();

        example = example.toLowerCase();
        boolean answer = p(example);
        System.out.println(answer);
    }
}
