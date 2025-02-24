package pro1;

public class Utils
{
    public static long gcd(long a, long b)
    {
        /* Euklidův algoritmus*/
        while(b != 0)
        {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
