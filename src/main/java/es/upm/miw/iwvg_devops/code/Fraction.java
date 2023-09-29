package es.upm.miw.iwvg_devops.code;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public boolean isProper() {
        return this.numerator < this.denominator;
    }

    public boolean isImproper() {
        return this.numerator > this.denominator;
    }

    public boolean isEquivalent(Fraction fraction) {
        return this.numerator*fraction.getDenominator() == this.denominator* fraction.getNumerator();
    }

    public Fraction add(Fraction fraction) {
        int commonDenominator = this.denominator;
        if (this.denominator != fraction.getDenominator()) {
            commonDenominator = this.denominator * fraction.getDenominator();
        }
        int numerator1 = commonDenominator/this.denominator*this.numerator;
        int numerator2 = commonDenominator/fraction.getDenominator()*fraction.getNumerator();
        return new Fraction(numerator1+numerator2, commonDenominator);
    }

    public Fraction multiply(Fraction fraction) {
        return new Fraction(this.numerator* fraction.getNumerator(),
                this.denominator* fraction.getDenominator());
    }

    public Fraction divide(Fraction fraction) {
        return new Fraction(this.numerator* fraction.getDenominator(),
                this.denominator* fraction.getNumerator());
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

}