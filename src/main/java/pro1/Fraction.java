package pro1;

public class Fraction
{
    long n; // čitatel
    long d; // jmenovatel

    public Fraction(long n, long d) {
        long gcd = Utils.gcd(n,d);
        this.n = n / gcd;
        this. d = d / gcd;
    }

    public static Fraction parse(String s)
    {
        return new Fraction(1,1);
    }

    public String toString() {
        return n + "/" + d;
    }
}
