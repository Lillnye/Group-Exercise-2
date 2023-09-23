import java.util.Scanner;
public class Increments
{
    private String increment(String input){
        char[] chars = input.toCharArray();

        boolean stopLoop = false;
        for(int i = chars.length - 1; i >= 0; i--){
            char character = chars[i];
            switch (character) {
                case '0', '1', '2', '3', '4', '5', '6', '7', '8' -> {
                    chars[i] = (char) (character + 1);
                    stopLoop = true;
                }
                case '9' -> chars[i] = '0';
                default -> {
                    if(i + 1 < chars.length && chars[i + 1] == '0')
                        stopLoop = true;
                }
            }

            if(stopLoop)
                break;
        }

        return  new String(chars);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(new Increments().increment(s));
    }
}
