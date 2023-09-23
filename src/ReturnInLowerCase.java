public class ReturnInLowerCase
{
    public static void main(String[] args)
    {
        String[] array = {"Abba", "Lilly", "ArbitRatioN", "EAt", "At", "ARBYS"};
        for(int i=0;i<array.length;i++)
        {
            if(array[i].startsWith("A") || array[i].startsWith("a"))
            {
                array[i] = array[i].toLowerCase();
                System.out.println(array[i]);
            }
        }
    }
}
