import java.util.Arrays;
import java.util.Scanner;
public class Anagrams
{
    static boolean Anagram(char[] str1, char[] str2)
    {
        int n1 = str1.length;
        int n2 = str2.length;

        if (n1 != n2)
        {
            return false;
        }

        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < n1; i++)
        {
            if (str1[i] != str2[i])
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        // Function Call
        if (Anagram(str1, str2))
        {
            System.out.println(s1 + " and " + s2 + " are Anagrams");
        }
        else
        {
            System.out.println(s1 + " and " + s2 + " are not Anagrams");
        }
    }
}
