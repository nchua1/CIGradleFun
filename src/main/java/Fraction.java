public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        numerator = 0;
        denominator = 1;
    }

    public Fraction(int n, int d) {
        if(d == 0) {
            System.out.println("Denominator cannot be zero");
            numerator = 0;
            denominator = 1;
        } /*
        else if (n < Integer.MIN_VALUE) {
            System.out.println("Numerator is less than min value");
            numerator = 0;
            denominator = 1;
        }
        else if (n > Integer.MAX_VALUE) {
            System.out.println("Numerator is greater than max value");
            numerator = 0;
            denominator = 1;
        }
        else if (d > Integer.MAX_VALUE) {
            System.out.println("Denominator is greater than max value");
            numerator = 0;
            denominator = 1;
        }
        else if (d < Integer.MIN_VALUE) {
            System.out.println("Denominator is less than the min value");
            numerator = 0;
            denominator = 1;
        } */
        else if (n < 0 && d < 0)
        {
            numerator = Math.abs(n);
            denominator = Math.abs(d);
        }
        else {
            numerator = n;
            denominator = d;
        }
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    double getRealValue() {
        return (double) numerator / (double) denominator;
    }

    Fraction reduce(Fraction temp) {
        int num1 = temp.getNumerator();
        int num2 = temp.getDenominator();

        int remainder = 0;
        while (num2 != 0) {
            remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }

        int redNumerator = temp.getNumerator() / num1;
        int redDenominator = temp.getDenominator() / num1;
        return new Fraction(redNumerator, redDenominator);
    }

    Fraction add(Fraction temp) {
        int den1 = denominator;
        int den2 = temp.getDenominator();
        int resultdenom = den1 * den2;

        int num1 = numerator * den2;
        int num2 = temp.getNumerator() * den1;
        int resultnum = num1 + num2;

        Fraction result = new Fraction(resultnum, resultdenom);

        return reduce(result);
    }

    public boolean equals(Fraction temp) {
        return this == temp;
    }

    /*
    @Override
    public int compareTo(Fraction temp) {
        if (equals(this)) {
            return 0;
        }
        //else if ()
    }
    */
}
