import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ex = sc.nextLine();
        int total = 1;
        for (int i = 0; i < ex.length(); i++)
        {
            if ((ex.charAt(i) == ' ') && (ex.charAt(i + 1) != ' '))
            {
                total++;
            }
        }
        System.out.println(total);
    }
}
