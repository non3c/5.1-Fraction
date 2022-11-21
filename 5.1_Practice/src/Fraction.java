/**
 * @Author: Jiongting Chen
 * @Purpose: To simulate a fraction
 * @Version: 1.0
 */

public class Fraction {
    private int nmrt;
    private int dnmt;

    public Fraction() {
        nmrt = 1;
        dnmt = 1;
    }

    public Fraction(int n, int d) {
        nmrt = n;
        if (d != 0) dnmt = d;
        else {
            dnmt = 1;
            System.out.println("Error: 0 as the denominator? Are you kidding me...");
        }
    }

    public Fraction(String f) {
        nmrt = Integer.parseInt(f.substring(0, f.indexOf("/")));
        if (Integer.parseInt(f.substring(f.indexOf("/")+1)) != 0) dnmt = Integer.parseInt(f.substring(f.indexOf("/")+1));
        else {
            dnmt = 1;
            System.out.println("Error: 0 as the denominator? Are you kidding me...");
        }
    }

    public Fraction (Fraction f) {
        nmrt = f.nmrt;
        dnmt = f.dnmt;

    }



    //Accessor Methods
    public String toString() {
        return nmrt + "/" + dnmt;
    }

    /**
     *
     * @return Numerator
     */
    public int getNum() {
        return nmrt;
    }

    public int getDenom() {
        return dnmt;
    }

    public double toDouble() {
        return ((double) nmrt/ (double) dnmt);
    }

    //Mutator Methods
    public void reduce() {
        int factor = GCF(nmrt, dnmt);
        nmrt /= factor;
        dnmt /= factor;

    }

    public void setNum(int n) {
        nmrt = n;
    }

    public void setDenom(int d) {
        if (d != 0) dnmt = d;
        else {
            dnmt = 1;
            System.out.println("Error: 0 as the denominator? Are you kidding me...");
        }

    }

    private int GCF(int a, int b) {
        if (a == b) return a;
        if (a > b) return GCF(a - b, b);
        return GCF(b - a, a);

    }

    public static Fraction reciprocal(Fraction f) {
        return new Fraction(f.dnmt,f.nmrt);
    }

    public static Fraction add(Fraction a, Fraction b) {
        Fraction f1 = new Fraction(multiply(new Fraction(a.nmrt, a.dnmt), new Fraction (b.dnmt, b.dnmt)));
        Fraction f2 = new Fraction(multiply(new Fraction(b.nmrt, b.dnmt), new Fraction (a.dnmt, a.dnmt)));
        Fraction output = new Fraction(f1.nmrt + f2.nmrt, f1.dnmt);
        output.reduce();
        return output;
    }

    public static Fraction subtract(Fraction a, Fraction b) {
        Fraction output = new Fraction(add(new Fraction(a.nmrt, a.dnmt), new Fraction (-b.nmrt, b.dnmt)));
        output.reduce();
        return output;
    }

    public static Fraction multiply(Fraction a, Fraction b) {
        Fraction output = new Fraction((a.nmrt * b.nmrt), (a.dnmt * b.dnmt));
        output.reduce();
        return output;

    }

    public Fraction multiply(Fraction a) {
        Fraction output = new Fraction((nmrt * a.nmrt), (dnmt * a.dnmt));
        output.reduce();
        return output;

    }

    public static Fraction divide(Fraction a, Fraction b) {
        return multiply(a, reciprocal(b));
    }

    public Fraction divide(Fraction a) {
        return multiply(new Fraction(nmrt, dnmt), reciprocal(a));
    }


}
