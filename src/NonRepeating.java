import java.util.Scanner;
public class NonRepeating {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean b = true;

        for(char i : s.toCharArray())
        {
            if (s.indexOf(i) == s.lastIndexOf(i))
            {
                System.out.println(i);
                b = false;
                break;
            }
        }

        if(b)
        {
            System.out.println("There aren't any non-repeating characters");
        }
    }
}
