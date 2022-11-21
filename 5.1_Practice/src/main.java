public class main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(48, 12);
        Fraction f3 = new Fraction(27, 3);
        Fraction f4 = new Fraction(30, 10);
        Fraction f5 = Fraction.multiply(f1, f2);
        Fraction f6 = Fraction.divide(f2, f3);
//        Fraction f7 = Fraction.minus(f2, f3);
        System.out.println(f6);
    }
}
