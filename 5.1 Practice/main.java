public class main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(-2, -1);
        Fraction f3 = new Fraction(1, 3);
        Fraction f4 = new Fraction("5/2");

        Fraction f5 = Fraction.multiply(f1, f2);
        Fraction f6 = Fraction.divide(f2, f3);
        Fraction f7 = Fraction.add(f3, f4);
        Fraction f8 = Fraction.subtract(f4, f1);

        System.out.println(f5);
        System.out.println(f6);
        System.out.println(f7);
        System.out.println(f8);

    }
}
